package com.suibibk.xingweixing.tongguozhognjianlei.interpreter;
/**
 * 	乘法解释器
 * @author suibibk.com
 */
public class MultExpression implements AbstractExpression{
	@Override
	public int interpreter(Context context) {
		return context.getNum1()*context.getNum2();
	}
}
