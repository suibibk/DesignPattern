package com.suibibk.xingweixing.fuleizilei.templateMethod;
/**
 * @author suibibk.com
 */
public class Test {

	public static void main(String[] args) {
		Game a = new GameA();
		a.paly();
		System.out.println("---------------------");
		Game b = new GameB();
		b.paly();
	}
}
