package code.ponfee.pay.dto;

import java.io.Serializable;

import code.ponfee.pay.enums.PaymentStatus;

/**
 * 支付请求结果
 * @author fupf
 */
public class PayApplyResult implements Serializable {

    private static final long serialVersionUID = 7586296160311748495L;

    private String payId; // 与第三方支付交互id
    private PaymentStatus status = PaymentStatus.WAITING; // 支付状态
    private String thirdTradeNo; // 支付成功时的第三方支付号

    private String channelType; // 支付类型
    private String response; // 响应到客户端数据（如JSON或html form）

    public PayApplyResult() {}

    public PayApplyResult(String response) {
        this.response = response;
    }

    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getChannelType() {
        return channelType;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }

    public String getThirdTradeNo() {
        return thirdTradeNo;
    }

    public void setThirdTradeNo(String thirdTradeNo) {
        this.thirdTradeNo = thirdTradeNo;
    }

}