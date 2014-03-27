import java.util.Scanner;


public class DvdPlayer {
	Scanner userSelector = new Scanner(System.in);
	void dvdPlayerOptions() {
		System.out.println("1	Watch: Taken");
		System.out.println("2   Watch: The Godfather");
		System.out.println("3   Watch: Monsters Inc.");
		System.out.println("4   Turn off DVD player");
		String userSelection = userSelector.nextLine();
		switch (userSelection) {
		case "1" :
			System.out.println("You watch the movie: Taken");
			dvdPlayerOptions();
		case "2" :
			System.out.println("You watch the movie: The Godfather");
			dvdPlayerOptions();
		case "3" :
			System.out.println("You watch the movie: Monsters Inc.");
			dvdPlayerOptions();
		case "4" :
			System.out.println("You turn the DVD player off.");
			Basement basementOptions = new Basement();
			basementOptions.basementOptions();
		}
	}

}
