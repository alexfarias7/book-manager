package com.alexfarias.bookmanager.responses.wrappers;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;


@JsonAutoDetect
@JsonIgnoreProperties(ignoreUnknown=true)
@Getter
@Setter
public class BookVolumeInfoWrapper {

   private String title;
   private String subtitle;
   private String[] authors;
   private String publisher;
   private String publishedDate;
   private String description;
   private int pageCount;
   private String[] categories;
   private String language;
	private Map<String, String> imageLinks = new HashMap<String, String>();

}
