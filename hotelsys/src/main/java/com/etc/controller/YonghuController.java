package com.etc.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.etc.model.Yonghu;
import com.etc.service.YonghuService;

@RestController
@RequestMapping("/yonghu")
public class YonghuController {
	
	@Autowired
	private YonghuService yonghuService;
	
	@RequestMapping("/insert")
	public String insert(@RequestBody Yonghu yonghu){
		try {
			System.out.println("yonghu:"+yonghu);
			yonghuService.insert(yonghu);
			return "1";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "0";
	}
	@RequestMapping("/update")
	public String update(@RequestBody Yonghu yonghu){
		try {
			yonghuService.update(yonghu);
			return "1";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "0";
	}
	
	@RequestMapping("/delete")
	public String delete(String yid){
		try {
			yonghuService.delete(yid);
			return "1";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "0";
	}
	@RequestMapping("/selectOne")
	public Yonghu selectOne(String yid){
		Yonghu yonghu = null;
		try {
			yonghu = yonghuService.selectOne(yid);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return yonghu;
	}
	@RequestMapping("/selectList")
	public List selectList(){
		List yonghus = null;
		try {
			yonghus = yonghuService.selectList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return yonghus;
	}
	@RequestMapping("/deleteList/{id}")
	public String deleteList(@PathVariable String id){
		try {
			String[] ids = id.split(",");
			yonghuService.deleteList(ids);
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
			total = yonghuService.totalPage(line);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return total;
	}
	@RequestMapping("/selectByPage")
	public List selectByPage(int page, int line){
		List list = null;
		try {
			list = yonghuService.selectByPage(page, line);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	@RequestMapping("/selectByProperty")
	public List selectByProperty(String propertyName, String value){
		List list = null;
		try {
			list = yonghuService.selectByProperty(propertyName, value);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	@RequestMapping("/selectTotal")
	public int selectTotal(){
		int total = 0;
		try {
			total = yonghuService.selectTotal();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return total;
	}
}
