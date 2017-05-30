package code.ponfee.pay.dto;

import java.io.Serializable;
import java.util.Date;

import code.ponfee.pay.enums.RefundStatus;

/**
 * 退款异步通知结果
 * @author fupf
 */
public class RefundNotifyResult implements Serializable {
    private static final long serialVersionUID = 8695297859795986206L;

    /**
     * 订单相关
     */
    private String payId; // 支付号，与第三方支付交互（out_trade_no）
    private int orderAmt; // 订单金额
    private String thirdTradeNo; // 第三方支付交易号

    /**
     * 退款批次相关
     */
    private String refundId; // 退款号
    private int refundAmt; // 退款金额
    private int refundRate; // 退费比率
    private String thirdRefundNo; // 第三方退款号
    private RefundStatus status; // 退款状态
    private Date tradeTime; // 交易时间

    /**
     * 业务参数
     */
    private int bizType; // 业务类型
    private int orderType; // 业务订单类型
    private String orderNo; // 业务订单号
    private int refundType; // 业务退款类型
    private String refundNo; // 业务退款单号
    private String extraData; // 附加数据

    /**
     * 响应给第三方数据
     */
    private String response;

    public int getRefundType() {
        return refundType;
    }

    public String getRefundNo() {
        return refundNo;
    }

    public int getOrderType() {
        return orderType;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setRefundType(int refundType) {
        this.refundType = refundType;
    }

    public void setRefundNo(String refundNo) {
        this.refundNo = refundNo;
    }

    public void setOrderType(int orderType) {
        this.orderType = orderType;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

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

    public String getThirdTradeNo() {
        return thirdTradeNo;
    }

    public void setThirdTradeNo(String thirdTradeNo) {
        this.thirdTradeNo = thirdTradeNo;
    }

    public String getRefundId() {
        return refundId;
    }

    public void setRefundId(String refundId) {
        this.refundId = refundId;
    }

    public int getRefundAmt() {
        return refundAmt;
    }

    public void setRefundAmt(int refundAmt) {
        this.refundAmt = refundAmt;
    }

    public String getThirdRefundNo() {
        return thirdRefundNo;
    }

    public void setThirdRefundNo(String thirdRefundNo) {
        this.thirdRefundNo = thirdRefundNo;
    }

    public RefundStatus getStatus() {
        return status;
    }

    public void setStatus(RefundStatus status) {
        this.status = status;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public int getRefundRate() {
        return refundRate;
    }

    public void setRefundRate(int refundRate) {
        this.refundRate = refundRate;
    }

    public Date getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(Date tradeTime) {
        this.tradeTime = tradeTime;
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

}