package com.damonyuan.postrade.service;

import com.damonyuan.postrade.domain.Order;
import org.checkerframework.checker.nullness.qual.NonNull;

import java.util.List;
import java.util.Map;

public interface IOrderService {
    Order create(Map<String, Object> attrs);
    List<Order> index(Long size, Long offset);
    Order show(@NonNull Long id);
    Order update(@NonNull Long id, Map<String, Object> attrs);
    void delete(@NonNull Long id);
}
