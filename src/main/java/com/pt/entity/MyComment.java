package com.pt.entity;

import java.util.Date;

public class MyComment {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column my_comment.id
	 * @mbggenerated  Sat May 07 14:44:09 CST 2016
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column my_comment.blog_id
	 * @mbggenerated  Sat May 07 14:44:09 CST 2016
	 */
	private Long blogId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column my_comment.content
	 * @mbggenerated  Sat May 07 14:44:09 CST 2016
	 */
	private String content;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column my_comment.user_id
	 * @mbggenerated  Sat May 07 14:44:09 CST 2016
	 */
	private Long userId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column my_comment.user_name
	 * @mbggenerated  Sat May 07 14:44:09 CST 2016
	 */
	private String userName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column my_comment.add_time
	 * @mbggenerated  Sat May 07 14:44:09 CST 2016
	 */
	private Date addTime;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column my_comment.id
	 * @return  the value of my_comment.id
	 * @mbggenerated  Sat May 07 14:44:09 CST 2016
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column my_comment.id
	 * @param id  the value for my_comment.id
	 * @mbggenerated  Sat May 07 14:44:09 CST 2016
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column my_comment.blog_id
	 * @return  the value of my_comment.blog_id
	 * @mbggenerated  Sat May 07 14:44:09 CST 2016
	 */
	public Long getBlogId() {
		return blogId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column my_comment.blog_id
	 * @param blogId  the value for my_comment.blog_id
	 * @mbggenerated  Sat May 07 14:44:09 CST 2016
	 */
	public void setBlogId(Long blogId) {
		this.blogId = blogId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column my_comment.content
	 * @return  the value of my_comment.content
	 * @mbggenerated  Sat May 07 14:44:09 CST 2016
	 */
	public String getContent() {
		return content;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column my_comment.content
	 * @param content  the value for my_comment.content
	 * @mbggenerated  Sat May 07 14:44:09 CST 2016
	 */
	public void setContent(String content) {
		this.content = content == null ? null : content.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column my_comment.user_id
	 * @return  the value of my_comment.user_id
	 * @mbggenerated  Sat May 07 14:44:09 CST 2016
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column my_comment.user_id
	 * @param userId  the value for my_comment.user_id
	 * @mbggenerated  Sat May 07 14:44:09 CST 2016
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column my_comment.user_name
	 * @return  the value of my_comment.user_name
	 * @mbggenerated  Sat May 07 14:44:09 CST 2016
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column my_comment.user_name
	 * @param userName  the value for my_comment.user_name
	 * @mbggenerated  Sat May 07 14:44:09 CST 2016
	 */
	public void setUserName(String userName) {
		this.userName = userName == null ? null : userName.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column my_comment.add_time
	 * @return  the value of my_comment.add_time
	 * @mbggenerated  Sat May 07 14:44:09 CST 2016
	 */
	public Date getAddTime() {
		return addTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column my_comment.add_time
	 * @param addTime  the value for my_comment.add_time
	 * @mbggenerated  Sat May 07 14:44:09 CST 2016
	 */
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}
}