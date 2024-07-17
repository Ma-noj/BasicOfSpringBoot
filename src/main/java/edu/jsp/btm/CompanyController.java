package edu.jsp.btm;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {
	@PostMapping("/company/save")
	public String saveCompany(@RequestBody Company company) {
		return "CompanyId = " + company.getCompanyId() + 
				" Compnay GST Number = " + company.getGst().getGstNumber();
	}

}
