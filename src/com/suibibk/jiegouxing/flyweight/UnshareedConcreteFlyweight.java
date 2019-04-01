package com.suibibk.jiegouxing.flyweight;
/**
 * 不需要共享的Flyweight子类。
 * @author suibibk.com
 *
 */
public class UnshareedConcreteFlyweight extends Flyweight{

	public UnshareedConcreteFlyweight(String extrinsic) {
		super(extrinsic);
	}

	@Override
	public void operation(String extrinsic) {
		System.out.println("不需要共享的Flyweight子类："+extrinsic);
	}
}
