package com.zoshare.bi.util;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @description  【说明】本接口类用于对restful调用的时候，返回统一的数据接口类
 *
 * @author yehh
 * @date  2019-07-19 22:38.
 * @version: 1.0
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResultInfo<T> implements Serializable {

    private static final String CODE = "code";
    private static final String MSG = "msg";
    private static final long serialVersionUID = 2633283546876721434L;

    private Integer code=20000;
    private String msg="操作成功";
    private String description;
    private T data;

    private HashMap<String,Object> exend;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public ResultInfo setData(T data) {
        this.data = data;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @JsonIgnore
    public HashMap<String, Object> getExend() {
        return exend;
    }

    public void setExend(HashMap<String, Object> exend) {
        this.exend = exend;
    }

    public ResultInfo() {
        this.exend = new HashMap<String,Object>();
    }

    public static ResultInfo failure(int code, String msg) {
        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setCode(code);
        resultInfo.setMsg(msg);
        return resultInfo;
    }

    public static ResultInfo ok(String msg) {
        ResultInfo resultInfo = new ResultInfo();
        resultInfo.put("msg", msg);
        return resultInfo;
    }

    public static ResultInfo ok(Map<String, Object> map) {
        ResultInfo resultInfo = new ResultInfo();
        resultInfo.exend.putAll(map);
        return resultInfo;
    }

    public static ResultInfo ok() {
        return new ResultInfo();
    }

    public ResultInfo put(String key, Object value) {
        exend.put(key, value);
        return this;
    }
}
