package edu.jsp.btm;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@PostMapping("/employees/save")
	public Employee saveEmployee(@RequestBody Employee employee) {
		System.err.println("Employee Name = " + employee.getEmployeeName());
		return employee;
	}
}
