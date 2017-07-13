package code.ponfee.pay.service;

import java.util.List;
import java.util.Map;

import code.ponfee.commons.exception.UnimplementedException;
import code.ponfee.commons.model.Pagination;
import code.ponfee.commons.model.Result;
import code.ponfee.pay.dto.PayApplyResult;
import code.ponfee.pay.dto.PayNotifyResult;
import code.ponfee.pay.dto.PayQueryResult;
import code.ponfee.pay.dto.PayReturnResult;
import code.ponfee.pay.dto.RefundApplyResult;
import code.ponfee.pay.dto.RefundNotifyResult;
import code.ponfee.pay.dto.RefundQueryResult;
import code.ponfee.pay.enums.ChannelType;
import code.ponfee.pay.model.OrderBill;
import code.ponfee.pay.model.PayChannel;
import code.ponfee.pay.model.Refund;
import code.ponfee.pay.service.IPayService;

/**
 * 支付接口适配器
 * @author fupf
 */
public abstract class PayServiceAdapter implements IPayService {

    /**
     * 转ChannelType
     * @param name
     * @param expectChannel
     * @return
     */
    protected ChannelType toChannel(String name, String expectChannel) {
        ChannelType channel = ChannelType.from(name);
        if (!expectChannel.equals(channel.channel())) {
            throw new IllegalArgumentException(name + " does not match " + expectChannel + ".");
        }
        return channel;
    }

    /**
     * @param params
     * @return
     */
    protected abstract Map<String, String> transformPayParams(Map<String, String> params);

    // -------------------------------------------IPayService methods
    @Override
    public Result<List<PayChannel>> listPayChannelBySource(String source) {
        throw new UnimplementedException();
    }

    @Override
    public Result<PayApplyResult> pay(Map<String, String> params) {
        throw new UnimplementedException();
    }

    @Override
    public Result<PayNotifyResult> payNotify(Map<String, String> params) {
        throw new UnimplementedException();
    }

    @Override
    public Result<PayReturnResult> payReturn(Map<String, String> params) {
        throw new UnimplementedException();
    }

    @Override
    public Result<RefundApplyResult> refund(Map<String, String> params) {
        throw new UnimplementedException();
    }

    @Override
    public Result<RefundNotifyResult> refundNotify(Map<String, String> params) {
        throw new UnimplementedException();
    }

    @Override
    public Result<PayQueryResult> payQuery(Map<String, String> params) {
        throw new UnimplementedException();
    }

    @Override
    public Result<RefundQueryResult> refundQuery(Map<String, String> params) {
        throw new UnimplementedException();
    }

    @Override
    public Result<List<OrderBill>> orderBill(String originPayId, String... changePayIds) {
        throw new UnimplementedException();
    }

    @Override
    public Result<Pagination<Refund>> queryRefundsForPage(Map<String, ?> params) {
        throw new UnimplementedException();
    }

}