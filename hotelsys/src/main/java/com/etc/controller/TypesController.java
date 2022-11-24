package com.etc.controller;
import java.io.File;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.etc.model.Types;
import com.etc.service.TypesService;
//import com.sun.glass.ui.Application;

@RestController
@RequestMapping("/types")
public class TypesController {
	
	@Autowired
	private ServletContext app;
	
	@Autowired
	private TypesService typesService;
	
	@RequestMapping("/insert")
	public String insert(Types types,MultipartFile upload){
		System.out.println(types);
		try {
			//获取文件名
			String name = upload.getOriginalFilename();
			System.out.println("name:"+name);
			
			Date date = new Date();
			SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-ddHHmmss");
			String str = sf.format(date);
			str += types.getTid();
			String str1 = name.substring(name.lastIndexOf("."));
			name = str+str1;
			System.out.println("name:"+name);
			
			//文件上传的路径
			String path = ClassLoader.getSystemResource("static").toString();
//			String path = app.getRealPath("/upload");
			path = path.substring(path.indexOf("/")+1)+"/upload";
			System.out.println("path:"+path);
//			创建文件
			File file = new File(path, name);
			try {
				upload.transferTo(file);
				System.out.println("文件上传成功");
			} catch (Exception e) {
				e.printStackTrace();
			}
			types.setImage("upload/"+name);
			
			typesService.insert(types);
			return "1";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "0";
	}
	
	
	@RequestMapping("/update")
	public String update(Types types,MultipartFile upload){
		try {
			//获取文件名
			String name = upload.getOriginalFilename();
			System.out.println("name:"+name);
			
			Date date = new Date();
			SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-ddHHmmss");
			String str = sf.format(date);
			str += types.getTid();
			String str1 = name.substring(name.lastIndexOf("."));
			name = str+str1;
			System.out.println("name:"+name);

			//文件上传的路径
			String path = ClassLoader.getSystemResource("static").toString();
//			String path = app.getRealPath("/upload");
			path = path.substring(path.indexOf("/")+1)+"/upload";
			System.out.println("path:"+path);
//			创建文件
			File file = new File(path, name);
			try {
				upload.transferTo(file);
				System.out.println("文件上传成功");
			} catch (Exception e) {
				e.printStackTrace();
			}
			types.setImage("upload/"+name);
			
			typesService.update(types);
			return "1";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "0";
	}
	
	@RequestMapping("/updateNum")
	public String updateNum(Integer tid){
		try {
			System.out.println(tid);
			typesService.updateNum(tid);
			return "1";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "0";
	}
	
	@RequestMapping("/delete")
	public String delete(Integer tid){
		try {
			typesService.delete(tid);
			return "1";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "0";
	}
	@RequestMapping("/selectOne")
	public Types selectOne(Integer tid){
		Types types = null;
		try {
			types = typesService.selectOne(tid);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return types;
	}
	@RequestMapping("/selectTid")
	public List selectTid(Integer tid){
		List list = new ArrayList();
		Types types = null;
		try {
			types = typesService.selectOne(tid);
			list.add(types);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	@RequestMapping("/selectList")
	public List selectList(){
		List typess = null;
		try {
			typess = typesService.selectList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return typess;
	}
	@RequestMapping("/deleteList/{id}")
	public String deleteList(@PathVariable String id){
		try {
			String[] ids = id.split(",");
			typesService.deleteList(ids);
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
			total = typesService.totalPage(line);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return total;
	}
	@RequestMapping("/selectByPage")
	public List selectByPage(int page, int line){
		List list = null;
		try {
			list = typesService.selectByPage(page, line);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	@RequestMapping("/selectByProperty")
	public List selectByProperty(String propertyName, String value){
		List list = null;
		try {
			list = typesService.selectByProperty(propertyName, value);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	@RequestMapping("/selectTotal")
	public int selectTotal(){
		int total = 0;
		try {
			total = typesService.selectTotal();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return total;
	}
	
	@RequestMapping("/selectPrice")
	public List selectPrice(int price){
		System.out.println(price);
		List typess = null;
		try {
			typess = typesService.selectPrice(price);
			System.out.println(typess);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return typess;
	}
}
