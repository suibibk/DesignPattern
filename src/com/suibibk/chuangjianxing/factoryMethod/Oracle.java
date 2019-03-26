package com.suibibk.chuangjianxing.factoryMethod;

public class Oracle implements DB{
	@Override
	public String select() {
		return "Oracle数据库查询";
	}
}
