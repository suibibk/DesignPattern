package com.suibibk.chuangjianxing.singleton;
/**
 * 	懒汉式单例模式，对加锁后的改进方法1，用双重检验机制，提高效率;
 * 	但是在Java指令中创建对象和赋值操作是分开进行的，也就是说singleton = new SecondSingleton3();
 * 	语句是分两步执行的。但是JVM并不保证这两个操作的先后顺序，也就是说有可能JVM会为新的Singleton实例分配空间，
 *       然后直接赋值给singleton成功，然后再去初始化这个SecondSingleton3实例。这样就有可能出错了
 * @author suibibk.com
 *
 */
public class SecondSingleton3{
	private static SecondSingleton3 singleton = null;
	private SecondSingleton3() {
		System.out.println("创建实例成功");
	}
	public static  SecondSingleton3 getInstance() {
		System.out.println("调用单例模式的方法");
		if(singleton==null) {
			synchronized(SecondSingleton3.class) {
				if(singleton==null) {
					singleton = new SecondSingleton3();
				}
			}
		}
		return singleton;
	}
	public static void main(String[] args) {
		SecondSingleton3.getInstance();
	}

}
