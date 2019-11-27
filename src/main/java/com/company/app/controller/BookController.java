package com.company.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

    @RequestMapping("/books/{id}")
    public String getBookById(Model model, @PathVariable int id) {
        model.addAttribute("id", id);
        return "books";
    }
}
