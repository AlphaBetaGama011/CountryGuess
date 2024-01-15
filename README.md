In this Java-based project, I developed a captivating game where users engage in a flag guessing challenge. The program leverages Swing for graphical user interface components, presenting users with flag images on the screen. The core functionality involves reading country names and corresponding flag addresses from a CSV file, achieved through the implementation of a CSVFileReader class. Users are prompted to guess the country associated with the displayed flag, and their input is validated against the actual answer. The project seamlessly integrates components such as the GameHandler for managing game logic, the ListAccessor for handling data lists, and the StartPrompt for initiating user interaction. The challenge not only entertains but also educates users about different countries and their flags. Overall, the project blends Java programming with interactive gameplay, creating an engaging experience for users eager to test their knowledge of world flags.

Java Class - CSVFileReader.java
  Method: addCountries(ListAccessor countryList)

    Reads data from the CSV file named countries_name.csv.
    Parses each line, splitting it by commas to obtain an array of country names.
    Populates an ArrayList (countryList.getCountries()) with the names of countries.
    The loop is designed to handle up to 193 countries.
    Catches FileNotFoundException and IOException with corresponding error messages.
  
  Method: addFlagAddress(ListAccessor flagslist)

    Reads data from the CSV file named CountryFlagAddress.csv.
    Parses each line, splitting it by commas to obtain an array of flag addresses.
    Populates an ArrayList (flagslist.getFlagAddress()) with the addresses of flag images.
    The loop is designed to handle up to 193 flag addresses.
    Catches FileNotFoundException and IOException with corresponding error messages.

Java Class - CountriesAddWithCVSFile.java

  Main Method: public static void main(String[] args)
  
    Creates an instance of ListAccessor named listsGetter to store country names and flag image addresses.
    Reads country names from the CSV file (countries_names.csv) and adds them to listsGetter.getCountries() ArrayList.
    File path: "/Users/advaithtontalapur/Desktop/countries_names.csv"
    Reads flag image addresses from another CSV file (path indicated by comments) and adds them to listsGetter.getFlagAddress() ArrayList.
    Both reading processes are capped at 193 iterations.
    Catches FileNotFoundException and IOException with corresponding error messages.

Java Class - DisplayImage.java
  Class: DisplayImage extends JFrame

  Declares instance variables:
  
    JFrame frame: The main frame of the application.
    JLabel displayField: A label to display the image.
    ImageIcon image: Represents the image to be displayed.
  
  Constructor: public DisplayImage(String countryName)

    Initializes the JFrame (frame) with the title "Image Display test" and sets the default close operation to EXIT_ON_CLOSE.
    Attempts to create an ImageIcon using the specified countryName. The image is expected to be located relative to the class's package.
    If successful, creates a JLabel (displayField) with the image and adds it to the frame.
    If an exception occurs (e.g., image not found), prints an error message.
    Packs the frame and sets it to be visible.

Java Class - GameExcecute.java

  Declares and initializes several class-level variables:
  
    listsAccessor: An instance of ListAccessor to manage lists of country names and flag addresses.
    start: An instance of GameStarter to handle the start prompt and user agreement.
    gameHandle: An instance of GameHandler to manage the game logic.
    csv: An instance of CSVFileReader to read data from CSV files.
    jText: A JTextField instance (commented out), possibly intended for GUI interaction.
    
  Method: main(String[] args)

    Initializes the instances of ListAccessor, GameStarter, GameHandler, and CSVFileReader.
    Invokes startgame() method to print the start prompt.
    Takes user input to determine whether the game should start.
    Adds country names and flag addresses to the lists using methods from listsAccessor and csv.
    Starts the game loop, iterating through countries.
    Generates a random index and displays the flag image using DisplayImage.
    Prompts the user for the country name and compares it with the actual country name.
    Increments the user's score if the guess is correct.
    Prints feedback messages based on the correctness of the guess.
    Ends the game loop if the user inputs an exit command.
    Prints the user's final score.
    
  Method: getJText()
  
    Returns the jText instance.

