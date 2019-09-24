package com.zoshare.bi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zoshare.bi.model.BiOrder;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BiOrderMapper extends BaseMapper<BiOrder> {
    int updateBatch(List<BiOrder> list);

    int batchInsert(@Param("list") List<BiOrder> list);

    int insertOrUpdate(BiOrder record);

    int insertOrUpdateSelective(BiOrder record);
}