package application;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class UpdateCustomer extends JFrame implements ActionListener {

	JLabel labelusername;
	JComboBox comboid;
	JTextField tfnumber,tfcountry,tfadress,tfemail,tfphone,tfid,tfgender,tfname;
	JRadioButton rmail,rfemale;
	JButton add,back,delete;
	ResultSet rs;
	String Nusername;
	
	UpdateCustomer (String username)
	{
		this.Nusername=username;
		
			setBounds(450,200,850,550);
			setLayout(null);
			// full background white colour
			getContentPane().setBackground(Color.WHITE);
			
			// update Customer details
			
			JLabel text=new JLabel("Update/Delete customer Details");
			text.setBounds(50,0,340,29);
			text.setFont(new Font("Tahoma",Font.BOLD,20));
			text.setForeground(Color.ORANGE);
			add(text);
			
			//username
			JLabel lblusername=new JLabel("Username");
			lblusername.setBounds(30,50,150,25);
			lblusername.setForeground(Color.BLACK);
			lblusername.setFont(new Font("Thoma",Font.BOLD,20));
			add(lblusername);
			
			// username

			labelusername=new JLabel(Nusername);
			labelusername.setBounds(220,50,150,25);
			labelusername.setFont(new Font("Thoma",Font.BOLD,20));
			add(labelusername);
			
			//Name
			JLabel lblname=new JLabel("Name");
			lblname.setBounds(430,50,150,25);
			lblname.setForeground(Color.BLACK);
			lblname.setFont(new Font("Thoma",Font.BOLD,20));
			add(lblname);
			
			//Name field
			
			tfname=new JTextField();
			tfname.setBounds(550,50,150,25);
			tfname.setFont(new Font("Thoma",Font.BOLD,20));
			add(tfname);
			
			//id
			JLabel lblid=new JLabel("id");
			lblid.setBounds(30,90,150,25);
			lblid.setForeground(Color.BLACK);
			lblid.setFont(new Font("Thoma",Font.BOLD,20));
			add( lblid);
			
			// change id
			tfid=new JTextField();
			tfid.setForeground(Color.BLACK);
			tfid.setFont(new Font("Thoma",Font.BOLD,12));
			tfid.setBounds(220,90,150,25);
			add(tfid);
			
			// FROM SELECT DROPDOWN LIST ONE ID IS THEIR AND FILLED IT
			// userid no
			JLabel lblnumber=new JLabel("Number");
			lblnumber.setForeground(Color.BLACK);
			lblnumber.setFont(new Font("Thoma",Font.BOLD,20));
			lblnumber.setBounds(30,130,150,25);
			add( lblnumber);
			
			//text field for  number
			tfnumber=new JTextField();
			tfnumber.setForeground(Color.BLACK);
			tfnumber.setFont(new Font("Thoma",Font.BOLD,12));
			tfnumber.setBounds(220,130,150,25);
			add( tfnumber);
			
			
			
			
			//Gender
			
			JLabel lblgender=new JLabel("Gender");
			lblgender.setForeground(Color.BLUE);
			lblgender.setFont(new Font("Thoma",Font.BOLD,20));
			lblgender.setBounds(30,210,150,25);
			add(lblgender);
			
			//Update gender
			tfgender=new JTextField();
			tfgender.setForeground(Color.BLACK);
			tfgender.setFont(new Font("Thoma",Font.BOLD,12));
			tfgender.setBounds(220,210,150,25);
			add(tfgender);
			
			
			//Country
			JLabel lblCountry=new JLabel("Country");
			lblCountry.setForeground(Color.BLUE);
			lblCountry.setFont(new Font("Thoma",Font.BOLD,20));
			lblCountry.setBounds(30,250,150,25);
			add(lblCountry);
			
			//country Adress
			tfcountry=new JTextField();
			tfcountry.setForeground(Color.BLACK);
			tfcountry.setFont(new Font("Thoma",Font.BOLD,12));
			tfcountry.setBounds(220,250,150,25);
			add(tfcountry);
			
			
			//Adress
			JLabel lbladress=new JLabel("Adress");
			lbladress.setForeground(Color.BLUE);
			lbladress.setFont(new Font("Thoma",Font.BOLD,20));
			lbladress.setBounds(30,290,150,25);
			add(lbladress);
					
			// Adress text field
			tfadress=new JTextField();
			tfadress.setForeground(Color.BLACK);
			tfadress.setFont(new Font("Thoma",Font.BOLD,12));
			tfadress.setBounds(220,290,150,25);
			add(tfadress);
			
			//EMAIL
			JLabel lblemail=new JLabel("Email");
			lblemail.setForeground(Color.BLUE);
			lblemail.setFont(new Font("Thoma",Font.BOLD,20));
			lblemail.setBounds(30,330,150,25);
			add(lblemail);
			
			//Email text Fiels
			tfemail=new JTextField();
			tfemail.setForeground(Color.BLACK);
			tfemail.setFont(new Font("Thoma",Font.BOLD,12));
			tfemail.setBounds(220,330,150,25);
			add(tfemail);
			
			//Phone no
			JLabel lblPhone=new JLabel("Mobile No");
			lblPhone.setForeground(Color.BLUE);
			lblPhone.setFont(new Font("Thoma",Font.BOLD,20));
			lblPhone.setBounds(30,370,150,25);
			add(lblPhone);
					
			//Phone no text Fiels
			tfphone=new JTextField();
			tfphone.setForeground(Color.BLACK);
			tfphone.setFont(new Font("Thoma",Font.BOLD,12));
			tfphone.setBounds(220,370,150,25);
		    add(tfphone);
			
			//add button
		    add=new JButton("Update");
		    add.setBackground(Color.GREEN);
		    add.setForeground(Color.BLACK);
		    add.setBounds(70,430,100,25);
		    add.addActionListener(this);
		    add(add);
		    
		  //Back button
		    back=new JButton("Back");
		    back.setBackground(Color.black);
		    back.setForeground(Color.white);
		    back.setBounds(370,430,100,25);
		    back.addActionListener(this);
		    add(back);
		    
		    delete=new JButton("Delete_Details");
		    delete.setBackground(Color.RED);
		    delete.setForeground(Color.white);
		    delete.setBounds(220,430,120,25);
		    delete.addActionListener(this);
		    add(delete);
		    
		    
		    ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/Annotation 2022-11-25 192920.jpg"));
			//to scale image
			Image i2=i1.getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT);
			ImageIcon i3=new ImageIcon(i2);
			JLabel image =new JLabel(i3);
			image.setBounds(400,150,500,300);
			add(image);
		    
			
			//from database get username and name
		    try {
		    	DButils c=new DButils();
		    	rs=c.s.executeQuery("select * from customer where username='"+Nusername+"'");
		    	
		    	while(rs.next())
		    	{
		    		labelusername.setText(rs.getString("username")); 
		    		
		    		tfid.setText(rs.getString("id"));
		    		tfnumber.setText(rs.getString("number"));
		    		tfname.setText(rs.getString("name"));   
		    		tfcountry.setText(rs.getString("country"));
		    		tfgender.setText(rs.getString("gender"));
		    		tfadress.setText(rs.getString("adress"));
		    		tfphone.setText(rs.getString("phone"));
		    		tfemail.setText(rs.getString("email"));
		    	}
		    	
		    	
		    }catch(Exception e)
		    {
		    	e.printStackTrace();
		    }finally{
		    	if(rs!=null)
				{
					try {
						rs.close();
						}catch(SQLException e){
						e.printStackTrace();
					}
				}
		    }
			
			setVisible(true);
			
		
	}
	public static void main(String[] args) {
		
		new UpdateCustomer("");
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==add) {
			
			String username=labelusername.getText();
			String id=tfid.getText();
			String number=tfnumber.getText();
			String name=tfname.getText();
			String gender=tfgender.getText();
			String country=tfcountry.getText();
			String adress=tfadress.getText();
			String phone=tfphone.getText() ;
			String email=tfemail.getText();
			
			if(!tfid.getText().isEmpty()&& !tfnumber.getText().isEmpty()&&!tfgender.getText().isEmpty()&&!tfcountry.getText().isEmpty()&&!tfadress.getText().isEmpty()&&!tfphone.getText().isEmpty()&&!tfemail.getText().isEmpty())
			{
			try {
				
				DButils c =new DButils();
				String query="update customer set username='"+username+"',id='"+id+"', number='"+number+"',name='"+name+"',gender='"+gender+"',country='"+country+"',adress='"+adress+"',phone='"+phone+"',email='"+email+"' ";
				c.s.executeUpdate(query);
				JOptionPane.showMessageDialog(null,"customer details updated Sucessfully");
				setVisible(false);
				
			}catch(Exception e1)
			{
				e1.printStackTrace();
			}
	
			}else
			{
				JOptionPane.showMessageDialog(null,"Please fill up all details");
			}
			
		}else if(e.getSource()==delete)
		{
			try {
				
				DButils c =new DButils();
				c.s.executeUpdate("delete from customer where username='"+Nusername+"' ");
				c.s.executeUpdate("delete from account where username='"+Nusername+"' ");
				JOptionPane.showMessageDialog(null,"user details deleted Sucessfully");
				setVisible(false);
				new Login();
				
			}catch(Exception e1)
			{
				e1.printStackTrace();
			}
			finally
			{
				if(rs!=null)
				{
					try {
						rs.close();
					}catch(SQLException e1)
					{
						e1.printStackTrace();
					}
				}
			}
			
			
		}else if(e.getSource()==back)
		{
				setVisible(false);
				new Login();
		}
		
	}
		
	

}
