package code.ponfee.pay.common;

/**
 * 常量类
 * @author fupf
 */
public abstract class Constants {

    /** 支付参数名 */
    public static final String PARAM_CHANNEL_TYPE = "channelType"; // 渠道类型
    public static final String PARAM_PAY_ID = "payId"; // 支付ID（与第三方支付交互）
    public static final String PARAM_ORDER_AMT = "orderAmt"; // 订单金额
    public static final String PARAM_CLIENT_IP = "clientIp"; // 用户端IP（非必传）
    public static final String PARAM_ATTACH_DATA = "attachData"; // 自定义的附加参数（非必传）
    public static final String PARAM_THIRD_TRADE_NO = "thirdTradeNo"; // 第三方交易号
    public static final String PARAM_EXPIRE_TIME = "expireTime"; // 超时时间

    /** 支付回跳地址 */
    public static final String PARAM_PAYMENT_NOTIFY_URL = "paymentNotifyUrl"; // 支付异步通知
    public static final String PARAM_PAYMENT_RETURN_URL = "paymentReturnUrl"; // 支付页面跳转
    public static final String PARAM_REFUND_NOTIFY_URL = "refundNotifyUrl"; // 退款异步通知

    /** 其它参数 */
    public static final String PARAM_BIZ_TYPE = "bizType"; // 业务类型：0汽车票；10火车票；
    public static final String PARAM_GOODS_BODY = "body"; // 商品信息
    public static final String PARAM_CREATE_TM = "createTime"; // 创建时间
    public static final String PARAM_TRADE_TM = "tradeTime"; // 交易时间
    public static final String PARAM_REMARK = "remark"; // 备注
    public static final String PARAM_USER_ID = "userId"; // 用户id
    public static final String PARAM_SOURCE = "source"; // 用户id
    public static final String PARAM_EXTRA_DATA = "extraData"; // 外部参数
    
    /** 特有参数 */
    public static final String PARAM_ALI_PAYMETHOD = "paymethod"; // ali web银行支付
    public static final String PARAM_ALI_DEFAULTBANK = "defaultbank"; // ali web银行支付
    public static final String PARAM_QPAY_QQ = "purchaserQQ"; // 手Q支付买方qq号
    
    /** 退款参数名 */
    public static final String PARAM_REFUND_ID = "refundId"; // 退款单号
    public static final String PARAM_REFUND_AMT = "refundAmt"; // 退款金额
    public static final String PARAM_REFUND_RATE = "refundRate"; // 退款费率
    public static final String PARAM_REFUND_REASON = "refundReason"; // 退款原因
    public static final String PARAM_THIRD_REFUND_NO = "thirdRefundNo"; // 第三方退款单号

    /** 业务参数 */
    public static final String PARAM_ORDER_NO = "orderNo";
    public static final String PARAM_ORDER_TYPE = "orderType";
    public static final String PARAM_REFUND_TYPE = "refundType";
    public static final String PARAM_REFUND_NO = "refundNo";
    public static final String PARAM_HANDLE_FEE = "handleFee";
    
    /** 固定参数值 */
    public static final String GOODS_SUBJECT = "12308出行";
    public static final String DEFAULT_DATE_FORMAT = "yyyyMMddHHmmss";

}
