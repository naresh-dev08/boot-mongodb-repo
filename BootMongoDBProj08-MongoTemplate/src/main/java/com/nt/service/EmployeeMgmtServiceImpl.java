package com.nt.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.mongodb.client.result.UpdateResult;
import com.nt.document.Employee;

@Service("empService")
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {
	@Autowired
	private MongoTemplate template;

	@Override
	public String registerEmployee(Employee emp) {
		//String idVal=template.insert(emp).getId();
		 String idVal=template.save(emp).getId();
		return idVal;
	}

	@Override
	public String registerBatchEmployees(List<Employee> list) {
		Collection<Employee> sList= template.insertAll(list);
		return  sList.size()+" no.of emp/docs are saved";
	}

	@Override
	public List<Employee> findEmployeesBySalaryRange(double start, double end) {
		 //Query object -- represents the condition
		 Query query=new Query();
		 query.addCriteria(Criteria.where("salary").gte(start).lte(end));
		 List<Employee> list=template.find(query, Employee.class);
		return list;
	}

	@Override
	public List<Employee> findEmployeesByAddrs(String addrs) {
		 Query query=new Query();
		 query.addCriteria(Criteria.where("eadd").is(addrs));
		 List<Employee> list=template.find(query, Employee.class);
		return list;
	}

	@Override
	public Employee findEmployeeById(String id) {
		return template.findById(id, Employee.class);
	}

	@Override
	public List<Employee> findEmployeesByAddrsAndSalaryRange(double start, double end, String... addrs) {
		// Query object
		 Query query=new Query();
		 query.addCriteria(Criteria.where("eadd").in(addrs).and("salary").gte(start).lte(end));
		 List<Employee> list=template.find(query, Employee.class);
		return list;
	}

	@Override
	public String findAndUpdateEmpDataByEno(int eno, String newAddrs, double newSalary) {
		  //Query object
		 Query query=new Query();
		 query.addCriteria(Criteria.where("eno").is(eno));
		 //Update object
		 Update update=new Update();
		 update.set("eadd", newAddrs);
		 update.set("salary", newSalary);
		 
		 Employee emp=template.findAndModify(query, update,Employee.class);
		 
		return emp==null?"Employee not found":" Employee found and updated:: "+emp;
	}

	@Override
	public String findAndUpdateEmpDataBySalaryRange(double start, double end, String newAddrs) {
		  //Query object
		 Query query=new Query();
		 query.addCriteria(Criteria.where("salary").gte(start).lte(end));
		 //Update object
		 Update update=new Update();
		 update.set("eadd", newAddrs);
		
		 
		 UpdateResult result=template.updateMulti(query, update,Employee.class);
		 
		return  result.getModifiedCount()+" docs are updated";
	}
	
	@Override
	public String saveOrUpdateEmpDataByEno(int eno, String newAddrs, double newSalary) {
		  //Query object
		 Query query=new Query();
		 query.addCriteria(Criteria.where("eno").is(eno));
		 //Update object
		 Update update=new Update();
		 update.set("eadd", newAddrs);
		 update.set("salary", newSalary);
		 update.setOnInsert("isVaccinated", true);
		 update.setOnInsert("ename", "bond");
		 update.setOnInsert("eno", eno);
		 
		 //save or update the doc
		 UpdateResult result=template.upsert(query, update, Employee.class);
		  if(result.getModifiedCount()==0)
			     return "Doc is inserted";
		  else
			  return "Doc is Updated";
			    		
	}

}
