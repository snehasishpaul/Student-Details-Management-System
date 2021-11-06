package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

import javax.swing.JOptionPane;

import model.*;

public class cStudentDetails {

	static ArrayList arr=new ArrayList<>();
	
	public void StudentDetailsAdd(int rollno,String semester,String stream,String attendance,String feestatus) {
		
		StudentDetails s1=new StudentDetails(rollno, semester,stream,attendance,feestatus);
		try {
			
			File f=new File("studentdetails.dat");
			if(f.exists()) {
				FileInputStream fis=new FileInputStream(f);
				ObjectInputStream ois=new ObjectInputStream(fis);
				arr=(ArrayList) ois.readObject();
				arr.add(s1);
				
				FileOutputStream fos=new FileOutputStream(f);
				ObjectOutputStream oos=new ObjectOutputStream(fos);
				oos.writeObject(arr);
				oos.close();
				
			}
			else {
				FileOutputStream fos=new FileOutputStream(f);
				ObjectOutputStream oos=new ObjectOutputStream(fos);
				arr.add(s1);
				oos.writeObject(arr);
				oos.close();
				
			}
		}
		catch(Exception ex) {
			System.out.println("Exception exists");
		}

	}
	
	public Object StudentDetailsSearch(int roll) {

		try {
			File f=new File("studentdetails.dat");
			if(f.exists()) {
				FileInputStream fis=new FileInputStream(f);
				ObjectInputStream ois=new ObjectInputStream(fis);
				arr=(ArrayList) ois.readObject();
				//arr.add(s1);
			
				for(Object o:arr) {
					if(o instanceof StudentDetails) {
						StudentDetails std=(StudentDetails) o;
						if(std.rollno==roll) 
						{
							return o;
							
						}
					}
				}
			
			
			
			}

		
		}
		catch(Exception e) {
			System.out.println("Exception exists");
		}
		return null;
	}
	
	
	public void StudentDetailsUpdate(int roll,String sem,String stream,String attendance,String feestatus) {
		
		//ArrayList arr1=new ArrayList();
		
		try {
			File f=new File("studentdetails.dat");
			if(f.exists()) {
				FileInputStream fis=new FileInputStream(f);
				ObjectInputStream ois=new ObjectInputStream(fis);
				arr=(ArrayList) ois.readObject();
				//arr.add(s1);
			
				for(Object o:arr) {
					if(o instanceof StudentDetails) {
						StudentDetails std=(StudentDetails) o;
						if(std.rollno==roll) 
						{
							std.semester=sem;
							std.stream=stream;
							std.attendance=attendance;
							std.feestatus=feestatus;
							FileOutputStream fos=new FileOutputStream(f);
							ObjectOutputStream oos=new ObjectOutputStream(fos);
							oos.writeObject(arr);
							oos.close();
							
						}
					}
				
					else {
						System.out.println("No student details");
					}
				}
			}		
		}
		catch(Exception e) {
			System.out.println("Exception exists");
		}

		
		
	}
	
	public void StudentDetailsDelete(int roll,String sem) {
		
		//Object obj=StudentDetailsSearch(roll);
		
		try {
			File f=new File("studentdetails.dat");
			if(f.exists()) {
				FileInputStream fis=new FileInputStream(f);
				ObjectInputStream ois=new ObjectInputStream(fis);
				arr=(ArrayList) ois.readObject();
				//arr.add(s1);
			
				for(Object o:arr) {
					if(o instanceof StudentDetails) {
						StudentDetails std=(StudentDetails) o;
						if(std.rollno==roll) 
						{
							arr.remove(std);
							FileOutputStream fos=new FileOutputStream(f);
							ObjectOutputStream oos=new ObjectOutputStream(fos);
							oos.writeObject(arr);
							oos.close();
						}
					}
				
					else {
						System.out.println("No student details");
					}
				}
			}		
		}
		catch(Exception e) {
			System.out.println("Exception exists");
		}
		
		
	}
	
	
}
