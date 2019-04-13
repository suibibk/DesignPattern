package com.suibibk.xingweixing.tongguozhognjianlei.visitor;
/**
 * 具体访问者：读者
 * @author suibibk.com
 */
public class Reader extends Visit{
	@Override
	public void visitBook(Book book) {
		System.out.println("查阅图书：Book="+book.getName());
	}
	@Override
	public void visitCD(CD cd) {
		System.out.println("查阅CD：CD="+cd.getName());
	}
}
