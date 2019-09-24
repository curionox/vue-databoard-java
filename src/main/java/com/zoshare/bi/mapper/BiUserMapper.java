package com.zoshare.bi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zoshare.bi.model.BiUser;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BiUserMapper extends BaseMapper<BiUser> {
    int updateBatch(List<BiUser> list);

    int batchInsert(@Param("list") List<BiUser> list);

    int insertOrUpdate(BiUser record);

    int insertOrUpdateSelective(BiUser record);
}