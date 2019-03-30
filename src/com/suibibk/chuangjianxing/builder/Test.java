package com.suibibk.chuangjianxing.builder;

public class Test {

	public static void main(String[] args) {
		Direct d1 = new Direct(new OracleBuilder());
		Direct d2 = new Direct(new MySQLBuilder());
		DB db1 = d1.construct();
		DB db2 = d2.construct();
		System.out.println(db1);
		System.out.println(db2);
	}
}
