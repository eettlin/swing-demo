package swingdemo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
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

		final JTextField txtInput = new JTextField(20);
		pnlContent.add(txtInput);

		JButton btnInput = new JButton("Click me");
		pnlContent.add(btnInput);

		// In JGame:
		// addListener(someHitTestListener);
		// addListener(someFrameListener);
		// addListener(someTimerListener);
		//
		// In AS3:
		// addEventListener(MouseEvent.MOUSE_MOVE, ...)
		// addEventListener(Event.ENTER_FRAME, ...)
		// addEventListener(TimerEvent.TIMER_STEP, ...)
		//
		// In Swing:
		// addActionListener(someActionListener);
		// addFocusListener(someFocusListener);
		// addChangeListener(someChangeListeners);
		btnInput.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// In JGame: GObject target, Context context
				// In AS3: e:Event (or e:MouseEvent)
				// In Swing: ActionEvent e

				// When we're in this method, some action has been performed.
				txtInput.setText("Button was clicked (peace love joy)");
			}
		});

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
