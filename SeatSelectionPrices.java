package application;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;



public class SeatSelectionPrices extends JFrame  implements ActionListener{

 	Choice cdate,cfood;
 	
 	JLabel tfprice,tftime,tfdays,tfavgdurationt, tfbustype,cdesti,seat1;
 JTextField tftotal,tfperson;
 	String nusername,Bustype,destination,persons,ntime,nprice,ac_nac,navgtime,uperson;
 	JLabel lbelusername,lbelid,lbelnumber,lbelphone ;
 	JButton Checkseat,checkprice ,back, AddpersonsDFetails;
 	ResultSet rs;
 	 Calendar calendar; 
 	
 	SeatSelectionPrices(String username,String bustype,String DesTination,String time,String price,String ac_nonac,String avgtime,String person)
	{
 		this.nusername=username;
 		this.Bustype=bustype;
 		this.destination=DesTination;
 		this.ntime=time;
		this.nprice=price;
		this.ac_nac=ac_nonac;
		this.navgtime=avgtime;
		this.uperson=person;
		setTitle("ADD Persons details Check Seat And Prices");
		setBounds(150,100,1300,700);
		setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		
		
		JLabel text=new JLabel("Select Seat Section & Prices");
		text.setBounds(200,10,500,30);
		text.setFont(new Font("Tahoma",Font.BOLD,30));
		add(text);
		
	  // username
		
		JLabel lblusername = new JLabel("Username");
		lblusername.setFont(new Font("Tahoma",Font.BOLD,20));
		lblusername.setBounds(30,70,200,30);
		add( lblusername);
		
		// real username
		
		lbelusername=new JLabel(nusername);
		lbelusername.setFont(new Font("Thoma",Font.PLAIN,15));
		lbelusername.setForeground(Color.BLUE);
		lbelusername.setBounds(250,70,100,25);
		add( lbelusername);
		
		//Select destination
		JLabel lblpackage=new JLabel("Destination Selected");
		lblpackage.setFont(new Font("Tahoma",Font.BOLD,20));
		lblpackage.setBounds(30,110,220,25);
		add(lblpackage);
		
		cdesti=new JLabel(destination);
		cdesti.setFont(new Font("Thoma",Font.PLAIN,15));
		cdesti.setForeground(Color.BLUE);
		cdesti.setBounds(250,110,220,25);
			
		// use try catch block 
		
		add(cdesti);
			
		//Total person
		
		JLabel lblidnumber=new JLabel("Total Person");
		lblidnumber.setFont(new Font("Tahoma",Font.BOLD,20));
		lblidnumber.setBounds(30,310,150,25);
		add(lblidnumber);
				
		// Total person number
				
		tfperson=new JTextField(uperson);
		tfperson.setFont(new Font("Thoma",Font.PLAIN,15));
		tfperson.setForeground(Color.BLUE);
		tfperson.setBounds(250,310,150,25);
		add(tfperson);
		
		JLabel lblbusnum=new JLabel("Bus Name");
		lblbusnum.setFont(new Font("Tahoma",Font.BOLD,20));
		lblbusnum.setBounds(30,350,150,25);
		add(lblbusnum);
				
		// Total person number
				
		tfbustype=new JLabel(Bustype);
		tfbustype.setFont(new Font("Thoma",Font.PLAIN,15));
		tfbustype.setForeground(Color.BLUE);
		tfbustype.setBounds(250,350,150,25);
		add(tfbustype);
			
		
		//price per seat
		
		JLabel lblprice=new JLabel("Per Seat Price");
		lblprice.setFont(new Font("Tahoma",Font.BOLD,20));
		lblprice.setBounds(30,190,150,25);
		add(lblprice);
				
		//price per seat
		tfprice=new JLabel(nprice);
		tfprice.setFont(new Font("Thoma",Font.PLAIN,15));
		tfprice.setForeground(Color.BLUE);
		tfprice.setBounds(250,190,150,25);
		add(tfprice);	
		
		//ac or non ac
		
		JLabel lblac=new JLabel("Date");
		lblac.setFont(new Font("Tahoma",Font.BOLD,20));
		lblac.setBounds(30,230,150,25);
		add(lblac);
		
//		cdate=new Choice();
//		cdate.add("Today");
//		cdate.add("Tomorrow");
//		cdate.setBounds(250,230,150,20);
//		add(cdate);
		
		// Date choice dropdown
        cdate = new Choice();
        // Add current date as the first option
        calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String currentDate = sdf.format(calendar.getTime());
        cdate.add(currentDate);

        // Add tomorrow's date as the second option
        calendar.add(Calendar.DATE, 1);
        String tomorrowDate = sdf.format(calendar.getTime());
        cdate.add(tomorrowDate);
        
        calendar.add(Calendar.DATE, 1);
        String tomorrowDate1 = sdf.format(calendar.getTime());
        cdate.add(tomorrowDate1);
        cdate.setFont(new Font("Thoma",Font.PLAIN,15));
        cdate.setBounds(250, 230, 150, 25);
        add(cdate);
		
		//seat no 1
		JLabel lblfood=new JLabel("AC/Non AC");
		lblfood.setFont(new Font("Tahoma",Font.BOLD,20));
		lblfood.setBounds(30,270,150,25);
		add(lblfood);
		
		seat1=new JLabel(ac_nac);
		seat1.setBounds(250,270,150,25);
		seat1.setFont(new Font("Thoma",Font.PLAIN,15));
		seat1.setForeground(Color.BLUE);
		add(seat1);
		
		//time
		
		JLabel lbltime=new JLabel("Bus Time");
		 lbltime.setFont(new Font("Tahoma",Font.BOLD,20));
		 lbltime.setBounds(30,150,150,25);
		add( lbltime);
				
		// time
		tftime=new JLabel(ntime);
		tftime.setFont(new Font("Thoma",Font.PLAIN,15));
		tftime.setForeground(Color.BLUE);
		tftime.setBounds(250,150,150,25);
		add(tftime);		
		
		
		AddpersonsDFetails=new JButton ("Add Persons & Booked Ticket");
		AddpersonsDFetails.setBackground(Color.GREEN);
		AddpersonsDFetails.setForeground(Color.WHITE);
		AddpersonsDFetails.setBounds(350,490,260,32);
		AddpersonsDFetails.setFont(new Font("Tahoma",Font.BOLD,15));
		AddpersonsDFetails.addActionListener(this);
		add(AddpersonsDFetails);
		
		//Avg Duration time
		
		JLabel lblphone=new JLabel("Avg Duration time");
		lblphone.setFont(new Font("Tahoma",Font.BOLD,20));
		lblphone.setBounds(30,390,250,25);
		add(lblphone);
				
		// Avg Duration time print
				
		tfavgdurationt=new JLabel(navgtime);
		tfavgdurationt.setBounds(250,390,200,25);
		tfavgdurationt.setFont(new Font("Thoma",Font.PLAIN,15));
		tfavgdurationt.setForeground(Color.BLUE);
		add(tfavgdurationt);
		
		//Total Price
		JLabel lbltotal=new JLabel("Total Price");
		lbltotal.setFont(new Font("Tahoma",Font.BOLD,20));
		lbltotal.setBounds(30,430,150,25);
		add(lbltotal);
				
		// Total price print
				
		tftotal=new JTextField();
		 tftotal.setBounds(250,430,200,25);
		 tftotal.setFont(new Font("Tahoma",Font.BOLD,15));
		 tftotal.setForeground(Color.BLUE);
		add( tftotal);
		
		
		checkprice=new JButton ("Check Price");
		checkprice.setBackground(Color.BLACK);
		checkprice.setForeground(Color.WHITE);
		checkprice.setBounds(50,490,120,25);
		checkprice.addActionListener(this);
		add(checkprice);
		
		
		back=new JButton ("Back");
		back.setBackground(Color.LIGHT_GRAY);
		back.setForeground(Color.BLACK);
		back.setBounds(210,490,100,25);
		back.addActionListener(this);
		add(back);
				
		
		 ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/SEATARRANGEMENT.jpg"));
			//to scale image
			Image i2=i1.getImage().getScaledInstance(350, 600, Image.SCALE_DEFAULT);
			ImageIcon i3=new ImageIcon(i2);
			JLabel image =new JLabel(i3);
			image.setBounds(690,25,350,600);
			add(image);
		
	
		setVisible(true);
	}
	

