package com.suibibk.xingweixing.lianggeleizijian.command;
/**
 * 	传递命令对象Invoker：持有命令对象，要求命令对象执行请求。
 * @author suibibk.com
 */
public class Invoke {
	private Command command;
	public Invoke(Command command) {
		this.command=command;
	}
	//发布命令
	public void doCommand() {
		System.out.println("我要发布命令");
		command.exec();
	}
}
