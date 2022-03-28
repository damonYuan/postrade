package com.damonyuan.postrade.service;

import com.damonyuan.postrade.domain.Trade;
import org.checkerframework.checker.nullness.qual.NonNull;

import java.util.List;
import java.util.Map;

public interface ITradeService {
    Trade create(Map<String, Object> attrs);
    List<Trade> index(Long size, Long offset);
    Trade show(@NonNull Long id);
    Trade update(@NonNull Long id, Map<String, Object> attrs);
    void delete(@NonNull Long id);

    void book(@NonNull Long id);
}
