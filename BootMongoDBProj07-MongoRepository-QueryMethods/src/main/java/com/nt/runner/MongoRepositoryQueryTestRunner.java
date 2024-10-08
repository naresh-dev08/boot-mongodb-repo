package com.nt.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.Employee;
import com.nt.repository.IEmployeeRepository;


@Component
public class MongoRepositoryQueryTestRunner implements CommandLineRunner {
	@Autowired
	private IEmployeeRepository  empRepo;

	@Override
	public void run(String... args) throws Exception {
		/*List<Object[]> list=empRepo.getEmpsDataByAddrs("hyd");
		list.forEach(row->{
			System.out.println(Arrays.toString(row));
		});*/
		
		/*	List<Employee> list=empRepo.getEmpsFullDataByAddrs("hyd");
			list.forEach(emp->{
				System.out.println(emp);
			});*/
		
		//empRepo.getEmpsFullDataByNameAndAddrs("raja", "hyd").forEach(System.out::println);
		
		// empRepo.getEmpsFullDataByNameOrAddrs("raja", "vizag").forEach(System.out::println);
		
		/* empRepo.getEmpsDataBySalary(10000.0, 200000.0).forEach(row->{
			   System.out.println(Arrays.toString(row));
		 });*/
		  //empRepo.getEmpsFullDataByEnameChars("r").forEach(System.out::println);
		  //empRepo.getEmpsFullDataByEnameChars("^r").forEach(System.out::println);
		  //empRepo.getEmpsFullDataByEnameChars("a$").forEach(System.out::println);
		
		//empRepo.getEmpsFullDataByAddrs("hyd","vizag","delhi").forEach(System.out::println);
		
		//System.out.println("Emps count  by salary range ::"+empRepo.getEmpsCountBySalaryRange(100000.0, 200000.0));
		
		//empRepo.getEmpsByNameSorting().forEach(System.out::println);
		//System.out.println("deleted emps count::"+empRepo.deleteEmployeesWithNoAddrs());
		System.out.println(empRepo.isEmpsFoundBySalaryRange(100000.0, 20000000.0));
		
	}//run(-)
}//class
