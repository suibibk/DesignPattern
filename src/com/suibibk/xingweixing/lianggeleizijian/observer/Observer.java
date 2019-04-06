package com.suibibk.xingweixing.lianggeleizijian.observer;
/**
 * 	观察者
 * @author suibibk.com
 *
 */
public interface Observer {
	public void update();
	//添加主题（被观察者）
	public void addSubject(Subject subject);
	//移除主题（被观察者）
	public void removeSubject(Subject subject);
}
