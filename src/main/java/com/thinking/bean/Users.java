package com.thinking.bean;

import java.util.Date;

/**
 * 作者 李亚卿
 * 日期：2017年6月29日
 * 公司：ArteonWMS
 * 描述：用户实体类
 */
public class Users {
    private Integer userId;

    private String userName;

    private String realName;

    private String password;

    private String gender;

    private String tel;

    private String email;

    private Date createDate;

    private String loginCount;

    private String isDeleted;

    private Integer characterType;

    private Integer departId;

    public Integer getUserid() {
        return userId;
    }

    public void setUserid(Integer userid) {
        this.userId = userid;
    }

    public String getUsername() {
        return userName;
    }

    public void setUsername(String username) {
        this.userName = username == null ? null : username.trim();
    }

    public String getRealname() {
        return realName;
    }

    public void setRealname(String realname) {
        this.realName = realname == null ? null : realname.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Date getCreatedate() {
        return createDate;
    }

    public void setCreatedate(Date createdate) {
        this.createDate = createdate;
    }

    public String getLogincount() {
        return loginCount;
    }

    public void setLogincount(String logincount) {
        this.loginCount = logincount == null ? null : logincount.trim();
    }

    public String getIsdeleted() {
        return isDeleted;
    }

    public void setIsdeleted(String isdeleted) {
        this.isDeleted = isdeleted == null ? null : isdeleted.trim();
    }

    public Integer getCharactertype() {
        return characterType;
    }

    public void setCharactertype(Integer charactertype) {
        this.characterType = charactertype;
    }

    public Integer getDepartid() {
        return departId;
    }

    public void setDepartid(Integer departid) {
        this.departId = departid;
    }
}