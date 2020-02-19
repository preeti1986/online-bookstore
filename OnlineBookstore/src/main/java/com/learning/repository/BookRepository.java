package com.learning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.learning.entity.Book;

@Repository
@CrossOrigin("*")
public interface BookRepository extends JpaRepository<Book, Long> {

}
