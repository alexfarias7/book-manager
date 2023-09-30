package com.alexfarias.bookmanager.clients;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.alexfarias.bookmanager.responses.BookWrapperResponse;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static org.springframework.http.MediaType.APPLICATION_JSON;

import org.springframework.beans.factory.annotation.Value;

@Service
@Slf4j
public class BookClient {

        @Value("${apiGoogleKey}")
        private String apiKey;

        private final WebClient webClient;

        public BookClient(WebClient.Builder builder) {
                webClient = builder.baseUrl("https://www.googleapis.com/books/v1/").build();
        }

        public Mono<BookWrapperResponse> findACharacterByISBN(String isbn) {
                log.info("Buscando o livro com o isbn [{}]", isbn);
                return webClient
                                .get()
                                .uri("volumes?q=isbn:" + isbn + "&key="+apiKey)
                                .accept(APPLICATION_JSON)
                                .retrieve()
                                .onStatus(HttpStatus.BAD_REQUEST::equals,
                                                error -> Mono.error(new RuntimeException(
                                                                "verifique os parametros informados")))
                                .bodyToMono(BookWrapperResponse.class);
        }

        public Flux<BookWrapperResponse> findBookByTitle(String title) {
                log.info("Listando todos os livros cadastrados pelo titulo " + title);
                return webClient
                                .get()
                                .uri("volumes?q=intitle:" + title + "&key="+apiKey)
                                .accept(APPLICATION_JSON)
                                .retrieve()
                                .onStatus(HttpStatus.BAD_REQUEST::equals,
                                                error -> Mono.error(new RuntimeException(
                                                                "verifique os parâmetros informados")))
                                .bodyToFlux(BookWrapperResponse.class);
        }

        public Flux<BookWrapperResponse> findBookByAuthor(String author) {
                log.info("Listando todos os livros cadastrados pelo titulo " + author);
                return webClient
                                .get()
                                .uri("volumes?q=inauthor:" + author + "&key="+apiKey)
                                .accept(APPLICATION_JSON)
                                .retrieve()
                                .onStatus(HttpStatus.BAD_REQUEST::equals,
                                                error -> Mono.error(new RuntimeException(
                                                                "verifique os parâmetros informados")))
                                .bodyToFlux(BookWrapperResponse.class);
        }
}
