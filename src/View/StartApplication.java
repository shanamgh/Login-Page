package View;

import javax.swing.SwingUtilities;

import Controler.Controller;

public class StartApplication {

	public static void main(String[] args) {
		
			SwingUtilities.invokeLater(new Runnable() {
				//test commit
				Controller controler;
				public void run(){
					controler = new Controller();
				}
		});

	}

}
