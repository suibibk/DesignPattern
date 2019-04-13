package com.suibibk.xingweixing.tongguozhognjianlei.visitor;
/**
 * 具体元素：书本
 * @author suibibk.com
 */
public class Book implements Element {
	private String name;
	public Book(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	@Override
	public void accept(Visit visit) {
		visit.visitBook(this);
	}
}
