package com.suibibk.jiegouxing.bridge;
/**
 * 抽象化角色
 * 形状
 * @author suibibk.com
 *
 */
public abstract class Shade {
	protected Color color;
	public void setColor(Color color) {
		this.color = color;
	}
	public Color getColor() {
		return color;
	}
	public abstract void draw();
}
