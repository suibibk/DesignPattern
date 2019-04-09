package com.suibibk.xingweixing.lianggeleizijian.command;
/**
 * 	具体的命令对象ConcreteCommand：持有具体的接受者对象，完成具体的具体的命令。
 * @author suibibk.com
 */
public class ConcreteCommand1 implements Command {
	private Receive receive;
	public ConcreteCommand1(Receive receive) {
		this.receive=receive;
	}
	@Override
	public void exec() {
		receive.action();
	}
}
