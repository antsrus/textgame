import java.util.Scanner; 

public class Actions {
	// createing scanner
	Scanner selection = new Scanner(System.in);
	// Get out of bed
	void getOutOfBed() {
		System.out.println("You get out of bed, and get dressed for the day\n then head down stair for breakfast.");

	}

	// stay in bed
	void stayInBed() {
		System.out.println("Jacob stays in bed for another hour.");
	}
	// Find the Key to the Basement 
	void findBasementKey() {
		System.out.println("The basement is locked you must find the key in the Kitchen.");
		RoomSelection roomSelect = new RoomSelection();
		roomSelect.roomSelection();
		String userSelection = selection.nextLine();
		
		}
	
	void cookMeal() {
			System.out.println("You cook a meal, and eat it.");
	}
//TV Options
	void watchFoxNews() {
		System.out.println("You become educated on the days event's.");
		tv channelOptions = new tv();
		channelOptions.channelSelection();
	}
	void watchELR() {
		System.out.println("You watch Everybody Loves Raymond, and have a great time!");
		tv channelOptions = new tv();
		channelOptions.channelSelection();
	}
	void watchWalkingDead() {
		System.out.println("You watch The Walking Dead for an hour!");
		tv channelOptions = new tv();
		channelOptions.channelSelection();
	}
	void stopTV() {
		System.out.println("You turn off the TV, and decide what to do next.");
		Livingroom livingroomOptions1 = new Livingroom();
		livingroomOptions1.livingRoomOptions();
	}
//Living Room Actions
	void layOnCouch() {
		System.out.println("You lye down on the couch for half an hour, what now?");
		Livingroom repeatOptions1 = new Livingroom();
		repeatOptions1.livingRoomOptions();
	}
	void watchTV() {
		System.out.println("You pick up the remote, and turn on the TV.\nThe current channel is static you decide what show to watch.");
		tv channelOptions = new tv();
		channelOptions.channelSelection();
	}
	void playGameboy() {
		System.out.println("You pickup the Game Boy and ponder between\nwhat game you want to play.");
		Gameboy gameboyOptions = new Gameboy();
		gameboyOptions.gameSelection();
		
	}
// Gameboy options
	void playPokemon() {
		System.out.println("You play Pokemon for hours.\nAnd level up you Pokemon a few levels");
		Gameboy gameSelection = new Gameboy();
		gameSelection.gameSelection();
	}
	void playNBAfreeThrows() {
		System.out.println("You shoot some free throws on your Game Boy.");
		Gameboy gameSelection = new Gameboy();
		gameSelection.gameSelection();
	}
	void playMarioWorld() {
		System.out.println("You play Mario orld for two hours.");
		Gameboy gameSelection = new Gameboy();
		gameSelection.gameSelection();
	}
	void listenMusic() {
		System.out.println("You turn on the radio on the entertainment center\nYou sit back and relax and listen to the music.");
		Livingroom repeatOptions1 = new Livingroom();
		repeatOptions1.livingRoomOptions();
	}
// Master Bedroom options.
	void layDownOnBed() {
		System.out.println("You lay down and take a nap...\nYou wake up one hour later.");
		Masterbedroom bedRoomOptions = new Masterbedroom();
		bedRoomOptions.bedroomOptions();
	}
void useBathroom() {
	System.out.println("You use the bathroom, you should wash your hands now");
	Bathroom bathroomOptions= new Bathroom();
	bathroomOptions.bathroomOptions();
} 
void washHands() {
	System.out.println("You was your hands.");
	Bathroom bathroomOptions= new Bathroom();
	bathroomOptions.bathroomOptions();
}
void takeShower() {
	System.out.println("You take a shower.");
	Bathroom bathroomOptions= new Bathroom();
	bathroomOptions.bathroomOptions();
}
void backToBedroom() {
	Bathroom bathroomOptions= new Bathroom();
	bathroomOptions.bathroomOptions();
}

}
