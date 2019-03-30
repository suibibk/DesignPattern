package com.suibibk.chuangjianxing.singleton;
/**
 * 	懒汉式单例模式，在getInstance方法上加锁，解决线程安全问题
 *  synchronized关键字锁住的是这个对象，这样的用法，在性能上会有所下降，
 * 	因为每次调用getInstance(),都要对对象上锁，事实上，
 * 	只有在第一次创建对象的时候需要加上锁，之后就不需要了，所以这个地方需要改进。
 * @author suibibk.com
 *
 */
public class SecondSingleton2{
	private static SecondSingleton2 singleton = null;
	private SecondSingleton2() {
		System.out.println("创建实例成功");
	}
	public static synchronized  SecondSingleton2 getInstance() {
		System.out.println("调用单例模式的方法");
		if(singleton==null) {
			singleton = new SecondSingleton2();
		}
		return singleton;
	}
	public static void main(String[] args) {
		SecondSingleton2.getInstance();
	}

}
