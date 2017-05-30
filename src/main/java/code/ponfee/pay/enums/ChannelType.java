package code.ponfee.pay.enums;

/**
 * 支付渠道类型
 * @author fupf
 */
public enum ChannelType {
    /** 支付宝 */
    ALIPAY_WEB("ALIPAY", "支付宝", "WEB", "code.ponfee.pay.alipay.AlipayService"), // 支付宝WEB
    ALIPAY_APP("ALIPAY", "支付宝", "APP", "code.ponfee.pay.alipay.AlipayService"), // 支付宝APP
    ALIPAY_WAP("ALIPAY", "支付宝", "WAP", "code.ponfee.pay.alipay.AlipayService"), // 支付宝WAP
    ALIPAY_BATCH("ALIPAY", "支付宝", "BATCH", "code.ponfee.pay.alipay.AlipayService"), // 支付宝批量付款

    /** 微信 */
    WECHAT_NATIVE("WECHATPAY", "微信", "NATIVE", "code.ponfee.pay.wechatpay.WechatpayService"), // 微信WEB
    WECHAT_APP("WECHATPAY", "微信", "APP", "code.ponfee.pay.wechatpay.WechatpayService"), // 微信APP
    @Deprecated WECHAT_WAP("WECHATPAY", "微信", "WAP", "code.ponfee.pay.wechatpay.WechatpayService"), // 微信WAP, use {@link ChannelType#WECHAT_MWEB instead
    WECHAT_MWEB("WECHATPAY", "微信", "MWEB", "code.ponfee.pay.wechatpay.WechatpayService"), // 微信H5
    WECHAT_JSAPI("WECHATPAY", "微信", "JSAPI", "code.ponfee.pay.wechatpay.WechatpayService"), // 微信公众号

    /** 财付通 */
    TENPAY_WEB("TENPAY", "财付通", "WEB", "code.ponfee.pay.tenpay.TenpayService"), // 财付通PC(包括web和qq手机扫码)
    TENPAY_APP("TENPAY", "财付通", "APP", "code.ponfee.pay.tenpay.TenpayService"), // 财付通QQ手机APP

    /** 银联 */
    UNIONPAY_WEB("UNIONPAY", "银联", "WEB", "code.ponfee.pay.unionpay.UnionpayService"), // 银联WEB
    UNIONPAY_APP("UNIONPAY", "银联", "APP", "code.ponfee.pay.unionpay.UnionpayService"), // 银联APP

    /** qq钱包 */
    QPAY_NATIVE("QPAY", "QQ钱包", "NATIVE", "code.ponfee.pay.qpay.QpayService"), // QQ钱包扫码
    QPAY_APP("QPAY", "QQ钱包", "APP", "code.ponfee.pay.qpay.QpayService"), // QQ钱包APP
    QPAY_JSAPI("QPAY", "QQ钱包", "JSAPI", "code.ponfee.pay.qpay.QpayService"), // QQ钱包JSAPI

    /** 1208钱包 */
    PURSE_PAY("PURSEPAY", "12308钱包", "ALL", "code.ponfee.pay.pursepay.PursepayService"), // 钱包支付

    //@Deprecated QPAY_APP("QPAY", "APP", "code.ponfee.pay.qpay.QpayService"), // 手机QQ APP
    //ALIPAY_QRCODE("ALIPAY", "QRCODE", "code.ponfee.pay.alipay.AlipayService"), // 支付宝扫码
    //ALIPAY_SCAN("ALIPAY", "SCAN", "code.ponfee.pay.alipay.AlipayService"), // 支付宝线下扫码
    //ALIPAY_OFFLINE_QRCODE("ALIPAY", "OFFLINE_QRCODE", "code.ponfee.pay.alipay.AlipayService"), // 支付宝线下扫码
    //WECHAT_SCAN("WECHAT", "SCAN", "code.ponfee.pay.wechatpay.WechatpayService"), // 微信扫码

    ;

    private String channel; // 渠道
    private String channelName; // 渠道名称
    private String type; // 类型
    private String clazz; // 类全限定名

    private ChannelType(String channel, String channelName, String type, String clazz) {
        this.channel = channel;
        this.channelName = channelName;
        this.type = type;
        this.clazz = clazz;
    }

    public String channel() {
        return this.channel;
    }

    public String channelName() {
        return this.channelName;
    }

    public String type() {
        return this.type;
    }

    public String clazz() {
        return this.clazz;
    }

    public static ChannelType from(String name) {
        if (name == null || name.length() == 0) {
            throw new IllegalArgumentException("ChannelType name can not be empty.");
        }
        return Enum.valueOf(ChannelType.class, name);
    }

}
