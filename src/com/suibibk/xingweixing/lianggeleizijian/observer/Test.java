package com.suibibk.xingweixing.lianggeleizijian.observer;

public class Test {

	public static void main(String[] args) {
		//建立一个主题
		Subject subject = new SubjectA();
		Observer a = new ObserverA();
		Observer b = new ObserverB();
		//观察主题A
		a.addSubject(subject);
		//观察主题A
		b.addSubject(subject);
		//主题A有变化
		subject.change();
		a.addSubject(subject);
		

	}

}
