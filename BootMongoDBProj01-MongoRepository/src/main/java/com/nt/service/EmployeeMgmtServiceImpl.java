package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.document.Employee;
import com.nt.repository.IEmployeeRepository;

@Service("empService")
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {
	@Autowired
	private IEmployeeRepository empRepo;

	@Override
	public String registerEmployee(Employee emp) {
		 String idVal=empRepo.save(emp).getId();
		return "employee is registered with the id value ::"+idVal;
	}

	@Override
	public String[] registerEmployees(List<Employee> emps) {
		
	  List<Employee> semps= empRepo.saveAll(emps);
	  String idVal[]=new String[emps.size()];
	   for(int i=0;i<idVal.length;++i) {
		     idVal[i]=semps.get(i).getId();
	   }
	   
	   return  idVal;
		
	}

	@Override
	public List<Employee> showAllEmployees() {
			return empRepo.findAll();
	}

	@Override
	public Employee findEmployeeById(String id) {
				Optional<Employee> opt= empRepo.findById(id);
				if(opt.isPresent())
					return opt.get();
				else
					throw new IllegalArgumentException("invalid id");
	}

	@Override
	public String updateEmployeeById(String id, double newSalary) {
		   // Load the Document
		 Optional<Employee> opt=empRepo.findById(id);
		  if(opt.isPresent()) {
			  //get the Document
			  Employee  emp=opt.get();
			  emp.setSalary(newSalary);
			  String idVal=empRepo.save(emp).getId();
			  return  idVal+" id  document is updated with new salary";
		  }
		return id+" id  document is not found";
	}

}
