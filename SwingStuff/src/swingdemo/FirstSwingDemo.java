package swingdemo;

import javax.swing.JFrame;

public class FirstSwingDemo {

	public static void main(String[] args) {
		// Create a JFrame, top level window
		JFrame mainFrame = new JFrame("Title");

		// Two ways to size:
		// manual sizing: mainFrame.setSize(new Dimension(400, 200));
		// automatic sizing:
		mainFrame.pack();

		// Quit the program when the frame is closed
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Show the frame
		mainFrame.setVisible(true);
	}

}
