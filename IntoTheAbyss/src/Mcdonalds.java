import java.util.Scanner;

public class Mcdonalds {
	Scanner userSelector = new Scanner(System.in);

	 void mcdonaldsMenu() {
		System.out.println("1	Hamburger");
		System.out.println("2	Cheesebuger");
		System.out.println("3	Chicken Nuggest");
		System.out.println("4	Big Mac");
		System.out.println("5	Never mind");
		String userSelection = userSelector.nextLine();
		switch (userSelection) {
		case "1" :
			System.out.println("You order a hamburger and eat it.");
			Car carOptions = new Car();
			carOptions.carOptions();
		case "2" :
			System.out.println("You order a cheeseburger and eat it.");
			Car carOptions1 = new Car();
			carOptions1.carOptions();
		case "3" :
			System.out.println("You order chicken nuggets, and eat them.");
			Car carOptions2 = new Car();
			carOptions2.carOptions();
		case "4" : 
			System.out.println("You order the Big Mac, and eat it.");
			Car carOptions3 = new Car();
			carOptions3.carOptions();
		case "5" :
			System.out.println("You kindly thank the order taker and say I changed my mind and pull off.");
			Car carOptions4 = new Car();
			carOptions4.carOptions();
			default :
				System.out.println("Invalid option...");
				mcdonaldsMenu();

		}
	}
}
