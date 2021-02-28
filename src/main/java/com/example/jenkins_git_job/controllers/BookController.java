package com.example.jenkins_git_job.controllers;

import com.example.jenkins_git_job.models.Book;
import com.example.jenkins_git_job.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public Collection<Book> getAll(){
        return bookService.getAllBooks();
    }

    @GetMapping("/{id}")
    public Book getBook(@PathVariable Long id){
        return bookService.getBookById(id);
    }

    @PostMapping
    public Book saveBook(@RequestBody Book book){
        return bookService.saveBook(book);
    }

    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable Long id){
        return bookService.deleteBook(id);
    }

}
