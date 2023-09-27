package com.alexfarias.bookmanager.controlers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.alexfarias.bookmanager.models.BookModel;
import com.alexfarias.bookmanager.repositories.BookRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/books")
@AllArgsConstructor
public class BookControler {

    private final BookRepository bookRepository;

    @GetMapping()
    public List<BookModel> list() {
        return bookRepository.findAll();
    }

    @PostMapping()
    @ResponseStatus(code = HttpStatus.CREATED)
    public BookModel create(@RequestBody BookModel book) {
        return bookRepository.save(book);
    }

}
