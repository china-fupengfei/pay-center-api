package code.ponfee.pay.service;

import java.util.List;
import java.util.Map;

import code.ponfee.commons.model.Page;
import code.ponfee.commons.model.Result;
import code.ponfee.pay.dto.PayApplyResult;
import code.ponfee.pay.dto.PayNotifyResult;
import code.ponfee.pay.dto.PayQueryResult;
import code.ponfee.pay.dto.PayReturnResult;
import code.ponfee.pay.dto.RefundApplyResult;
import code.ponfee.pay.dto.RefundNotifyResult;
import code.ponfee.pay.dto.RefundQueryResult;
import code.ponfee.pay.model.OrderBill;
import code.ponfee.pay.model.PayChannel;
import code.ponfee.pay.model.Refund;

/**
 * 支付接口类
 * @author fupf
 */
public interface IPayService {

    /**
     * 获取支付渠道
     * @param params
     * @return
     */
    Result<List<PayChannel>> listPayChannelBySource(String source);

    /**
     * <pre>
     *  <span>参数Map<String, String> param格式如下：</span>
     *  <ul>
     *   <li>channelType：支付渠道类型 {@link code.ponfee.pay.center.enums.ChannelType}</li>
     *   <li>expireTime：订单失效时间yyyyMMddHHmmss；</li>
     *   <li>orderType：订单类型：1车票；2保险；</li>
     *   <li>orderNo：订单号</li>
     *   <li>orderAmt：订单金额</li>
     *   <li>source：支付来源（Android、IOS、PC、H5、WECHAT等）</li>
     *   <li>bizType：业务类型：0汽车票；1旅游专线；2城际专线；3机场大巴；4港澳专线；6约租车；7船票；8飞机票；9包车；10火车票；</li>
     *   <li>userId：用户ID</li>
     *   <li>clientIp：客户端IP</li>
     *   <li>remark：备注</li>
     *   <li>body：商品信息</li>
     *   <li>extraData：附加数据</li>
     *   
     *   <li>paymethod：alipay web支付付款方式（如bankPay）</li>
     *   <li>defaultbank：alipay web支付银行类型（如BOCB2C）</li>
     *   <li>purchaserQQ：手Q支付买方QQ号</li>
     *  </ul>
     * </pre>
     * 
     * 支付请求
     * @param Map<String, String>
     * @return PayResponse
     */
    Result<PayApplyResult> pay(Map<String, String> params);

    /**
     * 支付异步通知处理
     * @param Map<String, String> 第三方请求通知参数原样拓传
     * @return PayNotifyResponse
     */
    Result<PayNotifyResult> payNotify(Map<String, String> params);

    /**
     * 支付同步返回
     * @param Map<String, String> 第三方请求跳转参数原样拓传
     * @return PayReturnResponse
     */
    Result<PayReturnResult> payReturn(Map<String, String> params);

    /**
     * 退款请求
     * 
     * <pre>
     *  <ul>
     *   <li>payId：支付ID</li>
     *   <li>refundType：退款类型：1车票；2保险；</li>
     *   <li>refundNo：退款单号（订单详情或保险订单号）</li>
     *   <li>refundAmt：退款金额</li>
     *   <li>handleFee：退款手续费</li>
     *   <li>refundRate：退款费率</li>
     *   <li>refundReason：退款原因</li>
     *   <li>remark：备注</li>
     *   <li>extraData：附加数据</li>
     *  </ul>
     * </pre>
     * 
     * @param Map<String, String>
     * @return RefundResponse
     */
    Result<RefundApplyResult> refund(Map<String, String> params);

    /**
     * 退款异步通知回调
     * @param Map<String, String>
     * @return RefundNotifyResult
     */
    Result<RefundNotifyResult> refundNotify(Map<String, String> params);

    /**
     * <pre>
     *  <ul>
     *   <li>payId：支付ID</li>
     *  </ul>
     * </pre>
     * 
     * 支付查询
     * @param params
     * @return
     */
    Result<PayQueryResult> payQuery(Map<String, String> params);

    /**
     * <pre>
     *  <ul>
     *   <li>refundId：支付ID</li>
     *  </ul>
     * </pre>
     * 
     * 退款查询
     * @param params
     * @return
     */
    Result<RefundQueryResult> refundQuery(Map<String, String> params);

    //----------------------------------账单相关查询--------------------------------
    /**
     * 按订单查询账单
     * @param originPayId   原始订单号
     * @param changePayIds  改签订单号
     * @return
     */
    Result<List<OrderBill>> orderBill(String originPayId, String... changePayIds);

    /**
     * <pre>
     *  <ul>
     *   <li>refundType：退款类型</li>
     *   <li>beginTime：开始时间</li>
     *   <li>endTime：结束时间</li>
     *  </ul>
     * </pre>
     * 查询退款数据
     * @param params
     * @return
     */
    Result<Page<Refund>> queryRefundsForPage(Map<String, ?> params);
}
