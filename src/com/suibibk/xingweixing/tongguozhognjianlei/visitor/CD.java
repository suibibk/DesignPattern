package com.suibibk.xingweixing.tongguozhognjianlei.visitor;
/**
 * 具体元素：光盘
 * @author suibibk.com
 */
public class CD implements Element {
	private String name;
	public CD(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	@Override
	public void accept(Visit visit) {
		visit.visitCD(this);
	}
}
