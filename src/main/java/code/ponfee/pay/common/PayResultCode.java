package code.ponfee.pay.common;

/**
 * 支付错误码
 * 
 * @author fupf
 */
public enum PayResultCode {
    
    // 基本错误码
    ILLEGAL_ARGS_ERR(-9999, "Illegal args error."),
    NO_ROWS_AFFECTED(-10000, "Database DML SQL no row affected."),
    
    // 支付错误码
    ILLEGAL_CHANNEL_TYPE(-400004001, "Illegal channel type"),
    PAY_REQUEST_EXCEPTION(-400004002, "Pay request exception."),
    PARAMS_VERIFY_FAILURE(-400004003, "params signature verify failure."),
    PAY_RETURN_EXCEPTION(-400004004, "Pay return exception."),
    PAY_NOTIFY_EXCEPTION(-400004005, "Pay notify exception."),
    PAY_NOT_EXISTS(-400004006, "Payment not exists."),
    PAY_WAITING_PAY(-400004007, "wait buyer pay."),
    PAY_FREQUENTLY_REQ(-400004008, "下单支付频繁请求，请2秒后再试"),
    PAY_REPEAT_ERROR(-400004009, "重复的付款"),
    
    // 退款错误码
    REFUND_REQUEST_EXCEPTION(-400004101, "refund request exception."),
    REFUND_NOTIFY_EXCEPTION(-400004102, "refund notify exception."),
    REFUND_TRADE_FAILURE(-400004103, "refund trade failure."),
    REFUND_NOT_EXISTS(-400004104, "refund not exists."),
    
    // 交易查询错误码
    QUERY_TRADE_FAILURE(-400004201, "query trade failure."),
    PAY_NOT_FOUND(-400004202, "wait buyer pay."),
    REFUND_NOT_FOUND(-400004203, "refund not exists."),
    ;

    private int code;
    private String msg;

    private PayResultCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}