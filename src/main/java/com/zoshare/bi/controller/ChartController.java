package com.zoshare.bi.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zoshare.bi.mapper.BiChartMapper;
import com.zoshare.bi.mapper.ExesqlMapper;
import com.zoshare.bi.model.BiChart;
import com.zoshare.bi.modelVO.ChartSchemaVO;
import com.zoshare.bi.service.BiChartService;
import com.zoshare.bi.util.BeanCopyUtil;
import com.zoshare.bi.util.ResultInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Description:
 * @Author： yehh
 * @Date: Creater in 2019/9/18 15:44
 * @Modified by:
 */
@RestController
public class ChartController {
    @Autowired
    ExesqlMapper exesqlMapper;

    @Autowired
    BiChartService biChartService;
    @Autowired
    BiChartMapper biChartMapper;

    @PostMapping("/chart")
    public   ResultInfo chat(@RequestBody ChartSchemaVO chart1)  {

        try {

            BiChart chart= new BiChart();
            chart.setChartName(chart1.getChart_name());
            chart.setDesc(chart1.getDesc());
            chart.setContent(chart1.getContent().toString());

            chart.setCreator("2");
          JSONObject json = (JSONObject) JSON.toJSON(chart);

//            chart.setContent(json);
            biChartMapper.insert(chart);
//                biChartService.save(chart);
//            int id=biChartService.insertOrUpdates(chart);
            HashMap ip= new HashMap(5);
            ip.put("id",chart.getId());
            return ResultInfo.ok().setData(ip);
        }catch (Exception e){
            throw new RuntimeException(e);

        }

    }
    @PutMapping("/chart")
    public   ResultInfo chatUpdate(@RequestBody ChartSchemaVO chart1)  {

        try {


            BiChart chart= new BiChart();
            BeanCopyUtil.beanCopy(chart1,chart);
            chart.setChartName(chart1.getChart_name());
            chart.setDesc(chart1.getDesc());
            chart.setContent(chart1.getContent().toString());
            chart.setCreator("2");
            biChartService.insertOrUpdate(chart);

            HashMap ip= new HashMap(5);
            ip.put("id",chart1.getId());
            return ResultInfo.ok().setData(ip);
        }catch (Exception e){
            throw new RuntimeException(e);

        }

    }
    @GetMapping("/chart/list")
    public   ResultInfo chartList()  {

        try {
            BiChart chart= new BiChart();
            chart.setCreator("2");



            QueryWrapper<BiChart> queryWrapper = new QueryWrapper<>();
            queryWrapper.setEntity(chart);
            List<BiChart> resultList= biChartService.list(queryWrapper);

            List<ChartSchemaVO> result=new ArrayList<>();
            resultList.stream().forEach(temp->{
                ChartSchemaVO cst=new ChartSchemaVO();
                BeanCopyUtil.beanCopy(temp,cst);
                cst.setChart_name(temp.getChartName());
                cst.setChart_id(temp.getId());
                result.add(cst);
            });
            return ResultInfo.ok().setData(result);
        }catch (Exception e){
            throw new RuntimeException(e);

        }

    }


    @GetMapping(value = "/chart")
    public   ResultInfo chartList( String id)  {

        try {
            BiChart chart= new BiChart();
            chart.setId(Long.parseLong(id));
            BiChart result= biChartService.getById(id);
//            BiChart result1 = biChartService.selectOne(chart);

            ChartSchemaVO result2= new ChartSchemaVO();
            BeanCopyUtil.beanCopy(result,result2);
            result2.setChart_name(result.getChartName());
            result2.setContent(JSON.parseObject(result.getContent()));
            return ResultInfo.ok().setData(result2);
        }catch (Exception e){
            throw new RuntimeException(e);

        }

    }


}
