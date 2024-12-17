package application;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
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
import javax.swing.border.LineBorder;

import com.mysql.cj.protocol.Resultset;

//to perform action implement
public class SignUp extends JFrame implements ActionListener{
	JButton Create,Back; // define as global if we not define it tyhen its scope will be in signup
	JTextField tfusername,tfname,tfpassword,tfanswer;
	Choice security;
	ResultSet rs;
	SignUp()
	{
		setTitle("SignUp");
		setBounds(350,200,1000,460);
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		JPanel p1=new JPanel();
		p1.setBackground(Color.CYAN);
		p1.setBounds(0,0,400,400);
		p1.setLayout(null);
		add(p1);
		
		// username
		JLabel lblusername=new JLabel("Username");   
		lblusername.setBounds(40,20,125,25);
		lblusername.setFont(new Font("Thoma",Font.BOLD,20));
		p1.add(lblusername);
		
		// username Text Field
		tfusername=new JTextField();
		tfusername.setBounds(180,20,200,30);  //first 60 is from left side second 60 is from upperside nect 300 is length, 30 is width
		tfusername.setBorder(BorderFactory.createEmptyBorder()); 
		tfusername.setFont(new Font("Raleway",Font.PLAIN,16));// for empty boarder
		p1.add(tfusername);
		
		// name
		JLabel lblname=new JLabel("Name");   
		lblname.setBounds(40,60,125,25);
		lblname.setFont(new Font("Thoma",Font.BOLD,20));
		p1.add(lblname);
				
		// 	Name Text Field
		tfname=new JTextField();
		tfname.setBounds(180,60,200,30);  //first 60 is from left side second 60 is from upperside nect 300 is length, 30 is width
		tfname.setBorder(BorderFactory.createEmptyBorder()); 
		tfname.setFont(new Font("Raleway",Font.PLAIN,16));// for empty boarder
		p1.add(tfname);
		
		// PASSWORD
		
		JLabel lblpassword=new JLabel("Password");   
		lblpassword.setBounds(40,100,125,25);
		lblpassword.setFont(new Font("Thoma",Font.BOLD,20));
		p1.add(lblpassword);
				
		// PRINT password Text Field
		tfpassword=new JTextField();
		tfpassword.setBounds(180,100,200,30);
		tfpassword.setBorder(BorderFactory.createEmptyBorder());
		tfpassword.setFont(new Font("Raleway",Font.PLAIN,16));
		p1.add(tfpassword);
		
		// security Question label
		JLabel lblsecurity=new JLabel("Security Question");   
		lblsecurity.setBounds(40,140,125,25);
		lblsecurity.setFont(new Font("Thoma",Font.BOLD,17));
		p1.add(lblsecurity);
		
		// create DropDOWN LIST foe security question
		security=new Choice();
		security.add("Fav Coding Language");
		security.add("Fav Marval Superhero");
		security.add("Fav Lucky Number");
		security.add("Fav Subject");
		security.add("Fav turist place");
		security.setBounds(180,140,200,35);
		security.setFont(new Font("Raleway",Font.PLAIN,14));
		p1.add(security);
		
		//Security Question Answer text Field
		JLabel lblAnswer=new JLabel("Answer");   
		lblAnswer.setBounds(40,180,125,25);
		lblAnswer.setFont(new Font("Thoma",Font.BOLD,20));
		p1.add(lblAnswer);
				
		// Security Question Answer text Field
		tfanswer=new JTextField();
		tfanswer.setBounds(180,180,200,30);
		tfanswer.setBorder(BorderFactory.createEmptyBorder()); 
		tfanswer.setFont(new Font("Raleway",Font.PLAIN,16));
		p1.add(tfanswer);
		
		// "create" Button
		Create =new JButton("Create");
		Create.setBounds(80,250,100,30);
		Create.setBackground(Color.black);
		Create.setForeground(new Color(131,191,233));
		Create.setFont(new Font("Thoma",Font.BOLD,20));
		// to perform action After click "Create" button
		Create.addActionListener(this);
		p1.add(Create);
		
		// "Back" Button
		Back =new JButton("Back");
		Back.setBounds(230,250,100,30);
		Back.setBackground(Color.blue);
		Back.setForeground(new Color(131,191,233));
		Back.setFont(new Font("Thoma",Font.BOLD,20));
		// to perform action After click "Back" button
		Back.addActionListener(this);
		p1.add(Back);
		
		//for right side
//		JPanel p2=new JPanel();
//		p2.setLayout(null);
//		p2.setBounds(400,30,450,300);
//		add(p2);
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/signuppage.png"));
		//to scale image
		Image i2=i1.getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image =new JLabel(i3);
		image.setBounds(580,50,200,200);
		add(image);
	
		setVisible(true);
	}
	
	public static void main(String[]args) {
		new SignUp();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// which button is called to understand it use e.getsource()		
		if(e.getSource()==Create)
		{
			try {
				DButils c=new DButils();
				String query1="select * from account where username='"+tfusername.getText()+"' ";
				rs=c.s.executeQuery(query1);		
				if(rs.isBeforeFirst())
				{
					JOptionPane.showMessageDialog(null,"Username is alredy Register" );
				}else
				{
					String username=tfusername.getText();
					String name=tfname.getText();
					String password=tfpassword.getText();
					String question=security.getSelectedItem();  // for drop down list
					String answer=tfanswer.getText();
					String query="insert into account values('"+username+"','"+name+"','"+password+"','"+question+"','"+answer+"') ";
			
					c.s.executeUpdate(query);   // Connection open need to close
				
					JOptionPane.showMessageDialog(null,"Acount created Sucessfully" );
					setVisible(false); //Current frame close
					new Login();
				}
				
			}catch(Exception e1)
			{
				e1.printStackTrace();
			}finally
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
			
		}else if(e.getSource()==Back){			
			setVisible(false); //Current frame close
			new Login();
	    }
	}
}