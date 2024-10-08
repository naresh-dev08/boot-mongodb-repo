package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.document.DrivingLicense;
import com.nt.document.Person;
import com.nt.repository.IDrivingLicenseRepository;
import com.nt.repository.IPersonRepository;

@Service("oneToOneService")
public class OneToOneAssociationMgmtServiceImpl implements IOneToOneAssociationMgmtService {
	@Autowired
    private IPersonRepository  personRepo;
	@Autowired
	private  IDrivingLicenseRepository licenseRepo;
	
	@Override
	public String saveDataUsingPerson(Person person) {
	    String idVal=personRepo.save(person).getId();
		return "Person object and its associated DrivingLicense object is saved with the id value ::"+idVal;
	}

	@Override
	public String saveDataUsingDrivingLicense(DrivingLicense license) {
		String idVal=licenseRepo.save(license).getId();
		return "DrivingLicense object and its associated Person object is saved with the id value ::"+idVal;
	}

	@Override
	public List<Person> showDataUsingPerson() {
		// TODO Auto-generated method stub
		return  personRepo.findAll();
	}

	@Override
	public List<DrivingLicense> showDataUsingDrivingLicense() {
		return licenseRepo.findAll();
	}

}
