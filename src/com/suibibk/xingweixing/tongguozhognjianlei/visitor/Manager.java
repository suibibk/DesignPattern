package com.suibibk.xingweixing.tongguozhognjianlei.visitor;
/**
 * 具体访问者：管理员
 * @author suibibk.com
 */
public class Manager extends Visit{
	@Override
	public void visitBook(Book book) {
		System.out.println("图书上架：Book="+book.getName());
	}
	@Override
	public void visitCD(CD cd) {
		System.out.println("CD放抽屉：CD="+cd.getName());
	}
}
