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
	private  IEmployeeRepository  empRepo;

	@Override
	public List<Employee> showEmployeesBySalaryRange(double startSalary, double endSalary) {
		 //use Repository
		List<Employee> list=empRepo.findBySalaryBetween(startSalary, endSalary);
		return list;
	}

	@Override
	public List<Employee> showEmloyeesByEnames(String... names) {
		
		return empRepo.findByEnameIn(names);
	}
	
}
