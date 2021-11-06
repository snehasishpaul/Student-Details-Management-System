
package view;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;

import controller.*;
import model.*;

import java.awt.event.ActionListener;

import javax.swing.*;

public class vFeeAdd extends JFrame implements ActionListener
{
	JLabel jlsemester,jlfee;
	JTextField jtfee;
	JComboBox jcsemester;
	
	JButton jbsubmit;
	String a[]={"Semester1","Semester2","Semester3","Semester4"};
	
	public vFeeAdd()
	{
	this.setBounds(75,75,700,700);
	this.setLayout(null);
	this.setVisible(true);
	
	Container c = getContentPane();
	c.setBackground(Color.CYAN);
	
	
	jlsemester=new JLabel();
	jlsemester.setBounds(10, 50, 100, 40);
	jlsemester.setText("SEMESTER");
	
	jcsemester = new JComboBox<>(a);
	jcsemester.setBounds(110,50,100,40);
	
	this.add(jlsemester);
	this.add(jcsemester);
	
	jlfee=new JLabel();
	jlfee.setBounds(10, 90, 100, 40);
	jlfee.setText("FEE");
	
	jtfee = new JTextField();
	jtfee.setBounds(110,90,100,40);
	
	this.add(jlfee);
	this.add(jtfee);
	
	jbsubmit = new JButton();
	jbsubmit.setBounds(10,150,100,40);
	jbsubmit.setText("SUBMIT");
	
	this.add(jbsubmit);
	
	jbsubmit.addActionListener(this);
	
	}
	
	public void actionPerformed(ActionEvent e)
	{
		//int rollno=Integer.parseInt(jtrollno.getText());
		String semester=jcsemester.getSelectedItem().toString();
		String fee=jtfee.getText();
		
		String action=e.getActionCommand();
		
		if(action.equals("SUBMIT"))
				{
					cFee obj=new cFee();
					obj.FeeAdd(semester, fee);
					JOptionPane.showMessageDialog(null,"FEE ADDED SUCCESSFULLY");
	
				}
	}
	
}



	

	
	
	


