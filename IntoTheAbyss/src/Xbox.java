import java.util.Scanner;


public class Xbox {
	Scanner userSelector = new Scanner(System.in);
	void xboxOptions() {
		System.out.println("1	Play Battle Field 4");
		System.out.println("2	Play Halo 4");
		System.out.println("3	Watch Netflix");
		System.out.println("4	Turn off the Xbox");
		String userSelection = userSelector.nextLine();
		switch(userSelection) {
		case "1" :
			System.out.println("You play Battle Field 4.");
			xboxOptions();
		case "2" :
			System.out.println("You play Halo 4.");
			xboxOptions();
		case "3" :
			System.out.println("You watch a movie on Netflix.");
			xboxOptions();
		case "4" :
			System.out.println("You turn of the Xbox.");
			Basement basementOptions = new Basement();
			basementOptions.basementOptions();
		}
	}

}
