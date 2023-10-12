package com.alexfarias.bookmanager.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alexfarias.bookmanager.clients.BookClient;
import com.alexfarias.bookmanager.responses.BookWrapperResponse;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public class BookService {

    @Autowired
    private final BookClient bookClient;


    public Flux<BookWrapperResponse> searchBookByAuthor(String value) {
        return bookClient.findBookByAuthor(value);
    }
       public Flux<BookWrapperResponse> searchBookByTitle(String value) {
        return bookClient.findBookByTitle(value);
    }

    public Mono<BookWrapperResponse> searchBookByISBN(String value) {
        return bookClient.findACharacterByISBN(value);
    }

}
