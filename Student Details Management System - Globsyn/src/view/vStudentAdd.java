package view;
import java.awt.event.ActionListener;

import controller.*;
import model.*;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import javax.swing.*;
import controller.*;

public class vStudentAdd extends JFrame implements ActionListener 

{
	JLabel jlname,jlstream,jlrollno,jldob,jladdress,jlphone,jlgender;
    JTextField jtname,jtrollno,jtdob,jtaddress,jtphone,jtgender;
    JComboBox jcstream;
    JButton jbsubmit,jbcancel;
    
    String[]stream={"ECE","CSE","ME","CE","IT"};
    
    public vStudentAdd()
    {
    	
    	Container c = getContentPane();
		c.setBackground(Color.GREEN);
		
    	this.setBounds(100,100,700,700);
		this.setLayout(null);
		this.setVisible(true);
		
		
		jlname=new JLabel();
		jlname.setBounds(10, 50, 100, 40);
		jlname.setText("NAME");
		
		jtname=new JTextField();
		jtname.setBounds(110,50,100,40);
		
		this.add(jlname);
		this.add(jtname);
		
		jlrollno=new JLabel();
		jlrollno.setBounds(10, 90, 100, 40);
		jlrollno.setText("ROLLNO");
		
		jtrollno=new JTextField();
		jtrollno.setBounds(110,90,100,40);
		
		this.add(jlrollno);
		this.add(jtrollno);
		
		
		jldob=new JLabel();
		jldob.setBounds(10, 130, 100, 40);
		jldob.setText("D.O.B");
		
		jtdob=new JTextField();
		jtdob.setBounds(110,130,100,40);
		
		this.add(jldob);
		this.add(jtdob);
		
		jladdress=new JLabel();
		jladdress.setBounds(10, 170, 100, 40);
		jladdress.setText("ADDRESS");
		
		jtaddress=new JTextField();
		jtaddress.setBounds(110,170,100,40);
		
		this.add(jladdress);
		this.add(jtaddress);
		


		jlphone=new JLabel();
		jlphone.setBounds(10, 210, 100, 40);
		jlphone.setText("PHONE.NO");
		
		jtphone=new JTextField();
		jtphone.setBounds(110,210,100,40);
		
		this.add(jlphone);
		this.add(jtphone);
		
		jlgender=new JLabel();
		jlgender.setBounds(10, 250, 100, 40);
		jlgender.setText("GENDER");
		
		jtgender=new JTextField();
		jtgender.setBounds(110,250,100,40);
		
		this.add(jlgender);
		this.add(jtgender);
		
		jlstream=new JLabel();
		jlstream.setBounds(10, 290, 100, 40);
		jlstream.setText("STREAM");
		
		jcstream=new JComboBox(stream);
		jcstream.setBounds(110,290,100,40);
		
		
		this.add(jlstream);
		this.add(jcstream);

		


		jbsubmit=new JButton("SUBMIT");
		jbsubmit.setBounds(500,500, 80, 40);
		
		
		this.add(jbsubmit);
		
		jbsubmit.addActionListener(this);
		
		jbcancel=new JButton("CANCEL");
		jbcancel.setBounds(1000, 500, 80, 40);
		
		
		this.add(jbcancel);
		
		jbcancel.addActionListener(this);

    }
    
    public void actionPerformed(ActionEvent e)
	{
		String action=e.getActionCommand();
		if(action.equals("SUBMIT"))
		{
			String name=jtname.getText();
			String stream=jcstream.getSelectedItem().toString();
			int rollno=Integer.parseInt(jtrollno.getText());
			String dob=jtdob.getText();
			String phone=jtphone.getText();
			String address=jtaddress.getText();
			//int phone=Integer.parseInt(jtphone.getText());
			String gender=jtgender.getText();
			
			cStudent obj=new cStudent();
			obj.StudentAdd(name, rollno, stream, dob, address, phone, gender);
			
			JOptionPane.showMessageDialog(null,"student added succesfully");
		}
		else if(action.equals("CANCEL"))
		{
			
			JOptionPane.showMessageDialog(null,"form cancelled succesfully");
		}
		
	}

}
