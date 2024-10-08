package com.nt.document;

import java.util.Map;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Document(collection = "MDB_OTM_PLAYER")
@Setter
@Getter
@NoArgsConstructor
@RequiredArgsConstructor
public class Player {
	@Id
	@NonNull
	private Integer pid;
	@NonNull
	private  String pname;
	@NonNull
	private  String paddrs;
	@NonNull
	@Field(name = "p_age")
	private  Integer page;
	private Set<Sport>  sportsInfo;
	private Map<String,Medal> medalsInfo;
	
	@Override
	public String toString() {
		return "Player [pid=" + pid + ", pname=" + pname + ", paddrs=" + paddrs + ", page=" + page + "]";
	}
	
	
	

}
