package code.ponfee.pay.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 退款流水
 * @author fupf
 */
public class Refund implements Serializable {
    private static final long serialVersionUID = 7534480126068601915L;

    private String refundId; // 退款ID
    private String payId; // 支付ID
    private int refundType; // 退款类型：1车票；2保险；
    private String refundNo; // 退款单号：车票订单号/订单详情号/保险订单号
    private int refundAmt; // 退款单金额
    private int refundRate; // 退款费率
    private int handleFee; // 退款手续费
    private String refundReason; // 退款原因
    private String thirdRefundNo; // 第三方退款单号
    private int status; // 退款状态：1退款处理中；2退款成功；3退款失败；
    private String remark; // 备注
    private Date createTime; // 创建时间
    private Date tradeTime; // 交易时间
    private String extraData; // 附加数据

    private int retryCount; // 重试次数

    public int getRetryCount() {
        return retryCount;
    }

    public void setRetryCount(int retryCount) {
        this.retryCount = retryCount;
    }

    public String getRefundId() {
        return refundId;
    }

    public void setRefundId(String refundId) {
        this.refundId = refundId;
    }

    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId;
    }

    public int getRefundType() {
        return refundType;
    }

    public void setRefundType(int refundType) {
        this.refundType = refundType;
    }

    public String getRefundNo() {
        return refundNo;
    }

    public void setRefundNo(String refundNo) {
        this.refundNo = refundNo;
    }

    public int getRefundAmt() {
        return refundAmt;
    }

    public void setRefundAmt(int refundAmt) {
        this.refundAmt = refundAmt;
    }

    public int getRefundRate() {
        return refundRate;
    }

    public void setRefundRate(int refundRate) {
        this.refundRate = refundRate;
    }

    public String getRefundReason() {
        return refundReason;
    }

    public void setRefundReason(String refundReason) {
        this.refundReason = refundReason;
    }

    public String getThirdRefundNo() {
        return thirdRefundNo;
    }

    public void setThirdRefundNo(String thirdRefundNo) {
        this.thirdRefundNo = thirdRefundNo;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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

    public int getHandleFee() {
        return handleFee;
    }

    public void setHandleFee(int handleFee) {
        this.handleFee = handleFee;
    }

}
