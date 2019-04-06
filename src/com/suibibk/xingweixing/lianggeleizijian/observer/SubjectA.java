package com.suibibk.xingweixing.lianggeleizijian.observer;

import java.util.ArrayList;
import java.util.List;

public class SubjectA implements Subject{
	private List<Observer> observers = new ArrayList<Observer>();
	@Override
	public void addObserver(Observer observer) {
		//如果已经加入就不再加入
		for (Observer o : observers) {
			if(o.equals(observer)) {
				System.out.println("已经观察了");
				return;
			}
		}
		System.out.println("添加观察成功");
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		if(observers.contains(observer)){
			System.out.println("移除观察成功");
			observers.remove(observer);
		}
	}

	@Override
	public void notifyAll1() {
		for (Observer observer : observers) {
			observer.update();
		}
	}

	@Override
	public void change() {
		System.out.println("主题A有变化，将变化通知给观察者");
		notifyAll1();
	}

}
