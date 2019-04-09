package com.suibibk.xingweixing.lianggeleizijian.command;

public class Test {
	public static void main(String[] args) {
		Receive receive = new Receive();
		Command command = new ConcreteCommand1(receive);
		Invoke invoke = new Invoke(command);
		invoke.doCommand();
	}
}
