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

import com.mysql.cj.protocol.Resultset;

public class AddCustomer extends JFrame implements ActionListener{
	JLabel labelusername,labelname;
	JComboBox comboid;
	JTextField tfnumber,tfcountry,tfadress,tfemail,tfphone;
	JRadioButton rmail,rfemale,rother;
	JButton add,back;
	String Nusername;
	ResultSet rs;
	
	AddCustomer(String username)
	{
		this.Nusername=username;
		setTitle("Add Customer Details");
		setBounds(450,200,850,550);
		setLayout(null);
		// full background white colour
		getContentPane().setBackground(Color.WHITE);
		
		//username
		JLabel lblusername=new JLabel("Username:");
		lblusername.setBounds(30,50,150,25);
		lblusername.setForeground(Color.black);
		lblusername.setFont(new Font("Thoma",Font.BOLD,20));
		add(lblusername);
		// username

		labelusername=new JLabel();
		labelusername.setBounds(220,50,150,25);
		labelusername.setForeground(Color.blue);
		labelusername.setFont(new Font("Thoma",Font.BOLD,20));
		add(labelusername);
		
		//Name
		JLabel lblname=new JLabel("Name:");
		lblname.setBounds(460,50,150,25);
		lblname.setForeground(Color.black);
		lblname.setFont(new Font("Thoma",Font.BOLD,20));
		add(lblname);	
		//Name field
		
		labelname=new JLabel();
		labelname.setBounds(550,50,150,25);
		labelname.setForeground(Color.blue);
		labelname.setFont(new Font("Thoma",Font.BOLD,20));
		add(labelname);
		
		//id
		JLabel lblid=new JLabel("id");
		lblid.setBounds(30,90,150,25);
		lblid.setForeground(Color.green);
		lblid.setFont(new Font("Thoma",Font.BOLD,20));
		add( lblid);
		
		//Drop down list using combo box
		
		comboid=new JComboBox(new String[] {"Pasport","Adhar Crad","Pan Card","Ration"});
		comboid.setBounds(220,90,150,25);
		comboid.setBackground(Color.WHITE);
		add( comboid);		
		
		// FROM SELECT DROPDOWN LIST ONE ID IS THEIR AND FILLED IT
		// userid no
		JLabel lblnumber=new JLabel("Number:");
		lblnumber.setBounds(30,130,150,25);
		lblnumber.setForeground(Color.GRAY);
		lblnumber.setFont(new Font("Thoma",Font.BOLD,20));
		add( lblnumber);
		
		//text field for  number
		tfnumber=new JTextField();
		tfnumber.setBounds(220,130,150,25);
		tfnumber.setForeground(Color.blue);
		tfnumber.setFont(new Font("Thoma",Font.BOLD,20));
		add( tfnumber);
		
	
		
		//Gender	
		JLabel lblgender=new JLabel("Gender:");
		lblgender.setBounds(30,210,150,25);
		lblgender.setForeground(Color.orange);
		lblgender.setFont(new Font("Thoma",Font.BOLD,20));
		add(lblgender);
		//Create Radio Button
		rmail=new 	JRadioButton("Male");
		rmail.setBounds(220,210,70,25);
		rmail.setFont(new Font("Thoma",Font.BOLD,15));
		rmail.setBackground(Color.WHITE);
		add(rmail);
		
		rfemale=new JRadioButton("Female");
		rfemale.setBounds(300,210,90,25);
		rfemale.setFont(new Font("Thoma",Font.BOLD,15));
		rfemale.setBackground(Color.WHITE);
		add(rfemale);
		
		rother=new JRadioButton("Other");
		rother.setBounds(390,210,90,25);
		rother.setFont(new Font("Thoma",Font.BOLD,15));
		rother.setBackground(Color.WHITE);
		add(rother);
		
		//to choice one option
		ButtonGroup bg=new ButtonGroup();
		bg.add(rfemale);
		bg.add(rmail);		
		//Country
		JLabel lblCountry=new JLabel("Country");
		lblCountry.setBounds(30,250,150,25);
		lblCountry.setForeground(Color.BLUE);
		lblCountry.setFont(new Font("Thoma",Font.BOLD,20));
		add(lblCountry);	
		//country Adress
		tfcountry=new JTextField();
		tfcountry.setBounds(220,250,150,25);
		tfcountry.setFont(new Font("Thoma",Font.BOLD,20));
		add(tfcountry);
	
		//Adress
		JLabel lbladress=new JLabel("Adress");
		lbladress.setBounds(30,290,150,25);
		lbladress.setFont(new Font("Thoma",Font.BOLD,20));
		lbladress.setForeground(Color.RED);
		add(lbladress);
				
		// Adress text field
		tfadress=new JTextField();
		tfadress.setBounds(220,290,150,25);
		add(tfadress);
		
		//EMAIL
		JLabel lblemail=new JLabel("Email");
		lblemail.setBounds(30,330,150,25);
		lblemail.setForeground(Color.BLUE);
		lblemail.setFont(new Font("Thoma",Font.BOLD,20));
		add(lblemail);
		
		//Email text Fiels
		tfemail=new JTextField();
		tfemail.setBounds(220,330,150,25);
		add(tfemail);
		
		//Phone no
		JLabel lblPhone=new JLabel("Mobile No");
		lblPhone.setBounds(30,370,150,25);
		lblPhone.setForeground(Color.BLUE);
		lblPhone.setFont(new Font("Thoma",Font.BOLD,20));
		add(lblPhone);
				
		//Phone no text Fiels
		tfphone=new JTextField();
		tfphone.setBounds(220,370,150,25);
	    add(tfphone);
		
		//add button
	    add=new JButton("Add");
	    add.setBackground(Color.green);
	    add.setForeground(Color.white);
	    add.setBounds(70,430,100,25);
	    add.setFont(new Font("Thoma",Font.BOLD,20));
	    add.addActionListener(this);
	    add(add);
	    
	  //Back button
	    back=new JButton("Back");
	    back.setBackground(Color.black);
	    back.setForeground(Color.white);
	    back.setBounds(220,430,100,25);
	    back.addActionListener(this);
	    add(back);
	    
	    ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/ADDPERSON.png"));
		//to scale image
		Image i2=i1.getImage().getScaledInstance(330, 290, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image =new JLabel(i3);
		image.setBounds(400,50,500,450);
		add(image);

	    try {
	    	DButils c=new DButils();
	    	rs=c.s.executeQuery("select * from account where username='"+Nusername+"'");
	    	
	    	while(rs.next())
	    	{
	    		labelusername.setText(rs.getString("username"));
	    		labelname.setText(rs.getString("name"));
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
		new AddCustomer(""); 
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub	
		if(e.getSource()==add) {		
			if(!tfnumber.getText().isEmpty()&&!tfcountry.getText().isEmpty()&&!tfadress.getText().isEmpty()&&!tfemail.getText().isEmpty()&&!tfphone.getText().isEmpty())
			{	
			try {
				DButils c=new DButils();
				String query1="select * from customer where username='"+Nusername+"' ";
				rs=c.s.executeQuery(query1);		
				if(rs.isBeforeFirst())
				{
					JOptionPane.showMessageDialog(null,"you have alredy add your Details" );
				}else
				{
					String username=labelusername.getText();
					String id=(String)comboid.getSelectedItem();// its return object with combo box so type cust into string
					String number=tfnumber.getText();
					String name=labelname.getText();
					String gender=null;
					if(rmail.isSelected())
					{
						gender="Male";
					}else
					{
						gender="Female";
					}
					String country=tfcountry.getText();
					String adress=tfadress.getText();
					String phone=tfphone.getText() ;
					String email=tfemail.getText();
				
						String query="Insert into customer values('"+username+"','"+id+"', '"+number+"','"+name+"','"+gender+"','"+country+"','"+adress+"','"+phone+"','"+email+"'   )";
						c.s.executeUpdate(query);
						JOptionPane.showMessageDialog(null,"customer Added Sucessfully");
						setVisible(false);			
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
			}else
			{
				JOptionPane.showMessageDialog(null,"Please fill all details");
			}
			
			}else
			{
				setVisible(false);
			}	
		}
}