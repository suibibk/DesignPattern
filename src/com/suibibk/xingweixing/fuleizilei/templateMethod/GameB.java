package com.suibibk.xingweixing.fuleizilei.templateMethod;
/**
 * @author suibibk.com
 */
public class GameB extends Game {

	@Override
	public void init() {
		System.out.println("初始化游戏B");
	}

	@Override
	public void start() {
		System.out.println("开始游戏B");
	}

	@Override
	public void ing() {
		System.out.println("游戏B进行中");
	}

	@Override
	public void end() {
		System.out.println("游戏B已结束");
	}

}
