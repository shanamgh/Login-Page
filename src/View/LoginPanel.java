package View;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginPanel extends JPanel {

	JTextField userName;
	JTextField password;
	JLabel userLabel;
	JLabel passLabel;

	JButton login;

	LoginPanel() {

		setSize(400, 400);
		setVisible(true);
		setLayout(new BorderLayout());

		userName = new JTextField(10);
		password = new JTextField(10);
		login = new JButton("Login");
		login.setSize(50, 50);
		userLabel = new JLabel("UserName:");
		passLabel = new JLabel("PassWord:");

		userName.setVisible(true);
		password.setVisible(true);
		login.setVisible(true);
		userLabel.setVisible(true);
		passLabel.setVisible(true);

		add(userLabel, BorderLayout.WEST);
		add(userName, BorderLayout.NORTH);
		add(passLabel);
		add(password, BorderLayout.CENTER);
		add(login, BorderLayout.SOUTH);

	}
}
