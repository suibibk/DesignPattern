package com.suibibk.xingweixing.lianggeleizijian.observer;

public interface Subject {
	public void addObserver(Observer observer);
	public void removeObserver(Observer observer);
	//Object中有，这里就不用notifyAll啦
	public void notifyAll1();
	public void change();
}
