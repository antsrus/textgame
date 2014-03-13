import java.util.Scanner;

public class Bathroom {
void enterBathroom() {
	System.out.println("You enter the bathroom.");
	Bathroom bathroomOptions= new Bathroom();
	bathroomOptions.bathroomOptions();
}
public void bathroomOptions() {
	System.out.println("1	Use the bathroom");
	System.out.println("2	Wash your hands");
	System.out.println("3	Take a shower");
	System.out.println("4	Go back to the bedroom");
	Scanner userSelector = new Scanner(System.in);
	String userSelection = userSelector.nextLine();
	switch(userSelection){
	case "1" :
		Actions useBathroom = new Actions();
		useBathroom.useBathroom();
	case "2" :
		Actions washHands = new Actions();
		washHands.washHands();
	case "3" :
		Actions takeShower = new Actions();
		takeShower.takeShower();
	case "4" :
		Masterbedroom bedroomOptions = new Masterbedroom();
		bedroomOptions.enterBedroom();
	default :
		System.out.println("Invalid Option...");
		bathroomOptions();
	}
	userSelector.close();
}
}
