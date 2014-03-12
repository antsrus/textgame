import java.util.Scanner;

public class Computer {
	void computerOptions() {
		Scanner userSelector = new Scanner(System.in);
		System.out.println("1	Log into work");
		System.out.println("2	Get on Facebook");
		System.out.println("3	Do some creative writing");
		System.out.println("4	Return to the Bedroom");
		String userSelection = userSelector.nextLine();
		switch (userSelection) {

		case "1":
			System.out.println("You login to work and finish some unfinished work");
			Computer computerOptions1 = new Computer();
			computerOptions1.computerOptions();
		case "2" :
			System.out.println("You get on Facebook and read what others have to say");
			Computer computerOptions2 = new Computer();
			computerOptions2.computerOptions();
		case "3" :
			System.out.println("You work on a short story you are writing.");
			Computer computerOptions3 = new Computer();
			computerOptions3.computerOptions();
		case "4" :
			Masterbedroom bedroomOptions = new Masterbedroom();
			bedroomOptions.enterBedroom();
		}
		userSelector.close();

	}
}
