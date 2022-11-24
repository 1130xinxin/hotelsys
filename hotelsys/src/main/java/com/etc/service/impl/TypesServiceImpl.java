package com.etc.service.impl;

import com.etc.model.Types;
import com.etc.service.TypesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.etc.dao.TypesDao;

import java.util.List;

import java.util.HashMap;

@Service
@Transactional
public class TypesServiceImpl implements TypesService {
	@Autowired
	private TypesDao typesDao;
	public void insert(Types types){
		typesDao.insert(types);
	}
	public void update(Types types){
		typesDao.update(types);
	}
	public void delete(Integer tid){
		typesDao.delete(tid);
	}
	public Types selectOne(Integer tid){
		return typesDao.selectOne(tid);
	}
	public List selectList(){
		return typesDao.selectList();
	}
	public int totalPage(int line) {
		int total = typesDao.total();
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
		return typesDao.selectByPage(map);
	}
	public void deleteList(String[] ids) {
		typesDao.deleteList(ids);
	}
	public List selectByProperty(String propertyName, Object value) {
		HashMap map = new HashMap();
		map.put("pname", propertyName);
		map.put("val", value);
		return typesDao.selectByProperty(map);
	}
	public int selectTotal() {
		return typesDao.total();
	}
	@Override
	public void updateNum(Integer tid) {
		// TODO Auto-generated method stub
		typesDao.updateNum(tid);
	}
	@Override
	public List selectPrice(int price) {
		// TODO Auto-generated method stub
		return typesDao.selectPrice(price);
	}
}
