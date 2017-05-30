package code.ponfee.pay.dto;

import java.io.Serializable;
import java.util.Date;

import code.ponfee.pay.enums.PaymentStatus;

/**
 * 支付查询结果
 * @author fupf
 */
public class PayQueryResult implements Serializable {

    private static final long serialVersionUID = 8165960762114453130L;

    private String payId; // 支付号
    private int orderAmt; // 订单金额
    private String thirdTradeNo; // 第三方交易号
    private Date tradeTime; // 交易时间
    private PaymentStatus status; // 状态
    //private int bizType; // 业务类型

    private Boolean isRefund; // 是否退款
    private Integer refundAmt; // 退款金额
    private Date refundTime; // 退款时间

    public String getPayId() {
        return payId;
    }

    public int getOrderAmt() {
        return orderAmt;
    }

    public String getThirdTradeNo() {
        return thirdTradeNo;
    }

    public Date getTradeTime() {
        return tradeTime;
    }

    public Boolean isRefund() {
        return isRefund;
    }

    public Integer getRefundAmt() {
        return refundAmt;
    }

    public Date getRefundTime() {
        return refundTime;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void setPayId(String payId) {
        this.payId = payId;
    }

    public void setOrderAmt(int orderAmt) {
        this.orderAmt = orderAmt;
    }

    public void setThirdTradeNo(String thirdTradeNo) {
        this.thirdTradeNo = thirdTradeNo;
    }

    public void setTradeTime(Date tradeTime) {
        this.tradeTime = tradeTime;
    }

    public void setRefund(Boolean isRefund) {
        this.isRefund = isRefund;
    }

    public void setRefundAmt(Integer refundAmt) {
        this.refundAmt = refundAmt;
    }

    public void setRefundTime(Date refundTime) {
        this.refundTime = refundTime;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }

}
