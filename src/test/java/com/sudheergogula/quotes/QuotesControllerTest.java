package com.sudheergogula.quotes;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.ui.Model;
import org.springframework.validation.support.BindingAwareModelMap;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ActiveProfiles("test")
@Slf4j
public class QuotesControllerTest {

    @Autowired
    private QuotesRepository repository;

    @Autowired
    private QuotesController controller;

    @Test
    void shouldGetQuotes(){
        Model model = new BindingAwareModelMap();
        controller.getQuote(model);
        assertThat(model.getAttribute("todayQuote")).isNotNull();
        List<Quotes> quotes = (List<Quotes>) model.getAttribute("quotes");
        assertThat(quotes).hasSize(9);
    }
}
