package com.zoshare.bi.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zoshare.bi.model.BiChart;
import com.zoshare.bi.model.BiChartDashInfo;
import com.zoshare.bi.modelVO.ChartSchemaVO;
import com.zoshare.bi.service.BiChartDashInfoService;
import com.zoshare.bi.service.BiChartService;
import com.zoshare.bi.util.BeanCopyUtil;
import com.zoshare.bi.util.ResultInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description:
 * @Author： yehh
 * @Date: Creater in 2019/9/16 16:24
 * @Modified by:
 */



@RestController
public class ChartDashBoardController {

    @Autowired
    BiChartDashInfoService biChartDashInfoService;

    @Autowired
    BiChartService biChartService ;
    @GetMapping("/chartdashmap/chartbydashboard")
    public   ResultInfo chartByDashBoard( String id)  {
        ResultInfo resultInfo=new ResultInfo();
        try {
            BiChartDashInfo cds= new BiChartDashInfo();
            cds.setDashboard(id);
            QueryWrapper<BiChartDashInfo> queryWrapper = new QueryWrapper<>();
            queryWrapper.setEntity(cds);

            List<BiChartDashInfo> resultList= biChartDashInfoService.list(queryWrapper);
            List<String> ids=resultList.stream().map(c->c.getChart()).collect(Collectors.toList());

            if(resultList.size()==0){
                return ResultInfo.ok();
            }
            List<BiChart>  result= (List<BiChart>) biChartService.listByIds(ids);
//            result=result.stream().map(BiChart::convert).collect(Collectors.toList());
            List<ChartSchemaVO> resultVo= new ArrayList<>();

            for(int i=0;i<result.size();i++){
                ChartSchemaVO temp=new ChartSchemaVO();
                BeanCopyUtil.beanCopy(result.get(i),temp);
                temp.setContent(JSON.parseObject(result.get(i).getContent()));
                temp.setObjectId(temp.getId().toString());
                temp.setChart_name(result.get(i).getChartName());
                resultVo.add(temp);
            }


            return resultInfo.setData(resultVo);
             }catch (Exception e){
            throw new RuntimeException(e);

        }

    }

//    @PostMapping("/dashboard")
//    public   ResultInfo chat(@RequestBody DashboardSchema ds)  {
//
//        try {
//
//            int ids=dashboardSchemaMapper.insert(ds);
////            int id=chartSchemaMapper.insertOrUpdates(chartController);
//            HashMap ip= new HashMap(5);
//            ip.put("id",ds.getId());
//            return ResultInfo.ok().setData(ip);
//        }catch (Exception e){
//            throw new RuntimeException(e);
//
//        }
//
//    }



    @PostMapping(value = "/chartdashmap")
    public ResultInfo chartdashmap(@RequestBody JSONObject chart_id) {

        try {
//            ChartSchema chart= new ChartSchema();
//            chart.setId(Integer.parseInt(id));
//            ChartSchema result= biChartService.selectByPrimaryKey(chart);
//            ChartSchema result1 = biChartService.selectOne(chart);
            BiChartDashInfo cd = new BiChartDashInfo();
            cd.setChart(chart_id.get("chart_id").toString());
            cd.setDashboard(chart_id.get("dashboard_id").toString());
            QueryWrapper<BiChartDashInfo> queryWrapper = new QueryWrapper<>();
            queryWrapper.setEntity(cd);
            biChartDashInfoService.saveOrUpdate(cd,queryWrapper);
            return ResultInfo.ok();
//            ResultInfo.ok().setData(result)"";
        } catch (Exception e) {
            throw new RuntimeException(e);

        }
    }

    @PostMapping(value = "/chartdashmap/unmap")
    public ResultInfo chartdashumap(@RequestBody JSONObject chart_id) {
        ResultInfo result=new  ResultInfo();
        try {

            BiChartDashInfo cds= new BiChartDashInfo();
            cds.setChart(chart_id.get("chart_id").toString());
            cds.setDashboard(chart_id.get("dashboard_id").toString());
            QueryWrapper<BiChartDashInfo> queryWrapper = new QueryWrapper<>();
            queryWrapper.setEntity(cds);

            biChartDashInfoService.remove(queryWrapper);
            result.setMsg("\"data\":{\"success\":true}");
            return result;
//            ResultInfo.ok().setData(result)"";
        } catch (Exception e) {
            throw new RuntimeException(e);

        }
    }
        @GetMapping(value = "/chartdashmap/dbbychart")
    public   ResultInfo  dbbychart( String id)  {

        try {
            BiChart chart= new BiChart();
            BiChart result= biChartService.getById(chart);
            return ResultInfo.ok().setData(result);
//            ResultInfo.ok().setData(result)"";
        }catch (Exception e){
            throw new RuntimeException(e);

        }

    }
}
