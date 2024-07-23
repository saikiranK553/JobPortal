package com.internal.posting.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.internal.posting.EmployeeUtil;
import com.internal.posting.entity.Employee;
import com.internal.posting.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public String uploadResume(MultipartFile file,int empId,String empName) throws IOException {
		Employee employee= employeeRepository.save(Employee.builder().employeeId(empId).employeeName(empName)
				.employeeResume(EmployeeUtil.compressImage(file.getBytes())).build());
		if(employee!=null) {
			return "file successfully uploaded"+file.getOriginalFilename();
		}
		return null;
	}

}
