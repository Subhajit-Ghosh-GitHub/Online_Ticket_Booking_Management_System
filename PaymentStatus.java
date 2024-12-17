package application;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

public class PaymentStatus extends JFrame implements ActionListener {
	JButton back;
	PaymentStatus()
	{
	
		setBounds(500,200,600,600);
		 setLayout(null);
		 JLabel lblusername=new JLabel("Scan And Pay in this QR CODE");
			lblusername.setBounds(130,50,550,25);
			lblusername.setForeground(Color.BLACK);
			lblusername.setFont(new Font("Thoma",Font.BOLD,20));
			add(lblusername);
			
			ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/QRCODE.jpg"));
			//to scale image
			Image i2=i1.getImage().getScaledInstance(300, 280, Image.SCALE_DEFAULT);
			ImageIcon i3=new ImageIcon(i2);
			JLabel image =new JLabel(i3);
			image.setBounds(150,110,300,300); //befor panel calculation +(500+30),
			add(image);
			
			 back=new JButton("Back");
			 back.setBounds(210,450,120,40);
			 back.addActionListener(this);
			 back.setForeground(Color.BLACK);
			 back.setFont(new Font("Thoma",Font.BOLD,20));
			 add(back);
			setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new PaymentStatus();
	}
	public void actionPerformed(ActionEvent ae) {
		
		setVisible(false);
	}

}
