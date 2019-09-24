package com.zoshare.bi.service;

import com.zoshare.bi.model.BiUser;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.IService;
    /**
 *@Description:
 *@Author： yehh
 *@Date: Creater in 2019/9/18 15:51
 *@Modified by:
 */
public interface BiUserService extends IService<BiUser>{


    int updateBatch(List<BiUser> list);

    int batchInsert(List<BiUser> list);

    int insertOrUpdate(BiUser record);

    int insertOrUpdateSelective(BiUser record);

}
