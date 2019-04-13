package com.suibibk.xingweixing.leidezhuangtai.state;

public class Test {
	public static void main(String[] args) {
		State healthSate = new HealthState();
		State sicknessState = new SicknessState();
		Context context = new Context(healthSate);
		context.eat();
		context.setState(sicknessState);
		context.eat();
	}
}
