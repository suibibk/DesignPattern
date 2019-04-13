package com.suibibk.xingweixing.tongguozhognjianlei.visitor;
/**
 * 抽象访问者
 * @author suibibk.com
 */
public abstract class Visit {
	public abstract void visitBook(Book book);
	public abstract void visitCD(CD cd);
}