	public static void main(String[] args) {
		
		new SeatSelectionPrices("","","","","","","","");
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==checkprice)
		{
					
					int persons=Integer.parseInt(tfperson.getText());
								
					if(persons <9)
					{
						int total=0;
						//total+=acselected.equals("AC")? ac:0;
						//total+=foodselected.equals("Yes")?food:0;
						total+=Integer.parseInt(tfprice.getText());
						total=total*persons;
						tftotal.setText("Rs "+total);
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Maximum 8 members Can Booked seat from one User");
						tfperson.setText("");
					}
				
			
		}else if(e.getSource()==back)
		{
			
			JOptionPane.showMessageDialog(null, "Your tickit book is not Completed ");
			setVisible(false); 
			
			
		}
		 else if(e.getSource()==AddpersonsDFetails)
		{
			if(!tfperson.getText().isEmpty()&&!tftotal.getText().isEmpty()&&!tfprice.getText().isEmpty())
			{
				try {
					DButils c=new DButils();
					String query="select * from u_d_t_p_per where username='"+nusername+"' AND Busdestination='"+cdesti.getText()+"' AND Timeing='"+tftime.getText()+"' AND bustype= '"+Bustype+"' AND d_ate='"+cdate.getSelectedItem()+"'";
					String query1="select * from u_d_t_p_per where username='"+nusername+"' AND  d_ate='"+cdate.getSelectedItem()+"' AND tickitno='"+"5"+"' ";
					rs=c.s.executeQuery(query1);		
					if(rs.isBeforeFirst())
					{
						JOptionPane.showMessageDialog(null,"You Can Booked maximum 5 tickit in a Day " );
						
						
					}else
					{
						rs=c.s.executeQuery(query);		
						if(rs.isBeforeFirst())
						{
							JOptionPane.showMessageDialog(null,"you have allredy Booked tickit on this Destination if you add persons or Edit Something,Go to View Tickit Cancel it And egain Booked it" );
						}
						else
						{
							int ppersons=Integer.parseInt(tfperson.getText());
						
							if(ppersons <9)
							{
								int total=0;
							//total+=acselected.equals("AC")? ac:0;
							//total+=foodselected.equals("Yes")?food:0;
								total+=Integer.parseInt(tfprice.getText());
								total=total*ppersons;
								tftotal.setText("Rs "+total);
							}
							else
							{
								JOptionPane.showMessageDialog(null, "Maximum 8 members Can Booked seat from one User");
								tfperson.setText("");
							}
							String totalprice=tftotal.getText();
							this.persons=tfperson.getText();
							setVisible(false);
							new AddPersonsDetails(nusername,persons,cdesti.getText(),cdate.getSelectedItem(),Bustype,ntime,nprice,ac_nac,navgtime,totalprice);
						}
					}
				}catch(Exception e1)
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
			}else
			{
				JOptionPane.showMessageDialog(null, "Please Filled Up Total Persons or check total price");
			}
		}		
		else
		{
			setVisible(false);
		}
		
	}

}

