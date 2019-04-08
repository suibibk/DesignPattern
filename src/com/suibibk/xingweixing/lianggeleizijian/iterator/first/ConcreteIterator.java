package com.suibibk.xingweixing.lianggeleizijian.iterator.first;
/**
 * 	白箱聚集与外禀迭代子：具体迭代子角色
 * @author suibibk.com
 */
public class ConcreteIterator implements Iterator{
	//下标
	private int index=0;
	//大小
	private int size=0;
	private Aggregate agg;
	public ConcreteIterator(Aggregate agg) {
		this.agg=agg;
		size = agg.size();
		index=0;
	}
	/**
     * 	迭代方法：移动到第一个元素
     */
	@Override
	public void first() {
		index=0;
	}
	 /**
     * 	迭代方法：移动到下一个元素
     */
	@Override
	public void next() {
		if(index<size) {
			index++;
		}
	}
	 /**
     * 	迭代方法：是否为最后一个元素
     */
	@Override
	public boolean isDone() {
		return (index>=size);
	}
	/**
     * 	迭代方法：返还当前元素
     */
	@Override
	public Object currentItem() {
		return agg.getElement(index);
	}

}