Java Class - GameHandler.java

  Declares instance variables:
  
    guess: Represents the user's guess.
    countryname: Represents the country name (not used in the provided code).
    listAccessor: An instance of ListAccessor.
    userScore: An integer to track the user's score.
    exit: A constant string "exit" used to signal the end of the game.
    randomIndex: An integer to store the randomly generated index.
    usedRandomNumbers: An ArrayList to keep track of random numbers that have been used.
    randIndex: An integer to store the current random index.
    
  Constructor: public GameHandler()
  
    Initializes instance variables, including an empty list of used random numbers.
    
  Method: randomNumber()
  
    Generates a random integer between 1 and 193 (inclusive).
    
  Method: getRandomIndex()
  
    Generates a random index and ensures it has not been used before by checking the usedRandomNumbers list.
    If the index is not used, adds it to the list and returns it.
    
  Method: incrementUserScore()
  
    Increments the user's score by 5 points.
    
  Method: getUserScore()
  
    Returns the current user score.
    
  Method: getExit()
  
    Returns the string "exit" to signal the end of the game.
    
  Method: setGuess(String guess)
  
    Sets the guess variable to the provided string.
    
  Method: getGuess()
  
    Returns the current value of the guess variable.

Java Class - GameStarter.java

  Declares instance variables:
  
    start1: A string "START" used for user validation to start the game.
    start2: A string "start" used for user validation to start the game.
    cool: A string "cool" (not used in the provided code).
    userAgree: A string to store user agreement.
    listAccessor: An instance of ListAccessor.
    gamer: An instance of GameHandler.
    userScore: An integer to store the user's score.
    
  Constructor: public GameStarter()
  
    Initializes instance variables, including instances of ListAccessor and GameHandler.
    
  Method: startgame()
  
    Prints the welcome message and prompts the user to start the game by entering either "START" or "start".
    
  Method: startvalidate(boolean userValidator)
  
    Prints the rules of the game based on the user's response to the start prompt.
    If the user enters "start" or "START," provides instructions and proceeds with the game.
    If the user's response is false, prompts them to run the code again to start the game.
    
  Method: agreeToTheRules()
  
    Prompts the user to agree to the rules by typing "ok" in the console.
    If the user types "ok," acknowledges and proceeds with the game.
    
  Getter and Setter Methods:
  
    Provide access to and set values for various instance variables.

Java Class - ListAccessor.java

  Declares instance variables:
  
    flags: An ArrayList to store ImageIcon objects representing flag images.
    countries: An ArrayList to store country names.
    flagAddress: An ArrayList to store addresses of flag images.
    
  Constructor: public ListAccessor()
  
    Initializes the three ArrayLists (flags, countries, flagAddress).
    
  Method: createAndAddFlags()
  
    Creates ImageIcon objects for each flag address in the flagAddress ArrayList.
    Adds the created ImageIcon objects to the flags ArrayList.
    
  Getter and Setter Methods:
  
    Provide access to and set values for the three ArrayLists (flags, countries, flagAddress).
  Getter Methods:
  
    Provide access to individual ArrayLists (getFlags(), getCountries(), getFlagAddress()).

Java Class - StartPrompt.java

  Declares instance variables:
  
    button: A JButton for user interaction.
    inPutFeild: A JTextField for user input.
    starter: An instance of GameStarter.
    userInput: A string to store user input.
    ex: An instance of GameExecute (not used in the provided code).
    
  Constructor: public StartPrompt(JTextField displayFeild)
  
    Configures the JFrame with a FlowLayout.
    Initializes GUI components, including a submit button and an input field.
    Sets the initial text in displayFeild.
    Displays the JFrame.
    If the user input matches the start command (starter.getStart1()), updates the text in displayFeild.
    
  Method: actionPerformed(ActionEvent e)
  
    Handles the button click event.
    Retrieves the user input from the input field.
    
  Method: frameStep2()
  
    Returns a string containing instructions for the next step of the game.
    
  Getter and Setter Methods:
  
    Provide access to and set values for the userInput.
