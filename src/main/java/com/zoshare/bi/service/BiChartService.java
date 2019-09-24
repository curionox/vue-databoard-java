package com.zoshare.bi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zoshare.bi.model.BiChart;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Author： yehh
 * @Date: Creater in 2019/9/18 15:51
 * @Modified by:
 */
@Service
public interface BiChartService extends IService<BiChart> {


    int updateBatch(List<BiChart> list);

    int batchInsert(List<BiChart> list);

    int insertOrUpdate(BiChart record);

    int insertOrUpdateSelective(BiChart record);

    int insertOrUpdateWithBLOBs(BiChart record);
}





