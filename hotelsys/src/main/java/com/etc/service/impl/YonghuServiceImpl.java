package com.etc.service.impl;

import com.etc.model.Yonghu;
import com.etc.service.YonghuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.etc.dao.YonghuDao;

import java.util.List;

import java.util.HashMap;

@Service
@Transactional
public class YonghuServiceImpl implements YonghuService {
	@Autowired
	private YonghuDao yonghuDao;
	public void insert(Yonghu yonghu){
		yonghuDao.insert(yonghu);
	}
	public void update(Yonghu yonghu){
		yonghuDao.update(yonghu);
	}
	public void delete(String yid){
		yonghuDao.delete(yid);
	}
	public Yonghu selectOne(String yid){
		return yonghuDao.selectOne(yid);
	}
	public List selectList(){
		return yonghuDao.selectList();
	}
	public int totalPage(int line) {
		int total = yonghuDao.total();
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
		return yonghuDao.selectByPage(map);
	}
	public void deleteList(String[] ids) {
		yonghuDao.deleteList(ids);
	}
	public List selectByProperty(String propertyName, Object value) {
		HashMap map = new HashMap();
		map.put("pname", propertyName);
		map.put("val", value);
		return yonghuDao.selectByProperty(map);
	}
	public int selectTotal() {
		return yonghuDao.total();
	}
}
