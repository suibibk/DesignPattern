package com.suibibk.jiegouxing.decorator;
/**
 * 被装饰着
 * @author suibibk.com
 */
public class Source implements Sourceable{
	@Override
	public void method() {
		System.out.println("吃饭");
	}
}
