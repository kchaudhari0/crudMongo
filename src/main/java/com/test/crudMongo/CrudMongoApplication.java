package com.test.crudMongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.test.crudMongo")
public class CrudMongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudMongoApplication.class, args);
	}

}
