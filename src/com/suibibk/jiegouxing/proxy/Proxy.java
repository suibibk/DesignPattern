package com.suibibk.jiegouxing.proxy;
/**
 * 代理模式：这里跟装饰者模式的区别是，不需要传入source对象
 * @author suibibk.com
 */
public class Proxy implements Sourceable{

	private Source source;
	public Proxy() {
		super();
		source = new Source();
	}
	
	@Override
	public void method() {
		System.out.println("收集资料");
		source.method();
		System.out.println("法庭辩论");
	}
}
