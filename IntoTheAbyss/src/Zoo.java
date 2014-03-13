import java.util.Scanner;


public class Zoo {
	Scanner userSelector = new Scanner(System.in);
	void zooOptions() {
		System.out.println("You look around and find a map.You look at the map full of ooption.");
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
			
			
		}
			
	}

}
