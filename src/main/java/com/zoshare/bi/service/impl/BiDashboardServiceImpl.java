package com.zoshare.bi.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import com.zoshare.bi.model.BiDashboard;
import com.zoshare.bi.mapper.BiDashboardMapper;
import com.zoshare.bi.service.BiDashboardService;

/**
 * @Description:
 * @Author： yehh
 * @Date: Creater in 2019/9/18 15:51
 * @Modified by:
 */
@Service
public class BiDashboardServiceImpl extends ServiceImpl<BiDashboardMapper, BiDashboard> implements BiDashboardService {

    @Override
    public int updateBatch(List<BiDashboard> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<BiDashboard> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(BiDashboard record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(BiDashboard record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}

