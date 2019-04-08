package com.suibibk.xingweixing.lianggeleizijian.iterator.first;

public class Client {

	public static void main(String[] args) {
        Object[] objs = {"One","Two","Three","Four","Five","Six"};
        //创建聚合对象
        Aggregate agg = new ConcreteAggregate(objs);
        //循环输出聚合对象中的值
        Iterator it = agg.iterator();
        while(!it.isDone()){
            System.out.println(it.currentItem());
            it.next();
        }
	}
}
