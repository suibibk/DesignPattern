package com.suibibk.xingweixing.lianggeleizijian.iterator.first;
/**
 * 	白箱聚集与外禀迭代子：具体聚集角色
 * @author suibibk.com
 */
public class ConcreteAggregate extends Aggregate{
	private Object[] objs=null;
	public ConcreteAggregate(Object[] objs) {
		this.objs = objs;
	}
	@Override
	public Iterator iterator() {
		return new ConcreteIterator(this);
	}
	
	//获取长度
	@Override
	public int size() {
		return objs.length;
	}
	@Override
	public Object getElement(int index) {
		if(index<this.size()) {
			return objs[index];
		}else {
			return null;
		}
	}
}
