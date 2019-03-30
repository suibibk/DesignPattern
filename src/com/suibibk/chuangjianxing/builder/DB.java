package com.suibibk.chuangjianxing.builder;
/**
 * 具体的产品。这里是数据库
 * @author suibibk.com
 */
public class DB {
	private String name="";
	private String desc="";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	@Override
	public String toString() {
		return "DB [name=" + name + ", desc=" + desc + "]";
	}
	
}
