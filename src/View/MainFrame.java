package View;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
	
	LoginPanel loginPage;
	
	MainFrame(){
		
		loginPage=new LoginPanel();
		setTitle("Login Page");
		setSize(400, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		add(loginPage);
		
	}
}
