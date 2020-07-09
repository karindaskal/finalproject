package view;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class openScreen {
	private static void createAndShowGUI() {
	    //Create and set up the window.
	    JFrame frame = new JFrame("ButtonExample");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    //Add "Hello World" label
	    JLabel label = new JLabel("Hellow World");

	    frame.getContentPane().add(label);
	    ButtonExample newContentPane = new ButtonExample();
        newContentPane.setOpaque(true);                
        frame.setContentPane(newContentPane);
	    //Display the window.
	    frame.pack();
	    frame.setVisible(true);
	}
	public static void main(String[] args) {
	    javax.swing.SwingUtilities.invokeLater(new Runnable() {
		public void run() {
	 		createAndShowGUI();
		}
	    });
	}

}
