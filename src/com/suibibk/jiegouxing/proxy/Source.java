package com.suibibk.jiegouxing.proxy;
/**
 * 被代理类
 * @author suibibk.com
 */
public class Source implements Sourceable{
	@Override
	public void method() {
		System.out.println("打官司");
	}
}
