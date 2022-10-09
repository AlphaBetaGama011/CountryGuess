import java.util.ArrayList;
import java.util.Scanner;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import javax.swing.ImageIcon;

public class GameHandler {

	private String guess;
	private String countryname;
	private ListAccessor listAccessor;
	private int userScore;
	private final String exit = "exit";
	private int randomIndex;
	private ArrayList<Integer> usedRandomNumbers;
	private int randIndex;

	public GameHandler() {
		guess = "";
		countryname = "";
		listAccessor = new ListAccessor();
		usedRandomNumbers = new ArrayList<>();
	}

	/**
	 * generates a random int from 1 to 193
	 * 
	 * @return rand (A random integer)
	 */
	public int randomNumber() {
		int rand = (int) (Math.random() * 193) + 1;
		return rand;
	}

	public int getRandomIndex() {
		randIndex = randomNumber();
		while (!usedRandomNumbers.contains(randIndex)) {
			usedRandomNumbers.add(randIndex);
			randIndex = randomNumber();
		}

		return randIndex;
	}

	/**
	 * Increments the userScore by 10.
	 * 
	 * @return int userScore
	 */
	public void incrementUserScore() {
		userScore += 5;
	}

	/**
	 * returns the userScore
	 * 
	 * @return the userScore.
	 */
	public int getUserScore() {
		return userScore;
	}

	/**
	 * returns the String required to end the game.
	 * 
	 * @return "exit"
	 */
	public String getExit() {
		return exit;
	}

	/**
	 * Sets guess to parameter guess
	 * 
	 * @param boolean
	 */
	public void setGuess(String guess) {
		this.guess = guess;
	}

	/**
	 * 
	 * @return guess
	 */
	public String getGuess() {
		return guess;
	}

}
