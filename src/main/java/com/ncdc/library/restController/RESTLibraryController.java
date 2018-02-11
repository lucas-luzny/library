package com.ncdc.library.restController;

import com.ncdc.library.model.Book;
import com.ncdc.library.service.BookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by Lucas on 10.02.2018
 */
@RestController
@Slf4j
public class RESTLibraryController {

    @Autowired
    BookService bookService;

    @PostMapping(value = "/addBook")
    public @ResponseBody
    Book addBook(@RequestBody @Valid Book book) {
        bookService.save(book);
        log.info("Book: " + book + "successfully added to library!");
        return book;
    }

    @GetMapping(value = "/getAllBooks")
    public List<Book> getAllBooks() {
        log.info("Retrieving books from the book repository");
        return bookService.retrieveAll();
    }
}
