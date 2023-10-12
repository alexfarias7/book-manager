package com.alexfarias.bookmanager.feigns;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.alexfarias.bookmanager.responses.BookWrapperResponse;


@FeignClient(url = "https://www.googleapis.com/books/v1/", name = "apigooglebooks")
public interface  BookFeign {

/*      @Value("${apiGoogleKey}")
        private String apiKey; */
    
   @GetMapping("{title}/json")
   public BookWrapperResponse searchBookByTitle(@PathVariable("title") String title);
}
