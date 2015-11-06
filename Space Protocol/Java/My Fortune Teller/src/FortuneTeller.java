import java.util.Random;

public class FortuneTeller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random generator = new Random();
		int option = generator.nextInt(3) + 1;
		 
		System.out.println("Welcome to the mystical Fortune Teller.");
		
		switch(option){
		 
		case 1:
		System.out.println("You will have good fortune... forever!");
		break;
		 
		case 2:
		System.out.println("You have bad luck, right now");
		break;
		 
		case 3:
		System.out.println("Neutral luck");
		break;
		 
		default:
		System.out.println("Invalid Option");
		}
		
	}

}
