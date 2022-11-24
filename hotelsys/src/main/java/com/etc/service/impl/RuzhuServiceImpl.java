package com.etc.service.impl;

import com.etc.model.Ruzhu;
import com.etc.service.RuzhuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.etc.dao.RuzhuDao;

import java.util.List;

import java.util.HashMap;

@Service
@Transactional
public class RuzhuServiceImpl implements RuzhuService {
	@Autowired
	private RuzhuDao ruzhuDao;
	public void insert(Ruzhu ruzhu){
		ruzhuDao.insert(ruzhu);
	}
	public void update(Ruzhu ruzhu){
		ruzhuDao.update(ruzhu);
	}
	public void delete(Integer rid){
		ruzhuDao.delete(rid);
	}
	public Ruzhu selectOne(Integer rid){
		return ruzhuDao.selectOne(rid);
	}
	public List selectList(){
		return ruzhuDao.selectList();
	}
	public int totalPage(int line) {
		int total = ruzhuDao.total();
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
		return ruzhuDao.selectByPage(map);
	}
	public void deleteList(String[] ids) {
		ruzhuDao.deleteList(ids);
	}
	public List selectByProperty(String propertyName, Object value) {
		HashMap map = new HashMap();
		map.put("pname", propertyName);
		map.put("val", value);
		return ruzhuDao.selectByProperty(map);
	}
	public int selectTotal() {
		return ruzhuDao.total();
	}
}
