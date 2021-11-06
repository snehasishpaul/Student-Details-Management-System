package view;

import controller.*;
import model.*;

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

public class vStudentDetailsAdd extends JFrame implements ActionListener {

	JLabel jlrollno,jlsemester,jlstream,jlattendance,jlfeestatus;
	JTextField jtrollno,jtattendance,jtfeestatus;
	JComboBox jcsemester,jcstream;
	JButton jbadd;
	
	String s[]= {"Semester1","Semester2","Semester3","Semester4"};
	String st[]={"ECE","CSE","ME","IT","CE"};
	
	public vStudentDetailsAdd() {
		
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
		
		jcsemester = new JComboBox(s);
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
		
		jbadd=new JButton("ADD");
		jbadd.setBounds(10,210,100,40);
		
		this.add(jbadd);
		
		jbadd.addActionListener(this);
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		String action=e.getActionCommand();
		
		int rollno=Integer.parseInt(jtrollno.getText());
		String semester=jcsemester.getSelectedItem().toString();
		String stream=jcstream.getSelectedItem().toString();
		String attendance=jtattendance.getText();
		String feestatus=jtfeestatus.getText();
		
		if(action.equals("ADD"))
		{
			
			cStudentDetails obj=new cStudentDetails();
			obj.StudentDetailsAdd(rollno, semester,stream,attendance,feestatus);
			JOptionPane.showMessageDialog(null,"student detail added succesfully");
			
			
		}
		
	}
	
	
}
