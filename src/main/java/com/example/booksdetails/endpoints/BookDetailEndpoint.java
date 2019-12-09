package com.example.booksdetails.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.booksdetails.models.BookEntity;
import com.example.booksdetails.repo.BooksRepository;

@RestController
@RequestMapping(path = "books")
public class BookDetailEndpoint {
	
	@Autowired
	BooksRepository bookRepo;
	
	@GetMapping(path = "/{id}", produces = "application/json", consumes = "application/json")
    public BookEntity getBook(@PathVariable int id ) {
       return  bookRepo.findById(id).get();
    }
	
	@PostMapping
	public BookEntity saveBook(@RequestBody @Validated BookEntity book) {
		return bookRepo.save(book);
	}
			
}
