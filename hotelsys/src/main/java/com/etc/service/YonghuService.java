package com.etc.service;
import com.etc.model.Yonghu;

import java.util.List;
public interface YonghuService {
	public void insert(Yonghu yonghu);
	public void update(Yonghu yonghu);
	public void delete(String yid);
	public Yonghu selectOne(String yid);
	public List selectList();
	public int totalPage(int line);
	public List selectByPage(int page, int line);
	public void deleteList(String [] ids);
	public List selectByProperty(String propertyName, Object value);
	public int selectTotal();
}
