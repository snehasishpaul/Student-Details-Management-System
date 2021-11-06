package model;

import java.io.Serializable;


public class StudentDetails implements Serializable{

	public int rollno;
	public String semester;
	public String stream;
	public String attendance;
	public String feestatus;
	
	public StudentDetails(int rollno,String semester,String stream,String attendance,String feestatus) {
		
		this.rollno=rollno;
		this.semester=semester;
		this.stream=stream;
		this.attendance=attendance;
		this.feestatus=feestatus;
	}
	
}
