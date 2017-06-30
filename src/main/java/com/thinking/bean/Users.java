package com.thinking.bean;

import java.util.Date;

/**
 * 作者 李亚卿 日期：2017年6月29日 公司：ArteonWMS 描述：用户实体类
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

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userid) {
		this.userId = userid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realname) {
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

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createdate) {
		this.createDate = createdate;
	}

	public String getLoginCount() {
		return loginCount;
	}

	public void setLoginCount(String logincount) {
		this.loginCount = logincount == null ? null : logincount.trim();
	}

	public String getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(String isdeleted) {
		this.isDeleted = isdeleted == null ? null : isdeleted.trim();
	}

	public Integer getCharacterType() {
		return characterType;
	}

	public void setCharacterType(Integer charactertype) {
		this.characterType = charactertype;
	}

	public Integer getDepartId() {
		return departId;
	}

	public void setDepartId(Integer departid) {
		this.departId = departid;
	}
}