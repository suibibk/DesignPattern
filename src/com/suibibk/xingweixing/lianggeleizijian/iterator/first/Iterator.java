package com.suibibk.xingweixing.lianggeleizijian.iterator.first;
/**
 * 	白箱聚集与外禀迭代子：抽象迭代子角色
 * @author suibibk.com
 */
public interface Iterator {
    public void first();
    public void next();
    public boolean isDone();
    public Object currentItem();
}
