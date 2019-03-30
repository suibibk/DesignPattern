package com.suibibk.chuangjianxing.builder;
/**
 * 具体的建造者类：Oracle数据库
 * @author suibibk.com
 *
 */
public class OracleBuilder implements Builder{
	private DB db= new DB();
	@Override
	public void buildName() {
		db.setName("创建一个Oracle数据库");
	}

	@Override
	public void buildDesc() {
		db.setDesc("Oracle数据库用于作为企业级的数据存储中心使用");
	}
	@Override
	public DB createDB() {
		return db;
	}
}
