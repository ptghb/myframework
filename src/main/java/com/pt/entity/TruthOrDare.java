package com.pt.entity;

import java.util.Date;

public class TruthOrDare {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column truth_or_dare.id
	 * @mbggenerated  Sat May 07 14:44:09 CST 2016
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column truth_or_dare.type
	 * @mbggenerated  Sat May 07 14:44:09 CST 2016
	 */
	private Integer type;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column truth_or_dare.content
	 * @mbggenerated  Sat May 07 14:44:09 CST 2016
	 */
	private String content;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column truth_or_dare.weight
	 * @mbggenerated  Sat May 07 14:44:09 CST 2016
	 */
	private Integer weight;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column truth_or_dare.state
	 * @mbggenerated  Sat May 07 14:44:09 CST 2016
	 */
	private Integer state;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column truth_or_dare.add_time
	 * @mbggenerated  Sat May 07 14:44:09 CST 2016
	 */
	private Date addTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column truth_or_dare.upt_time
	 * @mbggenerated  Sat May 07 14:44:09 CST 2016
	 */
	private Date uptTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column truth_or_dare.remark
	 * @mbggenerated  Sat May 07 14:44:09 CST 2016
	 */
	private String remark;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column truth_or_dare.id
	 * @return  the value of truth_or_dare.id
	 * @mbggenerated  Sat May 07 14:44:09 CST 2016
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column truth_or_dare.id
	 * @param id  the value for truth_or_dare.id
	 * @mbggenerated  Sat May 07 14:44:09 CST 2016
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column truth_or_dare.type
	 * @return  the value of truth_or_dare.type
	 * @mbggenerated  Sat May 07 14:44:09 CST 2016
	 */
	public Integer getType() {
		return type;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column truth_or_dare.type
	 * @param type  the value for truth_or_dare.type
	 * @mbggenerated  Sat May 07 14:44:09 CST 2016
	 */
	public void setType(Integer type) {
		this.type = type;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column truth_or_dare.content
	 * @return  the value of truth_or_dare.content
	 * @mbggenerated  Sat May 07 14:44:09 CST 2016
	 */
	public String getContent() {
		return content;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column truth_or_dare.content
	 * @param content  the value for truth_or_dare.content
	 * @mbggenerated  Sat May 07 14:44:09 CST 2016
	 */
	public void setContent(String content) {
		this.content = content == null ? null : content.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column truth_or_dare.weight
	 * @return  the value of truth_or_dare.weight
	 * @mbggenerated  Sat May 07 14:44:09 CST 2016
	 */
	public Integer getWeight() {
		return weight;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column truth_or_dare.weight
	 * @param weight  the value for truth_or_dare.weight
	 * @mbggenerated  Sat May 07 14:44:09 CST 2016
	 */
	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column truth_or_dare.state
	 * @return  the value of truth_or_dare.state
	 * @mbggenerated  Sat May 07 14:44:09 CST 2016
	 */
	public Integer getState() {
		return state;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column truth_or_dare.state
	 * @param state  the value for truth_or_dare.state
	 * @mbggenerated  Sat May 07 14:44:09 CST 2016
	 */
	public void setState(Integer state) {
		this.state = state;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column truth_or_dare.add_time
	 * @return  the value of truth_or_dare.add_time
	 * @mbggenerated  Sat May 07 14:44:09 CST 2016
	 */
	public Date getAddTime() {
		return addTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column truth_or_dare.add_time
	 * @param addTime  the value for truth_or_dare.add_time
	 * @mbggenerated  Sat May 07 14:44:09 CST 2016
	 */
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column truth_or_dare.upt_time
	 * @return  the value of truth_or_dare.upt_time
	 * @mbggenerated  Sat May 07 14:44:09 CST 2016
	 */
	public Date getUptTime() {
		return uptTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column truth_or_dare.upt_time
	 * @param uptTime  the value for truth_or_dare.upt_time
	 * @mbggenerated  Sat May 07 14:44:09 CST 2016
	 */
	public void setUptTime(Date uptTime) {
		this.uptTime = uptTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column truth_or_dare.remark
	 * @return  the value of truth_or_dare.remark
	 * @mbggenerated  Sat May 07 14:44:09 CST 2016
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column truth_or_dare.remark
	 * @param remark  the value for truth_or_dare.remark
	 * @mbggenerated  Sat May 07 14:44:09 CST 2016
	 */
	public void setRemark(String remark) {
		this.remark = remark == null ? null : remark.trim();
	}
}