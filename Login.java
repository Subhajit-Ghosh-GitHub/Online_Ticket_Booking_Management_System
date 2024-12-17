package application;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class Login extends JFrame implements ActionListener {
	JTextField tfusername,tfpassword;
	JButton login,SignUp,fpassword;
	Login()
	{
		setTitle("Login");
		setSize(1000,450);
		setLocation(450,250);
		setLayout(null);
		//change panel background;
		getContentPane().setBackground(Color.WHITE);
		
		
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
		//to scale image
		Image i2=i1.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image =new JLabel(i3);
		image.setBounds(10,30,400,300);
		add(image); // Panel is one type of frame,p1. is used to plane picture in front of label
		
		//for left side
		JPanel p1=new JPanel();
		p1.setLayout(null);
		p1.setBounds(400,30,450,300);
		add(p1);
		
		//print username;	
		JLabel lblusername=new JLabel("Username");   
		lblusername.setBounds(60,20,180,25);
		lblusername.setForeground(Color.BLUE);
		lblusername.setFont(new Font("Bookman Old Style",Font.PLAIN,20));
		p1.add(lblusername);
		
		// PRINT username Text Field
		tfusername=new JTextField();
		tfusername.setBounds(60,60,300,30); //first 60 is from left side second 60 is from upperside nect 300 is length, 30 is width
		tfusername.setForeground(Color.black);
		tfusername.setBorder(BorderFactory.createEmptyBorder());
		tfusername.setFont(new Font("Raleway",Font.PLAIN,16));// for empty boarder
		p1.add(tfusername);
		
		//print password
		JLabel lblpassword=new JLabel("Password");   
		lblpassword.setBounds(60,100,100,25);
		lblpassword.setFont(new Font("Bookman Old Style",Font.PLAIN,20));
		p1.add(lblpassword);
		
		// PRINT password Text Field
		tfpassword=new JTextField();
		tfpassword.setBounds(60,140,300,30);
		tfpassword.setForeground(Color.black);
		tfpassword.setBorder(BorderFactory.createEmptyBorder()); 
		tfpassword.setFont(new Font("Raleway",Font.PLAIN,16));
		p1.add(tfpassword);
		
		// create Sign in Button class
		login=new JButton("Login");
		login.setBounds(60,190,130,30);
		login.setBackground(new Color(131,191,233));
		login.setForeground(Color.WHITE);
		login.setBorder(new LineBorder(new Color(131,191,233)));  // for empty border
		login.setFont(new Font("Bookman Old Style",Font.PLAIN,20));
		login.addActionListener(this);
		p1.add(login);
		
		// Create sign up Button
		SignUp=new JButton("SignUp");
		SignUp.setBounds(230,190,130,30);
		SignUp.setBackground(new Color(131,191,233));
		SignUp.setForeground(Color.WHITE);
		SignUp.setBorder(new LineBorder(new Color(131,191,233)));  // for empty border
		SignUp.setFont(new Font("Bookman Old Style",Font.PLAIN,20));
		SignUp.addActionListener(this);
		p1.add(SignUp);
		
		// Create Forget Password Button
		fpassword=new JButton("Retrieve Password");
		fpassword.setBounds(230,240,130,30);
		fpassword.setBackground(new Color(131,191,233));
		fpassword.setForeground(Color.WHITE);
		fpassword.setBorder(new LineBorder(new Color(131,191,233)));  // for empty border
		login.setFont(new Font("Bookman Old Style",Font.PLAIN,20));
		fpassword.addActionListener(this);
		p1.add(fpassword);
		
		JLabel text=new JLabel("Trouble in Login Forget password?");
		text.setBounds(90,243,150,20);
		text.setForeground(Color.RED);
		p1.add(text);
		
		
		setVisible(true);
	}
	
	public static void main(String[]args)
	{
		new Login(); //anononimious object
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		ResultSet rs=null;
		if(e.getSource()== login)
		{
			// to open Lading frame
			try {
				
				String username=tfusername.getText();
				
				String sPassword=tfpassword.getText();
				String query="select * from account where username='"+ username +"' AND password ='"+sPassword+"'";
				DButils c=new DButils();
				rs=c.s.executeQuery(query);
				// if 1 value match so we usedit if
				if(rs.next())// rs object told ia it full or null
				{					
					setVisible(false);
					new Dashboard (username);					
				}else
				{
					JOptionPane.showMessageDialog(null, "Incorrect username or password");
				}				
			}catch(Exception e1)
			{
				e1.printStackTrace();
			}finally // finaly block pass start things to colse last
			{				
				try {
					if(rs !=null )
					{
						rs.close();
					}
				}catch(Exception e1)
				{
					e1.printStackTrace();
				}
			}			
		}else if(e.getSource()==SignUp)
		{
			setVisible(false);
			new SignUp();
		}else
		{
			setVisible(false);
			new ForgetPassword ();
		}
	}
}