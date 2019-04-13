package com.suibibk.xingweixing.tongguozhognjianlei.interpreter;
/**
 * 	加法解释器
 * @author suibibk.com
 */
public class ADDExpression implements AbstractExpression{
	@Override
	public int interpreter(Context context) {
		return context.getNum1()+context.getNum2();
	}
}
