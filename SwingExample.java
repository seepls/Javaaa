// swing based program with a TITLE and a BUTTON 
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;

public class SwingExample implements Runnable {
	public void run(){
		JFrame f = 	new JFrame("here goes the TITLE"); // creats a window
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //close control
		//layout manager : so that button not on top of label
		f.setLayout(new FlowLayout());
		 
		f.add(new JLabel("content it is ! "));
        f.add(new JButton("Press me!"));
        f.pack(); // set the components in the window 
        f.setVisible(true);
	}
	public static void main(String args[]){
		SwingExample se = new SwingExample();
		//schedules the event to be executed at the right time in the queue 
		SwingUtilities.invokeLater(se);
	}
}

//as Swing is not thread-safe, meaning that invoking resources from multiple
// threads can result in thread interference and memory consistency errors.