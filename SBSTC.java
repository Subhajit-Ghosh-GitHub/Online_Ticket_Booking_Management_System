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
import javax.swing.JTextField;

import com.mysql.cj.protocol.Resultset;

public class SBSTC extends JFrame implements ActionListener{


	Choice cdesti;
	ResultSet rs;
	JButton search,booked,back;
	JTextField tf1,tf2,tf3,tf4;
	String username;
	SBSTC(String nusername)
	{
		this.username=nusername;
		
		setTitle("SBSTC Bus Services");
		setBounds(350,200,900,460);
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		//alter table nbstcbusdestination add column avgtime varchar(30);
//		try {
//			DButils c=new DButils();
//			String s="2 hrs 40 mins";
//			//String query1="UPDATE seatbooked SET username='subha1234' where seatNo=10";
//			//String query2="delete from nbstcbusdestination where avgtime='"+s+"' ";
//			//c.s.executeUpdate(query1);
//			String q1="delete  from u_d_t_p_per where Price=90";
//			//c.s.executeQuery(q1);
//			c.s.executeUpdate(q1);
//			
//		}catch(Exception e)
//		{
//			e.printStackTrace();
//		}
		
		
	    JLabel lblnbstc=new JLabel("South Bengal State Transport Corporation(SBSTC)Bus Services");   
		lblnbstc.setBounds(150,10,650,25);
		lblnbstc.setForeground(Color.BLUE);
		lblnbstc.setFont(new Font("Thoma",Font.BOLD,20));
		add(lblnbstc);
		 
		JLabel lblbusdesti=new JLabel("Bus Destiantions");   
		lblbusdesti.setBounds(220,60,170,25);
		lblbusdesti.setFont(new Font("Thoma",Font.BOLD,20));
		add(lblbusdesti);
		
		cdesti=new Choice();
		cdesti.setBounds(400,65,150,25);			
		// use try catch block 
		try
		{
			DButils c=new DButils();
			rs=c.s.executeQuery("select * from busdestination ");
			while(rs.next())
			{
				cdesti.add(rs.getString("BusDestination"));
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
		add(cdesti);
		
		JLabel lblinformation=new JLabel("-:INFORMATION:-");   
		lblinformation.setBounds(50,100,220,35);
		lblinformation.setForeground(Color.GREEN);
		lblinformation.setFont(new Font("Thoma",Font.BOLD,25));
		add(lblinformation);
		
		JLabel lbltime=new JLabel("Time");   
		lbltime.setBounds(10,140,170,25);
		lbltime.setForeground(Color.black);
		lbltime.setFont(new Font("Thoma",Font.BOLD,20));
		add(lbltime);
		
		tf1=new JTextField();
		tf1.setBounds(150,140,150,25);
		add(tf1);
		
		JLabel lblseat=new JLabel("Seat Price");   
		lblseat.setBounds(10,170,170,25);
		lblseat.setForeground(Color.black);
		lblseat.setFont(new Font("Thoma",Font.BOLD,20));
		add(lblseat);
		
		 tf2=new JTextField();
		tf2.setBounds(150,170,150,25);
		add(tf2);
		
		JLabel lbltype=new JLabel("AC/Non AC");   
		lbltype.setBounds(10,200,170,25);
		lbltype.setForeground(Color.black);
		lbltype.setFont(new Font("Thoma",Font.BOLD,20));
		add(lbltype);
		
		 tf3=new JTextField();
		tf3.setBounds(150,200,150,25);
		add(tf3);
		
		JLabel lblbuseat=new JLabel("*Total 55 Seat Bus");   
		lblbuseat.setBounds(10,235,190,20);
		lblbuseat.setForeground(Color.PINK);
		lblbuseat.setFont(new Font("Thoma",Font.BOLD,18));
		add(lblbuseat);
		
		JLabel lblavgdut=new JLabel("Avg.Duration Time");   
		lblavgdut.setBounds(10,260,200,25);
		lblavgdut.setForeground(Color.black);
		lblavgdut.setFont(new Font("Thoma",Font.BOLD,15));
		add(lblavgdut);
		
		tf4=new JTextField();
		tf4.setBounds(150,260,150,25);
		add(tf4);
		
		JLabel lblDBS=new JLabel("Daily Bus Services");   
		lblDBS.setBounds(10,290,200,25);
		lblDBS.setForeground(Color.PINK);
		lblDBS.setFont(new Font("Thoma",Font.BOLD,20));
		add(lblDBS);
		
		search=new JButton("Search Information");
		search.setBounds(560,65,142,25);
		search.setBackground(Color.BLACK);
		search.setForeground(Color.WHITE);
		search.addActionListener(this);
		add(search);
	
		booked=new JButton("Booked Now");
		booked.setBounds(150,350,125,25);
		booked.setBackground(Color.GREEN);
		booked.setForeground(Color.black);
		booked.addActionListener(this);
		add(booked);
		
		back=new JButton("Back");
		back.setBounds(35,350,70,25);
		back.setBackground(Color.black);
		back.setForeground(Color.white);
		back.addActionListener(this);
		add(back);
		
		
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/SBSTC.jpg"));
		//to scale image
		Image i2=i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image =new JLabel(i3);
		image.setBounds(380,120,200,200);
		add(image);
		
		ImageIcon i11=new ImageIcon(ClassLoader.getSystemResource("icons/sbstc1.png"));
		//to scale image
		Image i21=i11.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
		ImageIcon i31=new ImageIcon(i21);
		JLabel image1 =new JLabel(i31);
		image1.setBounds(630,125,200,200);
		add(image1);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new SBSTC("");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==search)
		{
			try {
				DButils c=new DButils();
				String query="select * from busdestination where BusDestination='"+cdesti.getSelectedItem()+"'";
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
		}else if(e.getSource()==booked)
		{
			if(!tf1.getText().isEmpty()&&!tf2.getText().isEmpty()&&!tf3.getText().isEmpty()&&!tf4.getText().isEmpty())
			 {
				String bustype="SBSTC";
				String person="1";
				setVisible(false);
				new SeatSelectionPrices(username,bustype,cdesti.getSelectedItem(),tf1.getText(),tf2.getText(),tf3.getText(),tf4.getText(),person);
			 }else
			 {
				 JOptionPane.showMessageDialog(null, "Please Search ALL Information");
			 }
			
			
		}else if(e.getSource()==back)
		{
			setVisible(false);
		}
		
	}

}
