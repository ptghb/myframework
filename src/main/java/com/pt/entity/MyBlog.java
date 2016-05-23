package com.pt.entity;

import java.util.Date;

public class MyBlog {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column my_blog.id
	 * @mbggenerated  Mon May 23 11:46:26 CST 2016
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column my_blog.title
	 * @mbggenerated  Mon May 23 11:46:26 CST 2016
	 */
	private String title;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column my_blog.img
	 * @mbggenerated  Mon May 23 11:46:26 CST 2016
	 */
	private String img;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column my_blog.description
	 * @mbggenerated  Mon May 23 11:46:26 CST 2016
	 */
	private String description;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column my_blog.add_time
	 * @mbggenerated  Mon May 23 11:46:26 CST 2016
	 */
	private Date addTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column my_blog.upt_time
	 * @mbggenerated  Mon May 23 11:46:26 CST 2016
	 */
	private Date uptTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column my_blog.location
	 * @mbggenerated  Mon May 23 11:46:26 CST 2016
	 */
	private String location;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column my_blog.comment_count
	 * @mbggenerated  Mon May 23 11:46:26 CST 2016
	 */
	private Integer commentCount;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column my_blog.like_count
	 * @mbggenerated  Mon May 23 11:46:26 CST 2016
	 */
	private Integer likeCount;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column my_blog.categories
	 * @mbggenerated  Mon May 23 11:46:26 CST 2016
	 */
	private String categories;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column my_blog.content
	 * @mbggenerated  Mon May 23 11:46:26 CST 2016
	 */
	private String content;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column my_blog.id
	 * @return  the value of my_blog.id
	 * @mbggenerated  Mon May 23 11:46:26 CST 2016
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column my_blog.id
	 * @param id  the value for my_blog.id
	 * @mbggenerated  Mon May 23 11:46:26 CST 2016
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column my_blog.title
	 * @return  the value of my_blog.title
	 * @mbggenerated  Mon May 23 11:46:26 CST 2016
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column my_blog.title
	 * @param title  the value for my_blog.title
	 * @mbggenerated  Mon May 23 11:46:26 CST 2016
	 */
	public void setTitle(String title) {
		this.title = title == null ? null : title.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column my_blog.img
	 * @return  the value of my_blog.img
	 * @mbggenerated  Mon May 23 11:46:26 CST 2016
	 */
	public String getImg() {
		return img;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column my_blog.img
	 * @param img  the value for my_blog.img
	 * @mbggenerated  Mon May 23 11:46:26 CST 2016
	 */
	public void setImg(String img) {
		this.img = img == null ? null : img.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column my_blog.description
	 * @return  the value of my_blog.description
	 * @mbggenerated  Mon May 23 11:46:26 CST 2016
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column my_blog.description
	 * @param description  the value for my_blog.description
	 * @mbggenerated  Mon May 23 11:46:26 CST 2016
	 */
	public void setDescription(String description) {
		this.description = description == null ? null : description.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column my_blog.add_time
	 * @return  the value of my_blog.add_time
	 * @mbggenerated  Mon May 23 11:46:26 CST 2016
	 */
	public Date getAddTime() {
		return addTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column my_blog.add_time
	 * @param addTime  the value for my_blog.add_time
	 * @mbggenerated  Mon May 23 11:46:26 CST 2016
	 */
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column my_blog.upt_time
	 * @return  the value of my_blog.upt_time
	 * @mbggenerated  Mon May 23 11:46:26 CST 2016
	 */
	public Date getUptTime() {
		return uptTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column my_blog.upt_time
	 * @param uptTime  the value for my_blog.upt_time
	 * @mbggenerated  Mon May 23 11:46:26 CST 2016
	 */
	public void setUptTime(Date uptTime) {
		this.uptTime = uptTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column my_blog.location
	 * @return  the value of my_blog.location
	 * @mbggenerated  Mon May 23 11:46:26 CST 2016
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column my_blog.location
	 * @param location  the value for my_blog.location
	 * @mbggenerated  Mon May 23 11:46:26 CST 2016
	 */
	public void setLocation(String location) {
		this.location = location == null ? null : location.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column my_blog.comment_count
	 * @return  the value of my_blog.comment_count
	 * @mbggenerated  Mon May 23 11:46:26 CST 2016
	 */
	public Integer getCommentCount() {
		return commentCount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column my_blog.comment_count
	 * @param commentCount  the value for my_blog.comment_count
	 * @mbggenerated  Mon May 23 11:46:26 CST 2016
	 */
	public void setCommentCount(Integer commentCount) {
		this.commentCount = commentCount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column my_blog.like_count
	 * @return  the value of my_blog.like_count
	 * @mbggenerated  Mon May 23 11:46:26 CST 2016
	 */
	public Integer getLikeCount() {
		return likeCount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column my_blog.like_count
	 * @param likeCount  the value for my_blog.like_count
	 * @mbggenerated  Mon May 23 11:46:26 CST 2016
	 */
	public void setLikeCount(Integer likeCount) {
		this.likeCount = likeCount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column my_blog.categories
	 * @return  the value of my_blog.categories
	 * @mbggenerated  Mon May 23 11:46:26 CST 2016
	 */
	public String getCategories() {
		return categories;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column my_blog.categories
	 * @param categories  the value for my_blog.categories
	 * @mbggenerated  Mon May 23 11:46:26 CST 2016
	 */
	public void setCategories(String categories) {
		this.categories = categories == null ? null : categories.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column my_blog.content
	 * @return  the value of my_blog.content
	 * @mbggenerated  Mon May 23 11:46:26 CST 2016
	 */
	public String getContent() {
		return content;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column my_blog.content
	 * @param content  the value for my_blog.content
	 * @mbggenerated  Mon May 23 11:46:26 CST 2016
	 */
	public void setContent(String content) {
		this.content = content == null ? null : content.trim();
	}
}