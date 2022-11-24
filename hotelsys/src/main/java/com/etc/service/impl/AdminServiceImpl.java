package com.etc.service.impl;

import com.etc.model.Admin;
import com.etc.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.etc.dao.AdminDao;

import java.util.List;

import java.util.HashMap;

@Service
@Transactional
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminDao adminDao;
	public void insert(Admin admin){
		adminDao.insert(admin);
	}
	public void update(Admin admin){
		adminDao.update(admin);
	}
	public void delete(String loginid){
		adminDao.delete(loginid);
	}
	public Admin selectOne(String loginid){
		return adminDao.selectOne(loginid);
	}
	public List selectList(){
		return adminDao.selectList();
	}
	public int totalPage(int line) {
		int total = adminDao.total();
		int totalpage = total/line;
		if(total%line>0){
			totalpage++;
		}
		return totalpage;
	}
	public List selectByPage(int page, int line) {
		HashMap map = new HashMap();
		map.put("min", (page-1)*line);
		map.put("max", line);
		return adminDao.selectByPage(map);
	}
	public void deleteList(String[] ids) {
		adminDao.deleteList(ids);
	}
	public List selectByProperty(String propertyName, Object value) {
		HashMap map = new HashMap();
		map.put("pname", propertyName);
		map.put("val", value);
		return adminDao.selectByProperty(map);
	}
	public int selectTotal() {
		return adminDao.total();
	}
}
