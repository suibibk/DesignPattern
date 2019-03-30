package com.suibibk.jiegouxing.decorator;
/**
 * 装饰者
 * @author suibibk.com
 */
public class Decorator implements Sourceable{

	private Source source;
	
	public Decorator(Source source) {
		super();
		this.source = source;
	}
	@Override
	public void method() {
		System.out.println("煮饭");
		source.method();
		System.out.println("收拾碗筷");
	}
}
