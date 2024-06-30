package finestre;

import javax.swing.JFrame;

public class PrimaFinestra {

	public static void main(String[] args) {
		JFrame finestra = new JFrame();
		
		finestra.setTitle("Mia finestra");
		finestra.setSize(500, 400);
		
		finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		finestra.setVisible(true);
		
		

	}

}
