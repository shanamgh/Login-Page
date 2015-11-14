package View;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
	
	private LoginPanel loginPanel;
	
	public LoginPanel getLoginPage() {
		return loginPanel;
	}

	public void setLoginPage(LoginPanel loginPage) {
		this.loginPanel = loginPage;
	}

	public MainFrame(){
		
		loginPanel=new LoginPanel();
		setTitle("Login Page");
		setSize(500, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		add(loginPanel);
		
	}
}
