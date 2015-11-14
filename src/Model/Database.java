package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Database {
	private Connection connect;
	private Statement st;

	public void compare(String userName, String passWord) throws SQLException {
		connect();
		st = connect.createStatement();
		ResultSet res = st.executeQuery("SELECT [username],[password] FROM [JavaTraining].[dbo].[zs.person]   where username='"
						+ userName + "'and password='" + passWord + "'");

		if (res.next()) {
			JOptionPane.showMessageDialog(null, "Login Sucessfull.");
		} else {
			JOptionPane.showMessageDialog(null, "Invalid User Name/Password");
		}

	}

	public boolean connect() throws SQLException {
		if (connect != null) {
			return true;
		}

		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver Not Found");
			return false;
		}
		String connectionURL = "jdbc:sqlserver://swsql.mahanair.aero;user=sa;password=123;database=javaTraining";
		connect = DriverManager.getConnection(connectionURL);
		System.out.println("Connected");

		if (connect == null) {
			return false;
		}
		return true;
	}

	public void disconnect() {
		if (connect != null) {
			try {
				connect.close();
				System.out.println("Disconnected");
			} catch (SQLException e) {
				System.out.println("Could not disconect");
			}
		}
	}

}
