
package view;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;

import controller.*;
import model.*;

import java.awt.event.ActionListener;

import javax.swing.*;

public class vFeeUpdate extends JFrame implements ActionListener
{
	JLabel jlsemester,jlfee;
	JTextField jtfee;
	JComboBox jcsemester;
	
	JButton jbsearch,jbupdate,jbdelete;
	
	String a[]={"Semester1","Semester2","Semester3","Semester4"};
	
	public vFeeUpdate()
	{
	this.setBounds(75,75,700,700);
	this.setLayout(null);
	this.setVisible(true);
	
	Container c = getContentPane();
	c.setBackground(Color.cyan);
	
	
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
	
	jbsearch = new JButton();
	jbsearch.setBounds(10,150,100,40);
	jbsearch.setText("SEARCH");
	
	this.add(jbsearch);
	
	jbsearch.addActionListener(this);
	
	jbupdate = new JButton();
	jbupdate.setBounds(10,190,100,40);
	jbupdate.setText("UPDATE");
	
	this.add(jbupdate);
	
	jbupdate.addActionListener(this);
	
	jbdelete = new JButton();
	jbdelete.setBounds(10,230,100,40);
	jbdelete.setText("DELETE");
	
	this.add(jbdelete);
	
	jbdelete.addActionListener(this);
	
	}
	
	public void actionPerformed(ActionEvent e)
	{
		
		String semester=jcsemester.getSelectedItem().toString();
		String fee=jtfee.getText();
		
		String action=e.getActionCommand();
		
		if(action.equals("SEARCH"))
		{
			try{
				cFee obj=new cFee();
				Object o=obj.FeeSearch(semester);
				FeeEntity s=(FeeEntity)o;
				
				jtfee.setText(s.fee);
				
				}
				
				catch(Exception ex) {
					JOptionPane.showMessageDialog(null,"ID NOT FOUND !");
				}
	
		}
		else if(action.equals("UPDATE"))
		{
			cFee obj=new cFee();
			obj.FeeAdd(semester, fee);
			JOptionPane.showMessageDialog(null,"FEE ADDED SUCCESSFULLY");

		}
		else if(action.equals("DELETE"))
		{
			cFee obj=new cFee();
			obj.FeeAdd(semester, fee);
			JOptionPane.showMessageDialog(null,"FEE ADDED SUCCESSFULLY");

		}
	}
	
}
