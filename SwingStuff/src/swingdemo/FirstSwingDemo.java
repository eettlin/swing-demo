package swingdemo;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FirstSwingDemo {

	public static void main(String[] args) {
		// Create a JFrame, top level window
		JFrame mainFrame = new JFrame("Title");

		// main content pane: create and set
		JPanel pnlContent = new JPanel();
		mainFrame.setContentPane(pnlContent);

		// naming conventions: prefix pnl, lbl, btn, txt, txtr, rdbtn, chbx, mn
		JLabel lblInput = new JLabel("Please input your feelings");
		pnlContent.add(lblInput);
		
		JTextField txtInput = new JTextField(20);
		pnlContent.add(txtInput);

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
