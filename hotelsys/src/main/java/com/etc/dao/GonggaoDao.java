package com.etc.dao;
import com.etc.model.Gonggao;

import java.util.List;
public interface GonggaoDao extends BaseDao {
	public void insert(Gonggao gonggao);
	public void update(Gonggao gonggao);
	public void delete(Integer gid);
	public Gonggao selectOne(Integer gid);
	public List selectList();
}
