package com.nt.document;

import java.util.Arrays;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Document(collection = "MDB_OTM_SPORT")
@Setter
@Getter
@NoArgsConstructor
@RequiredArgsConstructor
public class Sport {
	@Id
	@NonNull
	private  Integer sid;
	@NonNull
	private String  spname;
	@NonNull
	private String spType;
	@NonNull
	private  String[] kitItems[];
	
	@Override
	public String toString() {
		return "Sport [sid=" + sid + ", spname=" + spname + ", spType=" + spType + ", kitItems="
				+ Arrays.toString(kitItems) + "]";
	}
	

}
