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
	 switch(selection) {
	 case "1" :
		 Actions layDownOnBed = new Actions();
		 layDownOnBed.layDownOnBed();
		 
	 case "2" :
		 Bathroom enterBathroom = new Bathroom();
		 enterBathroom.enterBathroom();
	 case "3" :
	 case "4" :
	 case "5" :
	 }
 }
}
