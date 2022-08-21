package com.sudheergogula.quotes;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class QuotesController {

    private final QuotesRepository repository;

    @RequestMapping("/")
    public String getQuote(Model model) {
        LocalDate today = LocalDate.now();
        List<Quotes> quotes = repository.findAll();
        int index = today.getDayOfMonth() % quotes.size();
        Quotes todayQuote = quotes.get(index);
        quotes.remove(index);
        model.addAttribute("todayQuote", todayQuote);
        model.addAttribute("quotes", quotes);
        return "index";
    }
}
