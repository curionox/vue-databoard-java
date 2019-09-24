package com.zoshare.bi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zoshare.bi.model.BiChart;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BiChartMapper extends BaseMapper<BiChart> {
    int updateBatch(List<BiChart> list);

    int batchInsert(@Param("list") List<BiChart> list);

    int insertOrUpdate(BiChart record);

    int insertOrUpdateSelective(BiChart record);

    int insertOrUpdateWithBLOBs(BiChart record);
}