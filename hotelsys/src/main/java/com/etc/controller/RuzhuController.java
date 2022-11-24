package com.etc.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.etc.model.Ruzhu;
import com.etc.service.RuzhuService;

@RestController
@RequestMapping("/ruzhu")
public class RuzhuController {
	
	@Autowired
	private RuzhuService ruzhuService;
	
	@RequestMapping("/insert")
	public String insert(@RequestBody Ruzhu ruzhu){
		try {
			ruzhuService.insert(ruzhu);
			return "1";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "0";
	}
	@RequestMapping("/update")
	public String update(@RequestBody Ruzhu ruzhu){
		try {
			ruzhuService.update(ruzhu);
			return "1";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "0";
	}
	@RequestMapping("/delete")
	public String delete(Integer rid){
		try {
			ruzhuService.delete(rid);
			return "1";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "0";
	}
	@RequestMapping("/selectOne")
	public Ruzhu selectOne(Integer rid){
		Ruzhu ruzhu = null;
		try {
			ruzhu = ruzhuService.selectOne(rid);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ruzhu;
	}
	@RequestMapping("/selectList")
	public List selectList(){
		List ruzhus = null;
		try {
			ruzhus = ruzhuService.selectList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ruzhus;
	}
	@RequestMapping("/deleteList/{id}")
	public String deleteList(@PathVariable String id){
		try {
			String[] ids = id.split(",");
			ruzhuService.deleteList(ids);
			return "1";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "0";
	}
	@RequestMapping("/totalPage")
	public int totalPage(int line){
		int total = 0;
		try {
			total = ruzhuService.totalPage(line);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return total;
	}
	@RequestMapping("/selectByPage")
	public List selectByPage(int page, int line){
		List list = null;
		try {
			list = ruzhuService.selectByPage(page, line);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	@RequestMapping("/selectByProperty")
	public List selectByProperty(String propertyName, String value){
		List list = null;
		try {
			list = ruzhuService.selectByProperty(propertyName, value);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	@RequestMapping("/selectTotal")
	public int selectTotal(){
		int total = 0;
		try {
			total = ruzhuService.selectTotal();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return total;
	}
}
