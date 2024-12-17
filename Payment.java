package application;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class Payment extends JFrame implements ActionListener{
	
	JButton pay, check,back;
	JLabel labelusername;
	String username;
	String pusername,date1,date2,ptickitno1,ptickitno2,ptickitno3,ptickitno4,ptickitno5;
	JRadioButton r1,r2,r3,r4,r5;
	 Payment(String Username)
	 {
		 this.username=Username;
		 setTitle("Payment");
		 setBounds(500,200,800,600);
		 setLayout(null);
			
			
		//Paybutton
			//username
			JLabel lblusername=new JLabel("Username");
			lblusername.setBounds(30,50,150,25);
			lblusername.setForeground(Color.BLACK);
			lblusername.setFont(new Font("Thoma",Font.BOLD,20));
			add(lblusername);
			
			// username

			labelusername=new JLabel(username);
			labelusername.setBounds(220,50,150,25);
			labelusername.setFont(new Font("Thoma",Font.BOLD,20));
			add(labelusername);
		 pay=new JButton("Pay");
		 pay.setBounds(420,0,80,40);
		 pay.addActionListener(this);
		add(pay);
		 
		 //Back Button
		 back=new JButton("Back");
		 back.setBounds(520,0,80,40);
		 back.addActionListener(this);
		 add(back);
		 
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
			
			check=new JButton ("Check Tickit price");
			check.setBackground(Color.GREEN);
			check.setForeground(Color.BLACK);
			check.setBounds(160,220,185,25);
			check.setFont(new Font("Thoma",Font.BOLD,16));
			check.addActionListener(this);
			add(check);
		 
		 
		 setVisible(true);
	 }
	
	
	
	
	
	

	public static void main(String[] args) {
		
		new  Payment("");
		
	}







	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==pay)
		{
			setVisible(false);
			new PaytmLink();
			
		}else
		{
			setVisible(false);
		}
		
	}

}
