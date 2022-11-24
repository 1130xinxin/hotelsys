package com.etc.model;
public class Hinfo {
	private Integer hid;
	private String htext;
	private Integer tid;
	private Integer price;
	private String htemp;
	public Hinfo (){}
	public Hinfo (Integer hid,String htext,Integer tid,Integer price,String htemp){
		this.hid = hid;
		this.htext = htext;
		this.tid = tid;
		this.price = price;
		this.htemp = htemp;
	}
	public Integer getHid(){
		return hid;
	}
	public void setHid(Integer hid){
		this.hid = hid;
	}
	public String getHtext(){
		return htext;
	}
	public void setHtext(String htext){
		this.htext = htext;
	}
	public Integer getTid(){
		return tid;
	}
	public void setTid(Integer tid){
		this.tid = tid;
	}
	public Integer getPrice(){
		return price;
	}
	public void setPrice(Integer price){
		this.price = price;
	}
	public String getHtemp(){
		return htemp;
	}
	public void setHtemp(String htemp){
		this.htemp = htemp;
	}
	public String toString(){
		return "Hinfo [hid=" + hid + ", htext=" + htext + ", tid=" + tid + ", price=" + price + ", htemp=" + htemp + "]";
	}
}
