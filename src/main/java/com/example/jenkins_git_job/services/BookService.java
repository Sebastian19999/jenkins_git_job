package com.example.jenkins_git_job.services;

import com.example.jenkins_git_job.models.Book;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;

@Service
public class BookService {

    private HashMap<Long,Book> bookMap=new HashMap<Long, Book>();

    public Collection<Book> getAllBooks(){
        return bookMap.values();
    }

    public Book getBookById(Long id){
        return bookMap.get(id);
    }

    public Book saveBook(Book book){
        Book book1=new Book();
        book1.setId(book.getId());
        book1.setAuthor(book.getAuthor());
        book1.setName(book.getName());
        bookMap.put(book1.getId(),book1);
        return book1;
    }

    public String deleteBook(Long id){
        bookMap.remove(id);
        return "Book deleted successfully";
    }



}
