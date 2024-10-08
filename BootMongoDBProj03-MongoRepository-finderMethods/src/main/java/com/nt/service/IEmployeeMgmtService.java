package com.nt.service;

import java.util.List;

import com.nt.document.Employee;

public interface IEmployeeMgmtService {
	public  List<Employee>  showEmployeesBySalaryRange(double startSalary,double endSalary);
	public   List<Employee>  showEmloyeesByEnames(String ...names);
      
}
