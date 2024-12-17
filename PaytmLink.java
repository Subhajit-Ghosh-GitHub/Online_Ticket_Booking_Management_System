package application;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

public class PaytmLink extends JFrame implements ActionListener{

	PaytmLink()
	{
		setBounds(500,200,800 ,600);
		
		setTitle("Paytm Link");
		JEditorPane pane=new JEditorPane();
		pane.setEditable(false);
		
		try {
            // Open Paytm UPI URI
            URI uri = new URI("https://paytm.com/payment://pay=6295500141@paytm");
//          URI uri = new URI("upi://pay?pa=6295500141@paytm");
//			Desktop.getDesktop().browse(uri);
            java.awt.Desktop.getDesktop().browse(uri);
        } catch (URISyntaxException | IOException ex) {
            JOptionPane.showMessageDialog(this, "Failed to open Paytm UPI link.", "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
		//addd frame and add scrollbar
		
		JScrollPane sp=new JScrollPane(pane);
		getContentPane().add(sp);
		
		JButton back=new JButton("Back");
		back.setBounds(610,20,80,40);
		back.addActionListener(this);
		pane.add(back);
		
		
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
	
		new PaytmLink();
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		setVisible(false);
		new  Payment("");
		
	}

}
