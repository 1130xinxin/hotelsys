package com.etc.dao;
import com.etc.model.Admin;

import java.util.List;
public interface AdminDao extends BaseDao {
	public void insert(Admin admin);
	public void update(Admin admin);
	public void delete(String loginid);
	public Admin selectOne(String loginid);
	public List selectList();
}
