package View;

import javax.swing.SwingUtilities;

public class StartApplication {

	public static void main(String[] args) {
		
			SwingUtilities.invokeLater(new Runnable() {
			MainFrame frame;
			public void run() {
				frame = new MainFrame();
				System.out.println("j");
			}
		});

	}

}
