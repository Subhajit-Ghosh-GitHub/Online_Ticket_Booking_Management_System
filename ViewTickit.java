package application;

import java.awt.Choice;
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
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class ViewTickit extends JFrame implements ActionListener{

	JButton back,canceltickit;
	String Nusername,date,tickitno;
	ResultSet rs;
	JLabel lbelbustype;
	JTextField tf1name;
	JLabel cp1,tf1age,tf1mobile,tf1seat,tf2name,cp2,tf2age,tf2mobile,tf2seat,tf3name,cp3,tf3age,tf3mobile,tf3seat,tf4name,cp4,tf4age,tf4mobile,tf4seat;
	JLabel tf5name,cp5,tf5age,tf5mobile,tf5seat,tf6name,cp6,tf6age,tf6mobile,tf6seat,tf7name,cp7,tf7age,tf7mobile,tf7seat,tf8name,cp8,tf8age,tf8mobile,tf8seat;
	JLabel lbeldestination,lbeltpersons;
	
	ViewTickit(String username,String ndate,String ntickitno)
	{
		this.Nusername=username;
		this.date=ndate;
		this.tickitno=ntickitno;
		setTitle("View Tickit");
		setBounds(350,50,950,705);
		getContentPane().setBackground(Color.white);
		setLayout(null);
		
		
		
		JLabel lbltickit=new JLabel("Conformed Tickit");
		lbltickit.setBounds(375,5,190,25);
		lbltickit.setForeground(Color.GREEN);
		lbltickit.setFont(new Font("Thoma",Font.BOLD,20));
			
		// username
		
		JLabel lblusername=new JLabel("username:-");
		lblusername.setBounds(20,50,150,25);
		lblusername.setFont(new Font("Thoma",Font.BOLD,20));
		
		// real username
		
		JLabel lbelusername=new JLabel(Nusername);
		lbelusername.setBounds(130,50,150,25);
		lbelusername.setFont(new Font("Thoma",Font.PLAIN,20));
		lbelusername.setForeground(Color.BLUE);
		
		
		//id
		JLabel lbldestination=new JLabel("Destination:-");
		lbldestination.setBounds(300,50,150,25);
		lbldestination.setFont(new Font("Thoma",Font.BOLD,20));
		
		
		// real id
		
		 lbeldestination=new JLabel();
		lbeldestination.setBounds(430,50,250,25);
		lbeldestination.setFont(new Font("Thoma",Font.PLAIN,20));
		lbeldestination.setForeground(Color.BLUE);
		
		
		//id number
		
		JLabel lblsprice=new JLabel("Seat Price:-");
		lblsprice.setBounds(660,50,150,25);
		lblsprice.setFont(new Font("Thoma",Font.BOLD,20));
		
				
		//  id number
				
		JLabel lbelspricer=new JLabel();
		lbelspricer.setBounds(780,50,150,25);
		lbelspricer.setFont(new Font("Thoma",Font.PLAIN,20));
		lbelspricer.setForeground(Color.BLUE);
		
		
		//date
		
		JLabel lbldate=new JLabel("Tickit Date:-");
		lbldate.setBounds(10,90,250,25);
		lbldate.setFont(new Font("Thoma",Font.BOLD,20));		
		// date print		
		JLabel lbeldate=new JLabel();
		lbeldate.setBounds(138,90,250,25);
		lbeldate.setFont(new Font("Thoma",Font.PLAIN,18));
		lbeldate.setForeground(Color.BLUE);
		
		JLabel lblticdate=new JLabel("Booked Date:-");
		lblticdate.setBounds(680,5,250,20);
		lblticdate.setForeground(Color.ORANGE);
		lblticdate.setFont(new Font("Thoma",Font.BOLD,16));	
		add(lblticdate);
		// date print		
		JLabel lbelticdate=new JLabel();
		lbelticdate.setBounds(795,5,250,20);
		lbelticdate.setFont(new Font("Thoma",Font.PLAIN,15));
		lbelticdate.setForeground(Color.BLUE);
		add(lbelticdate);
		
		
		 
		
		//avg duration time
		
		JLabel lblavgtime=new JLabel("Avg Duration Time Taken:-");
		lblavgtime.setBounds(290,90,350,25);
		lblavgtime.setFont(new Font("Thoma",Font.BOLD,15));				
		// avg duration time print					
		JLabel lbelavgtime=new JLabel();
		lbelavgtime.setBounds(490,90,150,25);
		lbelavgtime.setFont(new Font("Thoma",Font.PLAIN,20));
		lbelavgtime.setForeground(Color.BLUE);
		
		
		//time
		JLabel lbltime=new JLabel("Bus time:-");
		lbltime.setBounds(660,90,150,25);
		lbltime.setFont(new Font("Thoma",Font.BOLD,20));
		
						
		// time print
						
		JLabel lbeltime=new JLabel();
		lbeltime.setBounds(760,90,150,25);
		lbeltime.setFont(new Font("Thoma",Font.PLAIN,20));
		lbeltime.setForeground(Color.BLUE);
		
		
		
		//total persons
		JLabel lbltpersons=new JLabel("Total Persons");
		lbltpersons.setBounds(240,130,150,25);
		lbltpersons.setFont(new Font("Thoma",Font.BOLD,20));
		
						
		// total persons print
						
		lbeltpersons=new JLabel();
		lbeltpersons.setBounds(380,130,50,25);
		lbeltpersons.setFont(new Font("Thoma",Font.PLAIN,20));
		lbeltpersons.setBackground(Color.WHITE);
		
		lbeltpersons.setForeground(Color.BLUE);
		
		
		//Total Price
		JLabel lbltprice=new JLabel("Total Price");
		lbltprice.setBounds(475,130,150,25);
		lbltprice.setFont(new Font("Thoma",Font.BOLD,20));
		
						
		// total price print				
		JLabel lbeltprice=new JLabel();
		lbeltprice.setBounds(585,130,150,25);
		lbeltprice.setFont(new Font("Thoma",Font.PLAIN,20));
		lbeltprice.setForeground(Color.BLUE);
		
		//Bustype
		JLabel lblbustype=new JLabel("Bus Name");
		lblbustype.setBounds(20,130,140,25);
		lblbustype.setFont(new Font("Thoma",Font.BOLD,20));
				
								
		//Bustype print				
		 lbelbustype=new JLabel();
		lbelbustype.setBounds(130,130,130,25);
		lbelbustype.setFont(new Font("Thoma",Font.PLAIN,20));
		lbelbustype.setForeground(Color.BLUE);
		
		//Bustype
				JLabel lblac=new JLabel("Bus Type");
				lblac.setBounds(740,130,140,25);
				lblac.setFont(new Font("Thoma",Font.BOLD,20));
						
										
				//Bustype print				
				JLabel lbelac=new JLabel();
				lbelac.setBounds(840,130,90,25);
				lbelac.setFont(new Font("Thoma",Font.PLAIN,20));
				lbelac.setForeground(Color.BLUE);
		
		
		//Persons Details
		JLabel lblpdetails=new JLabel("#Persons Details:-");
		lblpdetails.setBounds(10,170,180,25);
		lblpdetails.setForeground(Color.PINK);
		lblpdetails.setFont(new Font("Thoma",Font.BOLD,20));
		
						
		// Adress print
						
		JLabel lbeladress=new JLabel();
		lbeladress.setBounds(690,230,150,25);
		
				
		
		//Back Button
		
		back=new JButton("Back");
		back.setBackground(Color.black);
		back.setForeground(Color.white);
		back.setBounds(500,550,100,25);
		back.addActionListener(this);
		
		
		canceltickit=new JButton("Cancel_Tickit");
		canceltickit.setBackground(Color.RED);
		canceltickit.setForeground(Color.white);
		canceltickit.setBounds(300,550,130,25);
		canceltickit.addActionListener(this);
		
		
		JLabel lblpdetailsa=new JLabel("Wish for Incredible,Safest and Comfortable journey THANK YOU!");
		lblpdetailsa.setBounds(180,590,650,25);
		lblpdetailsa.setForeground(Color.GREEN);
		lblpdetailsa.setFont(new Font("Thoma",Font.BOLD,20));
		
//**********************************************
		
		JLabel p1=new JLabel("1st Person Details");   
		p1.setBounds(50,205,200,20);
		p1.setFont(new Font("Thoma",Font.BOLD,15));
		p1.setForeground(Color.GRAY);
		
		JLabel p1_name=new JLabel("Name:-");   
		p1_name.setBounds(10,230,80,20);
		p1_name.setFont(new Font("Thoma",Font.BOLD,15));
		
		tf1name=new JTextField();
		tf1name.setBounds(100,230,110,20);  
		tf1name.setFont(new Font("Thoma",Font.PLAIN,15));
		tf1name.setForeground(Color.BLUE);
		tf1name.setBorder(BorderFactory.createEmptyBorder());  // for empty boarder
		
		JLabel p1_gender=new JLabel("Gender:-");   
		p1_gender.setBounds(10,255,80,20);
		p1_gender.setFont(new Font("Thoma",Font.BOLD,15));
		
		cp1=new JLabel();
		cp1.setBounds(100,255,180,20);
		cp1.setFont(new Font("Thoma",Font.PLAIN,15));
		cp1.setForeground(Color.BLUE);
		
		JLabel p1_age=new JLabel("Age:-");   
		p1_age.setBounds(10,280,80,25);
		p1_age.setFont(new Font("Thoma",Font.BOLD,15));
		
		tf1age=new JLabel();
		tf1age.setBounds(100,280,180,20);  
		tf1age.setFont(new Font("Thoma",Font.PLAIN,15));
		tf1age.setForeground(Color.BLUE);
		
		JLabel p1_phone=new JLabel("Phone_No");   
		p1_phone.setBounds(10,305,80,20);
		p1_phone.setFont(new Font("Thoma",Font.BOLD,15));
		
		tf1mobile=new JLabel();
		tf1mobile.setBounds(100,305,180,20);  
		tf1mobile.setFont(new Font("Thoma",Font.PLAIN,15));
		tf1mobile.setForeground(Color.BLUE);
		
		JLabel p1_seat=new JLabel("Seat No:-");   
		p1_seat.setBounds(10,330,80,20);
		p1_seat.setFont(new Font("Thoma",Font.BOLD,15));
		
		tf1seat=new JLabel();
		tf1seat.setBounds(100,330,180,20);  
		tf1seat.setFont(new Font("Thoma",Font.PLAIN,15));
		tf1seat.setForeground(Color.BLUE);
	
		
		JLabel p2=new JLabel("2nd Person Details");   
		p2.setBounds(260,205,200,20);
		p2.setFont(new Font("Thoma",Font.BOLD,15));

		
		JLabel p2_name=new JLabel("Name:-");   
		p2_name.setBounds(220,230,80,20);
		p2_name.setFont(new Font("Thoma",Font.BOLD,15));
		
		tf2name=new JLabel();
		tf2name.setBounds(310,230,180,20);  
		tf2name.setFont(new Font("Thoma",Font.PLAIN,15));
		tf2name.setForeground(Color.BLUE);
		//tf1name.setBorder(BorderFactory.createEmptyBorder());  // for empty boarder
		
		JLabel p2_gender=new JLabel("Gender:-");   
		p2_gender.setBounds(220,255,80,20);
		p2_gender.setFont(new Font("Thoma",Font.BOLD,15));
		
		 cp2=new JLabel();
		cp2.setBounds(310,255,180,20);
		cp2.setFont(new Font("Thoma",Font.PLAIN,15));
		cp2.setForeground(Color.BLUE);
		
		JLabel p2_age=new JLabel("Age:-");   
		p2_age.setBounds(220,280,80,20);
		p2_age.setFont(new Font("Thoma",Font.BOLD,15));
		
		 tf2age=new JLabel();
		tf2age.setBounds(310,280,180,20); 
		tf2age.setFont(new Font("Thoma",Font.PLAIN,15));
		tf2age.setForeground(Color.BLUE);
		
		JLabel p2_phone=new JLabel("Phone_No");   
		p2_phone.setBounds(220,305,80,20);
		p2_phone.setFont(new Font("Thoma",Font.BOLD,15));
		
		 tf2mobile=new JLabel();
		tf2mobile.setBounds(310,305,180,20);  
		tf2mobile.setFont(new Font("Thoma",Font.PLAIN,15));
		tf2mobile.setForeground(Color.BLUE);
		
		JLabel p2_seat=new JLabel("Seat No");   
		p2_seat.setBounds(220,330,80,20);
		p2_seat.setFont(new Font("Thoma",Font.BOLD,15));
		
		 tf2seat=new JLabel("");
		tf2seat.setBounds(310,330,180,20); 
		tf2seat.setFont(new Font("Thoma",Font.PLAIN,15));
		tf2seat.setForeground(Color.BLUE);
		
		
		
		JLabel p3=new JLabel("3rd Person Details");   
		p3.setBounds(500,205,200,20);
		p3.setFont(new Font("Thoma",Font.BOLD,15));
		p3.setForeground(Color.GRAY);

		
		JLabel p3_name=new JLabel("Name:-");   
		p3_name.setBounds(460,230,80,20);
		p3_name.setFont(new Font("Thoma",Font.BOLD,15));
		
		 tf3name=new JLabel();
		tf3name.setBounds(550,230,180,20);
		tf3name.setFont(new Font("Thoma",Font.PLAIN,15));
		tf3name.setForeground(Color.BLUE);
		//tf1name.setBorder(BorderFactory.createEmptyBorder());  // for empty boarder
		
		JLabel p3_gender=new JLabel("Gender:-");   
		p3_gender.setBounds(460,255,80,20);
		p3_gender.setFont(new Font("Thoma",Font.BOLD,15));
		
		 cp3=new JLabel();
		cp3.setBounds(550,255,180,20);
		cp3.setFont(new Font("Thoma",Font.PLAIN,15));
		cp3.setForeground(Color.BLUE);
		
		JLabel p3_age=new JLabel("Age:-");   
		p3_age.setBounds(460,280,80,20);
		p3_age.setFont(new Font("Thoma",Font.BOLD,15));
		
		 tf3age=new JLabel();
		tf3age.setBounds(550,280,180,20);  
		tf3age.setFont(new Font("Thoma",Font.PLAIN,15));
		tf3age.setForeground(Color.BLUE);
		
		JLabel p3_phone=new JLabel("Phone_No");   
		p3_phone.setBounds(460,305,80,20);
		p3_phone.setFont(new Font("Thoma",Font.BOLD,15));
		
		 tf3mobile=new JLabel();
		tf3mobile.setBounds(550,305,180,20);  
		tf3mobile.setFont(new Font("Thoma",Font.PLAIN,15));
		tf3mobile.setForeground(Color.BLUE);
		
		JLabel p3_seat=new JLabel("Seat No:-");   
		p3_seat.setBounds(460,330,80,20);
		p3_seat.setFont(new Font("Thoma",Font.BOLD,15));
		
		 tf3seat=new JLabel("");
		tf3seat.setBounds(550,330,180,20);  
		tf3seat.setFont(new Font("Thoma",Font.PLAIN,15));
		tf3seat.setForeground(Color.BLUE);


		JLabel p4=new JLabel("4th Person Details");   
		p4.setBounds(740,205,200,20);
		p4.setFont(new Font("Thoma",Font.BOLD,15));
		
		JLabel p4_name=new JLabel("Name:-");   
		p4_name.setBounds(700,230,80,20);
		p4_name.setFont(new Font("Thoma",Font.BOLD,15));
		
		 tf4name=new JLabel();
		tf4name.setBounds(790,230,180,20); 
		tf4name.setFont(new Font("Thoma",Font.PLAIN,15));
		tf4name.setForeground(Color.BLUE);
		//tf1name.setBorder(BorderFactory.createEmptyBorder());  // for empty boarder
		
		JLabel p4_gender=new JLabel("Gender:-");   
		p4_gender.setBounds(700,255,80,20);
		p4_gender.setFont(new Font("Thoma",Font.BOLD,15));
		
		 cp4=new JLabel();
		cp4.setBounds(790,255,180,20);
		cp4.setFont(new Font("Thoma",Font.PLAIN,15));
		cp4.setForeground(Color.BLUE);
		
		JLabel p4_age=new JLabel("Age:-");   
		p4_age.setBounds(700,280,80,20);
		p4_age.setFont(new Font("Thoma",Font.BOLD,15));
		
		 tf4age=new JLabel();
		tf4age.setBounds(790,280,180,20);  
		tf4age.setFont(new Font("Thoma",Font.PLAIN,15));
		tf4age.setForeground(Color.BLUE);
		
		JLabel p4_phone=new JLabel("Phone No");   
		p4_phone.setBounds(700,305,80,20);
		p4_phone.setFont(new Font("Thoma",Font.BOLD,15));
		
		 tf4mobile=new JLabel();
		tf4mobile.setBounds(790,305,180,20);  
		tf4mobile.setFont(new Font("Thoma",Font.PLAIN,15));
		tf4mobile.setForeground(Color.BLUE);

		JLabel p4_seat=new JLabel("Seat No:-");   
		p4_seat.setBounds(700,330,80,20);
		p4_seat.setFont(new Font("Thoma",Font.BOLD,15));
		
		 tf4seat=new JLabel();
		tf4seat.setBounds(790,330,180,20); 
		tf4seat.setFont(new Font("Thoma",Font.PLAIN,15));
		tf4seat.setForeground(Color.BLUE);

		
		JLabel p5=new JLabel("5th Person Details");   
		p5.setBounds(50,380,200,20);
		p5.setFont(new Font("Thoma",Font.BOLD,15));
		
		JLabel p5_name=new JLabel("Name:-");   
		p5_name.setBounds(10,410,80,20);
		p5_name.setFont(new Font("Thoma",Font.BOLD,15));
		
		 tf5name=new JLabel("");
		tf5name.setBounds(100,410,180,20); 
		tf5name.setFont(new Font("Thoma",Font.PLAIN,15));
		tf5name.setForeground(Color.BLUE);
		//tf1name.setBorder(BorderFactory.createEmptyBorder());  // for empty boarder
		
		JLabel p5_gender=new JLabel("Gender:-");   
		p5_gender.setBounds(10,435,80,20);
		p5_gender.setFont(new Font("Thoma",Font.BOLD,15));
		
		 cp5=new JLabel();
		cp5.setBounds(100,435,180,20);
		cp5.setFont(new Font("Thoma",Font.PLAIN,15));
		cp5.setForeground(Color.BLUE);
		
		JLabel p5_age=new JLabel("Age:-");   
		p5_age.setBounds(10,460,80,25);
		p5_age.setFont(new Font("Thoma",Font.BOLD,15));
		
		 tf5age=new JLabel();
		tf5age.setBounds(100,460,180,20);  
		tf5age.setFont(new Font("Thoma",Font.PLAIN,15));
		tf5age.setForeground(Color.BLUE);
		
		JLabel p5_phone=new JLabel("Phone_No");   
		p5_phone.setBounds(10,485,80,20);
		p5_phone.setFont(new Font("Thoma",Font.BOLD,15));
		
		 tf5mobile=new JLabel();
		tf5mobile.setBounds(100,485,180,20); 
		tf5mobile.setFont(new Font("Thoma",Font.PLAIN,15));
		tf5mobile.setForeground(Color.BLUE);
		
		JLabel p5_seat=new JLabel("Seat No:-");   
		p5_seat.setBounds(10,510,80,20);
		p5_seat.setFont(new Font("Thoma",Font.BOLD,15));
		
		 tf5seat=new JLabel();
		tf5seat.setBounds(100,510,180,20);
		tf5seat.setFont(new Font("Thoma",Font.PLAIN,15));
		tf5seat.setForeground(Color.BLUE);
		
	
		JLabel p6=new JLabel("6th Person Details");   
		p6.setBounds(260,380,200,20);
		p6.setFont(new Font("Thoma",Font.BOLD,15));
		p6.setForeground(Color.GRAY);

		
		JLabel p6_name=new JLabel("Name:-");   
		p6_name.setBounds(220,410,80,20);
		p6_name.setFont(new Font("Thoma",Font.BOLD,15));
		
		 tf6name=new JLabel();
		tf6name.setBounds(310,410,180,20); 
		tf6name.setFont(new Font("Thoma",Font.PLAIN,15));
		tf6name.setForeground(Color.BLUE);
		//tf1name.setBorder(BorderFactory.createEmptyBorder());  // for empty boarder
		JLabel p6_gender=new JLabel("Gender:-");   
		p6_gender.setBounds(220,435,80,20);
		p6_gender.setFont(new Font("Thoma",Font.BOLD,15));
		
		 cp6=new JLabel();
		cp6.setBounds(310,435,180,20);
		cp6.setFont(new Font("Thoma",Font.PLAIN,15));
		cp6.setForeground(Color.BLUE);
		JLabel p6_age=new JLabel("Age:-");   
		p6_age.setBounds(220,460,80,20);
		p6_age.setFont(new Font("Thoma",Font.BOLD,15));
		
		 tf6age=new JLabel();
		tf6age.setBounds(310,460,180,20); 
		tf6age.setFont(new Font("Thoma",Font.PLAIN,15));
		tf6age.setForeground(Color.BLUE);
		JLabel p6_phone=new JLabel("Phone_No");   
		p6_phone.setBounds(220,485,80,20);
		p6_phone.setFont(new Font("Thoma",Font.BOLD,15));
		
		tf6mobile=new JLabel();
		tf6mobile.setBounds(310,485,180,20);  
		tf6mobile.setFont(new Font("Thoma",Font.PLAIN,15));
		tf6mobile.setForeground(Color.BLUE);
		JLabel p6_seat=new JLabel("Seat No:-");   
		p6_seat.setBounds(220,510,80,20);
		p6_seat.setFont(new Font("Thoma",Font.BOLD,15));
		
		 tf6seat=new JLabel("");
		tf6seat.setBounds(310,510,180,20);  
		tf6seat.setFont(new Font("Thoma",Font.PLAIN,15));
		tf6seat.setForeground(Color.BLUE);
		
//		
		JLabel p7=new JLabel("7th Person Details");   
		p7.setBounds(500,380,200,20);
		p7.setFont(new Font("Thoma",Font.BOLD,15));
		
		JLabel p7_name=new JLabel("Name:-");   
		p7_name.setBounds(460,410,80,20);
		p7_name.setFont(new Font("Thoma",Font.BOLD,15));
		
		 tf7name=new JLabel();
		tf7name.setBounds(550,410,180,20);  
		tf7name.setFont(new Font("Thoma",Font.PLAIN,15));
		tf7name.setForeground(Color.BLUE);
		//tf1name.setBorder(BorderFactory.createEmptyBorder());  // for empty boarder
		
		JLabel p7_gender=new JLabel("Gender:-");   
		p7_gender.setBounds(460,435,80,25);
		p7_gender.setFont(new Font("Thoma",Font.BOLD,15));
		
		 cp7=new JLabel();
		cp7.setBounds(550,435,180,25);
		cp7.setFont(new Font("Thoma",Font.PLAIN,15));
		cp7.setForeground(Color.BLUE);
		
		JLabel p7_age=new JLabel("Age:-");   
		p7_age.setBounds(460,460,80,20);
		p7_age.setFont(new Font("Thoma",Font.BOLD,15));
		
		 tf7age=new JLabel();
		tf7age.setBounds(550,460,180,25);
		tf7age.setFont(new Font("Thoma",Font.PLAIN,15));
		tf7age.setForeground(Color.BLUE);
		
		JLabel p7_phone=new JLabel("Phone_No");   
		p7_phone.setBounds(460,485,80,25);
		p7_phone.setFont(new Font("Thoma",Font.BOLD,15));
		
		 tf7mobile=new JLabel();
		tf7mobile.setBounds(550,485,180,25);
		tf7mobile.setFont(new Font("Thoma",Font.PLAIN,15));
		tf7mobile.setForeground(Color.BLUE);
		
		JLabel p7_seat=new JLabel("Seat No:-");   
		p7_seat.setBounds(460,510,80,25);
		p7_seat.setFont(new Font("Thoma",Font.BOLD,15));
		
		 tf7seat=new JLabel("");
		tf7seat.setBounds(550,510,180,20);  
		tf7seat.setFont(new Font("Thoma",Font.PLAIN,15));
		tf7seat.setForeground(Color.BLUE);

		JLabel p8=new JLabel("8th Person Details");   
		p8.setBounds(740,380,200,20);
		p8.setFont(new Font("Thoma",Font.BOLD,15));
		p8.setForeground(Color.GRAY);

		
		JLabel p8_name=new JLabel("Name:-");   
		p8_name.setBounds(700,410,80,20);
		p8_name.setFont(new Font("Thoma",Font.BOLD,15));
		
		 tf8name=new JLabel();
		tf8name.setBounds(790,410,180,20);  
		tf8name.setFont(new Font("Thoma",Font.PLAIN,15));
		tf8name.setForeground(Color.BLUE);
		//tf1name.setBorder(BorderFactory.createEmptyBorder());  // for empty boarder
		
		JLabel p8_gender=new JLabel("Gender:-");   
		p8_gender.setBounds(700,435,80,20);
		p8_gender.setFont(new Font("Thoma",Font.BOLD,15));
		
		 cp8=new JLabel();
		cp8.setBounds(790,255,435,20);
		cp8.setFont(new Font("Thoma",Font.PLAIN,15));
		cp8.setForeground(Color.BLUE);
		
		JLabel p8_age=new JLabel("Age:-");   
		p8_age.setBounds(700,460,80,20);
		p8_age.setFont(new Font("Thoma",Font.BOLD,15));
		
		 tf8age=new JLabel();
		tf8age.setBounds(790,460,180,20); 
		tf8age.setFont(new Font("Thoma",Font.PLAIN,15));
		tf8age.setForeground(Color.BLUE);
		
		JLabel p8_phone=new JLabel("Phone No");   
		p8_phone.setBounds(700,485,80,20);
		p8_phone.setFont(new Font("Thoma",Font.BOLD,15));
		
		 tf8mobile=new JLabel();
		tf8mobile.setBounds(790,485,180,20);  
		tf8mobile.setFont(new Font("Thoma",Font.PLAIN,15));
		tf8mobile.setForeground(Color.BLUE);
		
		JLabel p8_seat=new JLabel("Seat No:-");   
		p8_seat.setBounds(700,510,80,20);
		p4_seat.setFont(new Font("Thoma",Font.BOLD,15));
		
		 tf8seat=new JLabel();
		tf8seat.setBounds(790,510,180,20);  
		tf8seat.setFont(new Font("Thoma",Font.PLAIN,15));
		tf8seat.setForeground(Color.BLUE);
		
		
		add(lblpdetailsa);
		add(canceltickit);
		add(back);
		add(lbeladress);
		add(lblpdetails);
		add(lbeltprice);
		add( lbltprice);
		add(lbeltpersons);
		add( lbltpersons);
		add(lbeltime);
		add( lbltime);
		add(lbelavgtime);
		add( lblavgtime);
		add(lbeldate);
		add(lbldate);
		add( lbelspricer);
		add(lblsprice);
		add(lbeldestination);
		add(lbldestination);
		add(lbltickit);
		add( lblusername);
		add( lbelusername);
		add(lblbustype);
		add(lbelbustype);
		add(lblac);
		add(lbelac);
	
		//conection with database
		
		
		try {
			DButils c=new DButils();
			String query="select * from u_d_t_p_per where username='"+Nusername+"' AND d_ate='"+date+"' AND tickitno='"+tickitno+"'";
			rs=c.s.executeQuery(query);		
			if(rs.isBeforeFirst())
			{
				add(lblpdetailsa);
				add(canceltickit);
				add(back);
				add(lbeladress);
				add(lblpdetails);
				add(lbeltprice);
				add( lbltprice);
				add(lbeltpersons);
				add( lbltpersons);
				add(lbeltime);
				add( lbltime);
				add(lbelavgtime);
				add( lblavgtime);
				add(lbeldate);
				add(lbldate);
				add( lbelspricer);
				add(lblsprice);
				add(lbeldestination);
				add(lbldestination);
				add(lbltickit);
				add( lblusername);
				add( lbelusername);
				add(lblbustype);
				add(lbelbustype);
				add(lblac);
				add(lbelac);
				
				while(rs.next()){
					
					lbelusername.setText(rs.getString("username"));
					lbeldestination.setText(rs.getString("Busdestination"));
					lbeltime.setText(rs.getString("Timeing"));
					lbeltpersons.setText(rs.getString("persons"));
					lbeldate.setText(rs.getString("d_ate"));
					lbelspricer.setText(rs.getString("Price"));
					lbeltprice.setText(rs.getString("Totalprice"));
					lbelavgtime.setText(rs.getString("avgtime"));
					lbelbustype.setText(rs.getString("bustype"));
					lbelac.setText(rs.getString("acnac"));
					lbelticdate.setText(rs.getString("CurentDate"));
				}
				for(int i=1;i<=Integer.parseInt(lbeltpersons.getText());i++)	
				{
					
					if(i==1&&i<=Integer.parseInt(lbeltpersons.getText()))
					{
						String no=Integer.toString(i);
						String queryup="select * from users_persons where username='"+Nusername+"' AND destination='"+lbeldestination.getText()+"' AND P_no='"+no+"' AND P_date='"+date+"' AND P_tickitno='"+tickitno+"'";
						add(p1);
						add(p1_name);
						add(tf1name);
						add(p1_gender);
						add(cp1);
						add(p1_age);
						add(tf1age);
						add(p1_phone);
						add(tf1mobile);
						add(p1_seat);
						add(tf1seat);
						rs=c.s.executeQuery(queryup);
						while(rs.next()) {
							tf1name.setText(rs.getString("P_name"));
							cp1.setText(rs.getString("P_gender"));
							tf1age.setText(rs.getString("P_age"));
							tf1mobile.setText(rs.getString("P_mobile"));
							tf1seat.setText(rs.getString("P_seat"));						
						}
						
					}else if(i==2&&i<=Integer.parseInt(lbeltpersons.getText()))
					{
						String no1=Integer.toString(i);
						String queryup="select * from users_persons where username='"+Nusername+"' AND destination='"+lbeldestination.getText()+"' AND P_no='"+no1+"' AND P_date='"+date+"'  AND P_tickitno='"+tickitno+"'";
						add(p2);
						add(p2_name);
						add(tf2name);
						add(p2_gender);
						add(cp2);
						add(p2_age);
						add(tf2age);
						add(p2_phone);
						add(tf2mobile);
						add(p2_seat);
						add(tf2seat);
						rs=c.s.executeQuery(queryup);
						while(rs.next()) {
							tf2name.setText(rs.getString("P_name"));
							cp2.setText(rs.getString("P_gender"));
							tf2age.setText(rs.getString("P_age"));
							tf2mobile.setText(rs.getString("P_mobile"));
							tf2seat.setText(rs.getString("P_seat"));
						}
					
					}else if(i==3&&i<=Integer.parseInt(lbeltpersons.getText()))
					{
						String no2=Integer.toString(i);
						String queryup="select * from users_persons where username='"+Nusername+"' AND destination='"+lbeldestination.getText()+"' AND P_no='"+no2+"' AND P_date='"+date+"' AND P_tickitno='"+tickitno+"'";
						add(p3);
						add(p3_name);
						add(tf3name);
						add(p3_gender);
						add(cp3);
						add(p3_age);
						add(tf3age);
						add(p3_phone);
						add(tf3mobile);
						add(p3_seat);
						add(tf3seat);
						rs=c.s.executeQuery(queryup);
						while(rs.next()) {
							tf3name.setText(rs.getString("P_name"));
							cp3.setText(rs.getString("P_gender"));
							tf3age.setText(rs.getString("P_age"));
							tf3mobile.setText(rs.getString("P_mobile"));
							tf3seat.setText(rs.getString("P_seat"));
						}
						
					}else if(i==4&&i<=Integer.parseInt(lbeltpersons.getText()))
					{
						String no3=Integer.toString(i);
						String queryup="select * from users_persons where username='"+Nusername+"' AND destination='"+lbeldestination.getText()+"' AND P_no='"+no3+"' AND P_date='"+date+"' AND P_tickitno='"+tickitno+"'";
						add(p4);
						add(p4_name);
						add(tf4name);
						add(p4_gender);
						add(cp4);
						add(p4_age);
						add(tf4age);
						add(p4_phone);
						add(tf4mobile);
						add(p4_seat);
						add(tf4seat);
						rs=c.s.executeQuery(queryup);
						while(rs.next()) {
							tf4name.setText(rs.getString("P_name"));
							cp4.setText(rs.getString("P_gender"));
							tf4age.setText(rs.getString("P_age"));
							tf4mobile.setText(rs.getString("P_mobile"));
							tf4seat.setText(rs.getString("P_seat"));
						}
					}else if(i==5&&i<=Integer.parseInt(lbeltpersons.getText()))
					{
						String no4=Integer.toString(i);
						String queryup="select * from users_persons where username='"+Nusername+"' AND destination='"+lbeldestination.getText()+"' AND P_no='"+no4+"' AND P_date='"+date+"' AND P_tickitno='"+tickitno+"'";
						add(p5);
						add(p5_name);
						add(tf5name);
						add(p5_gender);
						add(cp5);
						add(p5_age);
						add(tf5age);
						add(p5_phone);
						add(tf5mobile);
						add(p5_seat);
						add(tf5seat);
						rs=c.s.executeQuery(queryup);
						while(rs.next()) {
							tf5name.setText(rs.getString("P_name"));
							cp5.setText(rs.getString("P_gender"));
							tf5age.setText(rs.getString("P_age"));
							tf5mobile.setText(rs.getString("P_mobile"));
							tf5seat.setText(rs.getString("P_seat"));
						}
					}else if(i==6&&i<=Integer.parseInt(lbeltpersons.getText()))
					{
						String no5=Integer.toString(i);
						String queryup="select * from users_persons where username='"+Nusername+"' AND destination='"+lbeldestination.getText()+"' AND P_no='"+no5+"' AND P_date='"+date+"' AND P_tickitno='"+tickitno+"'";
						add(p6);
						add(p6_name);
						add(p6_gender);
						add(p6_age);
						add(p6_phone);
						add(tf6name);
						add(cp6);
						add(tf6age);
						add(tf6mobile);
						add(tf6seat);
						add(p6_seat);
						rs=c.s.executeQuery(queryup);
						while(rs.next()) {
							tf6name.setText(rs.getString("P_name"));
							cp6.setText(rs.getString("P_gender"));
							tf6age.setText(rs.getString("P_age"));
							tf6mobile.setText(rs.getString("P_mobile"));
							tf6seat.setText(rs.getString("P_seat"));
						}
					}else if(i==7&&i<=Integer.parseInt(lbeltpersons.getText()))
					{
						String no6=Integer.toString(i);
						String queryup="select * from users_persons where username='"+Nusername+"' AND destination='"+lbeldestination.getText()+"' AND P_no='"+no6+"' AND P_date='"+date+"' AND P_tickitno='"+tickitno+"'";
						add(p7);
						add(p7_name);
						add(tf7name);
						add(p7_gender);
						add(cp7);
						add(p7_age);
						add(tf7age);
						add(p7_phone);
						add(tf7mobile);
						add(p7_seat);
						add(tf7seat);
						rs=c.s.executeQuery(queryup);
						while(rs.next()) {
							tf7name.setText(rs.getString("P_name"));
							cp7.setText(rs.getString("P_gender"));
							tf7age.setText(rs.getString("P_age"));
							tf7mobile.setText(rs.getString("P_mobile"));
							tf7seat.setText(rs.getString("P_seat"));
						}
					}else if(i==8&&i<=Integer.parseInt(lbeltpersons.getText()))
					{
						String no7=Integer.toString(i);
						String queryup="select * from users_persons where username='"+Nusername+"' AND destination='"+lbeldestination.getText()+"' AND P_no='"+no7+"'AND P_date='"+date+"'  AND P_tickitno='"+tickitno+"'";
						add(p8);
						add(p8_name);
						add(tf8name);
						add(p8_gender);
						add(cp8);
						add(p8_age);
						add(tf8age);
						add(p8_phone);
						add(tf8mobile);
						add(p8_seat);
						add(tf8seat);
						rs=c.s.executeQuery(queryup);
						while(rs.next()) {
							tf8name.setText(rs.getString("P_name"));
							cp8.setText(rs.getString("P_gender"));
							tf8age.setText(rs.getString("P_age"));
							tf8mobile.setText(rs.getString("P_mobile"));
							tf8seat.setText(rs.getString("P_seat"));
						}
					}	
				
				}
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
		
		new ViewTickit("","","");  //letter its cahnge
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==back)
		{
			setVisible(false);
			
		}else if(e.getSource()==canceltickit)
		{
			try
			{
				DButils c=new DButils();
				c.s.executeUpdate("delete from u_d_t_p_per where username='"+Nusername+"' AND d_ate='"+date+"' AND bustype='"+lbelbustype.getText()+"' AND Busdestination='"+lbeldestination.getText()+"' AND tickitno='"+tickitno+"'  ");
				c.s.executeUpdate("delete from users_persons where username='"+Nusername+"' AND P_date='"+date+"' AND destination='"+lbeldestination.getText()+"' AND P_tickitno= '"+tickitno+"'");
				c.s.executeUpdate("delete from seatbooked where username='"+Nusername+"'AND bookdate= '"+date+"' AND destination='"+lbeldestination.getText()+"' AND tickitno= '"+tickitno+"'");
				
				
					if(tickitno.equals("1"))
					{
						String query="UPDATE u_d_t_p_per SET tickitno='"+"1"+"' where tickitno='"+"2"+"'AND d_ate='"+date+"'";
						String query1="UPDATE u_d_t_p_per SET tickitno='"+"2"+"' where tickitno='"+"3"+"'AND d_ate='"+date+"'";
						String query2="UPDATE u_d_t_p_per SET tickitno='"+"3"+"' where tickitno='"+"4"+"'AND d_ate='"+date+"'";
						String query3="UPDATE u_d_t_p_per SET tickitno='"+"4"+"' where tickitno='"+"5"+"'AND d_ate='"+date+"'";
						String query11="UPDATE users_persons SET P_tickitno='"+"1"+"' where P_tickitno='"+"2"+"'AND P_date='"+date+"'";
						String query111="UPDATE users_persons SET P_tickitno='"+"2"+"' where P_tickitno='"+"3"+"'AND P_date='"+date+"'";
						String query22="UPDATE users_persons SET P_tickitno='"+"3"+"' where P_tickitno='"+"4"+"'AND P_date='"+date+"'";
						String query33="UPDATE users_persons SET P_tickitno='"+"4"+"' where P_tickitno='"+"5"+"'AND P_date='"+date+"'";
						String query12="UPDATE seatbooked SET tickitno='"+"1"+"' where tickitno='"+"2"+"'AND bookdate='"+date+"'";
						String query121="UPDATE seatbooked SET tickitno='"+"2"+"' where tickitno='"+"3"+"'AND bookdate='"+date+"'";
						String query222="UPDATE seatbooked SET tickitno='"+"3"+"' where tickitno='"+"4"+"'AND bookdate='"+date+"'";
						String query333="UPDATE seatbooked SET tickitno='"+"4"+"' where tickitno='"+"5"+"'AND bookdate='"+date+"'";
						c.s.executeUpdate(query);
						c.s.executeUpdate(query1);
						c.s.executeUpdate(query2);
						c.s.executeUpdate(query3);
						c.s.executeUpdate(query11);
						c.s.executeUpdate(query111);
						c.s.executeUpdate(query22);
						c.s.executeUpdate(query33);
						c.s.executeUpdate(query12);
						c.s.executeUpdate(query121);
						c.s.executeUpdate(query222);
						c.s.executeUpdate(query333);
						
					}else if(tickitno.equals("2"))
					{
						String query1="UPDATE u_d_t_p_per SET tickitno='"+"2"+"' where tickitno='"+"3"+"'AND d_ate='"+date+"'";
						String query2="UPDATE u_d_t_p_per SET tickitno='"+"3"+"' where tickitno='"+"4"+"'AND d_ate='"+date+"'";
						String query3="UPDATE u_d_t_p_per SET tickitno='"+"4"+"' where tickitno='"+"5"+"'AND d_ate='"+date+"'";
						String query111="UPDATE users_persons SET P_tickitno='"+"2"+"' where P_tickitno='"+"3"+"'AND P_date='"+date+"'";
						String query22="UPDATE users_persons SET P_tickitno='"+"3"+"' where P_tickitno='"+"4"+"'AND P_date='"+date+"'";
						String query33="UPDATE users_persons SET P_tickitno='"+"4"+"' where P_tickitno='"+"5"+"'AND P_date='"+date+"'";
						String query121="UPDATE seatbooked SET tickitno='"+"2"+"' where tickitno='"+"3"+"'AND bookdate='"+date+"'";
						String query222="UPDATE seatbooked SET tickitno='"+"3"+"' where tickitno='"+"4"+"'AND bookdate='"+date+"'";
						String query333="UPDATE seatbooked SET tickitno='"+"4"+"' where tickitno='"+"5"+"'AND bookdate='"+date+"'";
						c.s.executeUpdate(query1);
						c.s.executeUpdate(query2);
						c.s.executeUpdate(query3);
						c.s.executeUpdate(query111);
						c.s.executeUpdate(query22);
						c.s.executeUpdate(query33);
						c.s.executeUpdate(query121);
						c.s.executeUpdate(query222);
						c.s.executeUpdate(query333);
						
					}else if(tickitno.equals("3")) 
					{
						String query2="UPDATE u_d_t_p_per SET tickitno='"+"3"+"' where tickitno='"+"4"+"'AND d_ate='"+date+"'";
						String query3="UPDATE u_d_t_p_per SET tickitno='"+"4"+"' where tickitno='"+"5"+"'AND d_ate='"+date+"'";
						String query22="UPDATE users_persons SET P_tickitno='"+"3"+"' where P_tickitno='"+"4"+"'AND P_date='"+date+"'";
						String query33="UPDATE users_persons SET P_tickitno='"+"4"+"' where P_tickitno='"+"5"+"'AND P_date='"+date+"'";
						String query222="UPDATE seatbooked SET tickitno='"+"3"+"' where tickitno='"+"4"+"'AND bookdate='"+date+"'";
						String query333="UPDATE seatbooked SET tickitno='"+"4"+"' where tickitno='"+"5"+"'AND bookdate='"+date+"'";
						c.s.executeUpdate(query2);
						c.s.executeUpdate(query3);
						c.s.executeUpdate(query22);
						c.s.executeUpdate(query33);
						c.s.executeUpdate(query222);
						c.s.executeUpdate(query333);
						
					}else if(tickitno.equals("4"))
					{
						String query3="UPDATE u_d_t_p_per SET tickitno='"+"4"+"' where tickitno='"+"5"+"'AND d_ate='"+date+"'";
						String query33="UPDATE users_persons SET P_tickitno='"+"4"+"' where P_tickitno='"+"5"+"'AND P_date='"+date+"'";
						String query333="UPDATE seatbooked SET tickitno='"+"4"+"' where tickitno='"+"5"+"'AND bookdate='"+date+"'"; 
						c.s.executeUpdate(query3);
						c.s.executeUpdate(query33);
						c.s.executeUpdate(query333);
					}
					
//					
//				
				//c.s.executeQuery("delet from account whereusername='"+username+"' ");
				JOptionPane.showMessageDialog(null, "Tickit Cancel Sucessfull");
				setVisible(false);

				
				
			}catch(Exception e1)
			{
				e1.printStackTrace();
			}
		}
		
	}

}
