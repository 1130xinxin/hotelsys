package com.etc.model;
public class Types {
	private Integer tid;
	private String 	tname;
	private Integer num;
	private String 	image;
	private String 	ttext;
	private Integer price;
	private Double 	area;
	private int 	bed;
	private Double 	weiyu;
	
	public Types (){}
	public Types (Integer tid,String tname,Integer num,String image,String ttext,Integer price){
		this.tid = tid;
		this.tname = tname;
		this.num = num;
		this.image = image;
		this.ttext = ttext;
		this.price = price;
	}
	
	public Types(Integer tid, String tname, Integer num, String image, String ttext, Integer price, Double area,
			int bed, Double weiyu) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.num = num;
		this.image = image;
		this.ttext = ttext;
		this.price = price;
		this.area = area;
		this.bed = bed;
		this.weiyu = weiyu;
	}
	public Integer getTid(){
		return tid;
	}
	public void setTid(Integer tid){
		this.tid = tid;
	}
	public String getTname(){
		return tname;
	}
	public void setTname(String tname){
		this.tname = tname;
	}
	public Integer getNum(){
		return num;
	}
	public void setNum(Integer num){
		this.num = num;
	}
	public String getImage(){
		return image;
	}
	public void setImage(String image){
		this.image = image;
	}
	public String getTtext(){
		return ttext;
	}
	public void setTtext(String ttext){
		this.ttext = ttext;
	}
	public Integer getPrice(){
		return price;
	}
	public void setPrice(Integer price){
		this.price = price;
	}
	@Override
	public String toString() {
		return "Types [tid=" + tid + ", tname=" + tname + ", num=" + num + ", image=" + image + ", ttext=" + ttext
				+ ", price=" + price + ", area=" + area + ", bed=" + bed + ", weiyu=" + weiyu + "]";
	}
	
}
