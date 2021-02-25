package com.example.lab3_practice.service;

import com.example.lab3_practice.DAO.bookDAO;
import com.example.lab3_practice.Entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;


@Service
public class bookService {
    @Autowired
    private bookDAO bookDAo;
    public Collection<Book> getBooks(){
        return bookDAo.getBooks();
    }
    public Book createBook(Book book){
        return bookDAo.createBooks(book);
    }
}

