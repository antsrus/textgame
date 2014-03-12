import java.util.Scanner;

public class Livingroom {
	Scanner userSelections = new Scanner(System.in);
	void enterLivingroom() {
		System.out.println("You enter the living room\nwhat would you like to do");
		Livingroom livingroomOptions = new Livingroom();
		livingroomOptions.livingRoomOptions();
	}
	void livingRoomOptions() {
		System.out.println("1	lay on the couch");
		System.out.println("2	watch TV");
		System.out.println("3	play on the gameboy");
		System.out.println("4 	listen to music from the entertainment center");
		System.out.println("5   return to room list");
		String userSelection = userSelections.nextLine();
		
		switch (userSelection) {
		case "1" :
			Actions LayOnCouch = new Actions();
			LayOnCouch.layOnCouch();
		case "2" :
			Actions watchTV = new Actions();
			watchTV.watchTV();
		case "3" :
			Actions playGameboy = new Actions();
			playGameboy.playGameboy();
		case "4" :
			Actions playMusic = new Actions();
			playMusic.listenMusic();
		case "5" :
			RoomSelection roomSelect = new RoomSelection();
			roomSelect.roomSelection();
		}
		
		
	}

}
