package com.etc.controller;
import java.util.List;

import javax.websocket.OnOpen;
import javax.websocket.RemoteEndpoint.Basic;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

import com.etc.model.Gonggao;
import com.etc.service.GonggaoService;
import com.google.gson.Gson;

@RestController
@RequestMapping("/gonggao")
@ServerEndpoint("/gonggaoAll")
public class GonggaoController {
	
	@Autowired
	private GonggaoService gonggaoService;
	
	@RequestMapping("/insert")
	public String insert(@RequestBody Gonggao gonggao){
		try {
			gonggaoService.insert(gonggao);
			return "1";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "0";
	}
	@RequestMapping("/update")
	public String update(@RequestBody Gonggao gonggao){
		try {
			gonggaoService.update(gonggao);
			return "1";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "0";
	}
	@RequestMapping("/delete")
	public String delete(Integer gid){
		try {
			gonggaoService.delete(gid);
			return "1";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "0";
	}
	@RequestMapping("/selectOne")
	public Gonggao selectOne(Integer gid){
		Gonggao gonggao = null;
		try {
			gonggao = gonggaoService.selectOne(gid);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return gonggao;
	}
	@RequestMapping("/selectList")
	public List selectList(){
		List gonggaos = null;
		try {
			gonggaos = gonggaoService.selectList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return gonggaos;
	}
	@RequestMapping("/deleteList/{id}")
	public String deleteList(@PathVariable String id){
		try {
			String[] ids = id.split(",");
			gonggaoService.deleteList(ids);
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
			total = gonggaoService.totalPage(line);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return total;
	}
	@RequestMapping("/selectByPage")
	public List selectByPage(int page, int line){
		List list = null;
		try {
			list = gonggaoService.selectByPage(page, line);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	@RequestMapping("/selectByProperty")
	public List selectByProperty(String propertyName, String value){
		List list = null;
		try {
			list = gonggaoService.selectByProperty(propertyName, value);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	@RequestMapping("/selectTotal")
	public int selectTotal(){
		int total = 0;
		try {
			total = gonggaoService.selectTotal();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return total;
	}
	
	@OnOpen
	public void sayHello(Session session){
		WebApplicationContext beans = ContextLoader.getCurrentWebApplicationContext();
		GonggaoService ggService = (GonggaoService) beans.getBean("gonggaoServiceImpl");
		try {
			while (true) {
				Thread.sleep(10000);
				//若改变，推送到客户端
				List list = ggService.selectList();
				Gson gson = new Gson();
				String json = gson.toJson(list);
				Basic remote = session.getBasicRemote();
				remote.sendText(json);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
