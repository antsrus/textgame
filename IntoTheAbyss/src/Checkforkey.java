import java.util.Scanner;

public class Checkforkey {
	Scanner selection = new Scanner(System.in);

	void checkKitchen() {
		System.out.println("Where would you like to check?");
		System.out.println("1	the drawer");
		System.out.println("2	the cabnet");
		System.out.println("3	the table");
		String searchSelection = selection.nextLine();

		switch (searchSelection) {
		case "1":
			System.out.println("You found it!");
			RoomSelection roomSelect2 = new RoomSelection();
			roomSelect2.roomSelection2();
			
		case "2":
			System.out.println("It's not in here.");
			Checkforkey checkKey1 = new Checkforkey();
			checkKey1.checkKitchen();
		case "3" :
			System.out.println("It's not in here.");
			Checkforkey checkKey2 = new Checkforkey();
			checkKey2.checkKitchen();
			
		}

	}
}
