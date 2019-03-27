package com.suibibk.chuangjianxing.abstractFactory;
/**
 * 测试类
 * @author suibibk.com
 *
 */
public class App {

	public static void main(String[] args) {
		Provide provide1 = new OracleFactory();
		Provide provide2 = new MySQLFactory();
		DB db1 = provide1.product();
		DB db2 = provide2.product();
		System.out.println(db1.select());
		System.out.println(db2.select());
	}

}
