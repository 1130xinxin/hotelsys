package com.etc.model;
public class Yonghu {
	private String yid;
	private String name;
	private String pwd;
	private String tel;
	private String email;
	private String idcard;
	
	public Yonghu (){}
	public Yonghu (String yid,String name,String pwd,String tel,String email,String idcard){
		this.yid = yid;
		this.name = name;
		this.pwd = pwd;
		this.tel = tel;
		this.email = email;
		this.idcard = idcard;
	}
	public String getYid(){
		return yid;
	}
	public void setYid(String yid){
		this.yid = yid;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getPwd(){
		return pwd;
	}
	public void setPwd(String pwd){
		this.pwd = pwd;
	}
	public String getTel(){
		return tel;
	}
	public void setTel(String tel){
		this.tel = tel;
	}
	public String getEmail(){
		return email;
	}
	public void setEmail(String email){
		this.email = email;
	}
	public String getIdcard(){
		return idcard;
	}
	public void setIdcard(String idcard){
		this.idcard = idcard;
	}
	public String toString(){
		return "Yonghu [yid=" + yid + ", name=" + name + ", pwd=" + pwd + ", tel=" + tel + ", email=" + email + ", idcard=" + idcard + "]";
	}
}
