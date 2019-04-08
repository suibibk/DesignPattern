package com.suibibk.xingweixing.lianggeleizijian.iterator.first;
/**
 * 	白箱聚集与外禀迭代子：聚集角色
 * @author suibibk.com
 */
public abstract class Aggregate {
	//返回迭代对象
	public abstract Iterator iterator();
	public abstract Object getElement(int index);
	public abstract int size();
}
