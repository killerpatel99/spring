package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Department;
import com.example.demo.repository.DepartmentRepository;
import com.example.demo.service.DepartmentService;

@RestController
public class DepartmentController {

	@Autowired
	private DepartmentService service;
	
	
	@PostMapping("/departments")
	public Department saveDepartment(@RequestBody Department department) {
		
		return service.saveDepartment(department);
		
		
	}
	@GetMapping("/departments")
	public List<Department> getDepartment() {
		
		return service.getDepartment();
	}
}
