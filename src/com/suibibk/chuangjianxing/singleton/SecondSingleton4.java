package com.suibibk.chuangjianxing.singleton;
/**
 * 	懒汉式单例模式，懒汉式单例模式最终解决方案
 * 	使用内部类来维护单例的实现，JVM内部机制能够保证一个类在被加载的时候，这个类的加载过程是线程互斥的。
 * @author suibibk.com
 *
 */
public class SecondSingleton4{
	private SecondSingleton4() {
		System.out.println("创建实例成功");
	}
	private static class SingleFactory{
		private static SecondSingleton4 instance = new SecondSingleton4();
	}
	public static  SecondSingleton4 getInstance() {
		System.out.println("调用单例模式的方法");
		return SingleFactory.instance;
	}
	public static void main(String[] args) {
		SecondSingleton4.getInstance();
	}

}
