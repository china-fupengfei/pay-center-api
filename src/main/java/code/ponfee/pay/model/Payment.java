package code.ponfee.pay.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 支付流水
 * @author fupf
 */
public class Payment implements Serializable {

    private static final long serialVersionUID = -7156030475506591651L;

    private String payId; // 支付ID
    private int orderType; // 业务订单类型：1车票；2保险；
    private String orderNo; // 业务订单编号
    private int orderAmt; // 订单金额（最小单位分）
    private String channelType; // 支付渠道类型
    private String thirdTradeNo; // 第三方支付订单号
    private String source; // 来源
    private int bizType; // 业务类型
    private int userId; // 用户id
    private int status; // 支付状态：0待买家付款；1支付成功；2支付失败；3待卖家收款；4交易关闭；
    private Date tradeTime; // 交易时间
    private String clientIp; // 客户端ip
    private String remark; // 备注
    private Date createTime; // 创建时间
    private String extraData; // 附加数据

    private int retryCount; // 重试次数

    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId;
    }

    public int getOrderType() {
        return orderType;
    }

    public void setOrderType(int orderType) {
        this.orderType = orderType;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
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

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(Date tradeTime) {
        this.tradeTime = tradeTime;
    }

    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
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

    public String getExtraData() {
        return extraData;
    }

    public void setExtraData(String extraData) {
        this.extraData = extraData;
    }

    public int getRetryCount() {
        return retryCount;
    }

    public void setRetryCount(int retryCount) {
        this.retryCount = retryCount;
    }

}