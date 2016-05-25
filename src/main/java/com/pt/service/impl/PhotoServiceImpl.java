package com.pt.service.impl;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pt.dao.MyPhotoMapper;
import com.pt.entity.MyPhoto;
import com.pt.service.IPhotoService;

@Service("photoService")
public class PhotoServiceImpl implements IPhotoService {
	@Resource
	private MyPhotoMapper myPhotoMapper;

	@Override
	public List<MyPhoto> getPhotoGroupList(int stanum, int offset) {
		// TODO Auto-generated method stub
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("stanum", stanum);
		map.put("offset", offset);
		return myPhotoMapper.getPhotoGroupList(map);
	}

	@Override
	public List<MyPhoto> getPhotoGroupAllList() {
		// TODO Auto-generated method stub
		return myPhotoMapper.getMyPhotoGroupAllLst();
	}

	@Override
	public List<MyPhoto> getMyPhotoLastGroupLst() {
		// TODO Auto-generated method stub
		return myPhotoMapper.getMyPhotoLastGroupLst();
	}

	@Override
	public List<MyPhoto> getPhotoAllListByGroup(String group) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("groupName", group);
		return myPhotoMapper.getPhotoListByGroup(map);
	}

	@Override
	public List<MyPhoto> getPhotoAllList() {
		return myPhotoMapper.getPhotoAllList();
	}

	@Override
	public List<MyPhoto> getPhotoList(int stanum, int offset) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("stanum", stanum);
		map.put("offset", offset);
		return myPhotoMapper.getPhotoList(map);
	}

	@Transactional(rollbackFor={Exception.class})
	@Override
	public int insertPhoto(MyPhoto myPhoto) {
		// TODO Auto-generated method stub
		myPhoto.setState(1);
		return myPhotoMapper.insertSelective(myPhoto);
	}

	@Transactional(rollbackFor={Exception.class})
	@Override
	public int updPhoto(MyPhoto myPhoto) {
		// TODO Auto-generated method stub
		return myPhotoMapper.updateByPrimaryKeySelective(myPhoto);
	}

	
}
