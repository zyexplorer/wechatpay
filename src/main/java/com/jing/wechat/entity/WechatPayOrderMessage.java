package com.jing.wechat.entity;

import java.util.Date;

import lombok.Data;

/**
 * 支付信息表
 * @author jddk
 *
 */
@Data
public class WechatPayOrderMessage {

    public Long id;
    
    public String sign;
    
    public String prepayId;
    
    public String partnerId;
    
    public String appId;
    
    public String packageValue;
    
    public String timeStamp;
    
    public String nonceStr;
    
    public Date createdTime;
    
    public Date updateTime;
}
