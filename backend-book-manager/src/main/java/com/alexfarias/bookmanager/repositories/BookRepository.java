package com.alexfarias.bookmanager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexfarias.bookmanager.models.BookModel;

public interface BookRepository extends JpaRepository<BookModel, Long> {

}
