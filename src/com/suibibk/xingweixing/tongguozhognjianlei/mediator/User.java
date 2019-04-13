package com.suibibk.xingweixing.tongguozhognjianlei.mediator;

public abstract class User {
	private Mediator mediator;
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}
	public Mediator getMediator() {
		return mediator;
	}
	public abstract void constact(String message) ;
}
