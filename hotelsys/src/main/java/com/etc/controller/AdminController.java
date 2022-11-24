package com.etc.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.etc.model.Admin;
import com.etc.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	@RequestMapping("/selectLogin")
	public Admin selectLogin(@RequestBody Admin admin){
		try {
			Admin temp = adminService.selectOne(admin.getLoginid());
			if(temp!=null && temp.getLoginpwd().equals(admin.getLoginpwd())) {
				return temp;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@RequestMapping("/insert")
	public String insert(@RequestBody Admin admin){
		try {
			adminService.insert(admin);
			return "1";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "0";
	}
	@RequestMapping("/update")
	public String update(@RequestBody Admin admin){
		try {
			adminService.update(admin);
			return "1";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "0";
	}
	@RequestMapping("/delete")
	public String delete(String loginid){
		try {
			adminService.delete(loginid);
			return "1";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "0";
	}
	@RequestMapping("/selectOne")
	public Admin selectOne(String loginid){
		Admin admin = null;
		try {
			admin = adminService.selectOne(loginid);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return admin;
	}
	@RequestMapping("/selectOne1")
	public List selectOne1(String loginid){
		System.out.println(loginid);
		ArrayList list = new ArrayList();
		Admin admin = null;
		try {
			admin = adminService.selectOne(loginid);
			list.add(admin);
			System.out.println(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	@RequestMapping("/selectList")
	public List selectList(){
		List admins = null;
		try {
			admins = adminService.selectList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return admins;
	}
	@RequestMapping("/deleteList/{id}")
	public String deleteList(@PathVariable String id){
		try {
			String[] ids = id.split(",");
			adminService.deleteList(ids);
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
			total = adminService.totalPage(line);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return total;
	}
	@RequestMapping("/selectByPage")
	public List selectByPage(int page, int line){
		List list = null;
		try {
			list = adminService.selectByPage(page, line);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	@RequestMapping("/selectByProperty")
	public List selectByProperty(String propertyName, String value){
		List list = null;
		try {
			list = adminService.selectByProperty(propertyName, value);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	@RequestMapping("/selectTotal")
	public int selectTotal(){
		int total = 0;
		try {
			total = adminService.selectTotal();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return total;
	}
}
