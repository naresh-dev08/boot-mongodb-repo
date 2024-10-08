package com.nt.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nt.document.Employee;

public interface IEmployeeRepository extends MongoRepository<Employee, String> {
        public  List<Employee> findBySalaryBetween(double startSalary,double endSalary);
        public  List<Employee>  findByEnameIn(String ... names);
}
