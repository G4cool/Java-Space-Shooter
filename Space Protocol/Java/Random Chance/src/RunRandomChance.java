import java.util.Scanner;
import java.util.Random;

public class RunRandomChance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declare variables
        String names[] = new String[7];
        Scanner input = new Scanner (System.in);
        Random generator = new Random();
 
        for (int index = 0; index < names.length; index++){
            System.out.println("Enter name " + (index + 1) + ": ");
            names[index] = input.nextLine();
        }//End for
 
        System.out.println("The winner is " + names[generator.nextInt(7)] + "!");
 
        //Close Scanner
        input.close();
		
	}

}
