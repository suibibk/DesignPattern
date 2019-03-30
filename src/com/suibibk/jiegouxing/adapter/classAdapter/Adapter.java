package com.suibibk.jiegouxing.adapter.classAdapter;
/**
 * 这样子，这个类不仅仅有Source方法1的能力，还有方法2的能力
 * @author suibibk.com
 *
 */
public class Adapter extends Source implements Targetable {

	@Override
	public void method2() {
		System.out.println("我是方法2");
	}
}
