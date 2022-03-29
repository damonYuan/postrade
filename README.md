README
====

## 概览 Overview

前台交易和后台簿记中的

- 数据模型 Modeling
- 交易 Trading
- 簿记 Booking
- 计价 Pricing

## 基本概念 Basic Concepts

### 什么是 Order？

Order 是客户希望通过下新的订单来生成一条合约对某种产品进行买卖。 

这个动作类比于电商平台相当于电商收到客户的订单。电商在收到订单后需要查看订单内容确认交易商品，查询仓库是否有货等等；证券交易员收到订单后同样需要确认订单中的交易内容，根据合约内容检查合规，确认订单交易类型等等。

以简单的证券交易为例，以限价单购买 1000@1685.00 600519.SH 茅台，订单中至少应包含以下信息：

```
{
  "instrument": "600519.SH",
  "quantity": 1000,
  "operation": "Buy; Limit; Fill or Kill",
  "trade_date": "2022-02-02",
  "others": "500 to sub-account A; 500 to sub-account B",
  "created_at": "2022-02-02 14:30:23 HKT"
}
```

交易员收到该订单后，明白该客户想要以限价单全部成交或取消订单的方式交易 1000 股茅台，并且如果交易成功后将股票平均分配到两个子账户中。

### 什么是 Trade？

Trade 是成功成交后的 Order。

### 什么是 Book？

#### 什么是 Order Book 和 Trade Book？

## 数据模型 Modeling

### Order 和 Trade 的关系

### 交易工具 Instrument

## 交易 Trading

### 订单路由 Order Routing

### 订单匹配 Order Matching

### 订单执行 Order Execution

## 簿记 Booking

### 交易 Transaction

### 公司行为 Corporate Action

### 利息 Interest

### 准备金利息返现 Margin Interest Rebate

## 计价 Pricing

### PnL 计算 PnL Calculation

- Open PnL
- PnL
- Close PnL

### 市场信息 Market Data

### 产品信息 Product Data

## 其他 Others

### Reset and Mark-to-Market
### Trading Calendar
### Valuation Report