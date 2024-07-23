package com.internal.posting.service;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

public interface EmployeeService {
	String uploadResume(MultipartFile file,int empId,String empName) throws IOException;
}
