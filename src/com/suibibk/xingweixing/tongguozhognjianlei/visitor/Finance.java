package com.suibibk.xingweixing.tongguozhognjianlei.visitor;
/**
 * 具体访问者：财务
 * @author suibibk.com
 */
public class Finance extends Visit{
	@Override
	public void visitBook(Book book) {
		System.out.println("计算图书的价格：Book="+book.getName());
	}
	@Override
	public void visitCD(CD cd) {
		System.out.println("计算CD的价格：CD="+cd.getName());
	}
}
