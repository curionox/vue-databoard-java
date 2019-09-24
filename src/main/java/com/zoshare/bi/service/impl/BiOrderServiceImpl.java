package com.zoshare.bi.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import com.zoshare.bi.model.BiOrder;
import com.zoshare.bi.mapper.BiOrderMapper;
import com.zoshare.bi.service.BiOrderService;

/**
 * @Description:
 * @Author： yehh
 * @Date: Creater in 2019/9/23 15:37
 * @Modified by:
 */
@Service
public class BiOrderServiceImpl extends ServiceImpl<BiOrderMapper, BiOrder> implements BiOrderService {

    @Override
    public int updateBatch(List<BiOrder> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<BiOrder> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(BiOrder record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(BiOrder record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}


