import java.util.Scanner;

public class RunArraysActual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			String names[] = new String[7];
			Scanner input = new Scanner (System.in);
			int index = 0;

			//for (int index = 0; index < names.length; index++){
				//System.out.println("Enter name number " + (index + 1) + ": ");
				//names[index] = input.next();
			//}
			
			do{
				
				System.out.println("Enter name number " + (index + 1) + ": ");
				names[index] = input.next();
				index++;
				
			} while (index < names.length);
			
			input.close();

	}

}
