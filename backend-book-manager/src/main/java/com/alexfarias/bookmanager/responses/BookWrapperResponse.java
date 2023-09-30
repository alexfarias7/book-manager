package com.alexfarias.bookmanager.responses;

import com.alexfarias.bookmanager.responses.wrappers.BookItemsWrapper;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown=true)
public class BookWrapperResponse {
    private int totalItems;
	private BookItemsWrapper[] items;
}
 

