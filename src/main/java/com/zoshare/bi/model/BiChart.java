package com.zoshare.bi.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@ApiModel(value = "com.zoshare.bi.model.BiChart")
@Data
@TableName(value = "bi.bi_chart")
public class BiChart implements Serializable {
    public static final String COL_UPDATEDAT = "updatedAt";
    public static final String COL_CONTENT = "content";
    public static final String COL_OBJECTID = "objectId";
    public static final String COL_CREATEDAT = "createdAt";
    public static final String COL_ISPRIVATE = "isPrivate";
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "null")
    private Long id;

    @TableField(value = "updated_time")
    @ApiModelProperty(value = "null")
    private Date updatedTime;

    @TableField(value = "creator")
    @ApiModelProperty(value = "null")
    private String creator;

    @TableField(value = "`desc`")
    @ApiModelProperty(value = "null")
    private String desc;

    @TableField(value = "ACL")
    @ApiModelProperty(value = "null")
    private String acl;

    @TableField(value = "object_id")
    @ApiModelProperty(value = "null")
    private String objectId;

    @TableField(value = "chart_name")
    @ApiModelProperty(value = "null")
    private String chartName;

    @TableField(value = "created_time")
    @ApiModelProperty(value = "null")
    private Date createdTime;

    @TableField(value = "status")
    @ApiModelProperty(value = "null")
    private Object status;

    @TableField(value = "is_private")
    @ApiModelProperty(value = "null")
    private String isPrivate;

    @TableField(value = "content")
    @ApiModelProperty(value = "null")
    private String content;

    private static final long serialVersionUID = 1L;

    public static final String COL_UPDATED_TIME = "updated_time";

    public static final String COL_CREATOR = "creator";

    public static final String COL_DESC = "desc";

    public static final String COL_ACL = "ACL";

    public static final String COL_OBJECT_ID = "object_id";

    public static final String COL_CHART_NAME = "chart_name";

    public static final String COL_CREATED_TIME = "created_time";

    public static final String COL_STATUS = "status";

    public static final String COL_IS_PRIVATE = "is_private";
}