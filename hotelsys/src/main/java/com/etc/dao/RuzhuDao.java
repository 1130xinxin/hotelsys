package com.etc.dao;
import com.etc.model.Ruzhu;

import java.util.List;
public interface RuzhuDao extends BaseDao {
	public void insert(Ruzhu ruzhu);
	public void update(Ruzhu ruzhu);
	public void delete(Integer rid);
	public Ruzhu selectOne(Integer rid);
	public List selectList();
}
