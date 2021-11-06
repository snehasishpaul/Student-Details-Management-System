package view;

import controller.*;

import java.awt.*;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class menulist extends JFrame implements ActionListener {
	
	JLabel jlstudentdetailsadd,jlstudentadd,jlstudentupdate,jlfeeadd,jlfeedelete,jlfeeupdate,jlstudentdetailsupdate;
	JButton jbstudentdetailsadd,jbstudentadd,jbstudentupdate,jbfeeadd,jbfeedelete,jbfeeupdate,jbstudentdetailsupdate;
	
	public menulist() {
		
		Container c = getContentPane();
		c.setBackground(Color.RED);
		
		this.setBounds(100,100,1000,1000);
		this.setLayout(null);
		this.setVisible(true);
		
		jlstudentadd = new JLabel();
		jlstudentadd.setBounds(10,10,100,40);
		jlstudentadd.setText("STUDENT ADD");
		
		this.add(jlstudentadd);
		
		jbstudentadd=new JButton();
		jbstudentadd.setBounds(150,10,200,40);
		jbstudentadd.setText("STUDENT ADD");
		
		this.add(jbstudentadd);
		
		jlstudentupdate = new JLabel();
		jlstudentupdate.setBounds(10,50,100,40);
		jlstudentupdate.setText("STUDENT UPDATE");
		
		this.add(jlstudentupdate);
		
		jbstudentupdate=new JButton();
		jbstudentupdate.setBounds(150,50,200,40);
		jbstudentupdate.setText("STUDENT UPDATE");
		
		this.add(jbstudentupdate);
		
		jlfeeadd = new JLabel();
		jlfeeadd.setBounds(10,130,100,40);
		jlfeeadd.setText("FEE ADD");
		
		this.add(jlfeeadd);
		
		jbfeeadd=new JButton();
		jbfeeadd.setBounds(150,130,200,40);
		jbfeeadd.setText("FEE ADD");
		
		this.add(jbfeeadd);
		
		jlfeeupdate = new JLabel();
		jlfeeupdate.setBounds(10,170,100,40);
		jlfeeupdate.setText("FEE UPDATE");
		
		this.add(jlfeeupdate);
		
		jbfeeupdate=new JButton();
		jbfeeupdate.setBounds(150,170,200,40);
		jbfeeupdate.setText("FEE UPDATE");
		
		this.add(jbfeeupdate);
		
		jlstudentdetailsadd = new JLabel();
		jlstudentdetailsadd.setBounds(10,290,100,40);
		jlstudentdetailsadd.setText("STUDENT DETAILS ADD");
		
		this.add(jlstudentdetailsadd);
		
		jbstudentdetailsadd=new JButton();
		jbstudentdetailsadd.setBounds(150,290,200,40);
		jbstudentdetailsadd.setText("STUDENT DETAILS ADD");
		
		this.add(jbstudentdetailsadd);
		
		jlstudentdetailsupdate = new JLabel();
		jlstudentdetailsupdate.setBounds(10,330,100,40);
		jlstudentdetailsupdate.setText("STUDENT DETAILS UPDATE");
		
		this.add(jlstudentdetailsupdate);
		
		jbstudentdetailsupdate=new JButton();
		jbstudentdetailsupdate.setBounds(150,330,200,40);
		jbstudentdetailsupdate.setText("STUDENT DETAILS UPDATE");
		
		this.add(jbstudentdetailsupdate);
		
		jbstudentadd.addActionListener(this);
		jbstudentupdate.addActionListener(this);
		jbfeeadd.addActionListener(this);
		jbfeeupdate.addActionListener(this);
		jbstudentdetailsadd.addActionListener(this);
		jbstudentdetailsupdate.addActionListener(this);
		
	}
		public void actionPerformed(ActionEvent e) {
			
					String action=e.getActionCommand();
					if(action.equals("STUDENT ADD"))
					{
						JOptionPane.showMessageDialog(null,"WELCOME TO THE STUDENT ADD FORM");
						vStudentAdd studentadd= new vStudentAdd();
					}
					else if(action.equals("STUDENT UPDATE"))
					{
						JOptionPane.showMessageDialog(null,"WELCOME TO THE STUDENT UPDATE FORM");
						vStudentUpdate studentupdate=new vStudentUpdate();
					}
					else if(action.equals("FEE ADD"))
					{
						JOptionPane.showMessageDialog(null,"WELCOME TO THE FEE ADD FORM");
						vFeeAdd feeadd= new vFeeAdd();
					}
					else if(action.equals("FEE UPDATE"))
					{
						JOptionPane.showMessageDialog(null,"WELCOME TO THE FEE UPDATE FORM");
						vFeeUpdate feeupdate= new vFeeUpdate();
					}
					else if(action.equals("STUDENT DETAILS ADD"))
					{
						JOptionPane.showMessageDialog(null,"WELCOME TO THE STUDENT DETAILS ADD FORM");
						vStudentDetailsAdd studentdetailsadd=new vStudentDetailsAdd();
					}
					else if(action.equals("STUDENT DETAILS UPDATE"))
					{
						JOptionPane.showMessageDialog(null,"WELCOME TO THE STUDENT DETAILS ADD FORM");
						vStudentDetailsUpdate studentdetailsupdate=new vStudentDetailsUpdate();
					}
					
		}	
}
	