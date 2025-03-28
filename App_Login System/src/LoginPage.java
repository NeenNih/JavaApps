import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class LoginPage implements ActionListener {
	
	JFrame frame = new JFrame();
	
	JButton loginButton = new JButton("Login");
	JButton resetButton = new JButton("Reset");
	
	JTextField userIDField = new JTextField();
	
	JPasswordField userPasswordField = new JPasswordField();
	
	JLabel userIDLabel = new JLabel("userID:");
	JLabel userPasswordLabel = new JLabel("password:");
	JLabel messageLabel = new JLabel();
	
	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	LoginPage(HashMap<String,String> loginInfoOriginal) {
		
		logininfo = loginInfoOriginal;
		
		userIDLabel.setBounds(50,100,100,30);
		userIDLabel.setFont(new Font(null,Font.PLAIN,20));
		
		userIDField.setBounds(150,100,200,30);
		userIDField.setFont(new Font(null,Font.PLAIN,20));
		
		userPasswordLabel.setBounds(50,150,150,30);
		userPasswordLabel.setFont(new Font(null,Font.PLAIN,20));
		
		userPasswordField.setBounds(150,150,200,30);
		userPasswordField.setFont(new Font(null,Font.PLAIN,20));
		
		loginButton.setBounds(150,200,100,30);
		loginButton.setFocusable(false);
		loginButton.addActionListener(this);
		
		resetButton.setBounds(250,200,100,30);
		resetButton.setFocusable(false);
		resetButton.addActionListener(this);
		
		messageLabel.setBounds(150,250,250,35);
		messageLabel.setFont(new Font(null,Font.BOLD,20));
		
		frame.add(userIDLabel);
		frame.add(userPasswordLabel);
		frame.add(messageLabel);
		frame.add(userIDField);
		frame.add(userPasswordField);
		frame.add(loginButton);
		frame.add(resetButton);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == resetButton) {
			
			userIDField.setText("");
			userPasswordField.setText("");
			
		}
		
		if(e.getSource() == loginButton) {
			
			String userID = userIDField.getText();
			String password = String.valueOf(userPasswordField.getPassword());
			
			if(logininfo.containsKey(userID)) {
	
				if(logininfo.get(userID).equals(password)) {
					
					messageLabel.setForeground(new Color(0x009c16));
					messageLabel.setText("Login successful");
					//frame.dispose();
					new WelcomePage(userID);
					
				}
				
				else {
					
					messageLabel.setForeground(Color.red);
					messageLabel.setText("Wrong password");
					
				}

			}
			
			else {
				
				messageLabel.setForeground(Color.red);
				messageLabel.setText("Username not found");
				
			}
		}
	}	
}
