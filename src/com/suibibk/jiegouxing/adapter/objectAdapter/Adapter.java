package com.suibibk.jiegouxing.adapter.objectAdapter;
/**
 * 这样子，这个类不仅仅有Source方法1的能力，还有方法2的能力
 * @author suibibk.com
 *
 */
public class Adapter  implements Targetable {
	private Source source;
    public Adapter(Source source){
         this.source =source;
    }
	@Override
	public void method2() {
		System.out.println("我是方法2");
	}

	@Override
	public void method1() {
		source.method1();
	}

}
