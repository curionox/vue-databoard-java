package com.zoshare.bi.util;

import com.alibaba.fastjson.JSONArray;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;

import java.sql.*;
import java.util.Arrays;

/**
 * @Description:
 * @Author： yehh
 * @Date: Creater in 2019/9/18 18:45
 * @Modified by:
 */
@MappedTypes({String[].class})
@MappedJdbcTypes({JdbcType.VARCHAR})
public class StringArrayTypeHandler implements TypeHandler<String[]> {
    @Override
    public void setParameter(PreparedStatement ps, int i, String[] parameter, JdbcType jdbcType) throws SQLException {
        if (parameter == null)
            ps.setNull(i, Types.VARCHAR);
        else {
            JSONArray array = new JSONArray(Arrays.asList(parameter));

            ps.setString(i, array.toString());
        }
    }

    @Override
    public String[] getResult(ResultSet rs, String s) throws SQLException {

        String columnValue = rs.getString(s);
        return this.getStringArray(columnValue);
    }

    @Override
    public String[] getResult(ResultSet rs, int columnIndex) throws SQLException {
        String columnValue = rs.getString(columnIndex);
        return this.getStringArray(columnValue);
    }

    @Override
    public String[] getResult(CallableStatement cs, int i) throws SQLException {
        String columnValue = cs.getString(i);
        return this.getStringArray(columnValue);

    }

    private String[] getStringArray(String columnValue) {

        if (columnValue == null)
            return null;
        JSONArray jsonArr = JSONArray.parseArray(columnValue);

        return jsonArr.toArray(new String[jsonArr.size()]);
    }

}