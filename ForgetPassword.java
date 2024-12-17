package application;


import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


// Implements actionlistener because to event perform action0
public class ForgetPassword extends JFrame implements ActionListener{
	
	// define as global if we not define it then its scope will be in signup
	JTextField tfusername,tfname,tfquestion,tfpassword,tfanswer;
	JButton search,retrieve,back;
	ResultSet rs;
	
	ForgetPassword ()
	{
		setTitle("Forget Password ?");
		setBounds(350,200,950,480);
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);  // null because we create ourself
		
		JPanel p1=new JPanel();
	    p1.setBackground(Color.pink);
		//p1.setBackground(new Color(131,191,233));
		p1.setBounds(30,30,500,280);
		p1.setLayout(null);
		add(p1);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/forgotpasswordICO.jpg"));
		//to scale image
		Image i2=i1.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image =new JLabel(i3);
		image.setBounds(550,60,300,300); //befor panel calculation +(500+30),
		add(image); 
		
		
		//username
		JLabel iblusername=new JLabel("Username");
		iblusername.setBounds(30,20,100,20);
		iblusername.setFont(new Font("Thoms",Font.BOLD,20));
		iblusername.setBackground(Color.blue);
		p1.add(iblusername);
		
		//username textfield
		tfusername=new JTextField();
		tfusername.setBounds(210,20,160,25);
		tfusername.setBorder(BorderFactory.createEmptyBorder());
		tfusername.setFont(new Font("Thoma",Font.PLAIN,15));
		p1.add(tfusername);
		
		//Search button
		search=new JButton("Search");
		search.setBackground(Color.gray);
		search.setForeground(Color.WHITE);
		search.setBounds(380,25,90,20); // username textfield ends (220+150)
		//to perform action 
		search.addActionListener(this);
		p1.add(search);
		
		// name
		JLabel lblname=new JLabel("Name");   
		lblname.setBounds(30,60,100,25);
		lblname.setFont(new Font("Thoma",Font.BOLD,20));
		p1.add(lblname);
						
		// 	Name Text Field
		tfname=new JTextField();
		tfname.setBounds(210,60,160,25);  //first 60 is from left side second 60 is from upperside nect 300 is length, 30 is width
		tfname.setBorder(BorderFactory.createEmptyBorder());  // for empty boarder
		tfname.setFont(new Font("Thoma",Font.PLAIN,15));
		p1.add(tfname);
				
		// Security Question	
		JLabel lblquestion=new JLabel("S.Question");   
		lblquestion.setBounds(30,100,110,25);
		lblquestion.setFont(new Font("Thoma",Font.BOLD,15));
		p1.add(lblquestion);
						
		//Security Question Answered Text Field
		tfquestion=new JTextField();
		tfquestion.setBounds(210,100,160,25);
		tfquestion.setBorder(BorderFactory.createEmptyBorder()); 
		tfquestion.setFont(new Font("Thoma",Font.PLAIN,15));
		p1.add(tfquestion);
		
		// ANSWER	
		JLabel lblanswer=new JLabel("Answerd");   
		lblanswer.setBounds(30,140,110,25);
		lblanswer.setFont(new Font("Thoma",Font.BOLD,15));
		p1.add(lblanswer);
								
		//Answered Text Field
		tfanswer=new JTextField();
		tfanswer.setBounds(210,140,160,25);
		tfanswer.setBorder(BorderFactory.createEmptyBorder()); 
		tfanswer.setFont(new Font("Thoma",Font.PLAIN,15));
		p1.add(tfanswer);
		
		//Retrieve button
		retrieve=new JButton("Retrieve");
		retrieve.setBackground(Color.gray);
		retrieve.setForeground(Color.WHITE);
		retrieve.setBounds(380,140,90,20); // username textfield ends (220+150)
		retrieve.addActionListener(this);
		retrieve.setFont(new Font("Thoma",Font.BOLD,13));
		p1.add(retrieve);
		
		// to display actual password
		//password
		JLabel lblpassword=new JLabel("Password");   
		lblpassword.setBounds(30,180,110,25);
		lblpassword.setFont(new Font("Thoma",Font.BOLD,15));
		p1.add(lblpassword);
								
		//password Text Field
		tfpassword=new JTextField();
		tfpassword.setBounds(210,180,160,25);
		tfpassword.setBorder(BorderFactory.createEmptyBorder()); 
		tfpassword.setFont(new Font("Thoma",Font.PLAIN,15));
		p1.add(tfpassword);	
		
		// Back button
		back=new JButton("Back");
		back.setBackground(Color.gray);
		back.setForeground(Color.WHITE);
		back.setBounds(190,230,90,20); // username textfield ends (220+150)
		back.addActionListener(this);
		p1.add(back);
		
		
	
		setVisible(true);
	}
	
	public static void main(String[]args)
	{
		new ForgetPassword ();
	}

	@Override
	// to perform action after click on button
	public void actionPerformed(ActionEvent ae) {
		
		// TODO Auto-generated method stub
		if(ae.getSource()== search )
		{
			// hit select quarry to get username,password
			
			try {
				String query="select * from account where username='" + tfusername.getText()+ "'";
				// TO EXECUTE QUERY CREATE object in DButils class 
				
				DButils c=new DButils();
				
				// here we fetch data from table so use executeQuery function;NOT UPDATE
				//c.s.executeQuery(query); its give all data so we store it on ResultSet(class) rs object
			
				 rs= c.s.executeQuery(query);
				 if(rs.isBeforeFirst())
					{
					 while(rs.next())
						{
					// rs.getString("name");// database "column name" to access data to set in text field
							tfname.setText("");
							tfquestion.setText("");
							tfname.setText(rs.getString("name"));
							tfquestion.setText(rs.getString("security"));
						}
					}else
					{ 
				
				// use loop to to get all fills
						JOptionPane.showMessageDialog(null,"Username not found" );

					}
				
				
			}catch(Exception e1)
			{
				e1.printStackTrace();
			}finally // finaly block pass start things to colse last
			{
				
				if(rs!=null)
				{
					try {
						rs.close();
					}catch(SQLException e){
						e.printStackTrace();
					}
				}
				
			}
		}
		
		else if(ae.getSource()== retrieve)
		{
			// hit select quarry to get usename,password
			try {
					String query="select * from account where answer ='" + tfanswer.getText() +"' AND username='"+tfusername.getText()+"'";
					// TO EXECUTE QUERY CREATE object in DButils class 
					DButils c=new DButils();
							
					// here we fetch data from table so use executeQuery function;NOT UPDATE
					//c.s.executeQuery(query); its give all data so we store it on ResultSet(class) rs object
					 rs=c.s.executeQuery(query);
					 if(rs.isBeforeFirst())
						{
						 while(rs.next())
							{
						 //rs1.getString("name");// database "colum name" to acess data to set in text field
							 JOptionPane.showMessageDialog(null,"Answer is Currect!" );
								tfpassword.setText(rs.getString("password"));
						
							}
							
						}else
						{		
					// use loop to to get all fills
							JOptionPane.showMessageDialog(null,"Answer is wrong" );
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
					}catch(Exception e)
					{
						e.printStackTrace();
					}
				}

		}else 
		{
			setVisible(false);
			new Login();
		}
	}
	
}