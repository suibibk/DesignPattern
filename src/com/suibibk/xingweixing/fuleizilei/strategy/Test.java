package com.suibibk.xingweixing.fuleizilei.strategy;
/**
 * 	测试类
 * @author suibibk.com
 *
 */
public class Test {

	public static void main(String[] args) {
		//我们要用Oracle数据库
		StrategyContext context1 = new StrategyContext(new OracleDBStrategy());
		context1.exec();
		
		//我们要用MySQL
		StrategyContext context2 = new StrategyContext(new MySQLDBStrategy());
		context2.exec();
		
		//假如我们要用redis,那么不用改动Oracle和MySQL，直接新建一个RedisDBStrategy类实现DBStrategy即可。
		//完美的实现了对扩展开放，对修改关闭的原则
	}
}
