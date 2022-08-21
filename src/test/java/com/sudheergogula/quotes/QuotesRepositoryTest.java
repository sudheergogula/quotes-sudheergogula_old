package com.sudheergogula.quotes;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ActiveProfiles("test")
@Slf4j
public class QuotesRepositoryTest {

    @Autowired
    private QuotesRepository repository;

    @Test
    void shouldFetchAllQuotes() {
        Quotes quote = new Quotes();
        quote.setId(2);
        quote.setQuote("First, solve the problem. Then, write the code.");
        quote.setAuthor("John Johnson");
        List<Quotes> quotes = repository.findAll();
        log.info("Quotes -> {}", quotes);
        assertThat(quotes).isNotNull();
        assertThat(quotes).isNotEmpty();
        assertThat(quotes).hasSize(10);
        assertThat(quotes).contains(quote);
    }
}
