package com.nt.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Document(collection = "MDB_OTO_PERSON")
@Setter
@Getter
//@ToString
@NoArgsConstructor
@RequiredArgsConstructor
public class Person {
	@Id
	private String id;
	@NonNull
	private String pname;
	@NonNull
	private String  paddrs;
	@NonNull
	private  Integer age;
	private DrivingLicense licenseDetails;
	@Override
	public String toString() {
		return "Person [id=" + id + ", pname=" + pname + ", paddrs=" + paddrs + ", age=" + age + "]";
	}
	
	

}
