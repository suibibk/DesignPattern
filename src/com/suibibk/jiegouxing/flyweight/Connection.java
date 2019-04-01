package com.suibibk.jiegouxing.flyweight;

public class Connection {
	private String ip;
	private String port;
	private String username;
	private String passward;
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassward() {
		return passward;
	}
	public void setPassward(String passward) {
		this.passward = passward;
	}
	//获取数据库连接
	public Connection(String ip, String port, String username, String passward) {
		super();
		this.ip = ip;
		this.port = port;
		this.username = username;
		this.passward = passward;
		System.out.println("获取一个新的数据库连接");
	}
}
