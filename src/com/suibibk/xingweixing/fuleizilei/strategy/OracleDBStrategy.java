package com.suibibk.xingweixing.fuleizilei.strategy;
/**
 *	具体的策略实现
 *	@author suibibk.com
 */
public class OracleDBStrategy implements DBStrategy {

	@Override
	public void select() {
		System.out.println("用Oracle数据库查询数据成功");
	}
}
