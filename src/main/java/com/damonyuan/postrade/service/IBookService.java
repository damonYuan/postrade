package com.damonyuan.postrade.service;

import com.damonyuan.postrade.domain.Book;
import com.damonyuan.postrade.domain.BookEntry;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.List;
import java.util.Map;

public interface IBookService {
    Book create(Map<String, Object> attrs);
    List<Book> index(Long size, Long offset);
    Book show(@NonNull Long id);
    Book update(@NonNull Long id, Map<String, Object> attrs);
    void delete(@NonNull Long id);

    List<BookEntry> positions(@NonNull Long id, @Nullable String instrument);
}
