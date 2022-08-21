package com.sudheergogula.quotes;

import org.springframework.data.jpa.repository.JpaRepository;

public interface QuotesRepository extends JpaRepository<Quotes, Integer> {
}
