package com.nt.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.nt.document.Employee;

public interface IEmployeeRepository extends MongoRepository<Employee, String> {

	@Query(fields = "{id:0,ename:1,eadd:1,eno:1}", value = "{eadd:?0}")
	public   List<Object[]>  getEmpsDataByAddrs(String addrs);
	
	//@Query(fields = "{}", value = "{eadd:?0}")
	@Query( value = "{eadd:?0}")
	public   List<Employee>  getEmpsFullDataByAddrs(String addrs);
	
	@Query( value = "{ename:?0,eadd:?1}")
	public  List<Employee>  getEmpsFullDataByNameAndAddrs(String name,String addrs);
	
	@Query( value = "{$or:[{ename:?0},{eadd:?1}]}")
	public  List<Employee>  getEmpsFullDataByNameOrAddrs(String name,String addrs);
	
	@Query(fields="{id:0,eno:1,ename:1,eadd:1,salary:1}", value = "{salary:{$gte:?0},salary:{$lte:?1}}")
	public  List<Object[]>  getEmpsDataBySalary(double start, double end);
	
	@Query(fields="{}", value = "{ename:{'$regex':?0, '$options':'i'}}")
	//@Query(fields="{}", value = "{ename:{'$regex':?0}}")
	public   List<Employee>  getEmpsFullDataByEnameChars(String initialChars);
	
	@Query(fields="{}", value = "{eadd:{$in:[?0,?1,?2]}}")
	public  List<Employee>  getEmpsFullDataByAddrs(String addrs1,String addrs2,String addrs3);
	
	
	@Query(value = "{salary:{$gte:?0},salary:{$lte:?1}}",count = true)
	public  int  getEmpsCountBySalaryRange(double start, double end);
	
	@Query(value = "{}",sort = "{ename:1}")
	public  List<Employee>  getEmpsByNameSorting();
	
	@Query(value = "{eadd:null}",delete = true)
	public   int   deleteEmployeesWithNoAddrs();
	
	
	@Query(value = "{salary:{$gte:?0},salary:{$lte:?1}}",exists = true)
	public  boolean  isEmpsFoundBySalaryRange(double start, double end);
	
	
	
	
	
	
	
}
