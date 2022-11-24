package com.etc.model;
public class Horder {
	private Integer oid;
	private Integer yid;
	private Integer tid;
	private String start;
	private String end;
	private Integer days;
	private Integer price;
	private Integer total;
	private String temp;
	private String tname;
	
	
	public Horder(Integer oid, Integer yid, Integer tid, String start, String end, Integer days, Integer price,
			Integer total, String temp, String tname) {
		super();
		this.oid = oid;
		this.yid = yid;
		this.tid = tid;
		this.start = start;
		this.end = end;
		this.days = days;
		this.price = price;
		this.total = total;
		this.temp = temp;
		this.tname = tname;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public Horder (){}
	public Horder (Integer oid,Integer yid,Integer tid,String start,String end,Integer days,Integer price,Integer total,String temp){
		this.oid = oid;
		this.yid = yid;
		this.tid = tid;
		this.start = start;
		this.end = end;
		this.days = days;
		this.price = price;
		this.total = total;
		this.temp = temp;
	}
	public Integer getOid(){
		return oid;
	}
	public void setOid(Integer oid){
		this.oid = oid;
	}
	public Integer getYid(){
		return yid;
	}
	public void setYid(Integer yid){
		this.yid = yid;
	}
	public Integer getTid(){
		return tid;
	}
	public void setTid(Integer tid){
		this.tid = tid;
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
	public Integer getDays(){
		return days;
	}
	public void setDays(Integer days){
		this.days = days;
	}
	public Integer getPrice(){
		return price;
	}
	public void setPrice(Integer price){
		this.price = price;
	}
	public Integer getTotal(){
		return total;
	}
	public void setTotal(Integer total){
		this.total = total;
	}
	public String getTemp(){
		return temp;
	}
	public void setTemp(String temp){
		this.temp = temp;
	}
	@Override
	public String toString() {
		return "Horder [oid=" + oid + ", yid=" + yid + ", tid=" + tid + ", start=" + start + ", end=" + end + ", days="
				+ days + ", price=" + price + ", total=" + total + ", temp=" + temp + ", tname=" + tname + "]";
	}
	
}
