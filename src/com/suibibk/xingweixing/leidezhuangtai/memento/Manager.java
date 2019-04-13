package com.suibibk.xingweixing.leidezhuangtai.memento;
/**
 * 	 游戏管理者 没有修改备忘录的权限
 * @author suibibk.com
 */
public class Manager {
	private Memento memento;

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}
}
