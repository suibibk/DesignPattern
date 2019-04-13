package com.suibibk.xingweixing.tongguozhognjianlei.mediator;

public class Test {

	public static void main(String[] args) {
		ConcreteMediator mediator = new ConcreteMediator();
		FangDong  fd = new FangDong();
		ZuKe zk = new ZuKe();
		//向中介注册
		fd.setMediator(mediator);
		mediator.setFangdong(fd);
		zk.setMediator(mediator);
		mediator.setZuke(zk);
		fd.constact("我这里有房子，有人要租房么");
		zk.constact("我要租房子，有人要出租么");
	}

}
