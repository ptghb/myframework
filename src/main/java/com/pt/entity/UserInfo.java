package com.pt.entity;

import java.util.Date;

public class UserInfo {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user_info.id
	 * @mbggenerated  Wed May 11 12:19:34 CST 2016
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user_info.sex
	 * @mbggenerated  Wed May 11 12:19:34 CST 2016
	 */
	private String sex;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user_info.img
	 * @mbggenerated  Wed May 11 12:19:34 CST 2016
	 */
	private String img;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user_info.age
	 * @mbggenerated  Wed May 11 12:19:34 CST 2016
	 */
	private Integer age;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user_info.location
	 * @mbggenerated  Wed May 11 12:19:34 CST 2016
	 */
	private String location;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user_info.signature
	 * @mbggenerated  Wed May 11 12:19:34 CST 2016
	 */
	private String signature;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user_info.add_time
	 * @mbggenerated  Wed May 11 12:19:34 CST 2016
	 */
	private Date addTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user_info.upt_time
	 * @mbggenerated  Wed May 11 12:19:34 CST 2016
	 */
	private Date uptTime;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_info.id
	 * @return  the value of user_info.id
	 * @mbggenerated  Wed May 11 12:19:34 CST 2016
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_info.id
	 * @param id  the value for user_info.id
	 * @mbggenerated  Wed May 11 12:19:34 CST 2016
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_info.sex
	 * @return  the value of user_info.sex
	 * @mbggenerated  Wed May 11 12:19:34 CST 2016
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_info.sex
	 * @param sex  the value for user_info.sex
	 * @mbggenerated  Wed May 11 12:19:34 CST 2016
	 */
	public void setSex(String sex) {
		this.sex = sex == null ? null : sex.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_info.img
	 * @return  the value of user_info.img
	 * @mbggenerated  Wed May 11 12:19:34 CST 2016
	 */
	public String getImg() {
		return img;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_info.img
	 * @param img  the value for user_info.img
	 * @mbggenerated  Wed May 11 12:19:34 CST 2016
	 */
	public void setImg(String img) {
		this.img = img == null ? null : img.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_info.age
	 * @return  the value of user_info.age
	 * @mbggenerated  Wed May 11 12:19:34 CST 2016
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_info.age
	 * @param age  the value for user_info.age
	 * @mbggenerated  Wed May 11 12:19:34 CST 2016
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_info.location
	 * @return  the value of user_info.location
	 * @mbggenerated  Wed May 11 12:19:34 CST 2016
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_info.location
	 * @param location  the value for user_info.location
	 * @mbggenerated  Wed May 11 12:19:34 CST 2016
	 */
	public void setLocation(String location) {
		this.location = location == null ? null : location.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_info.signature
	 * @return  the value of user_info.signature
	 * @mbggenerated  Wed May 11 12:19:34 CST 2016
	 */
	public String getSignature() {
		return signature;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_info.signature
	 * @param signature  the value for user_info.signature
	 * @mbggenerated  Wed May 11 12:19:34 CST 2016
	 */
	public void setSignature(String signature) {
		this.signature = signature == null ? null : signature.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_info.add_time
	 * @return  the value of user_info.add_time
	 * @mbggenerated  Wed May 11 12:19:34 CST 2016
	 */
	public Date getAddTime() {
		return addTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_info.add_time
	 * @param addTime  the value for user_info.add_time
	 * @mbggenerated  Wed May 11 12:19:34 CST 2016
	 */
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_info.upt_time
	 * @return  the value of user_info.upt_time
	 * @mbggenerated  Wed May 11 12:19:34 CST 2016
	 */
	public Date getUptTime() {
		return uptTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_info.upt_time
	 * @param uptTime  the value for user_info.upt_time
	 * @mbggenerated  Wed May 11 12:19:34 CST 2016
	 */
	public void setUptTime(Date uptTime) {
		this.uptTime = uptTime;
	}
}