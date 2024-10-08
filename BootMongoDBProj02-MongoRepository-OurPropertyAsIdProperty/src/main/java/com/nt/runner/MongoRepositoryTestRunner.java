package com.nt.runner;

import java.util.Random;

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
		  Employee emp=new Employee(new Random().nextInt(100000), "rajesh", "hyd", 90000.0, true);
		  String msg=empService.registerEmployee(emp);
		  System.out.println(msg);
	  }//try
	  catch(Exception e) {
		  e.printStackTrace();
	  }
		
		
	}//run(-)

}//class
