package com.suibibk.xingweixing.leidezhuangtai.memento;
/**
 *	 备忘录
 * @author suibibk.com
 */
public class Memento {
	private int level;//游戏等级
	private int score;//分数
	public Memento(int level, int score) {
		super();
		this.level = level;
		this.score = score;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
}
