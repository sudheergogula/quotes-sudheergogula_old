package com.sudheergogula.quotes;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "quotes")
@Data
@ToString
public class Quotes implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;

    @Column(name = "quote", nullable = false)
    private String quote;

    @Column(name = "author", nullable = false)
    private String author;
}
