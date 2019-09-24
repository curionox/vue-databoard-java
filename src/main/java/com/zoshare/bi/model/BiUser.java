package com.zoshare.bi.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="com.zoshare.bi.model.BiUser")
@Data
@TableName(value = "bi_user")
public class BiUser {
     @TableId(value = "_id", type = IdType.INPUT)
    @ApiModelProperty(value="null")
    private byte[] id;

    @TableField(value = "salt")
    @ApiModelProperty(value="null")
    private Object salt;

    @TableField(value = "email")
    @ApiModelProperty(value="null")
    private Object email;

    @TableField(value = "sessionToken")
    @ApiModelProperty(value="null")
    private Object sessiontoken;

    @TableField(value = "updatedAt")
    @ApiModelProperty(value="null")
    private Object updatedat;

    @TableField(value = "ACL")
    @ApiModelProperty(value="null")
    private Object acl;

    @TableField(value = "password")
    @ApiModelProperty(value="null")
    private Object password;

    @TableField(value = "objectId")
    @ApiModelProperty(value="null")
    private Object objectid;

    @TableField(value = "signature")
    @ApiModelProperty(value="null")
    private Object signature;

    @TableField(value = "city")
    @ApiModelProperty(value="null")
    private Object city;

    @TableField(value = "username")
    @ApiModelProperty(value="null")
    private Object username;

    @TableField(value = "errMsg")
    @ApiModelProperty(value="null")
    private Object errmsg;

    @TableField(value = "createdAt")
    @ApiModelProperty(value="null")
    private Object createdat;

    @TableField(value = "iv")
    @ApiModelProperty(value="null")
    private Object iv;

    @TableField(value = "emailVerified")
    @ApiModelProperty(value="null")
    private Object emailverified;

    @TableField(value = "nickName")
    @ApiModelProperty(value="null")
    private Object nickname;

    @TableField(value = "mobilePhoneNumber")
    @ApiModelProperty(value="null")
    private Object mobilephonenumber;

    @TableField(value = "rawData")
    @ApiModelProperty(value="null")
    private Object rawdata;

    @TableField(value = "language")
    @ApiModelProperty(value="null")
    private Object language;

    @TableField(value = "gender")
    @ApiModelProperty(value="null")
    private Object gender;

    @TableField(value = "province")
    @ApiModelProperty(value="null")
    private Object province;

    @TableField(value = "encryptedData")
    @ApiModelProperty(value="null")
    private Object encrypteddata;

    @TableField(value = "avatarUrl")
    @ApiModelProperty(value="null")
    private Object avatarurl;

    @TableField(value = "country")
    @ApiModelProperty(value="null")
    private Object country;

    @TableField(value = "authData")
    @ApiModelProperty(value="null")
    private Object authdata;

    @TableField(value = "userInfo")
    @ApiModelProperty(value="null")
    private Object userinfo;

    @TableField(value = "mobilePhoneVerified")
    @ApiModelProperty(value="null")
    private Object mobilephoneverified;

    public static final String COL_SALT = "salt";

    public static final String COL_EMAIL = "email";

    public static final String COL_SESSIONTOKEN = "sessionToken";

    public static final String COL_UPDATEDAT = "updatedAt";

    public static final String COL_ACL = "ACL";

    public static final String COL_PASSWORD = "password";

    public static final String COL_OBJECTID = "objectId";

    public static final String COL_SIGNATURE = "signature";

    public static final String COL_CITY = "city";

    public static final String COL_USERNAME = "username";

    public static final String COL_ERRMSG = "errMsg";

    public static final String COL_CREATEDAT = "createdAt";

    public static final String COL_IV = "iv";

    public static final String COL_EMAILVERIFIED = "emailVerified";

    public static final String COL_NICKNAME = "nickName";

    public static final String COL_MOBILEPHONENUMBER = "mobilePhoneNumber";

    public static final String COL_RAWDATA = "rawData";

    public static final String COL_LANGUAGE = "language";

    public static final String COL_GENDER = "gender";

    public static final String COL_PROVINCE = "province";

    public static final String COL_ENCRYPTEDDATA = "encryptedData";

    public static final String COL_AVATARURL = "avatarUrl";

    public static final String COL_COUNTRY = "country";

    public static final String COL_AUTHDATA = "authData";

    public static final String COL_USERINFO = "userInfo";

    public static final String COL_MOBILEPHONEVERIFIED = "mobilePhoneVerified";
}