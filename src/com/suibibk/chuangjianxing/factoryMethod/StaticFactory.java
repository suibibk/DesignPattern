package com.suibibk.chuangjianxing.factoryMethod;
/**
 * 静态工厂方法模式
 * 将多个工厂方法模式里的方法置为静态的，不需要创建实例，直接调用即可。
 * @author suibibk.com
 *
 */
public class StaticFactory {
	public static DB productOracle() {
		return new Oracle();
	}
	public static DB productMySQL() {
		return new MySQL();
	}
	public static void main(String[] args) {
		DB db1 = StaticFactory.productOracle();
		DB db2 = StaticFactory.productMySQL();
		System.out.println(db1.select());
		System.out.println(db2.select());
	}
}
