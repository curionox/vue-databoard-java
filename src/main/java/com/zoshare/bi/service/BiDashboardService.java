package com.zoshare.bi.service;

import java.util.List;
import com.zoshare.bi.model.BiDashboard;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @Description:
 * @Author： yehh
 * @Date: Creater in 2019/9/18 15:51
 * @Modified by:
 */
public interface BiDashboardService extends IService<BiDashboard> {


    int updateBatch(List<BiDashboard> list);

    int batchInsert(List<BiDashboard> list);

    int insertOrUpdate(BiDashboard record);

    int insertOrUpdateSelective(BiDashboard record);

}

