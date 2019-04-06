package com.suibibk.xingweixing.lianggeleizijian.observer;
/**
 * 	具体观察者
 * @author suibibk.com
 */
public class ObserverB implements Observer {
	@Override
	public void update() {
		System.out.println("ObserverB观察的主题有变化，需要做调整");
	}
	@Override
	public void removeSubject(Subject subject) {
		subject.removeObserver(this);
	}
	@Override
	public void addSubject(Subject subject) {
		subject.addObserver(this);
	}

}
