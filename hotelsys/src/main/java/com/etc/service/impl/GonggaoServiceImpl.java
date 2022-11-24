package com.etc.service.impl;

import com.etc.model.Gonggao;
import com.etc.service.GonggaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.etc.dao.GonggaoDao;

import java.util.List;

import java.util.HashMap;

@Service
@Transactional
public class GonggaoServiceImpl implements GonggaoService {
	@Autowired
	private GonggaoDao gonggaoDao;
	public void insert(Gonggao gonggao){
		gonggaoDao.insert(gonggao);
	}
	public void update(Gonggao gonggao){
		gonggaoDao.update(gonggao);
	}
	public void delete(Integer gid){
		gonggaoDao.delete(gid);
	}
	public Gonggao selectOne(Integer gid){
		return gonggaoDao.selectOne(gid);
	}
	public List selectList(){
		return gonggaoDao.selectList();
	}
	public int totalPage(int line) {
		int total = gonggaoDao.total();
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
		return gonggaoDao.selectByPage(map);
	}
	public void deleteList(String[] ids) {
		gonggaoDao.deleteList(ids);
	}
	public List selectByProperty(String propertyName, Object value) {
		HashMap map = new HashMap();
		map.put("pname", propertyName);
		map.put("val", value);
		return gonggaoDao.selectByProperty(map);
	}
	public int selectTotal() {
		return gonggaoDao.total();
	}
}
