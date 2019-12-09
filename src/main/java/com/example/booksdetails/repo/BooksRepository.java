package com.example.booksdetails.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.booksdetails.models.BookEntity;

@Repository
public interface BooksRepository extends JpaRepository<BookEntity, Integer>{
}
