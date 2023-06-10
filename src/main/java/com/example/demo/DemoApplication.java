package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoApplication {


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//		context.scan("com.example");
//		context.refresh();
//		System.out.println("Refreshing the spring context");
//		DBConnection dbConnection = context.getBean(DBConnection.class);
//
//		dbConnection.printDBConfigs();
//
//		// close the spring context
//		context.close();
	}

}
