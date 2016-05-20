package com.pt.dao;

import java.util.HashMap;
import java.util.List;

import com.pt.entity.MyPhoto;

public interface MyPhotoMapper {
    /**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table my_photo
	 * @mbggenerated  Mon May 16 16:32:39 CST 2016
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table my_photo
	 * @mbggenerated  Mon May 16 16:32:39 CST 2016
	 */
	int insert(MyPhoto record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table my_photo
	 * @mbggenerated  Mon May 16 16:32:39 CST 2016
	 */
	int insertSelective(MyPhoto record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table my_photo
	 * @mbggenerated  Mon May 16 16:32:39 CST 2016
	 */
	MyPhoto selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table my_photo
	 * @mbggenerated  Mon May 16 16:32:39 CST 2016
	 */
	int updateByPrimaryKeySelective(MyPhoto record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table my_photo
	 * @mbggenerated  Mon May 16 16:32:39 CST 2016
	 */
	int updateByPrimaryKey(MyPhoto record);

	List<MyPhoto> getPhotoGroupList(HashMap map);

	List<MyPhoto> getMyPhotoGroupAllLst();
	
	List<MyPhoto> getMyPhotoLastGroupLst();

	List<MyPhoto> getPhotoList(HashMap<String, Object> map);

	List<MyPhoto> getPhotoListByGroup(HashMap<String, Object> map);

	List<MyPhoto> getPhotoAllList();
}