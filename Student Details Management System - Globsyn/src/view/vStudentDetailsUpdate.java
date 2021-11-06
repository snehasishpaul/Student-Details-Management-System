package view;

import model.*;
import controller.*;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class vStudentDetailsUpdate extends JFrame implements ActionListener {

	JLabel jlrollno,jlsemester,jlstream,jlattendance,jlfeestatus;
	JTextField jtrollno,jtattendance,jtfeestatus;
	JComboBox jcsemester,jcstream;
	JButton jbupdate,jbsearch,jbdelete;
	
	String s[]= {"Semester1","Semester2","Semester3","Semester4"};
	String st[]={"ECE","CSE","ME","IT","CE"};
	
	
	public vStudentDetailsUpdate() {
		
		Container c = getContentPane();
		c.setBackground(Color.lightGray);
		
    	this.setBounds(100,100,1000,1000);
		this.setLayout(null);
		this.setVisible(true);
		
		jlrollno=new JLabel();
		jlrollno.setBounds(10, 10, 100, 40);
		jlrollno.setText("ROLL NO.");
		
		jtrollno=new JTextField();
		jtrollno.setBounds(110,10,100,40);
		
		this.add(jlrollno);
		this.add(jtrollno);
		
		jlsemester=new JLabel();
		jlsemester.setBounds(10, 50, 100, 40);
		jlsemester.setText("SEMESTER");
	
		this.add(jlsemester);
		
		jcsemester = new JComboBox<>(s);
		jcsemester.setBounds(110,50,100,40);
		
		this.add(jcsemester);
		
		jlstream=new JLabel();
		jlstream.setBounds(10, 90, 100, 40);
		jlstream.setText("STREAM");
		
		jcstream =new JComboBox<>(st);
		jcstream.setBounds(110,90,100,40);
		
		this.add(jlstream);
		this.add(jcstream);
		
		jlattendance=new JLabel();
		jlattendance.setBounds(10, 130, 100, 40);
		jlattendance.setText("ATTENDANCE");
		
		jtattendance =new JTextField();
		jtattendance.setBounds(110,130,100,40);
		
		this.add(jlattendance);
		this.add(jtattendance);
		
		jlfeestatus=new JLabel();
		jlfeestatus.setBounds(10, 170, 100, 40);
		jlfeestatus.setText("FEE STATUS");
		
		jtfeestatus =new JTextField();
		jtfeestatus.setBounds(110,170,100,40);
		
		this.add(jlfeestatus);
		this.add(jtfeestatus);
		
		jbsearch=new JButton("SEARCH");
		jbsearch.setBounds(10,210,100,40);
		
		this.add(jbsearch);
		jbsearch.addActionListener(this);
		
		jbupdate=new JButton("UPDATE");
		jbupdate.setBounds(10,250,100,40);
		
		this.add(jbupdate);
		
		jbupdate.addActionListener(this);
		
		jbdelete=new JButton("DELETE");
		jbdelete.setBounds(10,290,100,40);
		
		this.add(jbdelete);
		
		jbdelete.addActionListener(this);
		
		
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		int roll=Integer.parseInt(jtrollno.getText());
		String sem=jcsemester.getSelectedItem().toString();
		String stream=jcstream.getSelectedItem().toString();
		String attendance=jtattendance.getText();
		String feestatus=jtfeestatus.getText();
		
		
		String action=e.getActionCommand();
		
		if(action.equals("SEARCH"))
		{
			try{
			cStudentDetails obj=new cStudentDetails();
			Object o=obj.StudentDetailsSearch(Integer.parseInt(jtrollno.getText()));
			StudentDetails s=(StudentDetails)o;
			jcsemester.setSelectedItem(s.semester);
			jcstream.setSelectedItem(s.stream);
			jtattendance.setText(s.attendance);
			jtfeestatus.setText(s.feestatus);
			
			
			}
			
			catch(Exception ex) {
				JOptionPane.showMessageDialog(null,"ID NOT FOUND !");
			}
			
			
		}
		else if(action.equals("UPDATE")) {
			
			cStudentDetails obj=new cStudentDetails();
			obj.StudentDetailsUpdate(roll,sem,stream,attendance,feestatus);
			JOptionPane.showMessageDialog(null,"Update Successful !");
			
			
			
		}
		else if(action.equals("DELETE")) {
			cStudentDetails obj=new cStudentDetails();
			obj.StudentDetailsDelete(roll, sem);
			JOptionPane.showMessageDialog(null,"Delete Successful !");
			
		}
		
		
	}
}
