package com.zoshare.bi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zoshare.bi.model.BiChartDashInfo;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BiChartDashInfoMapper extends BaseMapper<BiChartDashInfo> {
    int updateBatch(List<BiChartDashInfo> list);

    int batchInsert(@Param("list") List<BiChartDashInfo> list);

    int insertOrUpdate(BiChartDashInfo record);

    int insertOrUpdateSelective(BiChartDashInfo record);
}