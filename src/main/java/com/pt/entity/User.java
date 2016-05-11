package com.pt.entity;

import java.util.Date;

public class User {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.id
	 * @mbggenerated  Wed May 11 12:19:34 CST 2016
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.user_name
	 * @mbggenerated  Wed May 11 12:19:34 CST 2016
	 */
	private String userName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.password
	 * @mbggenerated  Wed May 11 12:19:34 CST 2016
	 */
	private String password;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.tel
	 * @mbggenerated  Wed May 11 12:19:34 CST 2016
	 */
	private String tel;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.weixin
	 * @mbggenerated  Wed May 11 12:19:34 CST 2016
	 */
	private String weixin;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.type
	 * @mbggenerated  Wed May 11 12:19:34 CST 2016
	 */
	private Integer type;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.add_time
	 * @mbggenerated  Wed May 11 12:19:34 CST 2016
	 */
	private Date addTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.upd_time
	 * @mbggenerated  Wed May 11 12:19:34 CST 2016
	 */
	private Date updTime;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.id
	 * @return  the value of user.id
	 * @mbggenerated  Wed May 11 12:19:34 CST 2016
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.id
	 * @param id  the value for user.id
	 * @mbggenerated  Wed May 11 12:19:34 CST 2016
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.user_name
	 * @return  the value of user.user_name
	 * @mbggenerated  Wed May 11 12:19:34 CST 2016
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.user_name
	 * @param userName  the value for user.user_name
	 * @mbggenerated  Wed May 11 12:19:34 CST 2016
	 */
	public void setUserName(String userName) {
		this.userName = userName == null ? null : userName.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.password
	 * @return  the value of user.password
	 * @mbggenerated  Wed May 11 12:19:34 CST 2016
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.password
	 * @param password  the value for user.password
	 * @mbggenerated  Wed May 11 12:19:34 CST 2016
	 */
	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.tel
	 * @return  the value of user.tel
	 * @mbggenerated  Wed May 11 12:19:34 CST 2016
	 */
	public String getTel() {
		return tel;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.tel
	 * @param tel  the value for user.tel
	 * @mbggenerated  Wed May 11 12:19:34 CST 2016
	 */
	public void setTel(String tel) {
		this.tel = tel == null ? null : tel.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.weixin
	 * @return  the value of user.weixin
	 * @mbggenerated  Wed May 11 12:19:34 CST 2016
	 */
	public String getWeixin() {
		return weixin;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.weixin
	 * @param weixin  the value for user.weixin
	 * @mbggenerated  Wed May 11 12:19:34 CST 2016
	 */
	public void setWeixin(String weixin) {
		this.weixin = weixin == null ? null : weixin.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.type
	 * @return  the value of user.type
	 * @mbggenerated  Wed May 11 12:19:34 CST 2016
	 */
	public Integer getType() {
		return type;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.type
	 * @param type  the value for user.type
	 * @mbggenerated  Wed May 11 12:19:34 CST 2016
	 */
	public void setType(Integer type) {
		this.type = type;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.add_time
	 * @return  the value of user.add_time
	 * @mbggenerated  Wed May 11 12:19:34 CST 2016
	 */
	public Date getAddTime() {
		return addTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.add_time
	 * @param addTime  the value for user.add_time
	 * @mbggenerated  Wed May 11 12:19:34 CST 2016
	 */
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.upd_time
	 * @return  the value of user.upd_time
	 * @mbggenerated  Wed May 11 12:19:34 CST 2016
	 */
	public Date getUpdTime() {
		return updTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.upd_time
	 * @param updTime  the value for user.upd_time
	 * @mbggenerated  Wed May 11 12:19:34 CST 2016
	 */
	public void setUpdTime(Date updTime) {
		this.updTime = updTime;
	}
    
}