import java.util.Scanner;
public class userinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
			// String n = scan.nextLine();
			// System.out.println(n);
			System.out.println("What's you're name?");
			String n = scan.nextLine();
			System.out.println("Hello, "+n+".");
			System.out.println("How old are you?");
			int x = scan.nextInt();
			System.out.println("You are "+x+" years old.");
			int xagetofourty = 40 - x;
			System.out.println("You will be fourty in "+xagetofourty+" years.");
			System.out.println("It was nice to meet you "+n+".");
			String name = n;
			int age = 14;
			System.out.println("Put in a number");
			int y = scan.nextInt();
			System.out.println("Your number is "+y+".");
			System.out.println("Your number plus 10 is "+(y+10)+".");
	}

}