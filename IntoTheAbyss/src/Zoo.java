import java.util.Scanner;


public class Zoo {
	Scanner userSelector = new Scanner(System.in);
	void zooOptions() {
		System.out.println("You look around and find a map.You look at the map full of options.");
		System.out.println("1   Look at the Elephants");
		System.out.println("2   Look at the Lions");
		System.out.println("3   Look at the Seals");
		System.out.println("4   Look at the Gorillas");
		System.out.println("5   Go back to the car.");
		String userSelection = userSelector.nextLine();
		switch (userSelection) {
		case "1" :
			System.out.println("You go down to the Elephant exhibit.\nYou even get to feed one of them a peanut ");
			zooOptions();
		case "2" :
			System.out.println("You go down to the lion's pit and observe the lions.");
			zooOptions();
		case "3"  :
			System.out.println("You head to the seal's pool and watch them play with a red ball.");
			zooOptions();
		case "4" :
			System.out.println("You go to the gorilla house and watch them monkey around.");
			zooOptions();
		case "5" :
			Car carOptions = new Car();
			carOptions.carOptions();
		default :
			System.out.println("Invalid option...");
			zooOptions();
			
		}
			
	}

}
