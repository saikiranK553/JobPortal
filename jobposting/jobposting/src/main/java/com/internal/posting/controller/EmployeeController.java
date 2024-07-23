package com.internal.posting.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.internal.posting.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	@PostMapping
	public ResponseEntity<?> uploadEmpData(@RequestParam("resume") MultipartFile file,@RequestParam("id") int id,@RequestParam("name")String name ) throws IOException{
		String empData=employeeService.uploadResume(file, id, name);
		return ResponseEntity.ok().body(empData);
	}
}
