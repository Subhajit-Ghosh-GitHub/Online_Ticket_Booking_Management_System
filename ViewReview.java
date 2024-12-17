package application;
import java.awt.Color;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ViewReview extends JFrame {
    ResultSet rs;
    JTextArea textArea;

    ViewReview() {
        setTitle("Reviews");
        setBounds(600, 200, 500, 450);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(10, 20, 460, 300);
        add(scrollPane);

        try {
            DButils db = new DButils();
            String query = "select * from feadback where rating = '5'";
            rs = db.s.executeQuery(query);
            while (rs.next()) {
                String rating = rs.getString("rating");
                String userText = rs.getString("usertext");
                String userName = rs.getString("user_name");
                
                // Append data to JTextArea
                textArea.append("Rating: " + rating + "\n");
                textArea.append("User: " + userName + "\n");
                textArea.append("Review: " + userText + "\n\n");
            }
            
            String query1 = "select * from feadback where rating = '4'";
            rs = db.s.executeQuery(query1);
            while (rs.next()) {
                String rating = rs.getString("rating");
                String userText = rs.getString("usertext");
                String userName = rs.getString("user_name");
                
                // Append data to JTextArea
                textArea.append("Rating: " + rating + "\n");
                textArea.append("User: " + userName + "\n");
                textArea.append("Review: " + userText + "\n\n");
            }
            String query2 = "select * from feadback where rating = '3'";
            rs = db.s.executeQuery(query2);
            while (rs.next()) {
                String rating = rs.getString("rating");
                String userText = rs.getString("usertext");
                String userName = rs.getString("user_name");
                
                // Append data to JTextArea
                textArea.append("Rating: " + rating + "\n");
                textArea.append("User: " + userName + "\n");
                textArea.append("Review: " + userText + "\n\n");
            }
            
            String query3 = "select * from feadback where rating = '2'";
            rs = db.s.executeQuery(query3);
            while (rs.next()) {
                String rating = rs.getString("rating");
                String userText = rs.getString("usertext");
                String userName = rs.getString("user_name");
                
                // Append data to JTextArea
                textArea.append("Rating: " + rating + "\n");
                textArea.append("User: " + userName + "\n");
                textArea.append("Review: " + userText + "\n\n");
            }
            
            String query4 = "select * from feadback where rating = '1'";
            rs = db.s.executeQuery(query4);
            while (rs.next()) {
                String rating = rs.getString("rating");
                String userText = rs.getString("usertext");
                String userName = rs.getString("user_name");
                
                // Append data to JTextArea
                textArea.append("Rating: " + rating + "\n");
                textArea.append("User: " + userName + "\n");
                textArea.append("Review: " + userText + "\n\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        }

        setVisible(true);
    }

    public static void main(String[] args) {
        new ViewReview();
    }
}
