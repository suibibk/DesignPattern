package com.suibibk.xingweixing.lianggeleizijian.chainofResponsibility;

public class Test {

	public static void main(String[] args) {
		AbstractHandler myHandler1 = new MyHandler1();
		AbstractHandler myHandler2 = new MyHandler2();
		AbstractHandler myHandler3 = new MyHandler3();
		myHandler1.setHandler(myHandler2);
		myHandler2.setHandler(myHandler3);
		myHandler1.operation("我是一个待处理的字符串");
	}
}
