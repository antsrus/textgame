import java.util.Scanner;

public class RoomSelection {
	public void roomSelection() {
		System.out.println("1   The Kitchen");
		System.out.println("2   The Living Room");
		System.out.println("3   The Master Bedroom");
		System.out.println("4   The Garage");
		Scanner roomSelect = new Scanner(System.in);
		String userSelection = roomSelect.nextLine();
		switch (userSelection) {
		case "1":
			Kitchen enterKitchen = new Kitchen();
			enterKitchen.enterKitchen();
		case "2" :
			Livingroom enterLivingroom = new Livingroom();
			enterLivingroom.enterLivingroom(); 
		case "3" :
			Masterbedroom enterBedroom = new Masterbedroom();
			enterBedroom.enterBedroom();
		case "4" :
			Garage enterGarage = new Garage();
			enterGarage.enterGarage();
		default :
			System.out.println("Invalid Option...");
			roomSelection();
			}
		roomSelect.close();

		}

	void roomSelection2() {
		System.out.println("1   The Kitchen");
		System.out.println("2   The Living Room");
		System.out.println("3   The Master Bedroom");
		System.out.println("4   The Garage");
		System.out.println("5   Basement");
		Scanner roomSelect = new Scanner(System.in);
		String userSelection = roomSelect.nextLine();
		switch (userSelection) {
		case "1":
			Kitchen enterKitchen = new Kitchen();
			enterKitchen.enterKitchen();
		case "2" :
			Livingroom enterLivingroom = new Livingroom();
			enterLivingroom.enterLivingroom();
		case "3" :
			Masterbedroom enterBedroom = new Masterbedroom();
			enterBedroom.enterBedroom();
		case "4" :
			Garage enterGarage = new Garage();
			enterGarage.enterGarage();
		case "5" :
			Basement basementOptions = new Basement();
			basementOptions.basementOptions();
		default :
			System.out.println("Invalid Option...");
			roomSelection();
			}
		roomSelect.close();
			

		}

	}
