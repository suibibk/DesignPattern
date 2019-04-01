package com.suibibk.jiegouxing.bridge;

public class Test {

	public static void main(String[] args) {
		//画一个红色的圆形
		Shade shade1 = new CircleShade();
		shade1.setColor(new RedColor());
		shade1.draw();
		//画一个黄色的圆形
		Shade shade2 = new CircleShade();
		shade2.setColor(new YelloColor());
		shade2.draw();
		//画一个红色的正方形
		Shade shade3 = new SquareShade();
		shade3.setColor(new RedColor());
		shade3.draw();
		//画一个黄色的正方形
		Shade shade4 = new SquareShade();
		shade4.setColor(new YelloColor());
		shade4.draw();

	}
}
