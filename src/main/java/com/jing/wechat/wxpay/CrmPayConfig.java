package com.jing.wechat.wxpay;


import java.io.InputStream;

import org.springframework.context.annotation.Configuration;

@Configuration
public class CrmPayConfig extends WXPayConfig{
	
	private String appId = "wxd678efh567hg6787";
	
	private String mchId = "1230000109";
	
	private String key = "123456";

	@Override
	String getAppID() {
		return appId;
	}

	@Override
	String getMchID() {
		return mchId;
	}

	@Override
	String getKey() {
		return key;
	}

	@Override
	InputStream getCertStream() {
		return null;
	}

	@Override
	IWXPayDomain getWXPayDomain() {
		return new WXPayDomain();
	}
	
}
