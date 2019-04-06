package com.suibibk.xingweixing.fuleizilei.templateMethod;
/**
 * @author suibibk.com
 */
public class GameA extends Game {

	@Override
	public void init() {
		System.out.println("初始化游戏A");
	}

	@Override
	public void start() {
		System.out.println("开始游戏A");
	}

	@Override
	public void ing() {
		System.out.println("游戏A进行中");
	}

	@Override
	public void end() {
		System.out.println("游戏A已结束");
	}

}
