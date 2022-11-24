package com.etc.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.etc.model.Horder;
import com.etc.service.HorderService;
import com.etc.service.TypesService;

@RestController
@RequestMapping("/horder")
public class HorderController {
	
	@Autowired
	private HorderService horderService;
	@Autowired
	private TypesService typeService;
	
	@RequestMapping("/insert")
	public String insert(@RequestBody Horder horder){
		try {
			System.out.println(horder);
			horderService.insert(horder);
//			typeService.updateNum(horder.getTid());
			return "1";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "0";
	}
	@RequestMapping("/update")
	public String update(@RequestBody Horder horder){
		try {
			horderService.update(horder);
			return "1";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "0";
	}
	@RequestMapping("/delete")
	public String delete(Integer oid){
		try {
			horderService.delete(oid);
			return "1";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "0";
	}
	@RequestMapping("/selectOne")
	public Horder selectOne(Integer oid){
		Horder horder = null;
		try {
			horder = horderService.selectOne(oid);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return horder;
	}
	@RequestMapping("/selectList")
	public List selectList(){
		List horders = null;
		try {
			horders = horderService.selectList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return horders;
	}
	@RequestMapping("/selectListByYid")
	public List selectListByYid(Integer yid){
		List horders = null;
		try {
			horders = horderService.selectListByYid(yid);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return horders;
	}
	@RequestMapping("/deleteList/{id}")
	public String deleteList(@PathVariable String id){
		try {
			String[] ids = id.split(",");
			horderService.deleteList(ids);
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
			total = horderService.totalPage(line);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return total;
	}
	@RequestMapping("/selectByPage")
	public List selectByPage(int page, int line){
		List list = null;
		try {
			list = horderService.selectByPage(page, line);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	@RequestMapping("/selectByProperty")
	public List selectByProperty(String propertyName, String value){
		List list = null;
		try {
			list = horderService.selectByProperty(propertyName, value);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	@RequestMapping("/selectTotal")
	public int selectTotal(){
		int total = 0;
		try {
			total = horderService.selectTotal();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return total;
	}
	
	@RequestMapping("/selectYuNum")
	public int selectYuNum(@RequestBody Horder horder) {
		int total = 0;
		try {
			System.out.println(horder);
			total = horderService.selectYuNum(horder);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return total;
	}
	@RequestMapping("/selectCount1")
	public int selectCount1(Integer yid) {
		int total = 0;
		try {
			total = horderService.selectCount1(yid);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return total;
	}
	
	@RequestMapping("/selectDing")
	public List selectDing(){
		List list = null;
		try {
			list = horderService.selectDing();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
