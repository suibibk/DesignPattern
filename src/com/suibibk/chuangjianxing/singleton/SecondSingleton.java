package com.suibibk.chuangjianxing.singleton;
/**
 * 	懒汉式单例模式，第一种：这种只是简单的符合饿汉式单例模式，在高并发的情况下线程不安全
 * @author suibibk.com
 *
 */
public class SecondSingleton{
	private static SecondSingleton singleton = null;
	private SecondSingleton() {
		System.out.println("创建实例成功");
	}
	public static SecondSingleton getInstance() {
		System.out.println("调用单例模式的方法");
		if(singleton==null) {
			singleton = new SecondSingleton();
		}
		return singleton;
	}
	public static void main(String[] args) {
		SecondSingleton.getInstance();
	}

}
