package com.suibibk.chuangjianxing.abstractFactory;
/**
 * 专门提供MySQL产品的工厂
 * @author suibibk.com
 */
public class MySQLFactory implements Provide{
	@Override
	public DB product() {
		return new MySQL();
	}
}
