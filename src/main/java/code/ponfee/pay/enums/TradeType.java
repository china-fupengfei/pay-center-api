package code.ponfee.pay.enums;

/**
 * 交易类型
 * @author fupf
 */
public enum TradeType {
    PAY(1, "支付"), REFUND(2, "退款");

    private int type;
    private String desc;

    private TradeType(int type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    public int type() {
        return type;
    }

    public String desc() {
        return desc;
    }

    public static TradeType from(int type) {
        for (TradeType c : TradeType.values()) {
            if (c.type == type) {
                return c;
            }
        }
        return null;
    }
}