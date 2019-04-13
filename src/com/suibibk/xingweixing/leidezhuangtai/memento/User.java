package com.suibibk.xingweixing.leidezhuangtai.memento;
/**
 * 	 用户信息
 * @author suibibk.com
 */
public class User {
	private int level;//用户等级
	private int score;//分数
	private String username;//用户游戏名
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Memento createMemento() {
		return new Memento(level,score);
	}
}
