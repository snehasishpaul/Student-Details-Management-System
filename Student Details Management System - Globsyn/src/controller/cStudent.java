package controller;
import java.io.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import model.*;
import view.*;

public class cStudent {
	
	static ArrayList arr1=new ArrayList<>();

	public void StudentAdd(String name,int rollno,String stream,String dob,String address,String phone,String gender) {
		
		StudentEntity s1=new StudentEntity(name,rollno,stream,dob,address,phone,gender);
		
		
		try{
			
			File f=new File("studentinfo.dat");
			if(f.exists())	
			{
				FileInputStream fis=new FileInputStream(f);
				ObjectInputStream ois=new ObjectInputStream(fis);
				arr1=(ArrayList)ois.readObject();
				arr1.add(s1);
				
				FileOutputStream fos=new FileOutputStream(f);
				ObjectOutputStream ous=new ObjectOutputStream(fos);
				ous.writeObject(arr1);
				ous.close();
				
			}
			else
			{
				FileOutputStream fos=new FileOutputStream(f);
				ObjectOutputStream ous=new ObjectOutputStream(fos);
				arr1.add(s1);
				ous.writeObject(arr1);
				ous.close();
			}
			
		}
		catch(Exception e) 
		{
			System.out.println("Exception error exists");
		}
		
	}

	
	
	public Object StudentSearch(int roll,String stream) {

		try {
			File f=new File("studentinfo.dat");
			if(f.exists()) 
			{
				FileInputStream fis=new FileInputStream(f);
				ObjectInputStream ois=new ObjectInputStream(fis);
				arr1=(ArrayList) ois.readObject();
				//arr.add(s1);
			
				for(Object o:arr1) 
				{
					if(o instanceof StudentEntity/*model class*/) 
					{                                                  /*so 'o' is object of model-studentdetails class*/
					                                                   /*therefore it contains rollno & sem given in model class*/
						StudentEntity std=(StudentEntity) o;
						if(std.rollno==roll /* &&  std.stream==stream*/) 
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
	
	
	public void StudentUpdate(String name,int rollno,String stream,String dob,String address,String phone,String gender) {
		
		//ArrayList arr1=new ArrayList();
		
		try {
			File f=new File("studentinfo.dat");
			if(f.exists()) {
				FileInputStream fis=new FileInputStream(f);
				ObjectInputStream ois=new ObjectInputStream(fis);
				arr1=(ArrayList) ois.readObject();
				//arr.add(s1);
			
				for(Object o:arr1) {
					if(o instanceof StudentEntity) {
						StudentEntity student=(StudentEntity) o;
						if(student.rollno==rollno) 
						{
							student.name=name;
							student.dob=dob;
							student.stream=stream;
							student.address=address;
							student.phone=phone;
							student.gender=gender;
							FileOutputStream fos=new FileOutputStream(f);
							ObjectOutputStream oos=new ObjectOutputStream(fos);
							oos.writeObject(arr1);
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
	
	public void StudentDelete(String name,int roll,String stream,String dob,String address,String phone,String gender) {
		
		try {
			File f=new File("studentinfo.dat");
			if(f.exists()) 
			{
				FileInputStream fis=new FileInputStream(f);
				ObjectInputStream ois=new ObjectInputStream(fis);
				arr1=(ArrayList) ois.readObject();
				//arr.add(s1);
			
				for(Object o:arr1) 
				{
					if(o instanceof StudentEntity/*model class*/) 
					{                                                  /*so 'o' is object of model-studentdetails class*/
					                                                   /*therefore it contains rollno & sem given in model class*/
						StudentEntity std=(StudentEntity) o;
						if(std.rollno==roll /* &&  std.stream==stream*/) 
						{
							arr1.remove(std);
							FileOutputStream fos=new FileOutputStream(f);
							ObjectOutputStream oos=new ObjectOutputStream(fos);
							oos.writeObject(arr1);
							oos.close();
						}
					}
				
					
				}
			
			}
			
			}

		
		
		catch(Exception e) {
			System.out.println("Exception exists");
		}
		
		
		
	}
	
	
	
}
	

