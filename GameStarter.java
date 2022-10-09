import java.util.Scanner;

import javax.swing.JTextField;

import java.awt.RenderingHints.Key;
import java.util.Scanner;
import java.util.*;

public class GameStarter {
	private String start1;
	private String start2;
	private String cool;
	private String userAgree;
	private ListAccessor listAccesser;
	private GameHandler gamer;
	private int userScore;

	public GameStarter() {
		start1 = "START";
		start2 = "start";
		cool = "cool";
		listAccesser = new ListAccessor();
		gamer = new GameHandler();

	}

	/**
	 * Prints the welcome message and asks the user to start the game.
	 */
	public void startgame() {
		System.out.println("Hello user! Welcome to the Flag Guesser Game! enter " + start1 + " or " + start2
				+ " to start the game!");
	}

	/**
	 * Prints the prompt containing the rules of the game and asks the user to start
	 * the game.
	 * 
	 * @param boolean
	 */
	public void startvalidate(boolean userValidator ) {

		if (userValidator == true) {
			System.out.println("Ok! The image will be displayed on the top left cornor of the screen. You will be entering your guess here!\n"
					+ "If you want to end the game in the between, just enter exit. It will end the game and display your score");
		} else {
			System.out.println("Looks like you have not entered start or START. Please run the code again to start the game.");
		}
	}

	/**
	 * This checks if the user has agreed to the game by typing in "OK" in the
	 * console. If they type in OK, the game starts
	 */
	public void agreeToTheRules() {
		Scanner ruleAgree = new Scanner(System.in);
		String ruleAgreed = ruleAgree.nextLine();
		if (ruleAgreed.equals("ok")) {
			System.out.println("Here we start the game then!");

		}
	}

	public String getCool() {
		return cool;
	}

	public void setCool(String cool) {
		this.cool = cool;
	}

	/**
	 * Returns the String userAgree.
	 * 
	 * @return String userAgree
	 */
	public String getUserAgree() {
		return userAgree;
	}

	/**
	 * Sets the String variable this.userAgree to the parameter userAgree
	 * 
	 * @param userAgree
	 */
	public void setUserAgree(String userAgree) {
		this.userAgree = userAgree;
	}

	public ListAccessor getL() {
		return listAccesser;
	}

	public void setL(ListAccessor l) {
		this.listAccesser = l;
	}

	/**
	 * Returns the String variable which is used to validate of the user wants to
	 * start the game. returns "START"
	 * 
	 * @return String start1
	 */
	public String getStart1() {
		return start1;
	}

	public void setStart1(String start1) {
		this.start1 = start1;
	}

	/**
	 * Returns the String variable which is used to validate of the user wants to
	 * start the game. returns "start"
	 * 
	 * @return String start2
	 */
	public String getStart2() {
		return start2;
	}

	public void setStart2(String start2) {
		this.start2 = start2;
	}

	public int getUserScore() {
		return userScore;
	}

	public void setUserScore(int userScore) {
		this.userScore = userScore;
	}

}
