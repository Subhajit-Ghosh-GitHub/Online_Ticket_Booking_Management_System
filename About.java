package application;

import java.awt.Color;
import java.awt.Font;
import java.awt.Scrollbar;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class About extends JFrame implements ActionListener{

	About()
	{
		setTitle("ABOUT");
		setBounds(600,200,500,550);
		setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		
		JLabel l1=new JLabel("About");
		l1.setBounds(200,10,100,40);
		l1.setForeground(Color.red);
		l1.setFont(new Font("Thoma",Font.PLAIN,20));
		add(l1);
		
		String s="Why should you book bus tickets online on our Platform?\r\n"
				+ "\r\n"
				+ "Booking bus tickets online on our Platform is increasingly becoming the preferred choice for travellers due to its numerous advantages over traditional methods. With our platform, customers can book their bus tickets effortlessly from the comfort of their homes, avoiding the inconvenience of standing in long queues at bus stations or travel agencies. With Online bus booking you can compare different bus schedules, operators, ratings and choose the seat, boarding & dropping points of your choice. You can also save money by booking the cheapest bus tickets with attractive discount offers and exclusive deals \r\n"
				+ "\r\n"
				+ "We also offer other exclusive benefits on online bus tickets like flexible ticket rescheduling options, easy & friendly cancellation policies, and instant payment refunds. With different bus feature, you can plan travel and never miss the bus. You can get the cheapest bus tickets by availing the best discounts for new & existing customers. With red Deals, you can also get exclusive & additional discounts on your online bus ticket booking. You will get 24/7 customer support on call, chat & help to resolve all your queries in English & local languages.\r\n"
				+ "\r\n"
				+ "It’s A leading platform for booking bus tickets, redBus has been the leader in online bus booking over the past years across thousands of cities and lakhs of routes in India.\r\n"
				+ "\r\n"
				+ "Booking a bus ticket online on the app or website is very simple. You can download the  app or visit site.in and sign up enter your source, destination & travel date to check the top-rated bus services available. You can then compare bus prices, user ratings & amenities, select your preferred seat, boarding & dropping points and pay using multiple payment options like UPI, debit or credit card, net banking and more. We get assured safe & secure payment methods and guaranteed travel with the best seat and bus operator of your choice. Once the bus booking payment is confirmed, all you have to do is pack your bags and get ready to travel with the m-ticket, which you can show to the bus operator on your mobile before boarding the bus. Online bus ticket booking with our application is that simple!\r\n"
				+ "\r\n"
				+"\r\n"
				+ "*************************Please follow all instruction*****************************"
				+"\r\n"
				+"                                        Thank You Visit us egain"
				+"\r\n"
				+"\r\n"
				+"\r\n"
				+ "";
		
		TextArea area=new TextArea(s,10,40,Scrollbar.VERTICAL); //take 4 argument colum row
		area.setEditable(false);
		area.setBounds(20,100,450,300);
		add(area);
		
		
		
		JButton back=new JButton("Back");
		back.setBounds(200,420,100,25);
		back.addActionListener(this);
		add(back);
		
		setVisible(true);
		
	}
	  
	
	public static void main(String[] args) {
		
		new About();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		setVisible(false);
		
	}

}
