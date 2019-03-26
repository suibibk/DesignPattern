package com.suibibk.chuangjianxing.factoryMethod;
/**
 * 多个工厂方法模式
 * 为每一种产品都提供一个创建方法
 * @author suibibk.com
 *
 */
public class ManyFactory {
	public DB productOracle() {
		return new Oracle();
	}
	public DB productMySQL() {
		return new MySQL();
	}
	public static void main(String[] args) {
		ManyFactory manyFactory = new ManyFactory();
		DB db1 = manyFactory.productOracle();
		DB db2 = manyFactory.productMySQL();
		System.out.println(db1.select());
		System.out.println(db2.select());
	}
}
