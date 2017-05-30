package code.ponfee.pay.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import code.ponfee.pay.enums.RefundStatus;

/**
 * 退款查询结果
 * @author fupf
 */
public class RefundQueryResult implements Serializable {

    private static final long serialVersionUID = -8566163176405242484L;

    private String payId; // 支付号
    private int orderType; // 订单类型
    private String orderNo; // 业务订单号
    private String thirdTradeNo; // 第三方交易号
    private Integer orderAmt; // 订单金额
    private int bizType; // 业务类型

    private List<RefundDetail> details; // 退款明细

    public String getPayId() {
        return payId;
    }

    public String getThirdTradeNo() {
        return thirdTradeNo;
    }

    public Integer getOrderAmt() {
        return orderAmt;
    }

    public void setPayId(String payId) {
        this.payId = payId;
    }

    public void setThirdTradeNo(String thirdTradeNo) {
        this.thirdTradeNo = thirdTradeNo;
    }

    public void setOrderAmt(Integer orderAmt) {
        this.orderAmt = orderAmt;
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

    public List<RefundDetail> getDetails() {
        return details;
    }

    public void setDetails(List<RefundDetail> details) {
        this.details = details;
    }

    /**
     * 退款详情
     */
    public static class RefundDetail implements Serializable {
        private static final long serialVersionUID = 6435734420690871793L;
        
        private String refundId; // 退款号
        private int refundAmt; // 退款金额
        private String thirdRefundNo; // 第三方退款号
        private Date tradeTime; // 交易时间
        private RefundStatus status; // 退款状态

        public String getRefundId() {
            return refundId;
        }

        public int getRefundAmt() {
            return refundAmt;
        }

        public String getThirdRefundNo() {
            return thirdRefundNo;
        }

        public Date getTradeTime() {
            return tradeTime;
        }

        public RefundStatus getStatus() {
            return status;
        }

        public void setRefundId(String refundId) {
            this.refundId = refundId;
        }

        public void setRefundAmt(int refundAmt) {
            this.refundAmt = refundAmt;
        }

        public void setThirdRefundNo(String thirdRefundNo) {
            this.thirdRefundNo = thirdRefundNo;
        }

        public void setTradeTime(Date tradeTime) {
            this.tradeTime = tradeTime;
        }

        public void setStatus(RefundStatus status) {
            this.status = status;
        }
    }

    public int getBizType() {
        return bizType;
    }

    public void setBizType(int bizType) {
        this.bizType = bizType;
    }

}