package com.zoshare.bi.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import com.zoshare.bi.mapper.BiChartMapper;
import com.zoshare.bi.model.BiChart;
import com.zoshare.bi.service.BiChartService;

/**
 * @Description:
 * @Author： yehh
 * @Date: Creater in 2019/9/18 15:51
 * @Modified by:
 */
@Service
public class BiChartServiceImpl extends ServiceImpl<BiChartMapper, BiChart> implements BiChartService {

    @Override
    public int updateBatch(List<BiChart> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<BiChart> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(BiChart record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(BiChart record) {
        return baseMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertOrUpdateWithBLOBs(BiChart record) {
        return baseMapper.insertOrUpdateWithBLOBs(record);
    }
}





