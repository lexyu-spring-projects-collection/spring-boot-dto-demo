package com.lex;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.mapstruct.MapperConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.lex.entity.Product;
import com.lex.repository.ProductRepository;

@SpringBootApplication
public class SpringDtoDemo2Application implements CommandLineRunner {
	
	@Autowired
	private ProductRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SpringDtoDemo2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		List<Product> list = List.of(
				new Product(1,"p1","p1 test", new BigDecimal(1), LocalDateTime.now(), LocalDateTime.now()),
				new Product(2,"p2","p2 test", new BigDecimal(2), LocalDateTime.now(), LocalDateTime.now()),
				new Product(3,"p3","p3 test", new BigDecimal(3), LocalDateTime.now(), LocalDateTime.now()),
				new Product(4,"p4","p4 test", new BigDecimal(4), LocalDateTime.now(), LocalDateTime.now()),
				new Product(5,"p5","p5 test", new BigDecimal(5), LocalDateTime.now(), LocalDateTime.now())
				);
		
		repository.saveAll(list);
	}
	
	

}
