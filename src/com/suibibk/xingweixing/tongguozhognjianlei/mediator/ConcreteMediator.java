package com.suibibk.xingweixing.tongguozhognjianlei.mediator;

public class ConcreteMediator extends Mediator{
	private FangDong fangdong;
	private ZuKe zuke;
	//必须先在中介里注册
	public void setFangdong(FangDong fangdong) {
		this.fangdong = fangdong;
	}
	public void setZuke(ZuKe zuke) {
		this.zuke = zuke;
	}
	public FangDong getFangdong() {
		return fangdong;
	}
	public ZuKe getZuke() {
		return zuke;
	}
	@Override
	public void constact(String message, User user) {
		System.out.println("获取信息："+message);
		if(fangdong==user) {
			//来询问的是房东，那么我就去问问租客要不要租房
			zuke.getMessage("我是中介，需要租房么？");
		}
		if(zuke==user) {
			//来询问的是房东，那么我就去问问租客要不要租房
			fangdong.getMessage("我是中介，请问有房子出租么？");
		}
	}

}
