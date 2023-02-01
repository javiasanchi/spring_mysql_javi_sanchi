package com.example.spring_mysql_javi_sanchi;

import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Book;

public interface BookRepository extends JpaRepository <Book , Long> {
}
