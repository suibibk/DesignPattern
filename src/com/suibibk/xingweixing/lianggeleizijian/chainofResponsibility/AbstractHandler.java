package com.suibibk.xingweixing.lianggeleizijian.chainofResponsibility;

public abstract class AbstractHandler {
	private AbstractHandler handler;

	public AbstractHandler getHandler() {
		return handler;
	}

	public void setHandler(AbstractHandler handler) {
		this.handler = handler;
	}
	public abstract void operation(String name);
}
