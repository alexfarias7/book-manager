package com.alexfarias.bookmanager.controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.alexfarias.bookmanager.models.BookModel;
import com.alexfarias.bookmanager.repositories.BookRepository;
import com.alexfarias.bookmanager.responses.BookWrapperResponse;
import com.alexfarias.bookmanager.services.BookService;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/books")
@AllArgsConstructor
public class BookControler {

    @Autowired
    private BookService bookService;

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

    @GetMapping("/isbn/{isbn}")
    @ResponseStatus(HttpStatus.OK)
    public Mono<BookWrapperResponse> getCharacterByIsbn(@PathVariable String isbn) {
        return bookService.searchBookByISBN(isbn);
    }

    @GetMapping("/titles/{title}")
    @ResponseStatus(HttpStatus.OK)
    public Flux<BookWrapperResponse> getBooksByTitle(@PathVariable String title) {
        return bookService.searchBookByTitle(title);
    }

    @GetMapping("/author/{author}")
    @ResponseStatus(HttpStatus.OK)
    public Flux<BookWrapperResponse> getBooksByAuthor(@PathVariable String author) {
        return  bookService.searchBookByAuthor(author);
    }


}