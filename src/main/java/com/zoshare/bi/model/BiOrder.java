package com.zoshare.bi.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@ApiModel(value = "com.zoshare.bi.model.BiOrder")
@Data
@TableName(value = "bi_order")
public class BiOrder {
    public static final String COL_UDER = "uder";
    public static final String COL_USER = "user";
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "null")
    private Long id;

    @TableField(value = "objectId")
    @ApiModelProperty(value = "null")
    private String objectid;

    @TableField(value = "ACL")
    @ApiModelProperty(value = "null")
    private Object acl;

    @TableField(value = "createdAt")
    @ApiModelProperty(value = "null")
    private Date createdat;

    @TableField(value = "updatedAt")
    @ApiModelProperty(value = "null")
    private Date updatedat;

    @TableField(value = "userId")
    @ApiModelProperty(value = "null")
    private String userid;

    @TableField(value = "`order`")
    @ApiModelProperty(value = "null")
    private String order;

    public static final String COL_OBJECTID = "objectId";

    public static final String COL_ACL = "ACL";

    public static final String COL_CREATEDAT = "createdAt";

    public static final String COL_UPDATEDAT = "updatedAt";

    public static final String COL_USERID = "userId";

    public static final String COL_ORDER = "order";
}