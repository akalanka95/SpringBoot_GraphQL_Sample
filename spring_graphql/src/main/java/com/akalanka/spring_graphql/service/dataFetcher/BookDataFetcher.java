package com.akalanka.spring_graphql.service.dataFetcher;

import com.akalanka.spring_graphql.model.Book;
import com.akalanka.spring_graphql.repository.BookRepository;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookDataFetcher  implements DataFetcher<Book>{
    @Autowired
    BookRepository bookRepository;
    @Override
    public Book get(DataFetchingEnvironment dataFetchingEnvironment) {
        String isn = dataFetchingEnvironment.getArgument("id");
        return bookRepository.findOne(isn);
    }
}
