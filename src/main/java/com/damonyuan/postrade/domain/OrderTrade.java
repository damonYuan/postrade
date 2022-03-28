package com.damonyuan.postrade.domain;

public class OrderTrade {
    long orderId;
    long tradeId;
    // order -> orderTrades: sum(orderTrade.executed) <= order.qty; order.fulfilled = true when sum(orderTrade.executed) == order.qty
    // trade -> orderTrades: sum(orderTrade.executed) == trade.qty
    // executed <= min(order.qty, trade.qty)
    int executed;
}
