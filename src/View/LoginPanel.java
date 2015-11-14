package View;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginPanel extends JPanel {

	private JTextField userName;
	private JTextField password;
	public String getPassword() {
		return password.getText();
	}

	private JLabel userLabel;
	private JLabel passLabel;
	private GridBagConstraints layout;

	private JButton login;

	public JButton getLogin() {
		return login;
	}

	public void setLogin(JButton login) {
		this.login = login;
	}

	LoginPanel() {

		setSize(500,150);
		setVisible(true);
		setLayout(new GridBagLayout());
		setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		createFields();
	}

	private void createFields() {
		layout = new GridBagConstraints();
		layout.ipadx = 15;
		
		userLabel = new JLabel("Username : ");
		userLabel.setVisible(true);
		layout.gridx = 0;
		layout.gridy = 0;
		add(userLabel,layout);
		
		userName = new JTextField(15);
		userName.setVisible(true);
		layout.gridx = 1;
		layout.gridy = 0;
		add(userName,layout);
		
		passLabel = new JLabel("Password : ");
		passLabel.setVisible(true);
		layout.gridx = 0;
		layout.gridy = 1;
		add(passLabel,layout);
		
		password = new JTextField(15);
		password.setVisible(true);
		layout.gridx = 1;
		layout.gridy = 1;
		add(password,layout);
		
		login = new JButton("Login");
		login.setVisible(true);
		login.setSize(25, 30);
		layout.gridx = 1;
		layout.gridy = 2;
		add(login,layout);
	}

	public String getuserName() {
		return userName.getText();
	}
}
