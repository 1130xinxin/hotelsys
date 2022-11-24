package com.etc.model;
public class Gonggao {
	private Integer gid;
	private String title;
	private String gtext;
	private String ctime;
	public Gonggao (){}
	public Gonggao (Integer gid,String title,String gtext,String ctime){
		this.gid = gid;
		this.title = title;
		this.gtext = gtext;
		this.ctime = ctime;
	}
	public Integer getGid(){
		return gid;
	}
	public void setGid(Integer gid){
		this.gid = gid;
	}
	public String getTitle(){
		return title;
	}
	public void setTitle(String title){
		this.title = title;
	}
	public String getGtext(){
		return gtext;
	}
	public void setGtext(String gtext){
		this.gtext = gtext;
	}
	public String getCtime(){
		return ctime;
	}
	public void setCtime(String ctime){
		this.ctime = ctime;
	}
	public String toString(){
		return "Gonggao [gid=" + gid + ", title=" + title + ", gtext=" + gtext + ", ctime=" + ctime + "]";
	}
}
