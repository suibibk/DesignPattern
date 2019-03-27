package com.suibibk.chuangjianxing.abstractFactory;

public class MySQL implements DB{
	@Override
	public String select() {
		return "MySQL数据库查询";
	}
}
