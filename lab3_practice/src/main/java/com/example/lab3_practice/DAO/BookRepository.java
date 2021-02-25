package com.example.lab3_practice.DAO;

import com.example.lab3_practice.Entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book,Integer> {
}
