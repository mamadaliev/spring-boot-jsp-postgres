package com.company.app.controller;

import com.company.app.model.Book;
import com.company.app.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class BookController {

    private final BookRepository bookRepository;

    @Autowired
    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books")
    public String getBooks(Model model) {
        List<Book> books = bookRepository.findAll();
        model.addAttribute("books", books);
        return "books";
    }

    @RequestMapping("/books/{id}")
    public String getBookById(Model model, @PathVariable int id) {
        Optional<Book> book = bookRepository.findById(id);
        book.ifPresent(value -> model.addAttribute("book", value));
        return "book";
    }
}
