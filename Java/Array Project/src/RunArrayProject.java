import java.util.Scanner;

public class RunArrayProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner scan = new Scanner (System.in);
			int num = 0;
			int num2 = 1;
			
			System.out.println("What type of thing would you like to enter into your list?");
			String type = scan.nextLine();
			
			System.out.println("How many " + type + " would you like to put into the list?");
			int number = scan.nextInt();

			String names[] = new String[number];
			
			do{
				System.out.println("Enter name " + num2 + ".");
				names[num] = scan.next();
				num++;
				num2++;
			} while (num < number);
			
			System.out.println("Would you like to add to the array, or print it out?  Answer with either add or print.");
			scan.nextLine();
			String answer = scan.nextLine();
			
			if (answer.equals("add")){
				String temp[] = new String[number];
				for (int index2 = 0; index2 < names.length; index2++){
					temp[index2] = names[index2];
				}
				names = new String[number*2];
				for (int index2 = 0; index2 < temp.length; index2++){
					names[index2] = temp[index2];
				}
				int num3 = number;
				int num4 = number+1;
				do{
					System.out.println("Enter name " + num4 + ".");
					names[num3] = scan.next();
					num3++;
					num4++;
				} while (num3 < number*2);
				System.out.println("Here are the names on your list:");
				for (int index3 = 0; index3 < names.length; index3++){
					System.out.println(names[index3]);
				}
			} else if (answer.equals("print")){
				for (int index = 0; index < names.length; index++){
					System.out.println(names[index]);
				}
			}
			//else {
				//System.out.println("That is not a valid option.");
			//}
		
	}

}
