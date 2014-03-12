import java.util.Scanner;

public class Menu {
	void menuOptions() {
		{
		}
		// Option list
		System.out.println("Welcome to House Arrest");
		System.out.println("Choose one of the following options by typing it's corresponding numbers.");
		System.out.println("1   Play game.");
		System.out.println("2   Close game.");
		{
			// getting user input for options
			while(true) { 
			Scanner options = new Scanner(System.in);
			String optionNumber = options.nextLine();
				switch (optionNumber) {
				case "1":
					Play session = new Play();
					session.playGame();
					break;

				case "2":
					System.out.println("OK press enter to exit.");
					Scanner close = new Scanner(System.in);
					String closeGame = close.nextLine();
					switch (closeGame) {
					case"" :
						System.exit(0);
					}
				default:
					System.out.println("wrong command try again");
				}
				options.close();
			}

			}

		}
}
