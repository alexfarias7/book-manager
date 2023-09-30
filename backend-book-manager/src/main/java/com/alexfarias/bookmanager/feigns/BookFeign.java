package com.alexfarias.bookmanager.feigns;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;

import com.alexfarias.bookmanager.responses.BookWrapperResponse;


@FeignClient(url = "https://www.googleapis.com/books", name = "apigooglebooks")
public interface BookFeign {
    BookWrapperResponse searchBookByName(@PathVariable("title") String title);
}
