package com.suibibk.chuangjianxing.builder;
/**
 * 抽象的建造者类，要建造这些产品所需要的步骤
 * @author suibibk.com
 *
 */
public interface Builder {
	//建造名称
	public void buildName();
	//建造描述
	public void buildDesc();
	//创建产品
	public DB createDB();
}
