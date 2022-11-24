package com.etc.service;
import com.etc.model.Admin;

import java.util.List;
public interface AdminService {
	public void insert(Admin admin);
	public void update(Admin admin);
	public void delete(String loginid);
	public Admin selectOne(String loginid);
	public List selectList();
	public int totalPage(int line);
	public List selectByPage(int page, int line);
	public void deleteList(String [] ids);
	public List selectByProperty(String propertyName, Object value);
	public int selectTotal();
}
