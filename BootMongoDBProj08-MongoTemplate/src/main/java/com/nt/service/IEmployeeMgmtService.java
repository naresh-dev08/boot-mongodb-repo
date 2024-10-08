package com.nt.service;

import java.util.List;

import com.nt.document.Employee;

public interface IEmployeeMgmtService {
    public  String   registerEmployee(Employee emp);
    public  String    registerBatchEmployees(List<Employee> list);
    public  List<Employee>  findEmployeesBySalaryRange(double start, double end);
    public  List<Employee>  findEmployeesByAddrs(String addrs);
    public   Employee   findEmployeeById(String id);
    public  List<Employee> findEmployeesByAddrsAndSalaryRange(double start,double end, String ...addrs);
    public  String     findAndUpdateEmpDataByEno(int eno, String newAddrs, double newSalary);
    public  String     findAndUpdateEmpDataBySalaryRange(double start,double end, String newAddrs);
    public   String   saveOrUpdateEmpDataByEno(int eno,String  newAddrs, double newSalary);
    
    
}
