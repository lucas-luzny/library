package com.ncdc.library.repository;

import com.ncdc.library.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Lucas on 11.02.2018
 */
public interface BookRepository extends JpaRepository<Book, String> {
}
