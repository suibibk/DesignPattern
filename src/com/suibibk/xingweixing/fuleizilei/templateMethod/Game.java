package com.suibibk.xingweixing.fuleizilei.templateMethod;
/**
 * @author suibibk.com
 */
public abstract class Game {
	public abstract void init();
	public abstract void start();
	public abstract void ing();
	public abstract void end();
	//模板方法，已经规定好了执行逻辑顺序，不可重写，用final修饰
	public final void paly() {
		init();
		start();
		ing();
		end();
	}
}
