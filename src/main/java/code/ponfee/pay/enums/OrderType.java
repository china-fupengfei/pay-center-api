package code.ponfee.pay.enums;

/**
 * 订单类型
 * @author fupf
 */
public enum OrderType {
    TICKET(1, "单票"), INSURANCE(2, "保险"), PURSE(9, "钱包");

    private int type;
    private String desc;

    private OrderType(int type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    public int type() {
        return type;
    }

    public String desc() {
        return desc;
    }

    public static OrderType from(int type) {
        for (OrderType _type : OrderType.values()) {
            if (_type.type == type) return _type;
        }
        return null;
    }
}
