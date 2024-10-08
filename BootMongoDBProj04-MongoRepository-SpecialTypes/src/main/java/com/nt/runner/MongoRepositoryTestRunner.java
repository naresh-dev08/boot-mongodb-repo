package com.nt.runner;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

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
		/*try {
			 Properties props=new Properties();
			 props.put("voterId", 54343535); props.put("aadharId", 534353554);
			Employee  emp=new Employee(1001, "raja", "hyd", 90000.0, 
					                                                   new String[] {"red","green","black"},
					                                                   List.of("ravi","ramesh","suresh"),
					                                                   Set.of(9999999L,8888888L,7777777L),
					                                                   props,
					                                                   Map.of(1234,"Jeevan Anand",3456,"Jeevan Umang")
					                                                   );
			 System.out.println(empService.registerEmployee(emp));
			
		}//try
		catch(Exception e) {
			e.printStackTrace();
		}*/
		
		  empService.showAllEmployees().forEach(System.out::println);

	}//run(-)

}//class
