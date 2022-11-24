package com.etc.dao;
import com.etc.model.Horder;

import java.util.List;
public interface HorderDao extends BaseDao {
	public void insert(Horder horder);
	public void update(Horder horder);
	public void delete(Integer oid);
	public Horder selectOne(Integer oid);
	public List selectList();
	public List selectListByYid(Integer yid);
	public int selectYuNum(Horder horder);//查询某个时间段内，某种房型预订的数量
	public int selectCount1(Integer yid);//查询某种房型的总数量
	public List selectDing();//统计预定数量
}
