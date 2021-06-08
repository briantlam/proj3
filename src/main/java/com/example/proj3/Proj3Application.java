package com.example.proj3;

import com.example.proj3.controller.Proj3Controller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@ComponentScan(basePackageClasses = Proj3Controller.class)
public class Proj3Application {

	public static void main(String[] args) {
		SpringApplication.run(Proj3Application.class, args);
	}

}
