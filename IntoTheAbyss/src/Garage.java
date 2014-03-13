import java.util.Scanner;

public class Garage {
	Scanner userSelector = new Scanner(System.in);

	void enterGarage() {
		System.out.println("You enter th Garage.");
		Garage garageOptions = new Garage();
		garageOptions.garageOptions();
	}

	public void garageOptions() {
		System.out.println("1	Get in your car");
		System.out.println("2	Clean the garage");
		System.out.println("3	Grab a soda from the fridge");
		System.out.println("4	Tinker with the tools in the tool box");
		System.out.println("5	Return to the room list");
		String userSelection = userSelector.nextLine();
		switch (userSelection) {
		case "1":
			System.out.println("You get in your car, where would you like to go");
			Car carOptions = new Car();
			carOptions.carOptions();
			
		case "2":
			System.out.println("You spend a few hours cleaning the garage.");
			Garage garageOptions2 = new Garage();
			garageOptions2.garageOptions();
		case "3":
			System.out
					.println("You grab a soda from the fridge and gulp it down.");
			Garage garageOptions3 = new Garage();
			garageOptions3.garageOptions();
		case "4":
			System.out
					.println("You go to the tool box and rumage through the tools you hvae collected over the years");
			Garage garageOptions4 = new Garage();
			garageOptions4.garageOptions();
		case "5":
			RoomSelection roomSelection = new RoomSelection();
			roomSelection.roomSelection2();
			default :
				System.out.println("Invalid Option...");
				garageOptions();

		}
	}
}
