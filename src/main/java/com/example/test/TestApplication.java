package com.example.test;

import com.example.test.module.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication

public class TestApplication {

	public static void main(String[] args) {


		//autowired
		ApplicationContext context=SpringApplication.run(TestApplication.class, args);

//		Laptop lap=new Laptop();			//create laptop object by new keyword
//		lap.compile();

															//@Component is responsible to create object and pull it is to the container
		Laptop lap=context.getBean(Laptop.class);			//getbean= Create me a object
		lap.compile();

		System.out.println(lap.hashCode());    //without @Scope(value = "prototype")--301552475
												//without @Scope(value = "prototype")--108333023
		 Laptop lap1=context.getBean(Laptop.class);

		System.out.println(lap1.hashCode());	//without @Scope(value = "prototype")--301552475
												//without @Scope(value = "prototype")--874189736
	}

}
