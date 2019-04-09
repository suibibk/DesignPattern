package com.suibibk.xingweixing.lianggeleizijian.chainofResponsibility;

public class MyHandler2 extends AbstractHandler{
	@Override
	public void operation(String name) {
		System.out.println("我是处理器2，我处理："+name);
		if(getHandler()!=null) {
			getHandler().operation(name);
		}
	}
}
