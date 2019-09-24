package com.zoshare.bi.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zoshare.bi.model.BiUser;
import java.util.List;
import com.zoshare.bi.mapper.BiUserMapper;
import com.zoshare.bi.service.BiUserService;
/**
 *@Description:
 *@Author： yehh
 *@Date: Creater in 2019/9/18 15:51
 *@Modified by:
 */
@Service
public class BiUserServiceImpl extends ServiceImpl<BiUserMapper, BiUser> implements BiUserService{

    @Override
    public int updateBatch(List<BiUser> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int batchInsert(List<BiUser> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(BiUser record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(BiUser record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
