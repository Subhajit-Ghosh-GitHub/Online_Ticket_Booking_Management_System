package application;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Dashboard extends JFrame implements ActionListener
{

	String username;
	Choice busname;
	JButton addPersondetails, ViewPersonDetails, UpdatepersonDetails,CheckRAT,rivew,customerSupport,ViewHotels,feadback,Booktickit,ViewPackage, ViewBookedhotels,Payments;
	JButton Calculator, Notpad,ABOUT,Search,Back;
	
	Dashboard (String username)
	{
		//whel user click add person dertails then pass username
		this.username=username;
		setTitle("Dashboard");
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setLayout(null);
		JPanel p1=new JPanel();
		p1.setLayout(null);
		p1.setBounds(0, 0,1600,65);
		p1.setBackground(Color.GRAY);
		add(p1);
		
		
		
		JLabel heading=new JLabel("Dashboard");
		heading.setBounds(690,10,400,50);
		heading.setForeground(Color.WHITE);
		heading.setFont(new Font("Tahoma",Font.BOLD,30));
		p1.add(heading);
		
		JLabel bus=new JLabel ("Busname");
		bus.setBounds(950,10,150,40);
		bus.setForeground(Color.black);
		bus.setFont(new Font("Tahoma",Font.BOLD,30));
		p1.add(bus);
		
		Search=new JButton("Search");
		Search.setBounds(1350,13,130,35);
		Search.setForeground(Color.WHITE);
		Search.setBackground(Color.BLACK);
		Search.setFont(new Font("Tohoma",Font.PLAIN,20));
		Search.addActionListener(this);
		p1.add(Search);
		
		busname=new Choice();
		busname.add("South Bengal State Transport(SBSTC)");
		busname.add("WBTC(CTC)");
		busname.add("North Bengal State Transport Corporation");
		busname.setBounds(1100,22,245,70);
		p1.add(busname);
				
		JPanel p2=new JPanel();
		p2.setLayout(null);
		p2.setBounds(0, 65,300,900);
		p2.setBackground(new Color(135, 206, 250));
		add(p2);
				
		// Add person details Button
		 addPersondetails=new JButton("+Add Personal details");
		addPersondetails.setBounds(0,0,300,50);
		addPersondetails.setBackground(new Color(0,0,102));
		addPersondetails.setForeground(Color.WHITE);
		addPersondetails.setFont(new Font("Tohoma",Font.PLAIN,20));
		// TO ALINE BUTTOM TEXT AT LEFT.. PASS QUADINATE
		// TO SHIFT LEFT MERGIN AT RIGHT ......first argument is top,left,buttom,right
		addPersondetails.setMargin(new Insets(0,0,0,60));
		addPersondetails.addActionListener(this);
		p2.add(addPersondetails);
		
		//Update person details
		UpdatepersonDetails=new JButton("Update/Delete Personal Details");
		UpdatepersonDetails.setBounds(0,50,300,50);
		UpdatepersonDetails.setBackground(new Color(0,0,110));
		UpdatepersonDetails.setForeground(Color.WHITE);
		UpdatepersonDetails.setFont(new Font("Tohoma",Font.PLAIN,18));
		UpdatepersonDetails.addActionListener(this);
		UpdatepersonDetails.setMargin(new Insets(0,0,0,30));
		p2.add(UpdatepersonDetails);
		
		// VIEW person details
		ViewPersonDetails=new JButton("View Tickit");
		ViewPersonDetails.setBounds(0,100,300,50);
		ViewPersonDetails.setBackground(new Color(0,0,102));
		ViewPersonDetails.setForeground(Color.WHITE);
		ViewPersonDetails.setFont(new Font("Tohoma",Font.PLAIN,20));
		ViewPersonDetails.setMargin(new Insets(0,0,0,130));
		ViewPersonDetails.addActionListener(this);		
		p2.add(ViewPersonDetails);
		
		
		// Check Packages button
		
		CheckRAT=new JButton("Root schedules & Timing");
		CheckRAT.setBounds(0,150,450,50);//0,200,340,50
		CheckRAT.setBackground(new Color(0,0,102));
		CheckRAT.setForeground(Color.WHITE);
		CheckRAT.setFont(new Font("Tohoma",Font.PLAIN,20));
		CheckRAT.setMargin(new Insets(0,0,0,170));
		CheckRAT.addActionListener(this);
		p2.add(CheckRAT);

		Booktickit=new JButton("Tickit reservation and Conformation");
		Booktickit.setBounds(0,200,500,50); //0,400,500,50
		Booktickit.setBackground(new Color(0,0,80));
		Booktickit.setForeground(Color.WHITE);
		Booktickit.setFont(new Font("Tohoma",Font.PLAIN,18));
		Booktickit.addActionListener(this);
		Booktickit.setMargin(new Insets(0,0,0,190));
		p2.add(Booktickit);	
		
		feadback=new JButton("Feadback");
		feadback.setBounds(0,300,300,50);  //0,500,340,50
		feadback.setBackground(new Color(0,0,102));
		feadback.setForeground(Color.WHITE);
		feadback.setFont(new Font("Tohoma",Font.PLAIN,20));
		feadback.addActionListener(this);
		feadback.setMargin(new Insets(0,0,0,158));
		p2.add(feadback);
		
		rivew=new JButton("Check Reviews");
		rivew.setBounds(0,350,300,50);  
		rivew.setBackground(new Color(0,0,102));
		rivew.setForeground(Color.WHITE);
		rivew.setFont(new Font("Tohoma",Font.PLAIN,20));
		rivew.addActionListener(this);
		rivew.setMargin(new Insets(0,0,0,118));
		p2.add(rivew);
		
		customerSupport=new JButton("Customer Support");
		customerSupport.setBounds(0,400,300,50);  
		customerSupport.setBackground(new Color(0,0,102));
		customerSupport.setForeground(Color.WHITE);
		customerSupport.setFont(new Font("Tohoma",Font.PLAIN,20));
		customerSupport.addActionListener(this);
		customerSupport.setMargin(new Insets(0,0,0,77));
		p2.add(customerSupport);
		
		//Payments
		 Payments=new JButton("Payments");
		Payments.setBounds(0,250,300,50);// 0,550,300,50
		Payments.setBackground(new Color(0,0,102));
		Payments.setForeground(Color.WHITE);
		Payments.setFont(new Font("Tohoma",Font.PLAIN,20));
		Payments.addActionListener(this);
		// TO ALINE BUTTOM TEXT AT LEFT.. PASS QUADINATE
		// TO SHIFT LEFT MERGIN AT RIGHT ......first argument is top,left,buttom,right
		Payments.setMargin(new Insets(0,0,0,150));
		p2.add(Payments);
		
		//Calculator  open in laptop calculator
		Calculator=new JButton("Calculator");
		Calculator.setBounds(0,450,300,50);
		Calculator.setBackground(new Color(0,0,102));
		Calculator.setForeground(Color.WHITE);
		Calculator.setFont(new Font("Tohoma",Font.PLAIN,20));
		Calculator.addActionListener(this);
		Calculator.setMargin(new Insets(0,0,0,150));
		p2.add(Calculator);
		
		//Notpad
		 Notpad=new JButton("Notpad");
		Notpad.setBounds(0,500,300,45);
		Notpad.setBackground(new Color(0,0,102));
		Notpad.setForeground(Color.WHITE);
		Notpad.setFont(new Font("Tohoma",Font.PLAIN,20));
		Notpad.addActionListener(this);
		Notpad.setMargin(new Insets(0,0,0,170));
		p2.add(Notpad);
		
		//ABOUT	
		 ABOUT=new JButton("ABOUT");
		ABOUT.setBounds(0,540,300,45);
		ABOUT.setBackground(new Color(0,0,102));
		ABOUT.setForeground(Color.WHITE);
		ABOUT.setFont(new Font("Tohoma",Font.PLAIN,20));
		ABOUT.addActionListener(this);
		// TO ALINE BUTTOM TEXT AT LEFT.. PASS QUADINATE
		// TO SHIFT LEFT MERGIN AT RIGHT ......first argument is top,left,buttom,right
		ABOUT.setMargin(new Insets(0,0,0,170));
		p2.add(ABOUT);
				
		Back=new JButton("Back To Login Page");
		Back.setBounds(700,720,300,40);
		Back.setBackground(new Color(0,0,102));
		Back.setForeground(Color.WHITE);
		Back.setFont(new Font("Tohoma",Font.PLAIN,20));
		Back.addActionListener(this);
		add(Back);
		
		ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("icons/destop211.jpg"));
		// to change size
		Image i5=i4.getImage().getScaledInstance(1600, 860, Image.SCALE_DEFAULT);
		ImageIcon i6=new ImageIcon(i5);
		JLabel icon2=new JLabel(i6);
		icon2.setBounds(0,0,1610, 860);
		add(icon2);
		
		
		
		JLabel text=new JLabel("Online Ticket booking Management System");
		text.setBounds(600,70,1000,70);
		text.setForeground(Color.WHITE);
		text.setFont(new Font("Tahoma",Font.BOLD,30));
		icon2.add(text);
			
		setVisible(true);		
	
	}		
	
	public static void main(String[]args)
	{
		new Dashboard ("");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()== addPersondetails)
		{
			new AddCustomer(username);
		}else if(e.getSource()==ViewPersonDetails)
		{
			new Viewdatetickit(username);
		}else if(e.getSource()== UpdatepersonDetails)
		{
			new UpdateCustomer(username);
		}else if(e.getSource()==CheckRAT)
		{
			new Checkbusdetails(username);		
		
		}else if(e.getSource()==customerSupport)
		{
			new CustomerSupport();
		}
		else if(e.getSource()== rivew)
		{
			new ViewReview();
			
		}else if(e.getSource()==feadback)
		{
			new Feadback_Review(username);
		}else if(e.getSource()==Booktickit)
		{
			new SeatSelectionPrices(username,"","","","","","","");
		
		}else if(e.getSource()==Payments)
		{
			new PaymentStatus();
		}else if (e.getSource()==Calculator)
		{
			try
			{
				Runtime.getRuntime().exec("calc.exe");
			}catch(Exception e1)
			{
				e1.printStackTrace();
			}
		}
		else if(e.getSource()== Notpad)
		{
			try {
				
				Runtime.getRuntime().exec("notepad.exe");
			}catch(Exception e2)
			{
				e2.printStackTrace();
			}
		}else if(e.getSource()==ABOUT)
		{
			new About();
		}else if(e.getSource()==Search)
		{
			if(busname.getSelectedItem().equals("South Bengal State Transport(SBSTC)"))
			{
			
				new SBSTC(username);
				
				
			}else if(busname.getSelectedItem().equals("WBTC(CTC)"))
			{
				
				new WBTC(username);
			}else if(busname.getSelectedItem().equals("North Bengal State Transport Corporation"))
			{
				
				new NBSTC(username);
				
			}
		}else if(e.getSource()==Back)
		{
			setVisible(false);
			new Login();
		}
	}
}