package com.zoshare.bi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zoshare.bi.model.BiChartDashInfo;

import java.util.List;
    /**
 *@Description:
 *@Author： yehh
 *@Date: Creater in 2019/9/18 15:51
 *@Modified by:
 */
public interface BiChartDashInfoService extends IService<BiChartDashInfo>{


    int updateBatch(List<BiChartDashInfo> list);

    int batchInsert(List<BiChartDashInfo> list);

    int insertOrUpdate(BiChartDashInfo record);

    int insertOrUpdateSelective(BiChartDashInfo record);

}
