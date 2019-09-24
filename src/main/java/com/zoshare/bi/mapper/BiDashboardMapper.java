package com.zoshare.bi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zoshare.bi.model.BiDashboard;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BiDashboardMapper extends BaseMapper<BiDashboard> {
    int updateBatch(List<BiDashboard> list);

    int batchInsert(@Param("list") List<BiDashboard> list);

    int insertOrUpdate(BiDashboard record);

    int insertOrUpdateSelective(BiDashboard record);
}