import java.util.Scanner;

public class Kitchen {
	Scanner selection = new Scanner(System.in);

	void enterKitchen() {
		System.out.println("You enter a large kitchen");
		Kitchen getKitchenOptions = new Kitchen();
		getKitchenOptions.kitchenOptions();

	}

	void kitchenOptions() {
		System.out.println("1	Look out the window");
		System.out.println("2	Cook a meal");
		System.out.println("3 	Search for the Basement key");
		System.out.println("4 	Return to rooms list");
		String userSelection = selection.nextLine();

		switch (userSelection) {
		case "1" :
			System.out.println("You look out the window for a while");
			Kitchen returnOption = new Kitchen ();
			returnOption.kitchenOptions();
		case "2" :
			Actions cookMeal = new Actions();
			cookMeal.cookMeal();
			Kitchen returnOption1 = new Kitchen ();
			returnOption1.kitchenOptions();
		 
		case "3" :
				Checkforkey checkKey = new Checkforkey();
				checkKey.checkKitchen();
			
		case "4" :
			RoomSelection roomSelect = new RoomSelection();
			roomSelect.roomSelection();

		}
	}
}
