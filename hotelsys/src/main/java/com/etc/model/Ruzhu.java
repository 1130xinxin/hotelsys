package com.etc.model;
public class Ruzhu {
	private Integer rid;
	private Integer oid;
	private Integer hid;
	private String 	uname;
	private String 	tel;
	private String 	start;
	private String 	end;
	private Integer yajin;
	private Integer yufu;
	private Integer total;
	private String 	rtemp;
	public Ruzhu (){}
	public Ruzhu (Integer rid,Integer oid,Integer hid,String uname,String tel,String start,String end,Integer yajin,Integer yufu,Integer total,String rtemp){
		this.rid = rid;
		this.oid = oid;
		this.hid = hid;
		this.uname = uname;
		this.tel = tel;
		this.start = start;
		this.end = end;
		this.yajin = yajin;
		this.yufu = yufu;
		this.total = total;
		this.rtemp = rtemp;
	}
	public Integer getRid(){
		return rid;
	}
	public void setRid(Integer rid){
		this.rid = rid;
	}
	public Integer getOid(){
		return oid;
	}
	public void setOid(Integer oid){
		this.oid = oid;
	}
	public Integer getHid(){
		return hid;
	}
	public void setHid(Integer hid){
		this.hid = hid;
	}
	public String getUname(){
		return uname;
	}
	public void setUname(String uname){
		this.uname = uname;
	}
	public String getTel(){
		return tel;
	}
	public void setTel(String tel){
		this.tel = tel;
	}
	public String getStart(){
		return start;
	}
	public void setStart(String start){
		this.start = start;
	}
	public String getEnd(){
		return end;
	}
	public void setEnd(String end){
		this.end = end;
	}
	public Integer getYajin(){
		return yajin;
	}
	public void setYajin(Integer yajin){
		this.yajin = yajin;
	}
	public Integer getYufu(){
		return yufu;
	}
	public void setYufu(Integer yufu){
		this.yufu = yufu;
	}
	public Integer getTotal(){
		return total;
	}
	public void setTotal(Integer total){
		this.total = total;
	}
	public String getRtemp(){
		return rtemp;
	}
	public void setRtemp(String rtemp){
		this.rtemp = rtemp;
	}
	public String toString(){
		return "Ruzhu [rid=" + rid + ", oid=" + oid + ", hid=" + hid + ", uname=" + uname + ", tel=" + tel + ", start=" + start + ", end=" + end + ", yajin=" + yajin + ", yufu=" + yufu + ", total=" + total + ", rtemp=" + rtemp + "]";
	}
}
