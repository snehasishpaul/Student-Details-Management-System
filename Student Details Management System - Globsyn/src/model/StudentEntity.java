package model;

import java.io.Serializable;

public class StudentEntity implements Serializable{
      
	public String name;
	public int rollno;
	public String stream;
	public String dob;
	public String address;
	public String phone;
	public String gender;
	
	public StudentEntity(String name,int rollno,String stream,String dob,String address,String phone,String gender) {
		
		this.name=name;
		this.rollno=rollno;
		this.stream=stream;
		this.dob=dob;
		this.address=address;
		this.phone=phone;
		this.gender=gender;
		
	}

}
