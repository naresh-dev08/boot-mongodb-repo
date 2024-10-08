package com.nt.runner;

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
		try {
			 Employee emp=new Employee(1001, "raja", "hyd", 90000.0, true);
			String msg=empService.registerEmployee(emp);
			System.out.println(msg);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		/*	try {
				 Employee emp1=new Employee();
				 emp1.setEno(1002); emp1.setVaccinated(true); emp1.setEname("ramesh");
				 Employee emp2=new Employee(1003, "suresh", "vizag", 888998.0, true);
				 String idVal[]=empService.registerEmployees(List.of(emp1, emp2));
				 System.out.println("saved docs id Values are ::"+Arrays.toString(idVal));
			}
			catch(Exception e) {
				e.printStackTrace();
			}*/
		/*
		  try {
			  empService.showAllEmployees().forEach(emp->{
				  System.out.println(emp);
			  });
		  }//try
		  catch(Exception e) {
			  e.printStackTrace();
		  }*/
		
		/*	try {
				Employee e=empService.findEmployeeById("64e56d4f2fa3ad40489f44431");
				System.out.println(e);
			}
			catch(Exception e) {
				e.printStackTrace();
			}*/
		
		/*  try {
		  String msg=empService.updateEmployeeById("64e56d4f2fa3ad40489f4443", 120000.0);
		  System.out.println(msg);
		  }
		  catch(Exception e) {
		   e.printStackTrace();
		  }*/
		
		/*	try {
				 Employee emp=new Employee(UUID.randomUUID().toString(),1001, "raja", "hyd", 90000.0, true);
				String msg=empService.registerEmployee(emp);
				System.out.println(msg);
			}
			catch(Exception e) {
				e.printStackTrace();
			}*/
		
	

	}//run(-)

}//class
