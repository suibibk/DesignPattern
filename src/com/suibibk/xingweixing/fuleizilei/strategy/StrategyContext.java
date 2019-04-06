package com.suibibk.xingweixing.fuleizilei.strategy;
/**
 *	 策略上下文
 * @author suibibk.com
 *
 */
public class StrategyContext {
	//持有一个策略实现的引用
	private DBStrategy strategy;
	//使用构造器注入具体的策略类
	public StrategyContext(DBStrategy strategy) {
		this.strategy=strategy;
	}
	//执行策略
	public void exec() {
		strategy.select();
	}
}
