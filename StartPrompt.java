import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class StartPrompt extends JFrame implements ActionListener {

	private JButton button;
	private JTextField inPutFeild;

	private GameStarter starter;
	private String userInput;
	private static GameExcecute ex;

	public StartPrompt(JTextField displayFeild) {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());

		button = new JButton("Submit");
		button.addActionListener(this);
		starter = new GameStarter();

		inPutFeild = new JTextField();
		inPutFeild.setPreferredSize(new Dimension(250, 40));
		inPutFeild.setFont(new Font("Consolas", Font.PLAIN, 35));
		inPutFeild.setForeground(new Color(0x00FF00));
		inPutFeild.setBackground(Color.black);
		inPutFeild.setCaretColor(Color.white);
		inPutFeild.setText("username");

		displayFeild = new JTextField();
		displayFeild.setText("Hello user! Welcome to the Flag Guesser Game! enter " + starter.getStart1() + " or "
				+ starter.getStart2() + " to start the game!");

		this.add(displayFeild);
		displayFeild.setEditable(false);
		this.add(button);
		this.add(inPutFeild);
		this.pack();
		this.setVisible(true);

		if (userInput.equalsIgnoreCase(starter.getStart1())) {
			displayFeild.setText(frameStep2());

		}

	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == button) {
			userInput = inPutFeild.getText();
			/*
			 * if (userInput.equalsIgnoreCase(starter.getStart1())) {
			 * ex.getJText().setText(frameStep2()); }
			 */
		}

	}

	public String frameStep2() {
		return ("Ok! The image will be displayed on the top left cornor of the screen. You will be entering your guess here!\n"
				+ "If you want to end the game in the between, just enter exit. It will end the game and display your score");
	}

	public String getUserInput() {
		return userInput;
	}

	public void setUserInput(String userInput) {
		this.userInput = userInput;
	}
}
