package com.etc.service;
import com.etc.model.Ruzhu;

import java.util.List;
public interface RuzhuService {
	public void insert(Ruzhu ruzhu);
	public void update(Ruzhu ruzhu);
	public void delete(Integer rid);
	public Ruzhu selectOne(Integer rid);
	public List selectList();
	public int totalPage(int line);
	public List selectByPage(int page, int line);
	public void deleteList(String [] ids);
	public List selectByProperty(String propertyName, Object value);
	public int selectTotal();
}
