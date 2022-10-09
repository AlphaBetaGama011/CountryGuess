import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.*;

public class DisplayImage extends JFrame {
	JFrame frame;
	JLabel displayFeild;
	ImageIcon image;

	/**
	 * Displays the flag "flag" on the screen. Constructor of Image class
	 * 
	 * @param String
	 */
	public DisplayImage(String countryName) {

		frame = new JFrame("Image Display test");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		try {
			image = new ImageIcon(getClass().getResource(countryName));
			displayFeild = new JLabel(image);
			frame.add(displayFeild);

		} catch (Exception e) {
			System.out.println("Image cannot be found!");
		}
		frame.pack();
		frame.setVisible(true);
	}

}
