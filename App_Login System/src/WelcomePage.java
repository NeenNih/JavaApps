import java.awt.*;
import javax.swing.*;

public class WelcomePage {
	
	JFrame frame = new JFrame();
	JLabel welcomeLabel = new JLabel("Hello!");
	
	WelcomePage(String userID) {
		
		welcomeLabel.setBounds(20, 20, 400, 100);
		welcomeLabel.setFont(new Font("Gabriola",Font.BOLD,60));
		welcomeLabel.setText("Hello " + userID + "...");
		welcomeLabel.setForeground(new Color(0x4905a3));
		
		frame.add(welcomeLabel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}

}
