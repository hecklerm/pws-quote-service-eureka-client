package com.example;

import com.example.Quote;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by markheckler on 7/14/16.
 */
@RepositoryRestResource
public interface QuoteRepository extends CrudRepository<Quote, Long> {
    @Query("select q from Quote q order by RAND()")
    List<Quote> getQuotesRandomOrder();
}
