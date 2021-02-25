package com.example.lab3_practice.controller;

import com.example.lab3_practice.Entity.Book;
import com.example.lab3_practice.service.bookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping(path="/books")
public class bookController {
    @Autowired
    com.example.lab3_practice.service.bookService bookService;
    @GetMapping
    public Collection<Book> getBooks(){
        return bookService.getBooks();
    }
    @PostMapping
    public Book createBook(@RequestBody Book book){
        return bookService.createBook(book);
    }
}
