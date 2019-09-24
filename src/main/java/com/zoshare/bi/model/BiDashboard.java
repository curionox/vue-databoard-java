package com.zoshare.bi.model;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@ApiModel(value = "com.zoshare.bi.model.BiDashboard")
@Data
@TableName(value = "bi_dashboard")
public class BiDashboard {
    @TableId(value = "_id", type = IdType.AUTO)
    @ApiModelProperty(value = "null")
    private Long id;

    @TableField(value = "updatedAt")
    @ApiModelProperty(value = "null")
    private Date updatedat;

    @TableField(value = "creator")
    @ApiModelProperty(value = "null")
    private String creator;

    @TableField(value = "`desc`")
    @ApiModelProperty(value = "null")
    private String desc;

    @TableField(value = "ACL")
    @ApiModelProperty(value = "null")
    private Object acl;

    @TableField(value = "content")
    @ApiModelProperty(value = "null")
    @JSONField
    private Object content;

    @TableField(value = "name")
    @ApiModelProperty(value = "null")
    private String name;

    @TableField(value = "objectId")
    @ApiModelProperty(value = "null")
    private String objectId;

    @TableField(value = "createdAt")
    @ApiModelProperty(value = "null")
    private Date createdat;

    @TableField(value = "status")
    @ApiModelProperty(value = "null")
    private Integer status;

    @TableField(value = "isPrivate")
    @ApiModelProperty(value = "null")
    private String isprivate;

    public static final String COL_UPDATEDAT = "updatedAt";

    public static final String COL_CREATOR = "creator";

    public static final String COL_DESC = "desc";

    public static final String COL_ACL = "ACL";

    public static final String COL_CONTENT = "content";

    public static final String COL_NAME = "name";

    public static final String COL_OBJECTID = "objectId";

    public static final String COL_CREATEDAT = "createdAt";

    public static final String COL_STATUS = "status";

    public static final String COL_ISPRIVATE = "isPrivate";

//    public static com.zoshare.bi.model.BiDashboard convert(com.zoshare.bi.model.BiDashboard c) {
//        c.set(c.getId());
//        c.setChart_name(c.getChartName());
//
////        c.setContent(JSONObject.parseObject(c.getContent().toString()));
//        return c;
//    }

    public static BiDashboard convert(BiDashboard c) {
        c.setObjectId(c.getId().toString());
        c.setContent(JSONObject.parseObject(c.getContent()==null ? "":c.getContent().toString()));
        return c;
    }
}