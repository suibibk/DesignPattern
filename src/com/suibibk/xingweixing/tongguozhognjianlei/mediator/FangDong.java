package com.suibibk.xingweixing.tongguozhognjianlei.mediator;

/**
 * 房东
 * @author suibibk.com
 *
 */
public class FangDong extends User{

	@Override
	public void constact(String message) {
		getMediator().constact(message, this);
	}
	public void getMessage(String message) {
		System.out.println("房东收到消息："+message);
		System.out.println("房东回答。我这里有房子");
	}
}
