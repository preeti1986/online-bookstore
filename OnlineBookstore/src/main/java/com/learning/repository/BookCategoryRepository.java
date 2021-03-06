package com.learning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.learning.entity.BookCategory;

@CrossOrigin("*")
@RepositoryRestResource(collectionResourceRel = "bookCategory",path = "book-category")
public interface BookCategoryRepository extends JpaRepository<BookCategory, Long> {

}
