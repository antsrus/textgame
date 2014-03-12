import java.util.Scanner;

public class Masterbedroom {
	void enterBedroom() {
		System.out.println("You enter the bed room what would you like to do?");
		Masterbedroom bedroomOptions = new Masterbedroom();
		bedroomOptions.bedroomOptions();
	}

	void bedroomOptions() {
		System.out.println("1	Lay down on the bed");
		System.out.println("2	Enter the bathroom");
		System.out.println("3	Get on the computer");
		System.out.println("4	Look out the window");
		System.out.println("5 	Exit bed room");
		Scanner optionSelector = new Scanner(System.in);
		String selection = optionSelector.nextLine();
		switch (selection) {
		case "1":
			Actions layDownOnBed = new Actions();
			layDownOnBed.layDownOnBed();

		case "2":
			Bathroom enterBathroom = new Bathroom();
			enterBathroom.enterBathroom();
		case "3":
			System.out.println("You Log on to the computer.");
			Computer computerOptions = new Computer();
			computerOptions.computerOptions();
		case "4":
			System.out.println("You look out the window and watch the children play.");
			Masterbedroom bedroomOptions = new Masterbedroom();
			bedroomOptions.bedroomOptions();
		case "5":
			RoomSelection roomSelection = new RoomSelection();
			roomSelection.roomSelection2();
		}
	}
}
