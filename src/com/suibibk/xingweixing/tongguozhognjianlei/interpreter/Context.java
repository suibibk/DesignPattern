package com.suibibk.xingweixing.tongguozhognjianlei.interpreter;
/**
 * 	环境变量，存放固定文法构建的句子
 * @author suibibk.com
 */
public class Context {
	private Integer num1;
	private Integer num2;
	public Context(Integer num1, Integer num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	public Integer getNum1() {
		return num1;
	}
	public Integer getNum2() {
		return num2;
	}
}
