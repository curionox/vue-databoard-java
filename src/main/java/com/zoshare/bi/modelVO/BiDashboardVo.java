package com.zoshare.bi.modelVO;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Data
public class BiDashboardVo {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "_id")
    @GeneratedValue(generator = "JDBC")
    private Long id;

    @Column(name = "updatedAt")
    private Date updatedat;

    @Column(name = "creator")
    private String creator;

    @Column(name = "`desc`")
    private String desc;

    @Column(name = "ACL")
    private Object acl;

    @Column(name = "content")
    private JSONObject content;

    @Column(name = "`name`")
    private String name;

    @Column(name = "objectId")
    private String objectId;

    @Column(name = "createdAt")
    private Date createdat;

    @Column(name = "`status`")
    private String status;

    @Column(name = "isPrivate")
    private String isprivate;

        public static BiDashboardVo convert(BiDashboardVo c) {
        c.setObjectId(c.getId().toString());

//        c.setContent(JSONObject.parseObject(c.getContent().toString()));
        return c;
    }
}