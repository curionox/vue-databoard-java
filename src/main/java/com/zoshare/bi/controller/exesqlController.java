package com.zoshare.bi.controller;

import com.zoshare.bi.mapper.ExesqlDoMapper;
import com.zoshare.bi.mapper.ExesqlMapper;
import com.zoshare.bi.util.ResultInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

/**
 * @Description:
 * @Author： yehh
 * @Date: Creater in 2019/9/13 11:14
 * @Modified by:
 */
@RestController
public class exesqlController {
    @Autowired
    ExesqlMapper exesqlMapper;
    @Autowired
    ExesqlDoMapper exesqlDoMapper;

    @GetMapping("/exesql")
    public ResultInfo exesql(String sql)  {

        try {
            List<HashMap>  result=exesqlMapper.getTableInfo(sql);
            List<HashMap>  result1=exesqlMapper.getTableName();
            List<HashMap>  result2=exesqlDoMapper.getTableName();
            List<HashMap>  result3=exesqlMapper.getTableName();
            List<HashMap>  result4=exesqlDoMapper.getTableName();
            return ResultInfo.ok().setData(result);
//            return "{\"code\":20000,\"data\":[{\"Field\":\"date\",\"Type\":\"varchar(19)\",\"Null\":\"YES\",\"Key\":\"\",\"Default\":null,\"Extra\":\"\"},{\"Field\":\"user_src\",\"Type\":\"varchar(9)\",\"Null\":\"YES\",\"Key\":\"\",\"Default\":null,\"Extra\":\"\"},{\"Field\":\"order_src\",\"Type\":\"varchar(11)\",\"Null\":\"YES\",\"Key\":\"\",\"Default\":null,\"Extra\":\"\"},{\"Field\":\"order_location\",\"Type\":\"varchar(2)\",\"Null\":\"YES\",\"Key\":\"\",\"Default\":null,\"Extra\":\"\"},{\"Field\":\"new_order\",\"Type\":\"int(5)\",\"Null\":\"YES\",\"Key\":\"\",\"Default\":null,\"Extra\":\"\"},{\"Field\":\"payed_order\",\"Type\":\"int(5)\",\"Null\":\"YES\",\"Key\":\"\",\"Default\":null,\"Extra\":\"\"},{\"Field\":\"pending_order\",\"Type\":\"int(4)\",\"Null\":\"YES\",\"Key\":\"\",\"Default\":null,\"Extra\":\"\"},{\"Field\":\"cancel_order\",\"Type\":\"int(4)\",\"Null\":\"YES\",\"Key\":\"\",\"Default\":null,\"Extra\":\"\"},{\"Field\":\"reject_order\",\"Type\":\"int(4)\",\"Null\":\"YES\",\"Key\":\"\",\"Default\":null,\"Extra\":\"\"},{\"Field\":\"good_order\",\"Type\":\"int(5)\",\"Null\":\"YES\",\"Key\":\"\",\"Default\":null,\"Extra\":\"\"},{\"Field\":\"report_order\",\"Type\":\"int(4)\",\"Null\":\"YES\",\"Key\":\"\",\"Default\":null,\"Extra\":\"\"}]}";
        }catch (Exception e){
            throw new RuntimeException(e);

        }

    }

    @GetMapping("/tables")
    public ResultInfo tables(String sql)  {

        try {
            List<HashMap>  result1=exesqlMapper.getTableName();
            List<HashMap>  result2=exesqlDoMapper.getTableName();
            List<HashMap>  result3=exesqlMapper.getTableName();
            List<HashMap>  result4=exesqlDoMapper.getTableName();

            return ResultInfo.ok().setData(result1);
//            return "{\"code\":20000,\"data\":[{\"Field\":\"date\",\"Type\":\"varchar(19)\",\"Null\":\"YES\",\"Key\":\"\",\"Default\":null,\"Extra\":\"\"},{\"Field\":\"user_src\",\"Type\":\"varchar(9)\",\"Null\":\"YES\",\"Key\":\"\",\"Default\":null,\"Extra\":\"\"},{\"Field\":\"order_src\",\"Type\":\"varchar(11)\",\"Null\":\"YES\",\"Key\":\"\",\"Default\":null,\"Extra\":\"\"},{\"Field\":\"order_location\",\"Type\":\"varchar(2)\",\"Null\":\"YES\",\"Key\":\"\",\"Default\":null,\"Extra\":\"\"},{\"Field\":\"new_order\",\"Type\":\"int(5)\",\"Null\":\"YES\",\"Key\":\"\",\"Default\":null,\"Extra\":\"\"},{\"Field\":\"payed_order\",\"Type\":\"int(5)\",\"Null\":\"YES\",\"Key\":\"\",\"Default\":null,\"Extra\":\"\"},{\"Field\":\"pending_order\",\"Type\":\"int(4)\",\"Null\":\"YES\",\"Key\":\"\",\"Default\":null,\"Extra\":\"\"},{\"Field\":\"cancel_order\",\"Type\":\"int(4)\",\"Null\":\"YES\",\"Key\":\"\",\"Default\":null,\"Extra\":\"\"},{\"Field\":\"reject_order\",\"Type\":\"int(4)\",\"Null\":\"YES\",\"Key\":\"\",\"Default\":null,\"Extra\":\"\"},{\"Field\":\"good_order\",\"Type\":\"int(5)\",\"Null\":\"YES\",\"Key\":\"\",\"Default\":null,\"Extra\":\"\"},{\"Field\":\"report_order\",\"Type\":\"int(4)\",\"Null\":\"YES\",\"Key\":\"\",\"Default\":null,\"Extra\":\"\"}]}";
        }catch (Exception e){
            throw new RuntimeException(e);

        }

    }
}
