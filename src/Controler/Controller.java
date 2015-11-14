package Controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import Model.Database;
import View.MainFrame;

public class Controller{
	MainFrame uiFrame = new MainFrame();
	Database db = new Database();
public Controller() {
	callCompareMethodInDb();
}
	public void callCompareMethodInDb() {
		uiFrame.getLoginPage().getLogin()
				.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						String username = uiFrame.getLoginPage().getuserName();
						String password = uiFrame.getLoginPage().getPassword();
						try {
							db.compare(username, password);
						} catch (SQLException e) {
							System.out.println("Error");
						}
					}
				});
		;
	}

}
