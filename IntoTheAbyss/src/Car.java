import java.util.Scanner;

public class Car {
	Scanner userSelector = new Scanner(System.in);
	public void carOptions() {
		System.out.println("1	Drive to work");
		System.out.println("2	Drive to McDonald's");
		System.out.println("3	Drive to the zoo");
		System.out.println("4	Drive to the movie theter");
		System.out.println("5	Drive home");
		String userSelection =userSelector.nextLine();
		switch(userSelection) {
		case "1" :
			System.out.println("You drive to work and work a few hours and get back into your car.");
			carOptions();
		case "2" :
			System.out.println("You drive to McDonald's where the order taker asks, What would you like?");
		case "3" :
			System.out.println("You drive to the zo and pay for a ticket, you then step through the gate.");
		case "4" :
			System.out.println("You dirve to the movie theter and watch the newest action packed movie.");
			carOptions();
		case "5" :
			System.out.println("You drive home, and pull into the Garage.");
			Garage enterGarage = new Garage();
			enterGarage.enterGarage();
		}
		
	}

}
