import java.util.Scanner;


public class Basement {
	Scanner userSelector = new Scanner(System.in);
	void enterBasement() {
		System.out.println("You enter the Basement, what would you like to do.");
	}
	void basementOptions() {
		System.out.println("1	Play Xbox");
		System.out.println("2	Watch a movie");
		System.out.println("3	Clean the basement");
		System.out.println("4	Play pool");
		System.out.println("5	Return to room list");
		String userSelection = userSelector.nextLine();
		switch (userSelection) {
		case "1" :
			System.out.println("You sit on the couch and turn on the Xbox");
			Xbox xboxOptions = new Xbox();
			xboxOptions.xboxOptions();
		case "2" :
			System.out.println("You sit on the couch and turn ov the TV and DVD player.");
			basementOptions();
		case "3" :
			System.out.println("You spend the next two hours cleaning the basement.");
			basementOptions();
		case "4" :
			System.out.println("You play a game of pool.");
			basementOptions();
		case "5" :
			RoomSelection roomSelect = new RoomSelection();
			roomSelect.roomSelection2();
		}
	}
	
}
