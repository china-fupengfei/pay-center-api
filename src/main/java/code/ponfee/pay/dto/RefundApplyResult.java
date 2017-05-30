package code.ponfee.pay.dto;

import java.io.Serializable;
import java.util.Date;

import code.ponfee.pay.enums.RefundStatus;

/**
 * 退款请求结果
 * @author fupf
 */
public class RefundApplyResult implements Serializable {

    private static final long serialVersionUID = -4093487649977613628L;

    private int orderType; // 业务订单类型
    private String orderNo; // 业务订单号
    private int orderAmt; // 订单金额
    private String thirdTradeNo; // 第三方支付交易号
    
    private String refundId; // 退款号
    private String thirdRefundNo; // 第三方退款号
    private Date tradeTime; // 交易时间
    private RefundStatus status; // 退款状态

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

    public int getOrderType() {
        return orderType;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderType(int orderType) {
        this.orderType = orderType;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Date getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(Date tradeTime) {
        this.tradeTime = tradeTime;
    }

}