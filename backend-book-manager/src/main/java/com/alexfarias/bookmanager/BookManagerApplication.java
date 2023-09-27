package com.alexfarias.bookmanager;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.alexfarias.bookmanager.models.BookModel;
import com.alexfarias.bookmanager.repositories.BookRepository;

@SpringBootApplication
public class BookManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookManagerApplication.class, args);
	}

	    @Bean
 	   CommandLineRunner iniitDatabase(BookRepository bookRepository){
        return values->{
            bookRepository.deleteAll();

			BookModel book = new BookModel();
			book.setTitle("o senhor dos aneis");
			book.setCategory("fantasia");
			book.setAuthor("j rr token");
			book.setUrlCover("https://m.media-amazon.com/images/I/41RBd2DvmgL._SY445_SX342_.jpg");
			book.setShelf("comprado");
			bookRepository.save(book);
        };
	   }

}
