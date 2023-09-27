package com.alexfarias.bookmanager.responses;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class BookResponse {
 
   private String title;
   private String author;
   private String category;
   private String shelf;
}
