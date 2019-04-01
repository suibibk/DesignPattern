package com.suibibk.jiegouxing.bridge;
/**
 * 扩展抽象化角色
 * @author suibibk.com
 */
public class CircleShade extends Shade{
	@Override
	public void draw() {
		System.out.println("开始画圆形，确定颜色");
		color.paint();
		System.out.println("画圆形结束");
	}
}
