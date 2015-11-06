import java.util.Scanner;
import java.util.Random;

public class RunSpaceProtocol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner scan = new Scanner (System.in);
			Random rand = new Random();
			String response;
			space space = new space();
			
			do {
				
				space.intro();
				
				space.fight1();
				
				space.fight();
				
				space.fight();
				
				space.fight();
				
				space.fight();
				
				space.fight();
				
				space.fight();
				
				space.fight();
				
				space.fight();
				
				space.fight();
				
				space.print("Would you like to play again?  Enter y for yes and n for no.");
				response = scan.nextLine();
				
			} while (response.equals("y"));
		
	}

}
