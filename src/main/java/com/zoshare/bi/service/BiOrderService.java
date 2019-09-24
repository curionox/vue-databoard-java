package com.zoshare.bi.service;

import java.util.List;
import com.zoshare.bi.model.BiOrder;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @Description:
 * @Author： yehh
 * @Date: Creater in 2019/9/23 15:37
 * @Modified by:
 */
public interface BiOrderService extends IService<BiOrder> {


    int updateBatch(List<BiOrder> list);

    int batchInsert(List<BiOrder> list);

    int insertOrUpdate(BiOrder record);

    int insertOrUpdateSelective(BiOrder record);

}


