import java.util.Scanner;

public class tv {
	Scanner channelSelector = new Scanner(System.in);
	
	void channelSelection() {
		System.out.println("1   Fox News");
		System.out.println("2   Everybody Loves Raymond");
		System.out.println("3   The Walking Dead");
		System.out.println("4   Stop watching TV");
		String channelSelection = channelSelector.nextLine();
		switch(channelSelection){
		case "1":
			Actions foxnews = new Actions();
			foxnews.watchFoxNews();
		case "2" :
			Actions elr = new Actions();
			elr.watchELR();
		case "3" :
			Actions walkingdead = new Actions();
			walkingdead.watchWalkingDead();
		case "4" :
			Actions stopTv = new Actions();
			stopTv.stopTV();
		}
		
	}
}
