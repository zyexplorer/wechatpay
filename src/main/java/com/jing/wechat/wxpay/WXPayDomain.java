package com.jing.wechat.wxpay;
/**
 * <p>Title: WXPayDomain.java</p>
 * <p>Description: </p>
 * <p>Company: http://www.jingdaka.com</p>
 * @author 祝印
 * <p> Just go on !!!</p>
 * @date 2018年6月19日  上午9:21:29 
 * @version v1.0
 */
public class WXPayDomain implements IWXPayDomain {

	@Override
	public void report(String domain, long elapsedTimeMillis, Exception ex) {
	}

	@Override
	public DomainInfo getDomain(WXPayConfig config) {
		return new DomainInfo("https://www.jingdaka.com", true);
	}

}
