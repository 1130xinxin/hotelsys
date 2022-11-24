package com.etc.service;
import com.etc.model.Gonggao;

import java.util.List;
public interface GonggaoService {
	public void insert(Gonggao gonggao);
	public void update(Gonggao gonggao);
	public void delete(Integer gid);
	public Gonggao selectOne(Integer gid);
	public List selectList();
	public int totalPage(int line);
	public List selectByPage(int page, int line);
	public void deleteList(String [] ids);
	public List selectByProperty(String propertyName, Object value);
	public int selectTotal();
}
