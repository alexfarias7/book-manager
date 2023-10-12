package com.alexfarias.bookmanager.responses;

import com.alexfarias.bookmanager.responses.wrappers.BookItemsWrapper;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown=true)
public class BookWrapperResponse {
   private String kind;
   private  int totalItems;
  @JsonProperty("items")
	private BookItemsWrapper[] items;
} 
 

