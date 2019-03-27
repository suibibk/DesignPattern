package com.suibibk.chuangjianxing.abstractFactory;
/**
 * 专门提供Oracle产品的工厂
 * @author suibibk.com
 */
public class OracleFactory implements Provide{
	@Override
	public DB product() {
		return new Oracle();
	}
}
