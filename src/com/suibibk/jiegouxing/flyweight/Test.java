package com.suibibk.jiegouxing.flyweight;

public class Test {

	public static void main(String[] args) {
		FlyweightFactory.getFlyweight("A");
		FlyweightFactory.getFlyweight("B");
		FlyweightFactory.getFlyweight("C");
		FlyweightFactory.getFlyweight("A");
		FlyweightFactory.getFlyweight("B");
	}
}
