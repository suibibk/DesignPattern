package com.suibibk.jiegouxing.bridge;
/**
 * 扩展抽象化角色
 * @author suibibk.com
 */
public class SquareShade extends Shade{

	@Override
	public void draw() {
		System.out.println("开始画正方形，确定颜色");
		getColor().paint();
		System.out.println("正方形结束");
	}
}
