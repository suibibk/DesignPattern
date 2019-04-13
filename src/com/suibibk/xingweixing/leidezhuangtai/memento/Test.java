package com.suibibk.xingweixing.leidezhuangtai.memento;

public class Test {

	public static void main(String[] args) {
		Manager manager = new Manager();
		System.out.println("用户注册游戏");
		User user = new User();
		user.setLevel(3);
		user.setScore(20);
		user.setUsername("林蛋黄");
		System.out.println("用户修炼后游戏的等级为："+user.getLevel()+";游戏的分数为："+user.getScore());
		System.out.println("先存档");
		manager.setMemento(user.createMemento());
		user.setLevel(10);
		user.setScore(23);
		System.out.println("用户继续修炼后游戏的等级为："+user.getLevel()+";游戏的分数为："+user.getScore());
		user.setLevel(0);
		user.setScore(0);
		System.out.println("服务器崩溃了，用户的等级和分数清零等级为："+user.getLevel()+";游戏的分数为："+user.getScore());
		System.out.println("读档");
		Memento m = manager.getMemento();
		user.setLevel(m.getLevel());
		user.setScore(m.getScore());
		System.out.println("读档后等级为："+user.getLevel()+";游戏的分数为："+user.getScore());
	}

}
