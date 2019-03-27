package com.suibibk.chuangjianxing.abstractFactory;

public class Oracle implements DB{
	@Override
	public String select() {
		return "Oracle数据库查询";
	}
}
