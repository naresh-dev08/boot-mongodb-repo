package com.nt.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.Employee;
import com.nt.service.IEmployeeMgmtService;

@Component
public class MongoRepositoryTestRunner implements CommandLineRunner {
	@Autowired
	private IEmployeeMgmtService  empService;

	@Override
	public void run(String... args) throws Exception {
	        
		/*List<Employee> list=empService.showEmployeesBySalaryRange(10000.0, 300000.0);
				list.forEach(System.out::println);;*/
		
		  empService.showEmloyeesByEnames("raja","rani","rajesh","kiran").forEach(System.out::println);

	}//run(-)

}//class
