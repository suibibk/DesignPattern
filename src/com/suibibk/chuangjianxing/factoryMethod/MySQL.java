package com.suibibk.chuangjianxing.factoryMethod;

public class MySQL implements DB{
	@Override
	public String select() {
		return "MySQL数据库查询";
	}
}
