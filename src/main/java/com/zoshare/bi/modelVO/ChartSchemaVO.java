package com.zoshare.bi.modelVO;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Table(name = "bi_chart")
public class ChartSchemaVO {
    private static final long serialVersionUID = 1L;
    @Id
    @TableId(value="_id",type = IdType.AUTO )
    @Column(name = "_id")
    @GeneratedValue(generator = "JDBC")
    private Long id;

    @Transient
    private Long chart_id;
    @Column(name = "updatedAt")
    private Date updatedat;

    @Column(name = "creator")
    private String creator;

    @Column(name = "`desc`")
    private String desc;

    @Column(name = "ACL")
    private String acl;

    @Column(name = "content")
    private JSONObject content;

//
//    @Column(name = "content")
//    private String  content1;
    @Column(name = "objectId")
    private String objectId;

    @Column(name = "chart_name")
    private String chartName;

    @Transient
    private String chart_name;
    @Column(name = "createdAt")
    private Date createdat;

    @Column(name = "`status`")
    private Object status;

    @Column(name = "isPrivate")
    private String isprivate;


    public static ChartSchemaVO convert(ChartSchemaVO c) {
        c.setChart_id(c.getId());
        c.setChart_name(c.getChartName());
//        c.setContent(JSONObject.parseObject(c.getContent().toString()));
        return c;
    }
}