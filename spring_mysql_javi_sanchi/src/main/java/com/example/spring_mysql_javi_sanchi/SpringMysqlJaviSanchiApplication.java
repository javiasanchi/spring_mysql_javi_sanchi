package com.example.spring_mysql_javi_sanchi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringMysqlJaviSanchiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMysqlJaviSanchiApplication.class, args);

		// para crear repositorios se encarga Spring

		BookRepository bookRepository = spring.getBean(BookRepository.class);

	}

}
