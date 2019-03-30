package com.suibibk.chuangjianxing.builder;
/**
 * 具体的建造者类:MySQL数据库
 * @author suibibk.com
 *
 */
public class MySQLBuilder implements Builder{
	private DB db= new DB();
	@Override
	public void buildName() {
		db.setName("创建一个MySQL数据库");
	}

	@Override
	public void buildDesc() {
		db.setDesc("MySQL数据库用于作为一个免费的的数据存储中心使用");
	}

	@Override
	public DB createDB() {
		return db;
	}

}
