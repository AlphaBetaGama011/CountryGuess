import java.util.Scanner;

import javax.swing.AbstractButton;
import javax.swing.JTextField;

public class GameExcecute {

	private static ListAccessor listsAccessor;
	public static GameStarter start;
	private static GameHandler gameHandle;
	private static CSVFileReader csv;
	private static JTextField jText;

	public static void main(String[] args) {
		//jText = new JTextField();
		//StartPrompt frame = new StartPrompt(jText);
		listsAccessor = new ListAccessor();
		start = new GameStarter();
		gameHandle = new GameHandler();
		csv = new CSVFileReader();

		// Prints the start prompt
		start.startgame();

		Scanner startV = new Scanner(System.in);
		start.setUserAgree(startV.nextLine());

		// validates if the user wants to start the game by user input
		if (start.getStart1().equalsIgnoreCase(start.getStart1())) {
			start.startvalidate(true);
		} else {
			start.startvalidate(false);
		}

		// Checks if the user has agreed to the rules. If they agree, the game starts.
		start.agreeToTheRules();

		// As the user has agreed to the rules, all the name of the countries and the
		// images are added to the ArrayList countries and flags respectively
		listsAccessor.createAndAddFlags();
		csv.addCountries(listsAccessor);

		csv.addFlagAddress(listsAccessor);

		// Starts the game

		int userScore = 0;

		for (int i = 0; i <= listsAccessor.getCountries().size(); i++) {
			int randomIndex = gameHandle.randomNumber();

			DisplayImage imagePrinter = new DisplayImage(listsAccessor.getFlagAddress().get(randomIndex));
			System.out.println("What is the countries name?");

			Scanner userGuess = new Scanner(System.in);
			gameHandle.setGuess(userGuess.nextLine());

			String countryName = listsAccessor.getCountries().get(randomIndex);

			if (gameHandle.getGuess().equalsIgnoreCase(countryName)) {
				gameHandle.incrementUserScore();
				System.out.println("Good Job! You got that right!");
				System.out.println();
			}
			if (!gameHandle.getGuess().equalsIgnoreCase(countryName)
					&& (!gameHandle.getGuess().equalsIgnoreCase(gameHandle.getExit()))) {
				System.out.println("Nice try! It was " + countryName + ". All the best for the next one!👍");
				System.out.println();
			}

			if (gameHandle.getGuess().equalsIgnoreCase(gameHandle.getExit())) {
				break;
			}
		}
		System.out.println("your score was " + gameHandle.getUserScore());
	}
	
	public static JTextField getJText() {
		
		return jText;
	}
}
