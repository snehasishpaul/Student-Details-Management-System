package controller;
import model.*;
import view.*;

import java.io.*;
import java.util.*;

import javax.swing.JOptionPane;


public class cFee {

	static ArrayList arr=new ArrayList<>();
	
	public void FeeAdd(String semester,String fee) {
		
		FeeEntity obj=new FeeEntity(semester,fee);
		
		try {

			File f=new File("fee.dat");
			if(f.exists()) {
				FileInputStream fis=new FileInputStream(f);
				ObjectInputStream ois=new ObjectInputStream(fis);
				arr=(ArrayList) ois.readObject();
				arr.add(obj);
				
				FileOutputStream fos=new FileOutputStream(f);
				ObjectOutputStream oos=new ObjectOutputStream(fos);
				oos.writeObject(arr);
				oos.close();
				
			}
			else {
				FileOutputStream fos=new FileOutputStream(f);
				ObjectOutputStream oos=new ObjectOutputStream(fos);
				arr.add(obj);
				oos.writeObject(arr);
				oos.close();
				
			}
			
		}
		catch(Exception ex) {
			JOptionPane.showMessageDialog(null,"Exception exists in connector package");
		}
		
	}
	
	public Object FeeSearch(String semester) {
		
		try {
			File f=new File("fee.dat");
			if(f.exists()) {
				FileInputStream fis=new FileInputStream(f);
				ObjectInputStream ois=new ObjectInputStream(fis);
				arr=(ArrayList) ois.readObject();
			
				for(Object o:arr) {
					if(o instanceof FeeEntity) {
						FeeEntity fe=(FeeEntity) o;
						if(fe.semester==semester)
						{
							return o;
							
						}
					}
				}
			
			
			
			}

		
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null,"Exception exists");
		}
		
		return null;
		
	}
	
	public Object FeeUpdate(String semester,String fee) {
		
		try {
			File f=new File("fee.dat");
			if(f.exists()) {
				FileInputStream fis=new FileInputStream(f);
				ObjectInputStream ois=new ObjectInputStream(fis);
				arr=(ArrayList) ois.readObject();
				//arr.add(s1);
			
				for(Object o:arr) {
					if(o instanceof FeeEntity) {
						FeeEntity std=(FeeEntity) o;
						if(std.semester==semester) 
						{
							std.fee=fee;
							FileOutputStream fos=new FileOutputStream(f);
							ObjectOutputStream oos=new ObjectOutputStream(fos);
							oos.writeObject(arr);
							oos.close();
							
						}
					}
				
					else {
						JOptionPane.showMessageDialog(null,"No student details");
					}
				}
			}		
		}
		catch(Exception e) {
			System.out.println("Exception exists");
		}
		return null;
	}
	
	public Object FeeDelete(String semester) {
		
		try {
			File f=new File("fee.dat");
			if(f.exists()) {
				FileInputStream fis=new FileInputStream(f);
				ObjectInputStream ois=new ObjectInputStream(fis);
				arr=(ArrayList) ois.readObject();
				//arr.add(s1);
			
				for(Object o:arr) {
					if(o instanceof FeeEntity) {
						FeeEntity std=(FeeEntity) o;
						if(std.semester==semester) 
						{
							arr.remove(std);
							FileOutputStream fos=new FileOutputStream(f);
							ObjectOutputStream oos=new ObjectOutputStream(fos);
							oos.writeObject(arr);
							oos.close();
						}
					}
				
					else {
						JOptionPane.showMessageDialog(null,"No student details");
					}
				}
			}		
		}
		catch(Exception e) {
			System.out.println("Exception exists");
		}
		return null;
		
	}
	
	
}
