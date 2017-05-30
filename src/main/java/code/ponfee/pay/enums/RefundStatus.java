package code.ponfee.pay.enums;

/**
 * 退款状态
 * @author fupf
 */
public enum RefundStatus {
    HANDLING(0, "退款处理中"), SUCCESS(1, "退款完成"), FAILURE(2, "退款失败");

    private int status;
    private String desc;

    private RefundStatus(int status, String desc) {
        this.status = status;
        this.desc = desc;
    }

    public int status() {
        return status;
    }

    public String desc() {
        return desc;
    }
    
    public static RefundStatus from(int status) {
        for (RefundStatus refund : RefundStatus.values()) {
            if (refund.status == status) {
                return refund;
            }
        }
        return null;
    }
    
    public static void main(String[] args) {
        System.out.println(RefundStatus.from(2));
    }
}
