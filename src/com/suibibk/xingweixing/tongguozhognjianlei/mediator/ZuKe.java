package com.suibibk.xingweixing.tongguozhognjianlei.mediator;

/**
 * 租客
 * @author suibibk.com
 *
 */
public class ZuKe extends User{
	@Override
	public void constact(String message) {
		getMediator().constact(message, this);
	}
	public void getMessage(String message) {
		System.out.println("租客收到消息："+message);
		System.out.println("租客回答我需要租房子");
	}
}
