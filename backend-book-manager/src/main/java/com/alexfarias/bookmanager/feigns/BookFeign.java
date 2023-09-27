package com.alexfarias.bookmanager.feigns;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;

import com.alexfarias.bookmanager.responses.BookResponse;

@FeignClient(url = "https://www.googleapis.com/books", name = "apigooglebooks")
public interface BookFeign {
    BookResponse searchBookByName(@PathVariable("title") String title);
}
