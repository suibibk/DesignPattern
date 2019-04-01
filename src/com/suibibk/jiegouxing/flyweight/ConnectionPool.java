package com.suibibk.jiegouxing.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * 数据库连接池，当然这里没有考虑线程安全，只是为了给大家理解享元的概念。
 * @author suibibk.com
 */
public class ConnectionPool {
	private List<Connection> connections = new ArrayList<Connection>();
	private String ip="127.0.0.1";
	private String port="3306";
	private String username = "suibibk";
	private String password = "123456";
	private Connection connection = null;
	//创建连接池的时候初始化连接池的大小
	public ConnectionPool(int poolSize) {
		for (int i = 0; i <poolSize; i++) {
			connections.add(new Connection(ip, port, username, password));
		}
	}
	public Connection getConnection() {
		if(connections.size()>0) {
			connection = connections.get(0);
			connections.remove(connection);
			System.out.println("数据库中有连接，直接返回");
			return connection;
		}else {
			System.out.println("数据库连接池已用尽，初始化大小不足");
			return null;
		}
	}
	/**
	 * 关闭连接，这里是直接返回到连接池
	 */
	public void close() {
		System.out.println("释放一个连接");
		connections.add(connection);
	}
}
