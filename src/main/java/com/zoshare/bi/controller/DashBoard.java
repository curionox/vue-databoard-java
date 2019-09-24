package com.zoshare.bi.controller;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zoshare.bi.mapper.ExesqlMapper;
import com.zoshare.bi.model.BiDashboard;
import com.zoshare.bi.model.BiOrder;
import com.zoshare.bi.modelVO.BiDashboardVo;
import com.zoshare.bi.service.BiDashboardService;
import com.zoshare.bi.service.BiOrderService;
import com.zoshare.bi.util.BeanCopyUtil;
import com.zoshare.bi.util.ResultInfo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description:
 * @Author： yehh
 * @Date: Creater in 2019/9/16 16:24
 * @Modified by:
 */



@RestController
public class DashBoard {
    @Autowired
    ExesqlMapper exesqlMapper;

    @Autowired
    BiDashboardService biDashboardService;
    @Autowired
    BiOrderService biOrderService;
    @GetMapping("/dashboard/list")
    public ResultInfo chartList()  {
        ResultInfo resultInfo=new ResultInfo();
        try {
            BiDashboard ds= new BiDashboard();
            HashMap result= new HashMap(5);
            ds.setCreator("2");
            QueryWrapper<BiDashboard> queryWrapper = new QueryWrapper<>();
            queryWrapper.setEntity(ds);
            BiOrder dsOrder= new BiOrder();
            dsOrder.setUserid("2");
            QueryWrapper<BiOrder> queryWrapperOrder = new QueryWrapper<>();
            queryWrapperOrder.setEntity(dsOrder);

            dsOrder=biOrderService.getOne(queryWrapperOrder);
            List<BiDashboard> resultList= biDashboardService.list(queryWrapper);


            if(resultList.size()==0){
                result.put("dashboards",resultList);
                result.put("order","[]");
                return resultInfo.setData(result);
            }




            resultList=resultList.stream().map(BiDashboard::convert).collect(Collectors.toList());

            result.put("dashboards",resultList);
            String order = StringUtils.strip(dsOrder.getOrder(), "[]");
            ArrayList list=new ArrayList(Arrays.asList(order.split(",")));
            result.put("order", list);
            return resultInfo.setData(result);
             }catch (Exception e){
            throw new RuntimeException(e);

        }

    }

    @PostMapping("/dashboard")
    public   ResultInfo chat(@RequestBody BiDashboard ds)  {

        try {
            ds.setCreator("2");
//            ds.setContent(JSON.parseObject("{layout: []}"));
              biDashboardService.save(ds);
//            int id=chartSchemaMapper.insertOrUpdates(chartController);
            BiOrder dsOrder= new BiOrder();
            dsOrder.setUserid("2");
            QueryWrapper<BiOrder> queryWrapperOrder = new QueryWrapper<>();
            queryWrapperOrder.setEntity(dsOrder);
            dsOrder =biOrderService.getOne(queryWrapperOrder);
//
//            if(true) {
            if(dsOrder!=null) {
                String order = StringUtils.strip(dsOrder.getOrder(), "[]");
                order = "[" + ds.getId().toString() + "," + order + "]";
                dsOrder.setOrder(order);
                biOrderService.saveOrUpdate(dsOrder, queryWrapperOrder);
            }else{
                String order = "[" + ds.getId().toString() +  "]";
                dsOrder= new BiOrder();
                dsOrder.setUserid("2");
                dsOrder.setOrder(order);
                biOrderService.save(dsOrder);
            }

            HashMap ip= new HashMap(5);
            ip.put("id",ds.getId());
            return ResultInfo.ok().setData(ip);
        }catch (Exception e){
            throw new RuntimeException(e);

        }

    }
    @PostMapping("/dashboard/order")
    public   ResultInfo order(@RequestBody JSONObject order)  {

        try {

            BiOrder dsTemp=new BiOrder();
            BiOrder temp=new BiOrder();
            dsTemp.setOrder(order.get("order").toString());
            dsTemp.setUserid("2");
            temp.setUserid("2");
            BiDashboard ds= new BiDashboard();
            HashMap result= new HashMap(5);
            ds.setCreator("2");
            QueryWrapper<BiOrder> queryWrapper = new QueryWrapper<>();
            queryWrapper.setEntity(temp);


            biOrderService.saveOrUpdate(dsTemp,queryWrapper);
            HashMap ip= new HashMap(5);
            ip.put("id",dsTemp.getId());
            return ResultInfo.ok().setData(ip);
        }catch (Exception e){
            throw new RuntimeException(e);

        }

    }
    @PutMapping("/dashboard")
    public   ResultInfo chatUpdate(@RequestBody BiDashboardVo ds)  {

        try {

            BiDashboard dsTemp=new BiDashboard();
            BeanCopyUtil.beanCopy(ds,dsTemp);
            dsTemp.setContent(ds.getContent().toString());
            biDashboardService.saveOrUpdate(dsTemp);

            HashMap result= new HashMap(1);
            result.put("id",dsTemp.getId());
            return ResultInfo.ok().setData(result);
        }catch (Exception e){
            throw new RuntimeException(e);

        }

    }
    @GetMapping("/dashboard")
    public   ResultInfo dashboard( String id)  {
        try {
            BiDashboard result=biDashboardService.getById(id);
            return ResultInfo.ok().setData(result);
        }catch (Exception e){
            throw new RuntimeException(e);

        }

    }
    @DeleteMapping("/dashboard")
    public   ResultInfo deleteDashboard(@RequestBody JSONObject order)  {

        try {
            biDashboardService.removeById(order.get("id").toString());
            BiOrder dsOrder= new BiOrder();
            dsOrder.setUserid("2");
            QueryWrapper<BiOrder> queryWrapperOrder = new QueryWrapper<>();
            queryWrapperOrder.setEntity(dsOrder);
            dsOrder =biOrderService.getOne(queryWrapperOrder);


            String orders = StringUtils.strip(dsOrder.getOrder(), "[]");
            ArrayList list=new ArrayList(Arrays.asList(orders.split(",")));
            list.remove(order.get("id").toString());
            orders=list.toString();
            dsOrder.setUserid("2");
            dsOrder.setOrder(orders);
            biOrderService.saveOrUpdate(dsOrder,queryWrapperOrder);

            return ResultInfo.ok().setData("{\"success\":true}");
        }catch (Exception e){
            throw new RuntimeException(e);

        }

    }

}
