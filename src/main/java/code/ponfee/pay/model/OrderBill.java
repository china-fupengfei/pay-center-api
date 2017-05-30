package code.ponfee.pay.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 订单账单查询结果
 * @author fupf
 */
public class OrderBill implements Serializable {

    private static final long serialVersionUID = -70427938085815316L;

    private int tradeType; // 交易类型：1支付；2退款
    private int bizType; // 业务类型：0汽车票；1旅游专线；2城际专线；3机场大巴；4港澳专线；6约租车；7船票；8飞机票；9包车；10火车票；
    private int bizOrderType; // 订单类型：1订单；2单票；3保险；
    private String bizOrderNo; // 订单号
    private String thirdDealNo; // 第三方交易号
    private int amount; // 金额 

    private boolean isChange; // 是否改签
    private Date tradeTime; // 交易时间
    private int status; // 交易状态：支付[0待买家付款；1，4支付成功；2支付失败；3待卖家收款；]；退款：[0退款处理中；1退款成功；2退款失败；]
    private String payChannel; // 支付渠道：阿里、微信、财付通、银联
    private int userId; // 用户ID

    public int getTradeType() {
        return tradeType;
    }

    public int getBizType() {
        return bizType;
    }

    public int getBizOrderType() {
        return bizOrderType;
    }

    public String getBizOrderNo() {
        return bizOrderNo;
    }

    public String getThirdDealNo() {
        return thirdDealNo;
    }

    public int getAmount() {
        return amount;
    }

    public boolean isChange() {
        return isChange;
    }

    public Date getTradeTime() {
        return tradeTime;
    }

    public int getStatus() {
        return status;
    }

    public String getPayChannel() {
        return payChannel;
    }

    public int getUserId() {
        return userId;
    }

    public void setTradeType(int tradeType) {
        this.tradeType = tradeType;
    }

    public void setBizType(int bizType) {
        this.bizType = bizType;
    }

    public void setBizOrderType(int bizOrderType) {
        this.bizOrderType = bizOrderType;
    }

    public void setBizOrderNo(String bizOrderNo) {
        this.bizOrderNo = bizOrderNo;
    }

    public void setThirdDealNo(String thirdDealNo) {
        this.thirdDealNo = thirdDealNo;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setChange(boolean isChange) {
        this.isChange = isChange;
    }

    public void setTradeTime(Date tradeTime) {
        this.tradeTime = tradeTime;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

}