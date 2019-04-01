package com.suibibk.jiegouxing.flyweight;
/**
 * 所有具体享元类的超类或接口，通过这个接口，Flyweight可以接受并作用于外部状态。
 * @author suibibk.com
 *
 */
public abstract class Flyweight {
	//内部状态:比如数据库连接的ip，端口，用户，密码，这些基本上不会变化的。
	private String intrinsic;
	//外部状态，比如棋牌里的黑白棋子，这里是颜色。当然不一定有外部状态，比如数据库连接池，就直接初始化池的大小。
	public String extrinsic;
	public Flyweight(String extrinsic) {
		this.extrinsic = extrinsic;
	}
	public String getIntrinsic() {
		return intrinsic;
	}
	public void setIntrinsic(String intrinsic) {
		this.intrinsic = intrinsic;
	}
	/**
	 * 根据外部状态来定义不同的业务操作
	 * @param extrinsic
	 */
	public abstract void operation(String extrinsic);
}
