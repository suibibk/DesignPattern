package com.suibibk.chuangjianxing.singleton;
/**
 * 	线程安全的饿汉式单利模式，虽然线程安全，但是没有调用方法前就被加载，会占用内存
 * 	所以懒汉式和饿汉式都有优缺点
 * 	 饿汉式优点： 在多线程模式下是安全的
	缺点： 没有调用方法前就被加载，会占用内存
	懒汉式优点：只有调用方法才创建对象，不会占用内存
	缺点：在多线程模式下不安全（这个要解决）
 * @author suibibk.com
 *
 */
public class FirstSingleton{
	private static FirstSingleton singleton = new FirstSingleton();
	private FirstSingleton() {
		System.out.println("创建实例成功");
	}
	public static FirstSingleton getInstance() {
		System.out.println("调用单例模式的方法");
		return singleton;
	}
	public static void main(String[] args) {
		FirstSingleton.getInstance();
	}

}
