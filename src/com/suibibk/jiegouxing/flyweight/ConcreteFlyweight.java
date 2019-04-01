package com.suibibk.jiegouxing.flyweight;
/**
 * 具体子类，比如数据库连接，这里当然operation也不一定需要
 * @author suibibk.com
 */
public class ConcreteFlyweight extends Flyweight{

	public ConcreteFlyweight(String extrinsic) {
		super(extrinsic);
	}

	@Override
	public void operation(String extrinsic) {
		System.out.println("具体Flyweight:" + extrinsic);
	}
}
