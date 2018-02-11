package com.ncdc.library.controller;

import com.ncdc.library.config.Constants;
import com.ncdc.library.model.Book;
import com.ncdc.library.service.BookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

/**
 * Created by Lucas on 10.02.2018
 */
@Controller
@Slf4j
public class LibraryController {

    @Autowired
    BookService bookService;

    @GetMapping("/view")
    public ModelAndView viewBooks() {
        ModelAndView model = new ModelAndView(Constants.VIEW_BOOKS);
        model.addObject("library", bookService.retrieveAll());
        log.info("Redirecting to view.jsp");
        log.info("Retrieving books from the book repository");
        return model;
    }

    @GetMapping(value = "/add")
    public String addPage(Model model) {
        model.addAttribute(Constants.BOOK_ENTITY_NAME, new Book());
        log.info("Redirecting to add.jsp");
        return Constants.ADD_BOOK;
    }

    @PostMapping(value = "/add")
    public String addBookPage(@Valid Book book, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return Constants.ADD_BOOK;
        }
        log.info("Book: " + book + "successfully added to library!");
        model.addAttribute(Constants.BOOK_ENTITY_NAME, book);
        bookService.save(book);
        return "redirect:" + Constants.VIEW_BOOKS;
    }
}
