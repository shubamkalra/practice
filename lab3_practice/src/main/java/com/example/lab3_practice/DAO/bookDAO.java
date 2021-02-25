package com.example.lab3_practice.DAO;

import com.example.lab3_practice.Entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class bookDAO {
    @Autowired
    private BookRepository repository;

    public Collection<Book> getBooks(){
        return repository.findAll();
    }
    public Book createBooks(Book book){
        return repository.insert(book);
    }
}
