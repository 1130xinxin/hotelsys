package com.etc.model;
public class Admin {
	private String loginid;
	private String name;
	private String loginpwd;
	private String tel;
	private String role;
	
	public Admin (){}
	public Admin (String loginid,String name,String loginpwd,String tel,String role){
		this.loginid = loginid;
		this.name = name;
		this.loginpwd = loginpwd;
		this.tel = tel;
		this.role = role;
	}
	public String getLoginid(){
		return loginid;
	}
	public void setLoginid(String loginid){
		this.loginid = loginid;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getLoginpwd(){
		return loginpwd;
	}
	public void setLoginpwd(String loginpwd){
		this.loginpwd = loginpwd;
	}
	public String getTel(){
		return tel;
	}
	public void setTel(String tel){
		this.tel = tel;
	}
	public String getRole(){
		return role;
	}
	public void setRole(String role){
		this.role = role;
	}
	public String toString(){
		return "Admin [loginid=" + loginid + ", name=" + name + ", loginpwd=" + loginpwd + ", tel=" + tel + ", role=" + role + "]";
	}
}
