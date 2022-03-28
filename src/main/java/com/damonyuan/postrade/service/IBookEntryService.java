package com.damonyuan.postrade.service;

import com.damonyuan.postrade.domain.BookEntry;
import org.checkerframework.checker.nullness.qual.NonNull;

import java.util.List;
import java.util.Map;

public interface IBookEntryService {
    BookEntry create(Map<String, Object> attrs);
    List<BookEntry> index(Long size, Long offset);
    BookEntry show(@NonNull Long id);
    BookEntry update(@NonNull Long id, Map<String, Object> attrs);
    void delete(@NonNull Long id);
}
