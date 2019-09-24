package com.zoshare.bi.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zoshare.bi.mapper.BiChartDashInfoMapper;
import java.util.List;
import com.zoshare.bi.model.BiChartDashInfo;
import com.zoshare.bi.service.BiChartDashInfoService;
/**
 *@Description:
 *@Author： yehh
 *@Date: Creater in 2019/9/18 15:51
 *@Modified by:
 */
@Service
public class BiChartDashInfoServiceImpl extends ServiceImpl<BiChartDashInfoMapper, BiChartDashInfo> implements BiChartDashInfoService{

    @Override
    public int updateBatch(List<BiChartDashInfo> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int batchInsert(List<BiChartDashInfo> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(BiChartDashInfo record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(BiChartDashInfo record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
