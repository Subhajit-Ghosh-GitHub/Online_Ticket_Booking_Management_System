package application;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class Checkbusdetails extends JFrame implements ActionListener {

	Choice cdesti,cdesti1,cdesti2;
	ResultSet rs;
	JButton search,search1,search2,booked,booked1,booked2;
	JButton Checkseat, Checkseat1, Checkseat2,back,back1,back2;
	JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9,tf10,tf11,tf12,seat,seat1,seat2;
	String nusername;
	Checkbusdetails(String username)
	{
		this.nusername=username;
		setTitle("Bus Details");
		setBounds(350,180,950,520);
		//setLayout(null);   not neaded if we nullpanel

		JPanel p1=new JPanel();
		p1.setLayout(null);
		p1.setBackground(Color.white);
//		
//		// not cretae this
		JPanel p2=new JPanel();
		p2.setLayout(null);
		p2.setBackground(Color.white);
		
		JPanel p3=new JPanel();
		p3.setLayout(null);
		p3.setBackground(Color.white);
		
		// using JTabbedPane create tab
		
		JTabbedPane tab=new JTabbedPane();
		tab.addTab("NBSTC BUSES",null,p1);	
		tab.addTab("SBSTC BUSES",null,p2);	
		tab.addTab("WBTC(CTC) BUSES",null,p3);
		
		add(tab);
		
		JLabel lblnbstc=new JLabel("North Bengal State Transport Corporation Bus Service");   
		lblnbstc.setBounds(200,10,550,25);
		lblnbstc.setForeground(Color.BLUE);
		lblnbstc.setFont(new Font("Thoma",Font.BOLD,20));
		p1.add(lblnbstc);
		 
		JLabel lblbusdesti=new JLabel("Bus Destiantions");   
		lblbusdesti.setBounds(230,60,170,25);
		lblbusdesti.setFont(new Font("Thoma",Font.BOLD,20));
		p1.add(lblbusdesti);
		
		cdesti=new Choice();
		cdesti.setBounds(400,65,150,25);			
		// use try catch block 
		try
		{
			DButils c=new DButils();
			rs=c.s.executeQuery("select * from nbstcbusdestination ");
			while(rs.next())
			{
				cdesti.add(rs.getString("Busdestination"));
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
		p1.add(cdesti);
		
		JLabel lblinformation=new JLabel("-:INFORMATIONS:-");   
		lblinformation.setBounds(50,100,220,35);
		lblinformation.setForeground(Color.GREEN);
		lblinformation.setFont(new Font("Thoma",Font.BOLD,25));
		p1.add(lblinformation);
		
		JLabel lbltime=new JLabel("Time");   
		lbltime.setBounds(10,140,170,25);
		lbltime.setForeground(Color.black);
		lbltime.setFont(new Font("Thoma",Font.BOLD,20));
		p1.add(lbltime);
		
		tf1=new JTextField();
		tf1.setBounds(150,140,150,25);
		p1.add(tf1);
		
		JLabel lblseat=new JLabel("Seat Price");   
		lblseat.setBounds(10,170,170,25);
		lblseat.setForeground(Color.black);
		lblseat.setFont(new Font("Thoma",Font.BOLD,20));
		p1.add(lblseat);
		
		 tf2=new JTextField();
		tf2.setBounds(150,170,150,25);
		p1.add(tf2);
		
		JLabel lbltype=new JLabel("AC/Non AC");   
		lbltype.setBounds(10,200,170,25);
		lbltype.setForeground(Color.black);
		lbltype.setFont(new Font("Thoma",Font.BOLD,20));
		p1.add(lbltype);
		
		 tf3=new JTextField();
		tf3.setBounds(150,200,150,25);
		p1.add(tf3);
		
		JLabel lblbuseat=new JLabel("*Total 55 Seat Bus");   
		lblbuseat.setBounds(10,235,190,20);
		lblbuseat.setForeground(Color.PINK);
		lblbuseat.setFont(new Font("Thoma",Font.BOLD,18));
		p1.add(lblbuseat);
		
		JLabel lblavgdut=new JLabel("Avg.Duration Time");   
		lblavgdut.setBounds(10,320,150,25);
		lblavgdut.setForeground(Color.black);
		lblavgdut.setFont(new Font("Thoma",Font.BOLD,15));
		p1.add(lblavgdut);
		
		tf4=new JTextField();
		tf4.setBounds(150,320,150,25);
		p1.add(tf4);
		
		JLabel lblDBS=new JLabel("Daily Bus Services");   
		lblDBS.setBounds(10,290,200,25);
		lblDBS.setForeground(Color.PINK);
		lblDBS.setFont(new Font("Thoma",Font.BOLD,20));
		p1.add(lblDBS);
		
		search=new JButton("Search Information");
		search.setBounds(555,65,142,25);
		search.setBackground(Color.BLACK);
		search.setForeground(Color.WHITE);
		search.addActionListener(this);
		p1.add(search);
		
		JLabel lblnbstc1=new JLabel("South Bengal State Transport Corporation(SBSTC)Bus Servicerd");   
		lblnbstc1.setBounds(150,10,650,25);
		lblnbstc1.setForeground(Color.BLUE);
		lblnbstc1.setFont(new Font("Thoma",Font.BOLD,20));
		p2.add(lblnbstc1);
		 
		JLabel lblbusdesti1=new JLabel("Bus Destiantions");   
		lblbusdesti1.setBounds(220,60,170,25);
		lblbusdesti1.setFont(new Font("Thoma",Font.BOLD,20));
		p2.add(lblbusdesti1);
		
		cdesti1=new Choice();
		cdesti1.setBounds(400,65,150,25);			
		// use try catch block 
		try
		{
			DButils c=new DButils();
			rs=c.s.executeQuery("select * from busdestination ");
			while(rs.next())
			{
				cdesti1.add(rs.getString("BusDestination"));
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
		p2.add(cdesti1);
		
		JLabel lblinformation1=new JLabel("-:INFORMATIONS:-");   
		lblinformation1.setBounds(50,100,220,35);
		lblinformation1.setForeground(Color.GREEN);
		lblinformation1.setFont(new Font("Thoma",Font.BOLD,25));
		p2.add(lblinformation1);
		
		JLabel lbltime1=new JLabel("Time");   
		lbltime1.setBounds(10,140,170,25);
		lbltime1.setForeground(Color.black);
		lbltime1.setFont(new Font("Thoma",Font.BOLD,20));
		p2.add(lbltime1);
		
		tf5=new JTextField();
		tf5.setBounds(150,140,150,25);
		p2.add(tf5);
		
		JLabel lblseat1=new JLabel("Seat Price");   
		lblseat1.setBounds(10,170,170,25);
		lblseat1.setForeground(Color.black);
		lblseat1.setFont(new Font("Thoma",Font.BOLD,20));
		p2.add(lblseat1);
		
		 tf6=new JTextField();
		tf6.setBounds(150,170,150,25);
		p2.add(tf6);
		
		JLabel lbltype1=new JLabel("AC/Non AC");   
		lbltype1.setBounds(10,200,170,25);
		lbltype1.setForeground(Color.black);
		lbltype1.setFont(new Font("Thoma",Font.BOLD,20));
		p2.add(lbltype1);
		
		 tf7=new JTextField();
		tf7.setBounds(150,200,150,25);
		p2.add(tf7);
		
		JLabel lblbuseat1=new JLabel("*Total 55 Seat Bus");   
		lblbuseat1.setBounds(10,235,190,20);
		lblbuseat1.setForeground(Color.PINK);
		lblbuseat1.setFont(new Font("Thoma",Font.BOLD,18));
		p2.add(lblbuseat1);
		
		JLabel lblavgdut1=new JLabel("Avg.Duration Time");   
		lblavgdut1.setBounds(10,320,150,25);
		lblavgdut1.setForeground(Color.black);
		lblavgdut1.setFont(new Font("Thoma",Font.BOLD,15));
		p2.add(lblavgdut1);
		
		tf8=new JTextField();
		tf8.setBounds(150,320,150,25);
		p2.add(tf8);
		
		JLabel lblDBS1=new JLabel("Daily Bus Services");   
		lblDBS1.setBounds(10,290,200,25);
		lblDBS1.setForeground(Color.PINK);
		lblDBS1.setFont(new Font("Thoma",Font.BOLD,20));
		p2.add(lblDBS1);
		
		search1=new JButton("Search Information");
		search1.setBounds(560,65,142,25);
		search1.setBackground(Color.BLACK);
		search1.setForeground(Color.WHITE);
		search1.addActionListener(this);
		p2.add(search1);
		
		JLabel lblnbstc2=new JLabel("West Bengal Transportation Corporation(CTC) Bus Service");   
		lblnbstc2.setBounds(190,10,600,25);
		lblnbstc2.setForeground(Color.BLUE);
		lblnbstc2.setFont(new Font("Thoma",Font.BOLD,20));
		p3.add(lblnbstc2);
		 
		JLabel lblbusdesti2=new JLabel("Bus Destiantions");   
		lblbusdesti2.setBounds(230,60,170,25);
		lblbusdesti2.setFont(new Font("Thoma",Font.BOLD,20));
		p3.add(lblbusdesti2);
		
		cdesti2=new Choice();
		cdesti2.setBounds(410,65,150,25);			
		// use try catch block 
		try
		{
			DButils c=new DButils();
			rs=c.s.executeQuery("select * from wbtcbusdestination ");
			while(rs.next())
			{
				cdesti2.add(rs.getString("Busdestination"));
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
		p3.add(cdesti2);
		
		JLabel lblinformation2=new JLabel("-:INFORMATIONS:-");   
		lblinformation2.setBounds(50,100,220,35);
		lblinformation2.setForeground(Color.GREEN);
		lblinformation2.setFont(new Font("Thoma",Font.BOLD,25));
		p3.add(lblinformation2);
		
		JLabel lbltime2=new JLabel("Time");   
		lbltime2.setBounds(10,140,170,25);
		lbltime2.setForeground(Color.black);
		lbltime2.setFont(new Font("Thoma",Font.BOLD,20));
		p3.add(lbltime2);
		
		tf9=new JTextField();
		tf9.setBounds(150,140,150,25);
		p3.add(tf9);
		
		JLabel lblseat2=new JLabel("Seat Price");   
		lblseat2.setBounds(10,170,170,25);
		lblseat2.setForeground(Color.black);
		lblseat2.setFont(new Font("Thoma",Font.BOLD,20));
		p3.add(lblseat2);
		
		 tf10=new JTextField();
		tf10.setBounds(150,170,150,25);
		p3.add(tf10);
		
		JLabel lbltype2=new JLabel("AC/Non AC");   
		lbltype2.setBounds(10,200,170,25);
		lbltype2.setForeground(Color.black);
		lbltype2.setFont(new Font("Thoma",Font.BOLD,20));
		p3.add(lbltype2);
		
		 tf11=new JTextField();
		tf11.setBounds(150,200,150,25);
		p3.add(tf11);
		
		JLabel lblbuseat2=new JLabel("*Total 55 Seat Bus");   
		lblbuseat2.setBounds(10,235,190,20);
		lblbuseat2.setForeground(Color.PINK);
		lblbuseat2.setFont(new Font("Thoma",Font.BOLD,18));
		p3.add(lblbuseat2);
		
		JLabel lblavgdut2=new JLabel("Avg.Duration Time");   
		lblavgdut2.setBounds(10,320,150,25);
		lblavgdut2.setForeground(Color.black);
		lblavgdut2.setFont(new Font("Thoma",Font.BOLD,15));
		p3.add(lblavgdut2);
		
		tf12=new JTextField();
		tf12.setBounds(150,320,150,25);
		p3.add(tf12);
		
		JLabel lblDBS2=new JLabel("Daily Bus Services");   
		lblDBS2.setBounds(10,290,200,25);
		lblDBS2.setForeground(Color.PINK);
		lblDBS2.setFont(new Font("Thoma",Font.BOLD,20));
		p3.add(lblDBS2);
		
		search2=new JButton("Search Information");
		search2.setBounds(565,65,142,25);
		search2.setBackground(Color.BLACK);
		search2.setForeground(Color.WHITE);
		search2.addActionListener(this);
		p3.add(search2);
		
			
		JLabel lbelseat=new JLabel("Seat No");
		lbelseat.setFont(new Font("Tahoma",Font.BOLD,20));
		lbelseat.setBounds(10,260,200,25);
		p1.add(lbelseat);
		
		seat=new JTextField("");
		seat.setBounds(150,260,150,25);
		p1.add(seat);
		JLabel lbelseat1=new JLabel("Seat No");
		lbelseat1.setFont(new Font("Tahoma",Font.BOLD,20));
		lbelseat1.setBounds(10,260,200,25);
		p2.add(lbelseat1);
		
		seat1=new JTextField("");
		seat1.setBounds(150,260,150,25);
		p2.add(seat1);
		JLabel lbelseat2=new JLabel("Seat No");
		lbelseat2.setFont(new Font("Tahoma",Font.BOLD,20));
		lbelseat2.setBounds(10,260,200,25);
		p3.add(lbelseat2);
		
		seat2=new JTextField("");
		seat2.setBounds(150,260,150,25);
		p3.add(seat2);

		
		
		Checkseat=new JButton ("Checkseat");
		Checkseat.setBackground(Color.BLACK);
		Checkseat.setForeground(Color.WHITE);
		Checkseat.setBounds(310,260,95,25);
		Checkseat.addActionListener(this);
		p1.add(Checkseat);
		
		
		Checkseat1=new JButton ("Checkseat");
		Checkseat1.setBackground(Color.BLACK);
		Checkseat1.setForeground(Color.WHITE);
		Checkseat1.setBounds(310,260,95,25);
		Checkseat1.addActionListener(this);
		p2.add(Checkseat1);
		
		Checkseat2=new JButton ("Checkseat");
		Checkseat2.setBackground(Color.BLACK);
		Checkseat2.setForeground(Color.WHITE);
		Checkseat2.setBounds(310,260,95,25);
		Checkseat2.addActionListener(this);
		p3.add(Checkseat2);
		setVisible(true);
		
		booked=new JButton("Booked Now");
		booked.setBounds(175,380,125,25);
		booked.setBackground(Color.GREEN);
		booked.setForeground(Color.black);
		booked.addActionListener(this);
		p1.add(booked);
		
		booked1=new JButton("Booked Now");
		booked1.setBounds(175,380,125,25);
		booked1.setBackground(Color.GREEN);
		booked1.setForeground(Color.black);
		booked1.addActionListener(this);
		p2.add(booked1);
		
		booked2=new JButton("Booked Now");
		booked2.setBounds(175,380,125,25);
		booked2.setBackground(Color.GREEN);
		booked2.setForeground(Color.black);
		booked2.addActionListener(this);
		p3.add(booked2);
		
		back=new JButton("Back");
		back.setBounds(35,380,70,25);
		back.setBackground(Color.black);
		back.setForeground(Color.white);
		back.addActionListener(this);
		p1.add(back);
		back1=new JButton("Back");
		back1.setBounds(35,380,70,25);
		back1.setBackground(Color.black);
		back1.setForeground(Color.white);
		back1.addActionListener(this);
		p2.add(back1);
		back2=new JButton("Back");
		back2.setBounds(35,380,70,25);
		back2.setBackground(Color.black);
		back2.setForeground(Color.white);
		back2.addActionListener(this);
		p3.add(back2);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/WBTC.jpeg"));
		//to scale image
		Image i2=i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image =new JLabel(i3);
		image.setBounds(410,150,200,200);
		p3.add(image);
		
		ImageIcon i11=new ImageIcon(ClassLoader.getSystemResource("icons/wbtc2.jpeg"));
		//to scale image
		Image i21=i11.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
		ImageIcon i31=new ImageIcon(i21);
		JLabel image1 =new JLabel(i31);
		image1.setBounds(650,155,200,200);
		p3.add(image1);
		
		ImageIcon j1=new ImageIcon(ClassLoader.getSystemResource("icons/SBSTC.jpg"));
		//to scale image
		Image j2=j1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
		ImageIcon j3=new ImageIcon(j2);
		JLabel imagej =new JLabel(j3);
		imagej.setBounds(410,120,200,200);
		p2.add(imagej);
		
		ImageIcon j11=new ImageIcon(ClassLoader.getSystemResource("icons/sbstc1.png"));
		//to scale image
		Image j21=j11.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
		ImageIcon j31=new ImageIcon(j21);
		JLabel image1j =new JLabel(j31);
		image1j.setBounds(650,125,200,200);
		p2.add(image1j);
		
		ImageIcon k1=new ImageIcon(ClassLoader.getSystemResource("icons/NBSTC.jpeg"));
		//to scale image
		Image k2=k1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
		ImageIcon k3=new ImageIcon(k2);
		JLabel imagek =new JLabel(k3);
		imagek.setBounds(410,120,200,200);
		p1.add(imagek);
		
		ImageIcon k11=new ImageIcon(ClassLoader.getSystemResource("icons/NBSTC1.jpeg"));
		//to scale image
		Image k21=k11.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
		ImageIcon k31=new ImageIcon(k21);
		JLabel image1k =new JLabel(k31);
		image1k.setBounds(650,120,200,200);
		p1.add(image1k);
				
		
		
	}

	
	public static void main(String[] args) {
		
		new Checkbusdetails("");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==search)
		{
			try {
				DButils c=new DButils();
				String query="select * from nbstcbusdestination where Busdestination='"+cdesti.getSelectedItem()+"'";
				rs=c.s.executeQuery(query);
				while(rs.next()) {
					//lbelusername.setText(rs.getString("username"));
					tf1.setText(rs.getString("timeing"));
					tf2.setText(rs.getString("Price"));
					tf3.setText(rs.getString("bustype"));
					tf4.setText(rs.getString("avgtime"));
				}
					
				}catch(Exception e1)
				{
					e1.printStackTrace();
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
		}else if(e.getSource()==search1)
		{
			try {
				DButils c=new DButils();
				String query="select * from busdestination where BusDestination='"+cdesti1.getSelectedItem()+"'";
				rs=c.s.executeQuery(query);
				while(rs.next()) {
					//lbelusername.setText(rs.getString("username"));
					tf5.setText(rs.getString("timeing"));
					tf6.setText(rs.getString("Price"));
					tf7.setText(rs.getString("bustype"));
					tf8.setText(rs.getString("avgtime"));
				}
					
				}catch(Exception e1)
				{
					e1.printStackTrace();
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
		}else if(e.getSource()==search2)
		{
			try {
				DButils c=new DButils();
				String query="select * from wbtcbusdestination where Busdestination='"+cdesti2.getSelectedItem()+"'";
				rs=c.s.executeQuery(query);
				while(rs.next()) {
					//lbelusername.setText(rs.getString("username"));
					tf9.setText(rs.getString("timeing"));
					tf10.setText(rs.getString("Price"));
					tf11.setText(rs.getString("bustype"));
					tf12.setText(rs.getString("avgtime"));
				}
					
				}catch(Exception e1)
				{
					e1.printStackTrace();
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
			
		}else if(e.getSource()==Checkseat)
		{
			if(Integer.parseInt(seat.getText())<56)
			{
				try {
					String Busname="NBSTC";
				
				String seatNo=seat.getText(); 
				String query="select * from seatbooked where busname='"+Busname+"' AND destination='"+cdesti.getSelectedItem()+"' AND seat_No='"+seatNo+"'";
				DButils c=new DButils();
				rs=c.s.executeQuery(query);
				// if 1 value match so we usedit if
				if(rs.next())// rs object told ia it full or null
				{
					JOptionPane.showMessageDialog(null, "Seat_No is allredy Boooked");
					seat.setText("");
				
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
				JOptionPane.showMessageDialog(null, "Seat_No is not exist");
				seat1.setText("");
			}
			
		}
		else if(e.getSource()==Checkseat1)
		{
			if(Integer.parseInt(seat1.getText())<56)
			{
				try {
					String Busname="SBSTC";
				
				String seatNo1=seat1.getText(); 
				String query="select * from seatbooked where busname='"+Busname+"' AND destination='"+cdesti1.getSelectedItem()+"' AND seat_No='"+seatNo1+"'";
				DButils c=new DButils();
				rs=c.s.executeQuery(query);
				// if 1 value match so we usedit if
				if(rs.next())// rs object told ia it full or null
				{
					JOptionPane.showMessageDialog(null, "Seat_No is allredy Boooked");
					seat1.setText("");
				
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
				JOptionPane.showMessageDialog(null, "Seat_No is not exist");
				seat.setText("");
			}
			
		}else if(e.getSource()==Checkseat2)
		{
			if(Integer.parseInt(seat2.getText())<56)
			{
				try {
					String Busname="WBTC";
				
				String seatNo=seat.getText(); 
				String query="select * from seatbooked where busname='"+Busname+"' AND destination='"+cdesti.getSelectedItem()+"' AND seat_No='"+seatNo+"'";
				DButils c=new DButils();
				rs=c.s.executeQuery(query);
				// if 1 value match so we usedit if
				if(rs.next())// rs object told ia it full or null
				{
					JOptionPane.showMessageDialog(null, "Seat_No is allredy Boooked");
					seat2.setText("");
				
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
				JOptionPane.showMessageDialog(null, "Seat_No is not exist");
				seat2.setText("");
			}
			
		}else if(e.getSource()==booked)
		{
			 if(!tf1.getText().isEmpty()&&!tf2.getText().isEmpty()&&!tf3.getText().isEmpty()&&!tf4.getText().isEmpty())
			 {
			String bustype="NBSTC";
			String person="1";
			setVisible(false);
			new SeatSelectionPrices(nusername,bustype,cdesti.getSelectedItem(),tf1.getText(),tf2.getText(),tf3.getText(),tf4.getText(),person);
			 }else
			 {
				 JOptionPane.showMessageDialog(null, "Please Search ALL Information");
			 }
			
		}else if(e.getSource()==booked1)
		{
			if(!tf5.getText().isEmpty()&&!tf6.getText().isEmpty()&&!tf7.getText().isEmpty()&&!tf8.getText().isEmpty())
			 {
			String bustype="SBSTC";
			String person="1";
			setVisible(false);
			new SeatSelectionPrices(nusername,bustype,cdesti1.getSelectedItem(),tf5.getText(),tf6.getText(),tf7.getText(),tf8.getText(),person);
			 }else
			 {
				 JOptionPane.showMessageDialog(null, "Please Search ALL Information");
			 }
			
		}else if(e.getSource()==booked2)
		{
			if(!tf9.getText().isEmpty()&&!tf10.getText().isEmpty()&&!tf11.getText().isEmpty()&&!tf12.getText().isEmpty())
			 {
			String bustype="WBTC";
			String person="1";
			setVisible(false);
			new SeatSelectionPrices(nusername,bustype,cdesti2.getSelectedItem(),tf9.getText(),tf10.getText(),tf11.getText(),tf12.getText(),person);
			 }else
			 {
				 JOptionPane.showMessageDialog(null, "Please Search ALL Information");
			 }
		}else if(e.getSource()==back)
		{
			setVisible(false);
		}
		else if(e.getSource()==back1)
		{
			setVisible(false);
		}else if(e.getSource()==back2)
		{
			setVisible(false);
		}
		
	}

}
