package com.etc.service;
import com.etc.model.Horder;

import java.util.List;
public interface HorderService {
	public void insert(Horder horder);
	public void update(Horder horder);
	public void delete(Integer oid);
	public Horder selectOne(Integer oid);
	public List selectList();
	public int totalPage(int line);
	public List selectByPage(int page, int line);
	public void deleteList(String [] ids);
	public List selectByProperty(String propertyName, Object value);
	public int selectTotal();
	public List selectListByYid(Integer yid);
	
	public int selectYuNum(Horder horder);//查询某个时间段内，某种房型预订的数量
	public int selectCount1(Integer yid);//查询某种房型的总数量
	public List selectDing();
}
