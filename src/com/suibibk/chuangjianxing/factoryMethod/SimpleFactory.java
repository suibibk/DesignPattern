package com.suibibk.chuangjianxing.factoryMethod;
/**
 * 普通工厂方法模式
 * 普通工厂方法模式，根据传过来的类型生成相应的对象
 * @author suibibk.com
 */
public class SimpleFactory {
	public DB product(String DBName) {
		if("Oracle".equals(DBName)) {
			return new Oracle();
		}else if("MySQL".equals(DBName)) {
			return new MySQL();
		}else {
			System.out.println("请输入正确的类型");
			return null;
		}
	}
	public static void main(String[] args) {
		SimpleFactory simpleFactory = new SimpleFactory();
		DB db1 = simpleFactory.product("Oracle");
		DB db2 = simpleFactory.product("MySQL");
		System.out.println(db1.select());
		System.out.println(db2.select());
	}
}
