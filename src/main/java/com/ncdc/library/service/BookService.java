package com.ncdc.library.service;

import com.ncdc.library.model.Book;

import java.util.List;

/**
 * Created by Lucas on 10.02.2018
 */
public interface BookService {

    void save(Book book);
    List<Book> retrieveAll();
}
