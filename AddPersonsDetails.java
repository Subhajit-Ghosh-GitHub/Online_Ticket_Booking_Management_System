package application;
import java.net.URL;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AddPersonsDetails extends JFrame implements ActionListener{

	JTextField tf1name,tf2name,tf3name,tf4name,tf5name,tf6name,tf7name,tf8name;
	JTextField tf1age,tf2age,tf3age,tf4age,tf5age,tf6age,tf7age,tf8age;
	JTextField tf1mobile,tf2mobile,tf3mobile,tf4mobile,tf5mobile,tf6mobile,tf7mobile,tf8mobile;
	JTextField tf1seat,tf2seat,tf3seat,tf4seat,tf5seat,tf6seat,tf7seat,tf8seat;
	JButton b1add,b2add,b3add,b4add,b5add,b6add,b7add,b8add,Bookedtickit;
	JButton checkseat1,checkseat2,checkseat3,checkseat4,checkseat5,checkseat6,checkseat7,checkseat8,back;
	Choice cp1,cp2,cp3,cp4,cp5,cp6,cp7,cp8;
	int count=0;
	int tickit_No=1;
	ResultSet rs;

	String username,person,desination,date,Bustype,time,price,ac_nac,avgtime,totalprice;
	
	AddPersonsDetails(String usernamep,String persons,String destination,String ndate,String Bustype,String time,String price,String ac_nac,String navgtime,String totalp)
	{
		this.username=usernamep;
		this.person=persons;
		this.desination=destination;
		this.Bustype=Bustype;
		this.date=ndate;
		this.time=time;
		this.price=price;
		this.ac_nac=ac_nac;
		this.avgtime=navgtime;
		this.totalprice=totalp;
		setTitle("Add Persons Details And Booked Tickit");
		setBounds(160,25,1200,750);
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel user=new JLabel("username");   
		user.setBounds(10,30,80,25);
		user.setFont(new Font("Thoma",Font.BOLD,15));
		add(user);
		JLabel usernote=new JLabel("Note*");   
		 usernote.setBounds(30,10,200,25);
		 usernote.setForeground(Color.red);
		 usernote.setFont(new Font("Thoma",Font.BOLD,20));
		add( usernote);
		JLabel userNAME=new JLabel(username);   
		userNAME.setBounds(100,30,200,25);
		userNAME.setForeground(Color.magenta);
		userNAME.setFont(new Font("Thoma",Font.BOLD,17));
		add( userNAME);
		JLabel per=new JLabel("Add total");   
		per.setBounds(30,50,100,25);
		per.setForeground(Color.GREEN);
		per.setFont(new Font("Thoma",Font.BOLD,15));
		add(per);
		JLabel persdetails=new JLabel(person+" Persons Details");   
		persdetails.setBounds(10,70,200,25);
		persdetails.setForeground(Color.BLUE);
		persdetails.setFont(new Font("Thoma",Font.BOLD,15));
		add(persdetails);
		JLabel desti=new JLabel("Destination-");   
		desti.setBounds(30,90,200,25);
		desti.setForeground(Color.pink);
		desti.setFont(new Font("Thoma",Font.BOLD,15));
		add(desti);
		JLabel destin=new JLabel(desination);   
		destin.setBounds(10,110,200,25);
		destin.setForeground(Color.BLUE);
		destin.setFont(new Font("Thoma",Font.BOLD,15));
		add(destin);
		
		back=new JButton("<-Back");
		back.setBounds(1050,30,90,25);
		back.setBackground(Color.RED);
		back.setForeground(Color.WHITE);
		back.addActionListener(this);
		add(back);
		
		Bookedtickit=new JButton("Booked Tickit");
		Bookedtickit.setBounds(1020,70,150,25);
		Bookedtickit.setBackground(Color.GREEN);
		Bookedtickit.setForeground(Color.BLACK);
		Bookedtickit.addActionListener(this);
		add(Bookedtickit);
		
		JLabel p1=new JLabel("1st Person Details");   
		p1.setBounds(275,0,200,25);
		p1.setFont(new Font("Thoma",Font.BOLD,20));
		JLabel p1_name=new JLabel("Name");   
		p1_name.setBounds(220,35,80,25);
		p1_name.setFont(new Font("Thoma",Font.BOLD,20));
		tf1name=new JTextField("");
		tf1name.setBounds(300,35,180,25);  
		JLabel p1_gender=new JLabel("Gender");   
		p1_gender.setBounds(220,65,80,25);
		p1_gender.setFont(new Font("Thoma",Font.BOLD,20));
		cp1=new Choice();
		cp1.add("Male");
		cp1.add("Female");
		cp1.add("Others");
		cp1.setBounds(300,65,180,25);
		JLabel p1_age=new JLabel("Age");   
		p1_age.setBounds(220,95,80,25);
		p1_age.setFont(new Font("Thoma",Font.BOLD,20));
		tf1age=new JTextField("");
		tf1age.setBounds(300,95,180,25);  
		JLabel p1_phone=new JLabel("Phone_No");   
		p1_phone.setBounds(220,125,80,25);
		p1_phone.setFont(new Font("Thoma",Font.BOLD,15));
		tf1mobile=new JTextField("");
		tf1mobile.setBounds(300,125,180,25);  
		JLabel p1_seat=new JLabel("Seat No");   
		p1_seat.setBounds(220,155,80,25);
		p1_seat.setFont(new Font("Thoma",Font.BOLD,20));
		tf1seat=new JTextField("");
		tf1seat.setBounds(300,155,180,25);  
		checkseat1=new JButton("CheckSeat");
		checkseat1.setBounds(490,155,100,25);
		checkseat1.setBackground(Color.BLACK);
		checkseat1.setForeground(Color.WHITE);
		checkseat1.addActionListener(this);
		b1add=new JButton("Add_Details");
		b1add.setBounds(320,185,125,25);
		b1add.setBackground(Color.GREEN);
		b1add.setForeground(Color.BLACK);
		b1add.addActionListener(this);
		
	
		JLabel p2=new JLabel("2nd Person Details");   
		p2.setBounds(690,0,200,25);
		p2.setFont(new Font("Thoma",Font.BOLD,20));
		JLabel p2_name=new JLabel("Name");   
		p2_name.setBounds(610,35,80,25);
		p2_name.setFont(new Font("Thoma",Font.BOLD,20));
		tf2name=new JTextField("");
		tf2name.setBounds(690,35,180,25);  
		JLabel p2_gender=new JLabel("Gender");   
		p2_gender.setBounds(610,65,80,25);
		p2_gender.setFont(new Font("Thoma",Font.BOLD,20));
		cp2=new Choice();
		cp2.add("Male");
		cp2.add("Female");
		cp2.add("Others");
		cp2.setBounds(690,65,180,25);
		JLabel p2_age=new JLabel("Age");   
		p2_age.setBounds(610,95,80,25);
		p2_age.setFont(new Font("Thoma",Font.BOLD,20));
		tf2age=new JTextField("");
		tf2age.setBounds(690,95,180,25);  
		JLabel p2_phone=new JLabel("Phone_No");   
		p2_phone.setBounds(610,125,80,25);
		p2_phone.setFont(new Font("Thoma",Font.BOLD,15));
		tf2mobile=new JTextField("");
		tf2mobile.setBounds(690,125,180,25);  
		JLabel p2_seat=new JLabel("Seat No");   
		p2_seat.setBounds(610,155,80,25);
		p2_seat.setFont(new Font("Thoma",Font.BOLD,20));
		tf2seat=new JTextField("");
		tf2seat.setBounds(690,155,180,25);  
		checkseat2=new JButton("CheckSeat");
		checkseat2.setBounds(880,155,100,25);
		checkseat2.setBackground(Color.BLACK);
		checkseat2.setForeground(Color.WHITE);
		checkseat2.addActionListener(this);
		b2add=new JButton("Add_Details");
		b2add.setBounds(710,185,125,25);
		b2add.setBackground(Color.green);
		b2add.setForeground(Color.BLACK);
		b2add.addActionListener(this);
		
		JLabel p3=new JLabel("3rd Person Details");   
		p3.setBounds(85,230,200,25);
		p3.setFont(new Font("Thoma",Font.BOLD,20));
		JLabel p3_name=new JLabel("Name");   
		p3_name.setBounds(5,260,80,25);
		p3_name.setFont(new Font("Thoma",Font.BOLD,20));
		tf3name=new JTextField("");
		tf3name.setBounds(85,260,180,25);  
		//tf1name.setBorder(BorderFactory.createEmptyBorder());  // for empty boarder
		JLabel p3_gender=new JLabel("Gender");   
		p3_gender.setBounds(5,295,80,25);
		p3_gender.setFont(new Font("Thoma",Font.BOLD,20));
		cp3=new Choice();
		cp3.add("Male");
		cp3.add("Female");
		cp3.add("Others");
		cp3.setBounds(85,295,180,25);
		JLabel p3_age=new JLabel("Age");   
		p3_age.setBounds(5,330,80,25);
		p3_age.setFont(new Font("Thoma",Font.BOLD,20));
		tf3age=new JTextField("");
		tf3age.setBounds(85,330,180,25);  
		JLabel p3_phone=new JLabel("Phone_No");   
		p3_phone.setBounds(5,365,80,25);
		p3_phone.setFont(new Font("Thoma",Font.BOLD,15));
		tf3mobile=new JTextField("");
		tf3mobile.setBounds(85,365,180,25);  
		JLabel p3_seat=new JLabel("Seat No");   
		p3_seat.setBounds(5,400,80,25);
		p3_seat.setFont(new Font("Thoma",Font.BOLD,20));
		tf3seat=new JTextField("");
		tf3seat.setBounds(85,400,180,25);  
		checkseat3=new JButton("CheckSeat");
		checkseat3.setBounds(270,400,100,25);
		checkseat3.setBackground(Color.BLACK);
		checkseat3.setForeground(Color.WHITE);
		checkseat3.addActionListener(this);
		b3add=new JButton("Add_Details");
		b3add.setBounds(100,430,125,25);
		b3add.setBackground(Color.GREEN);
		b3add.setForeground(Color.BLACK);
		b3add.addActionListener(this);		
		
		JLabel p4=new JLabel("4th Person Details");   
		p4.setBounds(460,230,200,25);
		p4.setFont(new Font("Thoma",Font.BOLD,20));
		JLabel p4_name=new JLabel("Name");   
		p4_name.setBounds(390,255,80,25);
		p4_name.setFont(new Font("Thoma",Font.BOLD,20));
		tf4name=new JTextField("");
		tf4name.setBounds(470,255,180,25);  
		JLabel p4_gender=new JLabel("Gender");   
		p4_gender.setBounds(390,295,80,25);
		p4_gender.setFont(new Font("Thoma",Font.BOLD,20));
		cp4=new Choice();
		cp4.add("Male");
		cp4.add("Female");
		cp4.add("Others");
		cp4.setBounds(470,295,180,25);
		JLabel p4_age=new JLabel("Age");   
		p4_age.setBounds(390,330,80,25);
		p4_age.setFont(new Font("Thoma",Font.BOLD,20));
		tf4age=new JTextField("");
		tf4age.setBounds(470,330,180,25);  
		JLabel p4_phone=new JLabel("Phone_No");   
		p4_phone.setBounds(390,365,80,25);
		p4_phone.setFont(new Font("Thoma",Font.BOLD,15));
		tf4mobile=new JTextField("");
		tf4mobile.setBounds(470,365,180,25);  
		JLabel p4_seat=new JLabel("Seat No");   
		p4_seat.setBounds(390,400,80,25);
		p4_seat.setFont(new Font("Thoma",Font.BOLD,20));
		tf4seat=new JTextField("");
		tf4seat.setBounds(470,400,180,25);  
		checkseat4=new JButton("CheckSeat");
		checkseat4.setBounds(655,400,100,25);
		checkseat4.setBackground(Color.BLACK);
		checkseat4.setForeground(Color.WHITE);
		checkseat4.addActionListener(this);
		b4add=new JButton("Add_Details");
		b4add.setBounds(485,430,125,25);
		b4add.setBackground(Color.GREEN);
		b4add.setForeground(Color.BLACK);
		b4add.addActionListener(this);
		
		
		JLabel p5=new JLabel("5th Person Details");   
		p5.setBounds(835,230,200,25);
		p5.setFont(new Font("Thoma",Font.BOLD,20));
		JLabel p5_name=new JLabel("Name");   
		p5_name.setBounds(775,260,80,25);
		p5_name.setFont(new Font("Thoma",Font.BOLD,20));
		tf5name=new JTextField("");
		tf5name.setBounds(855,260,180,25);  
		JLabel p5_gender=new JLabel("Gender");   
		p5_gender.setBounds(775,295,80,25);
		p5_gender.setFont(new Font("Thoma",Font.BOLD,20));
		cp5=new Choice();
		cp5.add("Male");
		cp5.add("Female");
		cp5.add("Others");
		cp5.setBounds(855,295,180,25);
		JLabel p5_age=new JLabel("Age");   
		p5_age.setBounds(775,330,80,25);
		p5_age.setFont(new Font("Thoma",Font.BOLD,20));
		tf5age=new JTextField("");
		tf5age.setBounds(855,330,180,25);  
		JLabel p5_phone=new JLabel("Phone_No");   
		p5_phone.setBounds(775,365,80,25);
		p5_phone.setFont(new Font("Thoma",Font.BOLD,15));
		tf5mobile=new JTextField("");
		tf5mobile.setBounds(855,365,180,25);  
		JLabel p5_seat=new JLabel("Seat No");   
		p5_seat.setBounds(775,400,80,25);
		p5_seat.setFont(new Font("Thoma",Font.BOLD,20));
		tf5seat=new JTextField("");
		tf5seat.setBounds(855,400,180,25);  
		checkseat5=new JButton("CheckSeat");
		checkseat5.setBounds(1040,400,100,25);
		checkseat5.setBackground(Color.BLACK);
		checkseat5.setForeground(Color.WHITE);
		checkseat5.addActionListener(this);
		b5add=new JButton("Add_Details");
		b5add.setBounds(870,430,125,25);
		b5add.setBackground(Color.GREEN);
		b5add.setForeground(Color.BLACK);
		b5add.addActionListener(this);

		JLabel p6=new JLabel("6th Person Details");   
		p6.setBounds(85,470,200,25);
		p6.setFont(new Font("Thoma",Font.BOLD,20));
		JLabel p6_name=new JLabel("Name");   
		p6_name.setBounds(5,500,80,25);
		p6_name.setFont(new Font("Thoma",Font.BOLD,20));
		tf6name=new JTextField("");
		tf6name.setBounds(85,500,180,25);  
		JLabel p6_gender=new JLabel("Gender");   
		p6_gender.setBounds(5,530,80,25);
		p6_gender.setFont(new Font("Thoma",Font.BOLD,20));
		cp6=new Choice();
		cp6.add("Male");
		cp6.add("Female");
		cp6.add("Others");
		cp6.setBounds(85,530,180,25);
		JLabel p6_age=new JLabel("Age");   
		p6_age.setBounds(5,560,80,25);
		p6_age.setFont(new Font("Thoma",Font.BOLD,20));
		tf6age=new JTextField("");
		tf6age.setBounds(85,560,180,25);  
		JLabel p6_phone=new JLabel("Phone No");   
		p6_phone.setBounds(5,590,80,25);
		p6_phone.setFont(new Font("Thoma",Font.BOLD,15));
		tf6mobile=new JTextField("");
		tf6mobile.setBounds(85,590,180,25);  
		JLabel p6_seat=new JLabel("Seat No");   
		p6_seat.setBounds(5,620,80,25);
		p6_seat.setFont(new Font("Thoma",Font.BOLD,15));
		tf6seat=new JTextField("");
		tf6seat.setBounds(85,620,180,25);  
		checkseat6=new JButton("CheckSeat");
		checkseat6.setBounds(270,620,100,25);
		checkseat6.setBackground(Color.BLACK);
		checkseat6.setForeground(Color.WHITE);
		checkseat6.addActionListener(this);
		b6add=new JButton("Add_Details");
		b6add.setBounds(100,650,125,25);
		b6add.setBackground(Color.GREEN);
		b6add.setForeground(Color.BLACK);
		b6add.addActionListener(this);
		
		
		JLabel p7=new JLabel("7th Person Details");   
		p7.setBounds(460,470,200,25);
		p7.setFont(new Font("Thoma",Font.BOLD,20));
		JLabel p7_name=new JLabel("Name");   
		p7_name.setBounds(390,500,80,25);
		p7_name.setFont(new Font("Thoma",Font.BOLD,20));
		tf7name=new JTextField("");
		tf7name.setBounds(470,500,180,25);  
		//tf1name.setBorder(BorderFactory.createEmptyBorder());  // for empty boarder
		JLabel p7_gender=new JLabel("Gender");   
		p7_gender.setBounds(390,530,80,25);
		p7_gender.setFont(new Font("Thoma",Font.BOLD,20));
		cp7=new Choice();
		cp7.add("Male");
		cp7.add("Female");
		cp7.add("Others");
		cp7.setBounds(470,530,180,25);
		JLabel p7_age=new JLabel("Age");   
		p7_age.setBounds(390,560,80,25);
		p7_age.setFont(new Font("Thoma",Font.BOLD,20));
		tf7age=new JTextField("");
		tf7age.setBounds(470,560,180,25);  
		JLabel p7_phone=new JLabel("Phone No");   
		p7_phone.setBounds(390,590,80,25);
		p7_phone.setFont(new Font("Thoma",Font.BOLD,15));
		tf7mobile=new JTextField("");
		tf7mobile.setBounds(470,590,180,25);  
		JLabel p7_seat=new JLabel("Seat No");   
		p7_seat.setBounds(390,620,80,25);
		p7_seat.setFont(new Font("Thoma",Font.BOLD,15));
		tf7seat=new JTextField("");
		tf7seat.setBounds(470,620,180,25);  
		checkseat7=new JButton("CheckSeat");
		checkseat7.setBounds(650,620,100,25);
		checkseat7.setBackground(Color.BLACK);
		checkseat7.setForeground(Color.WHITE);
		checkseat7.addActionListener(this);
		b7add=new JButton("Add_Details");
		b7add.setBounds(485,650,125,25);
		b7add.setBackground(Color.GREEN);
		b7add.setForeground(Color.BLACK);
		b7add.addActionListener(this);
		
		
		JLabel p8=new JLabel("8th Person Details");   
		p8.setBounds(835,470,200,25);
		p8.setFont(new Font("Thoma",Font.BOLD,20));
		JLabel p8_name=new JLabel("Name");   
		p8_name.setBounds(775,500,80,25);
		p8_name.setFont(new Font("Thoma",Font.BOLD,20));
		tf8name=new JTextField("");
		tf8name.setBounds(855,500,180,25);  
		//tf1name.setBorder(BorderFactory.createEmptyBorder());  // for empty boarder
		JLabel p8_gender=new JLabel("Gender");   
		p8_gender.setBounds(775,530,80,25);
		p8_gender.setFont(new Font("Thoma",Font.BOLD,20));
		cp8=new Choice();
		cp8.add("Male");
		cp8.add("Female");
		cp8.add("Others");
		cp8.setBounds(855,530,180,25);
		JLabel p8_age=new JLabel("Age");   
		p8_age.setBounds(775,560,80,25);
		p8_age.setFont(new Font("Thoma",Font.BOLD,20));
		tf8age=new JTextField("");
		tf8age.setBounds(855,560,180,25);  
		JLabel p8_phone=new JLabel("Phone No");   
		p8_phone.setBounds(775,590,80,25);
		p8_phone.setFont(new Font("Thoma",Font.BOLD,15));
		tf8mobile=new JTextField("");
		tf8mobile.setBounds(855,590,180,25);  
		JLabel p8_seat=new JLabel("Seat No");   
		p8_seat.setBounds(775,620,80,25);
		p8_seat.setFont(new Font("Thoma",Font.BOLD,15));
		tf8seat=new JTextField("");
		tf8seat.setBounds(855,620,180,25);  
		checkseat8=new JButton("CheckSeat");
		checkseat8.setBounds(1040,620,100,25);
		checkseat8.setBackground(Color.BLACK);
		checkseat8.setForeground(Color.WHITE);
		checkseat8.addActionListener(this);
		b8add=new JButton("Add_Details");
		b8add.setBounds(870,650,125,25);
		b8add.setBackground(Color.GREEN);
		b8add.setForeground(Color.black);
		b8add.addActionListener(this);		
		for(int i=1;i<=Integer.parseInt(person);i++)	
		{
			String no=Integer.toString(i);
			
			if(i==1&&i<=Integer.parseInt(person))
			{
				add(p1);add(p1_name);add(tf1name);add(p1_gender);add(cp1);add(p1_age);add(tf1age);add(p1_phone);add(tf1mobile);add(p1_seat);add(tf1seat);add(b1add);add(checkseat1);
				
			}else if(i==2&&i<=Integer.parseInt(person))
			{
				add(p2);add(p2_name);add(tf2name);add(p2_gender);add(cp2);add(p2_age);add(tf2age);add(p2_phone);add(tf2mobile);add(p2_seat);add(tf2seat);add(checkseat2);add(b2add);
			
			}else if(i==3&&i<=Integer.parseInt(person))
			{
				add(p3);add(p3_name);add(tf3name);add(p3_gender);add(cp3);add(p3_age);add(tf3age);add(p3_phone);add(tf3mobile);add(p3_seat);add(tf3seat);add(checkseat3);add(b3add);
								
			}else if(i==4&&i<=Integer.parseInt(person))
			{
				add(p4);add(p4_name);add(tf4name);add(p4_gender);add(cp4);add(p4_age);add(tf4age);add(p4_phone);add(tf4mobile);add(p4_seat);add(tf4seat);add(b4add);add(checkseat4);
				
			}else if(i==5&&i<=Integer.parseInt(person))
			{
				add(p5);add(p5_name);add(tf5name);add(p5_gender);add(cp5);add(p5_age);add(tf5age);add(p5_phone);add(tf5mobile);add(p5_seat);add(tf5seat);add(checkseat5);add(b5add);
				
			}else if(i==6&&i<=Integer.parseInt(person))
			{
				add(p6);add(p6_name);add(p6_gender);add(p6_age);add(p6_phone);add(tf6name);add(cp6);add(tf6age);add(tf6mobile);add(tf6seat);add(p6_seat);add(b6add);add(checkseat6);
				
			}else if(i==7&&i<=Integer.parseInt(person))
			{
				add(p7);add(p7_name);add(tf7name);add(p7_gender);add(cp7);add(p7_age);add(tf7age);add(p7_phone);add(tf7mobile);add(p7_seat);add(tf7seat);add(b7add);add(checkseat7);
				
			}else if(i==8&&i<=Integer.parseInt(person))
			{
				add(p8);add(p8_name);add(tf8name);add(p8_gender);add(cp8);add(p8_age);add(tf8age);add(p8_phone);add(tf8mobile);add(p8_seat);add(tf8seat);add(b8add);add(checkseat8);
			}	
		}
		
		try
		{
			DButils c=new DButils();
			for(int i=1;i<5;i++)
			{
				String num=Integer.toString(i);
				String query11="select * from u_d_t_p_per where username='"+username+"' AND  d_ate='"+date+"' AND tickitno='"+num+"' ";
				rs=c.s.executeQuery(query11);
				if(rs.isBeforeFirst())
				{
		
					tickit_No=i+1;
					
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
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
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new AddPersonsDetails("","","","","","","","","","");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub		
		if(e.getSource()==b1add)
		{			
			if(!tf1name.getText().isEmpty() && !tf1age.getText().isEmpty() && !tf1seat.getText().isEmpty() && !tf1mobile.getText().isEmpty())
			{
				String person_no="1";
				try {
					DButils c=new DButils();
					String query1="select * from users_persons where username='"+username+"'AND destination='"+desination+"' AND P_no='"+person_no+"' AND P_date='"+date+"'";
					rs=c.s.executeQuery(query1);		
					if(rs.isBeforeFirst())
					{
						JOptionPane.showMessageDialog(null,"you have allredy add 1st Person Details " );
					}else
					{
						String query4="select * from seatbooked where busname='"+Bustype+"'  AND bookdate= '"+date+"' AND destination='"+desination+"' AND seat_No='"+tf1seat.getText()+"' ";
						rs=c.s.executeQuery(query4);
						if(rs.isBeforeFirst())
						{
							JOptionPane.showMessageDialog(null, "Seat Alredy Booked Please Checked seat");
						}else {
							
							if(Integer.parseInt(tf1seat.getText())<56)
							{
								// Get current datetime
								LocalDateTime currentDateTime = LocalDateTime.now();
								// Format datetime as per your database's requirements
								DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
								String formattedDateTime = currentDateTime.format(formatter);
							String tickit_no=Integer.toString(tickit_No);
							String query2="insert into users_persons values('"+username+"','"+desination+"','"+person_no+"','"+tf1name.getText()+"','"+cp1.getSelectedItem()+"','"+tf1age.getText()+"','"+tf1mobile.getText()+"','"+tf1seat.getText()+"','"+date+"','"+tickit_no+"','"+formattedDateTime+"') ";
							String query3="insert into seatbooked  values('"+Bustype+"','"+desination+"','"+username+"','"+tf1seat.getText()+"','"+tickit_no+"','"+date+"')";
							c.s.executeUpdate(query2);
							c.s.executeUpdate(query3);
							count++;
							JOptionPane.showMessageDialog(null,"Persons Details Uploaded Sucessfully" );
							}else
							{
								JOptionPane.showMessageDialog(null,"Seat No is not exixt.Please Check Seat_No" );
								tf1seat.setText("");
							}
						}
					}								
				}
				catch(Exception e1)
				{
					e1.printStackTrace();
				}
				finally
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
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Please Filed All Details");				
			}		
		}
		else if(e.getSource()==b2add)
		{
			if(Integer.parseInt(person)>=2)
			{		
			if(!tf2name.getText().isEmpty() && !tf2age.getText().isEmpty() && !tf2seat.getText().isEmpty() && !tf2mobile.getText().isEmpty())
			{
					
				String person_no="2";
				try {
					DButils c=new DButils();
					String query1="select * from users_persons where username='"+username+"' AND destination='"+desination+"' AND P_no='"+person_no+"' AND P_date='"+date+"'";
					rs=c.s.executeQuery(query1);		
					if(rs.isBeforeFirst())
					{
						JOptionPane.showMessageDialog(null,"you have allredy add 2nd Person Details" );
					}else
					{
						String query4="select * from seatbooked where busname='"+Bustype+"' AND bookdate='"+date+"' AND destination='"+desination+"' AND seat_No='"+tf2seat.getText()+"' ";
						rs=c.s.executeQuery(query4);
						if(rs.isBeforeFirst())
						{
							JOptionPane.showMessageDialog(null, "Seat Alredy Booked Please Checked seat");
						}else {
							if(Integer.parseInt(tf2seat.getText())<56)
							{
								LocalDateTime currentDateTime = LocalDateTime.now();

								// Format datetime as per your database's requirements
								DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
								String formattedDateTime = currentDateTime.format(formatter);
								
								String tickit_no=Integer.toString(tickit_No);
							String query2="insert into users_persons values('"+username+"','"+desination+"','"+person_no+"','"+tf2name.getText()+"','"+cp2.getSelectedItem()+"','"+tf2age.getText()+"','"+tf2mobile.getText()+"','"+tf2seat.getText()+"','"+date+"','"+tickit_no+"','"+formattedDateTime+"') ";
							String query3="insert into seatbooked  values('"+Bustype+"','"+desination+"','"+username+"','"+tf2seat.getText()+"','"+tickit_no+"','"+date+"')";
							c.s.executeUpdate(query2);
							c.s.executeUpdate(query3);
							count++;
							JOptionPane.showMessageDialog(null,"Persons Details Uploaded Sucessfully" );
							}else
							{
								JOptionPane.showMessageDialog(null,"Seat No is not exixt.Please Check Seat_No" );
								tf2seat.setText("");
							}
						}
					}						
				}
				catch(Exception e1)
				{
					e1.printStackTrace();
				}
				finally
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
				
				}
			
				else
				{
					JOptionPane.showMessageDialog(null,"Please Filed All Details");
				
				}
			}else
			{
				JOptionPane.showMessageDialog(null,"You required persons details is 1 so dont fill up this person details");
			}
		}
		else if(e.getSource()==b3add)
		{	
			if(Integer.parseInt(person)>=3)
			{
			if(!tf3name.getText().isEmpty() && !tf3age.getText().isEmpty() && !tf3seat.getText().isEmpty() && !tf3mobile.getText().isEmpty())
			{
				String person_no="3";
				try {
					DButils c=new DButils();
					String query1="select * from users_persons where username='"+username+"' AND destination='"+desination+"' AND P_no='"+person_no+"' AND P_date='"+date+"'";
					rs=c.s.executeQuery(query1);		
					if(rs.isBeforeFirst())
					{
						JOptionPane.showMessageDialog(null,"you have alredy add 3rd Person Details" );
					}else						
					{
						String query4="select * from seatbooked where busname='"+Bustype+"' AND bookdate='"+date+"' AND destination='"+desination+"' AND seat_No='"+tf3seat.getText()+"' ";
						rs=c.s.executeQuery(query4);
						if(rs.isBeforeFirst())
						{
							JOptionPane.showMessageDialog(null, "Seat Alredy Booked Please Checked seat");
						}else {
							if(Integer.parseInt(tf3seat.getText())<56)
							{
								LocalDateTime currentDateTime = LocalDateTime.now();

								// Format datetime as per your database's requirements
								DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
								String formattedDateTime = currentDateTime.format(formatter);
							String tickit_no=Integer.toString(tickit_No);
							String query2="insert into users_persons values('"+username+"','"+desination+"','"+person_no+"','"+tf3name.getText()+"','"+cp3.getSelectedItem()+"','"+tf3age.getText()+"','"+tf3mobile.getText()+"','"+tf3seat.getText()+"','"+date+"','"+tickit_no+"','"+formattedDateTime+"') ";
							String query3="insert into seatbooked  values('"+Bustype+"','"+desination+"','"+username+"','"+tf3seat.getText()+"','"+tickit_no+"','"+date+"')";
							c.s.executeUpdate(query2);
							c.s.executeUpdate(query3);
							count++;
							JOptionPane.showMessageDialog(null,"Persons Details Uploaded Sucessfully" );
							}else
							{
								JOptionPane.showMessageDialog(null,"Seat No is not exixt.Please Check Seat_No" );
								tf3seat.setText("");
							}
						}
					}								
				}
				catch(Exception e1)
				{
					e1.printStackTrace();
				}
				finally
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
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Please Filed All Details");				
			}
			
			}else
			{
				JOptionPane.showMessageDialog(null,"You required persons details is 2 so dont fill up this person details");
			}
		}
		else if(e.getSource()==b4add)
		{
			if(Integer.parseInt(person)>=4)
			{
			if(!tf4name.getText().isEmpty() && !tf4age.getText().isEmpty() && !tf4seat.getText().isEmpty() && !tf4mobile.getText().isEmpty())
			{
				String person_no="4";
				try {
					DButils c=new DButils();
					String query1="select * from users_persons where username='"+username+"' AND destination='"+desination+"' AND P_no='"+person_no+"' AND P_date='"+date+"'";
					rs=c.s.executeQuery(query1);		
					if(rs.isBeforeFirst())
					{
						JOptionPane.showMessageDialog(null,"you have alredy add 4th Person Details " );
					}else
					{
						String query4="select * from seatbooked where busname='"+Bustype+"' AND bookdate= '"+date+"' AND destination='"+desination+"' AND seat_No='"+tf4seat.getText()+"' ";
						rs=c.s.executeQuery(query4);
						if(rs.isBeforeFirst())
						{
							JOptionPane.showMessageDialog(null, "Seat Alredy Booked Please Checked seat");
						}else {
							if(Integer.parseInt(tf4seat.getText())<56)
							{ LocalDateTime currentDateTime = LocalDateTime.now();

							// Format datetime as per your database's requirements
							 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
							 String formattedDateTime = currentDateTime.format(formatter);
							String tickit_no=Integer.toString(tickit_No);
							String query2="insert into users_persons values('"+username+"','"+desination+"','"+person_no+"','"+tf4name.getText()+"','"+cp4.getSelectedItem()+"','"+tf4age.getText()+"','"+tf4mobile.getText()+"','"+tf4seat.getText()+"','"+date+"','"+tickit_no+"','"+formattedDateTime+"') ";
							String query3="insert into seatbooked  values('"+Bustype+"','"+desination+"','"+username+"','"+tf4seat.getText()+"','"+tickit_no+"','"+date+"')";
							c.s.executeUpdate(query2);
							c.s.executeUpdate(query3);
							count++;
							JOptionPane.showMessageDialog(null,"Persons Details Uploaded Sucessfully" );
							}else
							{
								JOptionPane.showMessageDialog(null,"Seat No is not exixt.Please Check Seat_No" );
								tf4seat.setText("");
							}
						}						
					}									
				}
				catch(Exception e1)
				{
					e1.printStackTrace();
				}
				finally
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
				
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Please Filed All Details");				
				}
			
			}else
			{
			JOptionPane.showMessageDialog(null,"You required persons details is 3 so dont fill up this person details");
			}			
		}
		else if(e.getSource()==b5add)
		{	
			if(Integer.parseInt(person)>=5)
			{
			if(!tf5name.getText().isEmpty() && !tf5age.getText().isEmpty() && !tf5seat.getText().isEmpty() && !tf5mobile.getText().isEmpty())
			{
				String person_no="5";
				try {
					DButils c=new DButils();
					String query1="select * from users_persons where username='"+username+"' AND destination='"+desination+"' AND P_no='"+person_no+"' AND P_date='"+date+"'";
					rs=c.s.executeQuery(query1);		
					if(rs.isBeforeFirst())
					{
						JOptionPane.showMessageDialog(null,"you have alredy add 5th Person Details" );
					}else
					{
						
						String query4="select * from seatbooked where busname='"+Bustype+"' AND bookdate= '"+date+"' AND destination='"+desination+"' AND seat_No='"+tf5seat.getText()+"' ";
						rs=c.s.executeQuery(query4);
						if(rs.isBeforeFirst())
						{
							JOptionPane.showMessageDialog(null, "Seat Alredy Booked Please Checked seat");
						}else {
							if(Integer.parseInt(tf5seat.getText())<56)
							{
								LocalDateTime currentDateTime = LocalDateTime.now();

								// Format datetime as per your database's requirements
								 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
								 String formattedDateTime = currentDateTime.format(formatter);
								String tickit_no=Integer.toString(tickit_No);
							String query2="insert into users_persons values('"+username+"','"+desination+"','"+person_no+"','"+tf5name.getText()+"','"+cp5.getSelectedItem()+"','"+tf5age.getText()+"','"+tf5mobile.getText()+"','"+tf5seat.getText()+"','"+date+"','"+tickit_no+"','"+formattedDateTime+"') ";
							String query3="insert into seatbooked  values('"+Bustype+"','"+desination+"','"+username+"','"+tf5seat.getText()+"','"+tickit_no+"','"+date+"')";
							c.s.executeUpdate(query2);
							c.s.executeUpdate(query3);
							count++;
							JOptionPane.showMessageDialog(null,"Persons Details Uploaded Sucessfully" );
							}else
							{
								
								JOptionPane.showMessageDialog(null,"Seat No is not exixt.Please Check Seat_No" );
								tf5seat.setText("");
							}
						}
					}									
				}
				catch(Exception e1)
				{
					e1.printStackTrace();
				}
				finally
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
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Please Filed All Details");
				
			}
		}else
		{
			JOptionPane.showMessageDialog(null,"You required persons details is 4 so dont fill up this person details");
		}

		}
		else if(e.getSource()==b6add)
		{	
			if(Integer.parseInt(person)>=6)
			{
			if(!tf6name.getText().isEmpty() && !tf6age.getText().isEmpty() && !tf6seat.getText().isEmpty() && !tf6mobile.getText().isEmpty())
			{
				String person_no="6";
				try {
					DButils c=new DButils();
					String query1="select * from users_persons where username='"+username+"'  AND destination='"+desination+"' AND P_no='"+person_no+"' AND P_date='"+date+"'";
					rs=c.s.executeQuery(query1);		
					if(rs.isBeforeFirst())
					{
						JOptionPane.showMessageDialog(null,"you have alredy add 6th Person Details " );
					}else
					{
						String query4="select * from seatbooked where busname='"+Bustype+"' AND bookdate= '"+date+"' AND destination='"+desination+"' AND seat_No='"+tf6seat.getText()+"' ";
						rs=c.s.executeQuery(query4);
						if(rs.isBeforeFirst())
						{
							JOptionPane.showMessageDialog(null, "Seat Alredy Booked Please Checked seat");
						}else {
							if(Integer.parseInt(tf6seat.getText())<56)
							{
								LocalDateTime currentDateTime = LocalDateTime.now();

								// Format datetime as per your database's requirements
								 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
								 String formattedDateTime = currentDateTime.format(formatter);
							String tickit_no=Integer.toString(tickit_No);
							String query2="insert into users_persons values('"+username+"','"+desination+"','"+person_no+"','"+tf6name.getText()+"','"+cp6.getSelectedItem()+"','"+tf6age.getText()+"','"+tf6mobile.getText()+"','"+tf6seat.getText()+"','"+date+"','"+tickit_no+"','"+formattedDateTime+"') ";
							String query3="insert into seatbooked  values('"+Bustype+"','"+desination+"','"+username+"','"+tf6seat.getText()+"','"+tickit_no+"'.'"+date+"' )";
							c.s.executeUpdate(query2);
							c.s.executeUpdate(query3);
							count++;
							JOptionPane.showMessageDialog(null,"Persons Details Uploaded Sucessfully" );
							}else
							{
								JOptionPane.showMessageDialog(null,"Seat No is not exixt.Please Check Seat_No" );
								tf6seat.setText("");
							}
						}
					}
									
				}
				catch(Exception e1)
				{
					e1.printStackTrace();
				}
				finally
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
	
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Please Filed All Details");				
			}
			
		}else
		{
			JOptionPane.showMessageDialog(null,"You required persons details is 5 so dont fill up this person details");
		}
		}

		else if(e.getSource()==b7add)
		{	
			
			if(Integer.parseInt(person)>=7)
			{
			if(!tf7name.getText().isEmpty() && !tf7age.getText().isEmpty() && !tf7seat.getText().isEmpty() && !tf7mobile.getText().isEmpty())
			{
				
				String person_no="7";
				try {
					DButils c=new DButils();
					String query1="select * from users_persons where username='"+username+"' AND destination='"+desination+"' AND P_no='"+person_no+"'AND P_date='"+date+"'";
					rs=c.s.executeQuery(query1);		
					if(rs.isBeforeFirst())
					{
						JOptionPane.showMessageDialog(null,"you have alredy add 7th Person Details" );
					}else
					{
						String query4="select * from seatbooked where busname='"+Bustype+"' AND bookdate='"+date+"' AND destination='"+desination+"' AND seat_No='"+tf7seat.getText()+"' ";
						rs=c.s.executeQuery(query4);
						if(rs.isBeforeFirst())
						{
							JOptionPane.showMessageDialog(null, "Seat Alredy Booked Please Checked seat");
						}else {
							if(Integer.parseInt(tf7seat.getText())<56)
							{
								LocalDateTime currentDateTime = LocalDateTime.now();

								// Format datetime as per your database's requirements
								 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
								 String formattedDateTime = currentDateTime.format(formatter);
								String tickit_no=Integer.toString(tickit_No);
							String query2="insert into users_persons values('"+username+"','"+desination+"','"+person_no+"','"+tf7name.getText()+"','"+cp7.getSelectedItem()+"','"+tf7age.getText()+"','"+tf7mobile.getText()+"','"+tf7seat.getText()+"','"+date+"','"+tickit_no+"','"+formattedDateTime+"') ";
							String query3="insert into seatbooked  values('"+Bustype+"','"+desination+"','"+username+"','"+tf7seat.getText()+"','"+tickit_no+"','"+date+"')";
							c.s.executeUpdate(query2);
							c.s.executeUpdate(query3);
							count++;
							JOptionPane.showMessageDialog(null,"Persons Details Uploaded Sucessfully" );
							}else
							{
								JOptionPane.showMessageDialog(null,"Seat No is not exixt.Please Check Seat_No" );
								tf7seat.setText("");
							}
						}
					}									
				}
				catch(Exception e1)
				{
					e1.printStackTrace();
				}
				finally
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
								
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Please Filed All Details");				
			}
			
		}else
		{
			JOptionPane.showMessageDialog(null,"You required persons details is 6 so dont fill up this person details");
		}

		}
		else if(e.getSource()==b8add)
		{
			if(Integer.parseInt(person)>=8)
			{
			if(!tf8name.getText().isEmpty() && !tf8age.getText().isEmpty() && !tf8seat.getText().isEmpty() && !tf8mobile.getText().isEmpty())
			{
				String person_no="8";
				try {
					DButils c=new DButils();
					String query1="select * from users_persons where username='"+username+"' AND destination='"+desination+"' AND P_no='"+person_no+"'AND P_date='"+date+"'";
					rs=c.s.executeQuery(query1);		
					if(rs.isBeforeFirst())
					{
						JOptionPane.showMessageDialog(null,"you have alredy add 8th Person Details OR Persons name alredy exixt" );
					}else
					{
						String query4="select * from seatbooked where busname='"+Bustype+"' AND bookdate='"+date+"' AND destination='"+desination+"' AND seat_No='"+tf8seat.getText()+"' ";
						rs=c.s.executeQuery(query4);
						if(rs.isBeforeFirst())
						{
							JOptionPane.showMessageDialog(null, "Seat_No Alredy Booked Please Checked seat");
						}else {
							if(Integer.parseInt(tf8seat.getText())<56)
							{
								LocalDateTime currentDateTime = LocalDateTime.now();

								// Format datetime as per your database's requirements
								 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
								 String formattedDateTime = currentDateTime.format(formatter);
							String tickit_no=Integer.toString(tickit_No);
							String query2="insert into users_persons values('"+username+"','"+desination+"','"+person_no+"','"+tf8name.getText()+"','"+cp8.getSelectedItem()+"','"+tf8age.getText()+"','"+tf8mobile.getText()+"','"+tf8seat.getText()+"','"+date+"','"+tickit_no+"','"+formattedDateTime+"') ";
							String query3="insert into seatbooked  values('"+Bustype+"','"+desination+"','"+username+"','"+tf8seat.getText()+"','"+tickit_no+"','"+date+"')";
							c.s.executeUpdate(query2);
							c.s.executeUpdate(query3);
							count++;
							JOptionPane.showMessageDialog(null,"Persons Details Uploaded Sucessfully" );
							}else
							{
								JOptionPane.showMessageDialog(null,"Seat No is not exixt.Please Check Seat_No" );
							}
						}
					}									
				}
				catch(Exception e1)
				{
					e1.printStackTrace();
				}
				finally
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
				
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Please Filed All Details");				
			}
			
		}else
		{
			JOptionPane.showMessageDialog(null,"You required persons details is 7 so dont fill up this person details");
		}

		}else if(e.getSource()== checkseat1)
		{
			if(Integer.parseInt(tf1seat.getText())<56)
			{
				
				try {
					
					String seatNo1=tf1seat.getText(); 				
					String query="select * from seatbooked where busname='"+Bustype+"' AND bookdate= '"+date+"' AND destination='"+desination+"' AND seat_No='"+seatNo1+"' ";
					DButils c=new DButils();
					rs=c.s.executeQuery(query);
					// if 1 value match so we usedit if
					if(rs.isBeforeFirst())// rs object told ia it full or null
					{
						JOptionPane.showMessageDialog(null, "Seat_No is allredy Boooked");
						tf1seat.setText("");
					
					}else
					{
						JOptionPane.showMessageDialog(null, "Seat_No is not BoookedYet");
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
			}
			else
			{	
				JOptionPane.showMessageDialog(null,"Seat_No Not Exsit");
			}
			
		}
		else if(e.getSource()== checkseat2)
		{
			if(Integer.parseInt(tf2seat.getText())<56)
			{
				
				try {
					
					String seatNo2=tf2seat.getText(); 				
					String query="select * from seatbooked where busname='"+Bustype+"' AND bookdate= '"+date+"'AND destination='"+desination+"' AND seat_No='"+ seatNo2 +"' ";
					DButils c=new DButils();
					rs=c.s.executeQuery(query);
					// if 1 value match so we usedit if
					if(rs.isBeforeFirst())// rs object told ia it full or null
					{
						JOptionPane.showMessageDialog(null, "Seat_No is allredy Boooked");
						tf2seat.setText("");
					
					}else
					{
						JOptionPane.showMessageDialog(null, "Seat_No is not BoookedYet");
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
			}
			else
			{	
				JOptionPane.showMessageDialog(null,"Seat_No Not Exsit");
			}
			
		}
		else if(e.getSource()== checkseat3)
		{
			if(Integer.parseInt(tf3seat.getText())<56)
			{
				
				try {
					
					String seatNo3=tf3seat.getText(); 				
					String query="select * from seatbooked where busname='"+Bustype+"'AND bookdate= '"+date+"' AND destination='"+desination+"' AND seat_No='"+seatNo3+"' ";
					DButils c=new DButils();
					rs=c.s.executeQuery(query);
					// if 1 value match so we usedit if
					if(rs.isBeforeFirst())// rs object told ia it full or null
					{
						JOptionPane.showMessageDialog(null, "Seat_No is allredy Boooked");
						tf1seat.setText("");
					
					}else
					{
						JOptionPane.showMessageDialog(null, "Seat_No is not BoookedYet");
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
			}
			else
			{	
				JOptionPane.showMessageDialog(null,"Seat_No Not Exsit");
			}
			
		}
		else if(e.getSource()== checkseat4)
		{
			if(Integer.parseInt(tf4seat.getText())<56)
			{
				
				try {
					
					String seatNo4=tf4seat.getText(); 				
					String query="select * from seatbooked where busname='"+Bustype+"' AND bookdate= '"+date+"'AND destination='"+desination+"' AND seat_No='"+ seatNo4 +"' ";
					DButils c=new DButils();
					rs=c.s.executeQuery(query);
					// if 1 value match so we usedit if
					if(rs.isBeforeFirst())// rs object told ia it full or null
					{
						JOptionPane.showMessageDialog(null, "Seat_No is allredy Boooked");
						tf4seat.setText("");
					
					}else
					{
						JOptionPane.showMessageDialog(null, "Seat_No is not BoookedYet");
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
			}
			else
			{	
				JOptionPane.showMessageDialog(null,"Seat_No Not Exsit");
			}
			
		}
		else if(e.getSource()== checkseat5)
		{
			if(Integer.parseInt(tf5seat.getText())<36)
			{
				
				try {
					
					String seatNo5=tf5seat.getText(); 				
					String query="select * from seatbooked where busname='"+Bustype+"'AND bookdate= '"+date+"' AND destination='"+desination+"' AND seat_No='"+ seatNo5 +"' ";
					DButils c=new DButils();
					rs=c.s.executeQuery(query);
					// if 1 value match so we usedit if
					if(rs.isBeforeFirst())// rs object told ia it full or null
					{
						JOptionPane.showMessageDialog(null, "Seat_No is allredy Boooked");
						tf1seat.setText("");
					
					}else
					{
						JOptionPane.showMessageDialog(null, "Seat_No is not BoookedYet");
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
			}
			else
			{	
				JOptionPane.showMessageDialog(null,"Seat_No Not Exsit");
			}
			
		}
		else if(e.getSource()== checkseat6)
		{
			if(Integer.parseInt(tf6seat.getText())<56)
			{
				
				try {
					
					String seatNo6=tf6seat.getText(); 				
					String query="select * from seatbooked where busname='"+Bustype+"'AND bookdate= '"+date+"' AND destination='"+desination+"' AND seat_No='"+ seatNo6 +"' ";
					DButils c=new DButils();
					rs=c.s.executeQuery(query);
					// if 1 value match so we usedit if
					if(rs.isBeforeFirst())// rs object told ia it full or null
					{
						JOptionPane.showMessageDialog(null, "Seat_No is allredy Boooked");
						tf6seat.setText("");
					
					}else
					{
						JOptionPane.showMessageDialog(null, "Seat_No is not BoookedYet");
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
			}
			else
			{	
				JOptionPane.showMessageDialog(null,"Seat_No Not Exsit");
			}
			
		}
		else if(e.getSource()== checkseat7)
		{
			if(Integer.parseInt(tf7seat.getText())<56)
			{
				
				try {
					
					String seatNo7=tf7seat.getText(); 				
					String query="select * from seatbooked where busname='"+Bustype+"' AND bookdate='"+date+"' AND destination='"+desination+"' AND seat_No='"+ seatNo7 +"' ";
					DButils c=new DButils();
					rs=c.s.executeQuery(query);
					// if 1 value match so we usedit if
					if(rs.isBeforeFirst())// rs object told ia it full or null
					{
						JOptionPane.showMessageDialog(null, "Seat_No is allredy Boooked");
						tf7seat.setText("");
					
					}else
					{
						JOptionPane.showMessageDialog(null, "Seat_No is not BoookedYet");
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
			}
			else
			{	
				JOptionPane.showMessageDialog(null,"Seat_No Not Exsit");
			}
			
		}
		else if(e.getSource()== checkseat8)
		{
			if(Integer.parseInt(tf8seat.getText())<35)
			{
				
				try {
					
					String seatNo8=tf8seat.getText(); 				
					String query="select * from seatbooked where busname='"+Bustype+"' AND bookdate= '"+date+"' AND destination='"+desination+"' AND seat_No='"+ seatNo8 +"' ";
					DButils c=new DButils();
					rs=c.s.executeQuery(query);
					// if 1 value match so we usedit if
					if(rs.isBeforeFirst())// rs object told ia it full or null
					{
						JOptionPane.showMessageDialog(null, "Seat_No is allredy Boooked");
						tf8seat.setText("");
					
					}else
					{
						JOptionPane.showMessageDialog(null, "Seat_No is not BoookedYet");
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
			}
			else
			{	
				JOptionPane.showMessageDialog(null,"Seat_No Not Exsit");
			}
			
		}else if(e.getSource()==back)
		{
			
			JOptionPane.showMessageDialog(null,"Tickit is not booked completed" );
			setVisible(false);
			new SeatSelectionPrices(username,Bustype,desination,time,price,ac_nac,avgtime,person);
		}else if(e.getSource()==Bookedtickit)
		{
			if(count<Integer.parseInt(person))
			{
				JOptionPane.showMessageDialog(null,"Please fill required persons details" );

			}
			else
			{
				try
				{
					DButils c=new DButils();
					
						LocalDateTime currentDateTime = LocalDateTime.now();

						// Format datetime as per your database's requirements
						 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
						 String formattedDateTime = currentDateTime.format(formatter);
						
						String tickitno=Integer.toString(tickit_No);
						String query2="insert into u_d_t_p_per values('"+username+"','"+desination+"','"+time+"','"+price+"','"+date+"','"+person+"','"+totalprice+"','"+avgtime+"','"+Bustype+"','"+tickitno+"','"+ac_nac+"','"+formattedDateTime+"')";
						c.s.executeUpdate(query2);
						count=0;
						JOptionPane.showMessageDialog(null,"Tickit Booked  Sucessfully");
						setVisible(false);
						new PaymentStatus();
					
					
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
			}
		}
		
	}
		
}
		
