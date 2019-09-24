package com.zoshare.bi.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zoshare.bi.model.BiChart;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.HashMap;
import java.util.List;

/**
 * @Description:
 * @Author： yehh
 * @Date: Creater in 2019/9/13 14:08
 * @Modified by:
 */
@DS("do")
public interface ExesqlDoMapper extends BaseMapper<BiChart> {
    @Select({"${sql}"})
    public List<HashMap> getTableInfo(@Param("sql") String sql);
    @Select({"desc bi_chart_dash_info;"})
    public List<HashMap> getTableName();
}
