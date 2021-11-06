
package view;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import controller.*;
import model.*;

import javax.swing.*;

		public class vStudentUpdate extends JFrame implements ActionListener
		{
		  JTextField jtname,jtrollno,jtdob,jtaddress,jtphone,jtgender;//declare  two textfield
		  JComboBox jcstream;
		  JLabel jlname,jlrollno,jldob,jladdress,jlphone,jlgender,jlstream; //declare three labels
		  JButton jbsearch,jbdelete,jbupdate;
		  String []stream={"ECE","CSE","ME","CE","IT"};
		  public vStudentUpdate()
		  {
			  Container c = getContentPane();
			  c.setBackground(Color.green);
				
			this.setBounds(100,100,700,700);
			this.setLayout(null);
			this.setVisible(true);
			
			jlname=new JLabel();
			jlname.setBounds(10,10,100,40);
			jlname.setText("Name:");
			
			jtname=new JTextField();
			jtname.setBounds(110,10,100,40);
			this.add(jlname);//attaching the components to the frame
			this.add(jtname);//attaching the components to the frame
			
			jlrollno=new JLabel();
			jlrollno.setBounds(10, 50, 100, 40);
			jlrollno.setText("Rollno");
			
			jtrollno=new JTextField();
			jtrollno.setBounds(110,50,100,40);
			
			this.add(jlrollno);
			this.add(jtrollno);
			
			jldob=new JLabel();
			jldob.setBounds(10, 90, 100, 40);
			jldob.setText("DOB");
			
			jtdob=new JTextField();
			jtdob.setBounds(110,90,100,40);
			
			this.add(jldob);
			this.add(jtdob);
			
			jladdress=new JLabel();
			jladdress.setBounds(10,130, 100, 40);
			jladdress.setText("Address");
			
			jtaddress=new JTextField();
			jtaddress.setBounds(110,130,100,40);
			
			this.add(jladdress);
			this.add(jtaddress);
			
			
			jlgender=new JLabel();
			jlgender.setBounds(10, 170, 100, 40);
			jlgender.setText("GENDER");
			
			jtgender=new JTextField();
			jtgender.setBounds(110,170,100,40);
			
			this.add(jlgender);
			this.add(jtgender);
			
			jlphone=new JLabel();
			jlphone.setBounds(10, 210, 100, 40);
			jlphone.setText("PHONE.NO");
			
			jtphone=new JTextField();
			jtphone.setBounds(110,210,100,40);
			
			this.add(jlphone);
			this.add(jtphone);
		
			jlstream=new JLabel();
			jlstream.setBounds(10, 250, 100, 40);
			jlstream.setText("STREAM");
			
			jcstream=new JComboBox(stream);
			jcstream.setBounds(110,250,100,40);
			
			this.add(jlstream);
			this.add(jcstream);
			
			
			jbsearch=new JButton("SEARCH");
			jbsearch.setBounds(10,300,80,40);
			
			this.add(jbsearch);
			
			jbsearch.addActionListener(this);
			
			jbupdate=new JButton("UPDATE");
			jbupdate.setBounds(100,300,80,40);
			
			this.add(jbupdate);
			
			jbupdate.addActionListener(this);
			
			
			jbdelete=new JButton("DELETE");
			jbdelete.setBounds(200,300,80,40);
			
			this.add(jbdelete);
			
			jbdelete.addActionListener(this);



		  }
		  public void actionPerformed(ActionEvent e)
		  {
			  int roll=Integer.parseInt(jtrollno.getText());
			  String stream=jcstream.getSelectedItem().toString();
			  
			  /*String name=jtname.getText();
			  String dob=jtdob.getText();
			  String phone=jtphone.getText();
			  String address=jtaddress.getText();
			 // int phone=Integer.parseInt(jtphone.getText());
			  String gender=jtgender.getText();*/
			  
			  String action=e.getActionCommand();//e is the variable of action event
			  if(action.equals("SEARCH"))
			  {
				  try
				  {
					 
				 cStudent obj=new cStudent();
				 Object o=obj.StudentSearch(roll,stream);
				 StudentEntity s=(StudentEntity)o;
				 jtname.setText(s.name);
			//	 jtrollno.setText(s.rollno);
				 jtdob.setText(s.dob);
				 jtaddress.setText(s.address);
				 jtphone.setText(s.phone);
				 jtgender.setText(s.gender);
				 jcstream.setSelectedItem(s.stream);
				// JOptionPane.showMessageDialog(null,"STUDENT UPDATED SUCCESSFULLY");
				  }
				  catch(Exception ex) {
					  JOptionPane.showMessageDialog(null,"ID NOT FOUND !");
				  }
			 }
			  
			  else if(action.equals("UPDATE"))
			  {
				  String name=jtname.getText();
				  String dob=jtdob.getText();
				  String phone=jtphone.getText();
				 // String phone=jtphone.getText();
				  String address=jtaddress.getText();
				//  int phone=Integer.parseInt(jtphone.getText());
				  String gender=jtgender.getText();
				 // String stream=jcstream.getSelectedItem().toString();
				  
				  cStudent obj=new cStudent();
					obj.StudentUpdate(name,roll,stream,dob,address,phone,gender);
				  JOptionPane.showMessageDialog(null,"FORM UPDATED SUCCESSFULLY");
			  }
			  else if(action.equals("DELETE"))
			  {
				  String name=jtname.getText();
				  String dob=jtdob.getText();
				  String phone=jtphone.getText();
				  String address=jtaddress.getText();
				 // int phone=Integer.parseInt(jtphone.getText());
				  String gender=jtgender.getText();
				 // String stream=jcstream.getSelectedItem().toString();
				  
				  cStudent obj=new cStudent();
					obj.StudentDelete(name,roll,stream,dob,address,phone,gender);
				  JOptionPane.showMessageDialog(null,"FORM DELETED SUCCESSFULLY");
			  }
		  }

		  }

