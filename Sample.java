
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Sample extends JFrame {
	private final JButton b = new JButton();

	public Sample() {
		super();
		this.setTitle("HelloApp");
		this.getContentPane().setLayout(null);
		this.setBounds(100, 100, 180, 140);
		this.add(makeButton());
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private JButton makeButton() {
		b.setText("Click me!");
		b.setBounds(40, 40, 100, 30);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(b, "Hello World!");
			}
		});
		return b;
	}

	public static void main(String[] args) {
		// Swing calls must be run by the event dispatching thread.
		SwingUtilities.invokeAndWait()-> new Sample();
	}
}
//JFrame uses java.awt.BorderLayout as its default layout-manager. 



