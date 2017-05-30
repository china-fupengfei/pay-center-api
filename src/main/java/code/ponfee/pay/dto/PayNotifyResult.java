package code.ponfee.pay.dto;

import java.io.Serializable;
import java.util.Date;

import code.ponfee.pay.enums.PaymentStatus;

/**
 * 支付异步通知处理结果
 * @author fupf
 */
public class PayNotifyResult implements Serializable {

    private static final long serialVersionUID = -6256136837171857492L;

    private String payId; // 支付号
    private int orderAmt; // 订单金额
    private String channelType; // 支付渠道类型
    private String thirdTradeNo; // 第三方交易号
    private Date tradeTime; // 付款时间
    private String attachData; // 支付时的附加数据，异步通知时原样返回
    private String batchData; // 批量结果数据（当为批量支付时有值）
    private PaymentStatus status; // 支付状态
    private String response; // 响应给第三方支付异步回调的数据

    private int userId; // 用户id
    private String clientIp; // 终端ip
    private int bizType; // 业务类型
    private int orderType; // 业务订单类型
    private String orderNo; // 业务订单号
    private String extraData; // 附加数据

    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId;
    }

    public int getOrderAmt() {
        return orderAmt;
    }

    public void setOrderAmt(int orderAmt) {
        this.orderAmt = orderAmt;
    }

    public String getChannelType() {
        return channelType;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    public String getThirdTradeNo() {
        return thirdTradeNo;
    }

    public void setThirdTradeNo(String thirdTradeNo) {
        this.thirdTradeNo = thirdTradeNo;
    }

    public Date getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(Date tradeTime) {
        this.tradeTime = tradeTime;
    }

    public String getAttachData() {
        return attachData;
    }

    public void setAttachData(String attachData) {
        this.attachData = attachData;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getBatchData() {
        return batchData;
    }

    public void setBatchData(String batchData) {
        this.batchData = batchData;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public int getOrderType() {
        return orderType;
    }

    public void setOrderType(int orderType) {
        this.orderType = orderType;
    }

    public String getExtraData() {
        return extraData;
    }

    public void setExtraData(String extraData) {
        this.extraData = extraData;
    }

    public int getBizType() {
        return bizType;
    }

    public void setBizType(int bizType) {
        this.bizType = bizType;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

}