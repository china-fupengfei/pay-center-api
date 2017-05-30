package code.ponfee.pay.enums;

/**
 * 退款类型
 * @author fupf
 */
public enum RefundType {
    ORDER(1, "订单"), 
    TICKET(2, "单票"), 
    INSURANCE(3, "保险"), 
    CHANGE(4, "改签"),
    
    PURSE(90, "钱包"), // 钱包提现退款
    ;

    private int type;
    private String desc;

    private RefundType(int type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    public int type() {
        return type;
    }

    public String desc() {
        return desc;
    }

    public static RefundType from(int type) {
        for (RefundType _type : RefundType.values()) {
            if (_type.type == type) {
                return _type;
            }
        }
        return null;
    }
}