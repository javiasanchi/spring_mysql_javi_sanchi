package com.example.spring_mysql_javi_sanchi.entities;

import jakarta.persistence.*;

import java.awt.print.Book;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @Column (length = 50)
    private String fullName;

    @Column (unique = true)
    private String nif;

    @Column (unique = true, nullable = false)
    private String email;
    private LocalDate birthday;
    private Boolean active;
    private Double salary;

    @OneToOne
    @JoinColumn (unique = true)

    private Address address;

    @OneToMany(mappedBy = "author", fetch = FetchType.EAGER)
    private List<Book> books = new ArrayList<>();












}
