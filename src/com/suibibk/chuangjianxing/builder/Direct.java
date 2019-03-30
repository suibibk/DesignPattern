package com.suibibk.chuangjianxing.builder;

public class Direct {
	private Builder builder;
	public Direct(Builder builder) {
		this.builder= builder;
	}
	/**
	 * 创建产品
	 * @return
	 */
	public DB construct() {
		builder.buildName();
		builder.buildDesc();
		DB db = builder.createDB();
		return db;
	}
}
