import java.util.Scanner;
public class Play {
	void playGame() {
		System.out.println("OK lets start the game. Unfortunantly thre is no save option right now please keep the game open to continue playing later");
		System.out.println("press enter to continue");
		Scanner beginPlaying = new Scanner(System.in);
		System.out.println("As the sun rises, you open your eyes and greet\n the morning with optimisim. For a while you lay in bed deciding what to do first.");
		System.out.println("1   Sit up and get drest.");
		System.out.println("2   Go back to bed for a while.");
		Scanner selections = new Scanner(System.in);
		String set1 = selections.nextLine();
		switch(set1){
		case "1" :
			Actions getup = new Actions();
			getup.getOutOfBed();
			break;
		case "2" :
			Actions stayInBed = new Actions();
			stayInBed.stayInBed();
			System.out.println("Then");
			Actions getupNow = new Actions();
			getupNow.getOutOfBed();
		}
		System.out.println("As you eat breakfast you wonder what\n what you want to do for the day.");
		RoomSelection roomSelection = new RoomSelection();
		roomSelection.roomSelection2();
		selections.close();	
		beginPlaying.close();
			}
	
		
		
	}

