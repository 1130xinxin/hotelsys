package com.etc.dao;
import com.etc.model.Yonghu;

import java.util.List;
public interface YonghuDao extends BaseDao {
	public void insert(Yonghu yonghu);
	public void update(Yonghu yonghu);
	public void delete(String yid);
	public Yonghu selectOne(String yid);
	public List selectList();
}
