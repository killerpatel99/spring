package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.controller.DepartmentController;
import com.example.demo.entity.Department;

@SpringBootApplication 
public class SpringDepartmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDepartmentApplication.class, args);
	}

}
