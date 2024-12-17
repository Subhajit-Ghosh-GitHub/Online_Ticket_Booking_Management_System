package application;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CustomerSupport extends JFrame implements ActionListener {

	JButton Back;

	CustomerSupport()
	{
		setTitle("Customer Support");
		setBounds(150,100,900,500);
		setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		setVisible(true);
		
		JLabel service=new JLabel("Custmer Care & Health test Service");
		service.setFont(new Font("Thoma",Font.BOLD,20));
		service.setForeground(Color.BLUE);
		service.setBounds(250,10,700,25);
		add(service);
		
		JLabel service1=new JLabel("Wish you for Incredible,Safest and Comfortable journey With our Services.");
		service1.setFont(new Font("Thoma",Font.PLAIN,15));
		service1.setForeground(Color.black);
		service1.setBounds(10,50,700,25);
		add(service1);
		
		JLabel service11=new JLabel("If You Face any Problems Regarding Tickit not Show or Not find Destination or Tickit Price AnyOtherElse.");
		service11.setFont(new Font("Thoma",Font.PLAIN,15));
		service11.setForeground(Color.black);
		service11.setBounds(10,60,750,45);
		add(service11);
		JLabel service111=new JLabel("Please Contact With us or send Email in Below information.");
		service111.setFont(new Font("Thoma",Font.PLAIN,15));
		service111.setForeground(Color.black);
		service111.setBounds(10,80,700,45);
		add(service111);
		
		JLabel phoneno=new JLabel("Phone No:-  6295500141");
		phoneno.setFont(new Font("Thoma",Font.PLAIN,20));
		phoneno.setForeground(Color.BLUE);
		phoneno.setBounds(10,120,700,45);
		add(phoneno);
		JLabel email=new JLabel("Email:-      bittughosh166@gmail.com");
		email.setFont(new Font("Thoma",Font.PLAIN,20));
		email.setForeground(Color.BLUE);
		email.setBounds(10,150,700,25);
		add(email);
		
		JLabel service1111=new JLabel("When you traveling, if you face any Health problem then will Call our Best Senior Experience Doctor Dr.Parthib Mondal ");
		service1111.setFont(new Font("Thoma",Font.PLAIN,15));
		service1111.setForeground(Color.black);
		service1111.setBounds(10,180,800,25);
		add(service1111);
		
		JLabel service11111=new JLabel("he will advice you what you will do ");
		service11111.setFont(new Font("Thoma",Font.PLAIN,15));
		service11111.setForeground(Color.black);
		service11111.setBounds(10,190,750,45);
		add(service11111);
		
		JLabel email1=new JLabel("Dr. Parthib Mandal:- 9083084864 or \n Dr.Arko Pan:- 6295113112");
		email1.setFont(new Font("Thoma",Font.PLAIN,20));
		email1.setForeground(Color.BLUE);
		email1.setBounds(10,230,700,25);
		add(email1);
		
		Back =new JButton("Back");
		Back.setBounds(330,400,100,30);
		Back.setBackground(Color.BLACK);
		Back.setForeground(Color.WHITE);
		Back.setFont(new Font("Thoma",Font.BOLD,20));
		// to perform action After click "Back" button
		Back.addActionListener(this);
		add(Back);
		
		
	}
	public static void main(String[] args) {
		new CustomerSupport();
		

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		setVisible(false);
		
	}

}
