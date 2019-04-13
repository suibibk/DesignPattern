package com.suibibk.xingweixing.tongguozhognjianlei.interpreter;

public class Client {
	public static void main(String[] args) {
		//2-5+7
		Integer result=new ADDExpression().interpreter(
				new Context(new MinusExpression().interpreter(new Context(2, 5)), 7));
		System.out.println(result);
	}
}
