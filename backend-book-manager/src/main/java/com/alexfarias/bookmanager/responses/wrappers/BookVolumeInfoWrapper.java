package com.alexfarias.bookmanager.responses.wrappers;

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
	private ImageLinks imageLinks;
   private IndustryIdentifiers[] industryIdentifiers;

}
