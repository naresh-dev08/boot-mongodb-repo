package com.nt.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.Employee;
import com.nt.service.IEmployeeMgmtService;

@Component
public class MongoTemplateTestRunner implements CommandLineRunner {
	@Autowired
	private  IEmployeeMgmtService  empService;

	@Override
	public void run(String... args) throws Exception {
		/*  Employee emp=new Employee(1001, "raja", "hyd", 90000.0, true);
		  String idVal=empService.registerEmployee(emp);
		  System.out.println(" id value ::"+idVal);*/
		
		/*	Employee emp1=new Employee(1001, "raja", "hyd", 90000.0,true);
			Employee emp2=new Employee(1002, "rajesh", "vizag", 80000.0,true);
			String msg=empService.registerBatchEmployees(List.of(emp1,emp2));
			System.out.println(msg);*/
		
		  //empService.findEmployeesBySalaryRange(10000.0, 80000.0).forEach(System.out::println);
		
		  //empService.findEmployeesByAddrs("hyd").forEach(System.out::println);
		
		 //System.out.println(empService.findEmployeeById("82e57b1c-3372-47dd-bb14-34ee296e872f"));
		  //empService.findEmployeesByAddrsAndSalaryRange(10000.0, 100000.0, "hyd","vizag").forEach(System.out::println);
		
		   //System.out.println(empService.findAndUpdateEmpDataByEno(1001, "newyork",999999.0));
		
		  //System.out.println(empService.findAndUpdateEmpDataBySalaryRange(50000.0, 90000.0, "newjersy1"));
		
		   System.out.println(empService.saveOrUpdateEmpDataByEno(1011, "navi Mumbai3", 77781.0));
		

	}

}
