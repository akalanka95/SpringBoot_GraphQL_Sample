package com.akalanka.spring_graphql.repository;

import com.akalanka.spring_graphql.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,String> {

}
