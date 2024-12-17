package application;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Viewdatetickit extends JFrame implements ActionListener{

	Choice cdate;
	JButton check,back;
	ResultSet rs;
	String pusername,date1,date2,ptickitno1,ptickitno2,ptickitno3,ptickitno4,ptickitno5;
	JRadioButton r1,r2,r3,r4,r5;
	Calendar calendar;
	
	Viewdatetickit(String nusername)
	{
		this.pusername=nusername;
		setTitle("View Tickit");
		setBounds(450,200,600,360);
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel text=new JLabel("View Tickit");
		text.setBounds(200,10,500,30);
		text.setFont(new Font("Tahoma",Font.BOLD,25));
		text.setForeground(Color.BLUE);
		add(text);	
		
		JLabel text1=new JLabel("Select Date");
		text1.setBounds(120,90,140,30);
		text1.setFont(new Font("Tahoma",Font.BOLD,20));
		text1.setForeground(Color.BLACK);
		add(text1);	
		
		// Date choice dropdown
        cdate = new Choice();
        
        // Add current date as the first option
         calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
     // Add previous date as the first option
        calendar.add(Calendar.DATE, -1);
        String previousDate = sdf.format(calendar.getTime());
        cdate.add(previousDate);
        
        calendar.add(Calendar.DATE, 1);
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
        cdate.setBounds(260, 90, 150, 25);
        add(cdate);
       
		
		
		JLabel lblgender=new JLabel("Tickit No");
		lblgender.setBounds(55,140,100,25);
		lblgender.setFont(new Font("Thoma",Font.BOLD,20));
		add(lblgender);
		//Create Radio Button
		r1=new 	JRadioButton("1st");
		r1.setBounds(150,140,60,25);
		r1.setBackground(Color.LIGHT_GRAY);
		r1.setFont(new Font("Thoma",Font.BOLD,20));
		add(r1);
		r2=new 	JRadioButton("2nd");
		r2.setBounds(220,140,80,25);
		r2.setBackground(Color.LIGHT_GRAY);
		r2.setFont(new Font("Thoma",Font.BOLD,20));
		add(r2);
		r3=new 	JRadioButton("3rd");
		r3.setBounds(310,140,70,25);
		r3.setBackground(Color.LIGHT_GRAY);
		r3.setFont(new Font("Thoma",Font.BOLD,20));
		add(r3);
		r4=new 	JRadioButton("4th");
		r4.setBounds(390,140,70,25);
		r4.setBackground(Color.LIGHT_GRAY);
		r4.setFont(new Font("Thoma",Font.BOLD,20));
		add(r4);
		r5=new 	JRadioButton("5th");
		r5.setBounds(470,140,70,25);
		r5.setBackground(Color.LIGHT_GRAY);
		r5.setFont(new Font("Thoma",Font.BOLD,20));
		add(r5);
		
		
		//to choice one option
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		bg.add(r4);
		bg.add(r5);
		
		check=new JButton ("Check Tickit");
		check.setBackground(Color.GREEN);
		check.setForeground(Color.BLACK);
		check.setBounds(160,220,105,25);
		check.addActionListener(this);
		add(check);
		
		back=new JButton ("Back");
		back.setBackground(Color.BLACK);
		back.setForeground(Color.WHITE);
		back.setBounds(290,220,70,25);
		back.addActionListener(this);
		add(back);
		
//		try {
//			DButils c=new DButils();
//			
//			String query2="delete from account where username='"+"subha23"+"' ";
//			c.s.executeUpdate(query2);
//			String query23="delete from u_d_t_p_per where username='"+"subha1234"+"' ";
//			c.s.executeUpdate(query23);
//			String query25="delete from seatbooked where username='"+"subha1234"+"' ";
//			c.s.executeUpdate(query25);
			//c.s.executeUpdate(query2);
//			
//		}catch(Exception e)
//		{
//			e.printStackTrace();
//		}
		
		
		setVisible(true);
	}
	public static void main(String[] args) {
		
		new Viewdatetickit("");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==check)
		{
			try
			{
				
				DButils c=new DButils();
				if(r1.isSelected())
				{
					 ptickitno1="1";
//					if(cdate.getSelectedItem()=="Today")
//					{
//						date1="Today";
//						String query1="select * from u_d_t_p_per where username='"+pusername+"' AND  d_ate='"+date1+"' AND tickitno='"+ptickitno1+"' ";
//						rs=c.s.executeQuery(query1);		
//						if(rs.isBeforeFirst())
//						{ 
//							new ViewTickit(pusername,date1,ptickitno1);
//						}
//						else
//						{
//							JOptionPane.showMessageDialog(null,"No tickit Booked");
//						}
//						
//					}else
//					{
//						date2="Tomorrow";
//						String query1="select * from u_d_t_p_per where username='"+pusername+"' AND  d_ate='"+date2+"' AND tickitno='"+ptickitno1+"' ";
//						rs=c.s.executeQuery(query1);		
//						if(rs.isBeforeFirst())
//						{ 
//							new ViewTickit(pusername,date2,ptickitno1);
//						}
//						else
//						{
//							JOptionPane.showMessageDialog(null,"No tickit Booked");
//						}
					
					 	String query1="select * from u_d_t_p_per where username='"+pusername+"' AND  d_ate='"+cdate.getSelectedItem()+"' AND tickitno='"+ptickitno1+"' ";
						rs=c.s.executeQuery(query1);		
						if(rs.isBeforeFirst())
						{ 
							new ViewTickit(pusername,cdate.getSelectedItem(),ptickitno1);
						}
						else
						{
							JOptionPane.showMessageDialog(null,"No tickit Booked");
						}
		
//					}
				}else if(r2.isSelected())
				{
					ptickitno2="2";
//					if(cdate.getSelectedItem()=="Today")
//					{
//						date1="Today";
//						String query1="select * from u_d_t_p_per where username='"+pusername+"' AND  d_ate='"+date1+"' AND tickitno='"+ptickitno2+"' ";
//						rs=c.s.executeQuery(query1);		
//						if(rs.isBeforeFirst())
//						{ 
//							new ViewTickit(pusername,date1,ptickitno2);
//						}
//						else
//						{
//							JOptionPane.showMessageDialog(null,"No tickit Booked");
//						}
//						
//					}else
//					{
//						date2="Tomorrow";
//						String query1="select * from u_d_t_p_per where username='"+pusername+"' AND  d_ate='"+date2+"' AND tickitno='"+ptickitno2+"' ";
//						rs=c.s.executeQuery(query1);		
//						if(rs.isBeforeFirst())
//						{ 
//							new ViewTickit(pusername,date2,ptickitno2);
//						}
//						else
//						{
//							JOptionPane.showMessageDialog(null,"No tickit Booked");
//						}
//					
//		
//					}
					String query1="select * from u_d_t_p_per where username='"+pusername+"' AND  d_ate='"+cdate.getSelectedItem()+"' AND tickitno='"+ptickitno2+"' ";
					rs=c.s.executeQuery(query1);		
					if(rs.isBeforeFirst())
					{ 
						new ViewTickit(pusername,cdate.getSelectedItem(),ptickitno2);
					}
					else
					{
						JOptionPane.showMessageDialog(null,"No tickit Booked");
					}
					
					
				}else if(r3.isSelected())
				{
					 ptickitno3="3";
//					 if(cdate.getSelectedItem()=="Today")
//						{
//							date1="Today";
//							String query1="select * from u_d_t_p_per where username='"+pusername+"' AND  d_ate='"+date1+"' AND tickitno='"+ptickitno3+"' ";
//							rs=c.s.executeQuery(query1);		
//							if(rs.isBeforeFirst())
//							{ 
//								new ViewTickit(pusername,date1,ptickitno3);
//							}
//							else
//							{
//								JOptionPane.showMessageDialog(null,"No tickit Booked");
//							}
//							
//						}else
//						{
//							date2="Tomorrow";
//							String query1="select * from u_d_t_p_per where username='"+pusername+"' AND  d_ate='"+date2+"' AND tickitno='"+ptickitno3+"' ";
//							rs=c.s.executeQuery(query1);		
//							if(rs.isBeforeFirst())
//							{ 
//								new ViewTickit(pusername,date2,ptickitno3);
//							}
//							else
//							{
//								JOptionPane.showMessageDialog(null,"No tickit Booked");
//							}
//						
//			
//						}
					 	String query1="select * from u_d_t_p_per where username='"+pusername+"' AND  d_ate='"+cdate.getSelectedItem()+"' AND tickitno='"+ptickitno3+"' ";
						rs=c.s.executeQuery(query1);		
						if(rs.isBeforeFirst())
						{ 
							new ViewTickit(pusername,cdate.getSelectedItem(),ptickitno3);
						}
						else
						{
							JOptionPane.showMessageDialog(null,"No tickit Booked");
						}
				}else if(r4.isSelected())
				{
					 ptickitno4="4";
					 
//					 if(cdate.getSelectedItem()=="Today")
//						{
//							date1="Today";
//							String query1="select * from u_d_t_p_per where username='"+pusername+"' AND  d_ate='"+date1+"' AND tickitno='"+ptickitno4+"' ";
//							rs=c.s.executeQuery(query1);		
//							if(rs.isBeforeFirst())
//							{ 
//								new ViewTickit(pusername,date1,ptickitno4);
//							}
//							else
//							{
//								JOptionPane.showMessageDialog(null,"No tickit Booked");
//							}
//							
//						}else
//						{
//							date2="Tomorrow";
//							String query1="select * from u_d_t_p_per where username='"+pusername+"' AND  d_ate='"+date2+"' AND tickitno='"+ptickitno4+"' ";
//							rs=c.s.executeQuery(query1);		
//							if(rs.isBeforeFirst())
//							{ 
//								new ViewTickit(pusername,date2,ptickitno4);
//							}
//							else
//							{
//								JOptionPane.showMessageDialog(null,"No tickit Booked");
//							}
//						
//			
//						}
					 
					 	String query1="select * from u_d_t_p_per where username='"+pusername+"' AND  d_ate='"+cdate.getSelectedItem()+"' AND tickitno='"+ptickitno4+"' ";
						rs=c.s.executeQuery(query1);		
						if(rs.isBeforeFirst())
						{ 
							new ViewTickit(pusername,cdate.getSelectedItem(),ptickitno4);
						}
						else
						{
							JOptionPane.showMessageDialog(null,"No tickit Booked");
						}
				}else if(r5.isSelected())
				{
					ptickitno5="5";
//					if(cdate.getSelectedItem()=="Today")
//					{
//						date1="Today";
//						String query1="select * from u_d_t_p_per where username='"+pusername+"' AND  d_ate='"+date1+"' AND tickitno='"+ptickitno5+"' ";
//						rs=c.s.executeQuery(query1);		
//						if(rs.isBeforeFirst())
//						{ 
//							new ViewTickit(pusername,date1,ptickitno5);
//						}
//						else
//						{
//							JOptionPane.showMessageDialog(null,"No tickit Booked");
//						}
//						
//					}else
//					{
//						date2="Tomorrow";
//						String query1="select * from u_d_t_p_per where username='"+pusername+"' AND  d_ate='"+date2+"' AND tickitno='"+ptickitno5+"' ";
//						rs=c.s.executeQuery(query1);		
//						if(rs.isBeforeFirst())
//						{ 
//							new ViewTickit(pusername,date2,ptickitno5);
//						}
//						else
//						{
//							JOptionPane.showMessageDialog(null,"No tickit Booked");
//						}
//					
//		
//					}
//				} 
				//String tick=Integer.toString(ptickitno);
//				String query1="select * from u_d_t_p_per where username='"+pusername+"' AND  d_ate='"+"Today"+"' AND tickitno='"+"1"+"' ";
//				rs=c.s.executeQuery(query1);		
//				if(rs.isBeforeFirst())
//				{ 
//					new ViewTickit(pusername,"Today","1");
//				}
//				else
//				{
//					JOptionPane.showMessageDialog(null,"No tickit Booked");
//				}
					
					String query1="select * from u_d_t_p_per where username='"+pusername+"' AND  d_ate='"+cdate.getSelectedItem()+"' AND tickitno='"+ptickitno5+"' ";
					rs=c.s.executeQuery(query1);		
					if(rs.isBeforeFirst())
					{ 
						new ViewTickit(pusername,cdate.getSelectedItem(),ptickitno5);
					}
					else
					{
						JOptionPane.showMessageDialog(null,"No tickit Booked");
					}
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
			setVisible(false);
		}
		
	}

}
