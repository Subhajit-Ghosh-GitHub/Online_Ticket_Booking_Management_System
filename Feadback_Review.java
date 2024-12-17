package application;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class Feadback_Review extends JFrame implements ActionListener{

	JButton send,back;
	JTextField texthear;
	JLabel userp,nper;
	JRadioButton r1,r2,r3,r4,r5;
	ResultSet rs;
	String Nusername;
	
	Feadback_Review(String username)
	{
		this.Nusername=username;
		setTitle("Send FeedBack");
		setBounds(500,200,650,400);
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel text=new JLabel("Send Feedback to Us");   
		text.setBounds(140,10,600,40);
		text.setBackground(Color.BLUE);
		text.setFont(new Font("Raleway",Font.BOLD,35));
		text.setForeground(Color.BLUE);
		add(text);
		
		JLabel user=new JLabel("Username:-");   
		user.setBounds(10,80,110,25);
		user.setFont(new Font("Thoma",Font.BOLD,20));
		add(user);
		userp=new JLabel();   
		userp.setBounds(120,80,110,25);
		userp.setFont(new Font("Thoma",Font.BOLD,18));
		userp.setForeground(Color.BLUE);
		add(userp);
		
		
		JLabel per=new JLabel("Name:-");   
		per.setBounds(330,80,100,25);
		per.setForeground(Color.BLACK);
		per.setFont(new Font("Thoma",Font.BOLD,20));
		add(per);
		nper=new JLabel();   
		nper.setBounds(400,80,200,25);
		nper.setForeground(Color.BLUE);
		nper.setFont(new Font("Thoma",Font.BOLD,20));
		add(nper);
		
		JLabel lblgender=new JLabel("Send Feadback Out of 5");
		lblgender.setBounds(10,140,250,25);
		lblgender.setFont(new Font("Thoma",Font.BOLD,20));
		add(lblgender);
		//Create Radio Button
		r1=new 	JRadioButton("1");
		r1.setBounds(270,140,40,25);
		r1.setBackground(Color.RED);
		r1.setFont(new Font("Thoma",Font.BOLD,25));
		add(r1);
		r2=new 	JRadioButton("2");
		r2.setBounds(310,140,40,25);
		r2.setBackground(Color.ORANGE);
		r2.setFont(new Font("Thoma",Font.BOLD,25));
		add(r2);
		r3=new 	JRadioButton("3");
		r3.setBounds(350,140,40,25);
		r3.setBackground(Color.YELLOW);
		r3.setFont(new Font("Thoma",Font.BOLD,25));
		add(r3);
		r4=new 	JRadioButton("4");
		r4.setBounds(390,140,40,25);
		r4.setBackground(Color.YELLOW);
		r4.setFont(new Font("Thoma",Font.BOLD,25));
		add(r4);
		r5=new 	JRadioButton("5");
		r5.setBounds(430,140,40,25);
		r5.setBackground(Color.GREEN);
		r5.setFont(new Font("Thoma",Font.BOLD,25));
		add(r5);
		
		
		//to choice one option
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		bg.add(r4);
		bg.add(r5);
			
		
		JLabel rev=new JLabel("*Share Your Experience(Within 20 words)*");   
		rev.setBounds(20,200,350,20);
		rev.setForeground(Color.BLUE);
		rev.setFont(new Font("Thoma",Font.BOLD,17));
		add(rev);
		texthear=new JTextField();
		texthear.setBounds(20,230,580,55);
		add( texthear);
		
		
		 send=new JButton("Submit");
		   send.setBackground(Color.GREEN);
		    send.setForeground(Color.BLACK);
		    send.setBounds(200,300,80,25);
		    send.addActionListener(this);
		    add(send);
		    
		    back=new JButton("Back");
			   back.setBackground(Color.black);
			    back.setForeground(Color.white);
			    back.setBounds(320,300,80,25);
			    back.addActionListener(this);
			    add(back);
		
			    try {
					DButils c=new DButils();
					String query="select * from account where username='"+Nusername+"'";
					rs=c.s.executeQuery(query);
					while(rs.next()) {
						userp.setText(rs.getString("username"));
						nper.setText(rs.getString("name"));
								
					}		
					}catch(Exception e)
					{
						e.printStackTrace();
					}finally
					{
						if(rs!=null)
						{
							try {
								rs.close();
								}catch(Exception e1)
							{
									e1.printStackTrace();
							}
						}
					}
		setVisible(true);
	}
	public static void main(String[] args) {
		new Feadback_Review("");

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==send)
		{
			try {
					DButils c=new DButils();
			
					String username=userp.getText();
					String name=nper.getText();
					String rate=null;
					if(r1.isSelected())
					{
						rate="1";
					}else if(r2.isSelected())
					{
						rate="2";
					}else if(r3.isSelected())
					{
						rate="3";
					}else if(r4.isSelected())
					{
						rate="4";
					}else if(r5.isSelected())
					{
						rate="5";
					}
						
						String query="Insert into feadback values('"+username+"','"+name+"','"+rate+"', '"+texthear.getText()+"'  )";
						c.s.executeUpdate(query);
						JOptionPane.showMessageDialog(null,"Feadback Submited");
						setVisible(false);			
					
				
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
			
		}else
		{
			setVisible(false);
		}
		
	}

}
