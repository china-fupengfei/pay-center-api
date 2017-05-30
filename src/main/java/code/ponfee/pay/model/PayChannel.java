package code.ponfee.pay.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 支付渠道
 * @author fupf
 */
public class PayChannel implements Serializable {

    private static final long serialVersionUID = 2217702830788263233L;

    private int aid; // 自增主键
    private String channelType; // 支付渠道
    private String channelName; // 渠道名称
    private String source; // 来源：Andriod；IOS；H5；
    private int orders; // 展示顺序
    private int status; // 状态：0无效；1有效；
    private String description; // 详细描述
    private Date createTime; // 创建时间
    private Date updateTime; // 修改时间

    public int getAid() {
        return aid;
    }

    public String getChannelType() {
        return channelType;
    }

    public String getChannelName() {
        return channelName;
    }

    public String getSource() {
        return source;
    }

    public int getOrders() {
        return orders;
    }

    public int getStatus() {
        return status;
    }

    public String getDescription() {
        return description;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setOrders(int orders) {
        this.orders = orders;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

}
