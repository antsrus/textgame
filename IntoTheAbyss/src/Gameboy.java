import java.util.Scanner;

public class Gameboy {
	Scanner userSelector = new Scanner(System.in);
	public void gameSelection() {
		System.out.println("1   Pokemon");
		System.out.println("2   NBA Free Throws");
		System.out.println("3   Mario World");
		System.out.println("4   Stop Playing Game Boy");
		String userSelection = userSelector.nextLine();
		switch(userSelection) {
		case "1":
			Actions playPokemon = new Actions();
			playPokemon.playPokemon();
		case "2":
			Actions playNBAfreeThrows = new Actions();
			playNBAfreeThrows.playNBAfreeThrows();
		case "3":
			Actions playMarioWorld = new Actions();
			playMarioWorld.playMarioWorld();
		case "4":
			System.out.println("You Stop playing Game Boy. What next?");
			Livingroom livingRoomOptions = new Livingroom();
			livingRoomOptions.livingRoomOptions();
			default :
				System.out.println("Invalid option...");
				gameSelection();
		}
	}

}
