package com.suibibk.jiegouxing.flyweight;

public class TestConnection {

	public static void main(String[] args) {
		ConnectionPool pool = new ConnectionPool(3);
		pool.getConnection();
		pool.getConnection();
		pool.getConnection();
		pool.getConnection();
		pool.close();
		pool.getConnection();
	}
}
