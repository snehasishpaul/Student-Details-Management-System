package view;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;

import javax.swing.*;
public class vLogin extends JFrame implements ActionListener
{
	JLabel jlusername,jlpassword;
	JTextField jtusername;
	JButton jblogin;
	JPasswordField jpass;
	
	public vLogin()
	{
		
		Container c = getContentPane();
		c.setBackground(Color.yellow);
		
		this.setBounds(100,100,1000,1000);//x,y,height,width
		this.setLayout(null);//null=default layout
		this.setVisible(true);//true=frame will b displayed
		
		
		jlusername=new JLabel();
		jlusername.setBounds(10, 50, 100, 40);
		jlusername.setText("USERNAME");
		
		jtusername=new JTextField();
		jtusername.setBounds(110,50,100,40);
		
		this.add(jlusername);
		this.add(jtusername);
		
		jlpassword=new JLabel();
		jlpassword.setBounds(10, 90, 100, 40);
		jlpassword.setText("PASSWORD");
		
		jpass=new JPasswordField();
		jpass.setBounds(110,90,100,40);
		
		this.add(jlpassword);
		this.add(jpass);
		
		jblogin=new JButton("LOGIN");
		jblogin.setBounds(500,500, 80, 40);
		
		
		this.add(jblogin);
		
		jblogin.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String u="shweta";
		String p="123";
		
		String action=e.getActionCommand();
		if(action.equals("LOGIN"))
		{
			String username=jtusername.getText();
			String password=jpass.getText();
			//String username=jtusername.getSelectedItem().toString();
			//String password=jtpassword.getSelectedItem().toString();

			if(username.equals(u) && password.equals(p))
			{
				JOptionPane.showMessageDialog(null,"logged in succesfully");
				menulist obj= new menulist();
			}
			else
			{
				JOptionPane.showMessageDialog(null,"username or password is incorrect");
			}
			
		}
	}

}

