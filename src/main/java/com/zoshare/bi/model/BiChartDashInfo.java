package com.zoshare.bi.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@ApiModel(value="com.zoshare.bi.model.BiChartDashInfo")
@Data
@TableName(value = "bi_chart_dash_info")
public class BiChartDashInfo {
     @TableId(value = "_id", type = IdType.AUTO)
    @ApiModelProperty(value="null")
    private Long id;

    @TableField(value = "objectId")
    @ApiModelProperty(value="null")
    private String objectId;

    @TableField(value = "ACL")
    @ApiModelProperty(value="null")
    private Object acl;

    @TableField(value = "createdAt")
    @ApiModelProperty(value="null")
    private Date createdat;

    @TableField(value = "updatedAt")
    @ApiModelProperty(value="null")
    private Date updatedat;

    @TableField(value = "dashboard")
    @ApiModelProperty(value="null")
    private String dashboard;

    @TableField(value = "chart")
    @ApiModelProperty(value="null")
    private String chart;

    public static final String COL_OBJECTID = "objectId";

    public static final String COL_ACL = "ACL";

    public static final String COL_CREATEDAT = "createdAt";

    public static final String COL_UPDATEDAT = "updatedAt";

    public static final String COL_DASHBOARD = "dashboard";

    public static final String COL_CHART = "chart";
}