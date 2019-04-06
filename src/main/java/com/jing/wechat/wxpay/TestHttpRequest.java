package com.jing.wechat.wxpay;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>Title: TestHttpRequest.java</p>
 * <p>Description: </p>
 * <p>Company: http://www.jingdaka.com</p>
 * @author 祝印
 * <p> Just go on !!!</p>
 * @date 2018年6月16日  下午6:29:28 
 * @version v1.0
 */
public class TestHttpRequest {
	
	
	public static void main(String[] args) throws Exception{
		
		//String url = "https://api.mch.weixin.qq.com/pay/unifiedorder";
		
		CrmPayConfig config = new CrmPayConfig();
	    WXPay wxpay = new WXPay(config);
		
		Map<String, String> data = new HashMap<String, String>();
        data.put("body", "腾讯充值中心-QQ会员充值");
        data.put("out_trade_no", "2016090910595900000012");
        data.put("device_info", "013467007045764");
        data.put("fee_type", "CNY");
        data.put("total_fee", "1");
        data.put("spbill_create_ip", "123.12.12.123");
        data.put("notify_url", "http://www.example.com/wxpay/notify");
        data.put("trade_type", "JSAPI");  // 此处指定为公众号支付
        data.put("product_id", "12");
        data.put("openid", "openid");

        try {
            Map<String, String> resp = wxpay.unifiedOrder(data);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
		
	}

}
