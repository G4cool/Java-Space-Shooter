import java.util.Scanner;

public class RunMethods {

	public static void sayHello() {
		
		System.out.println("Hello!");
		
	}
	
	public static void print (String text) {
		
		System.out.println(text);
		
	}
	
	public static int square (int x){
        return (x * x);
    }
	
	public static boolean isNegative (int x){
		 
	    if (x < 0){
	        return true;
	    }
	    else{
	        return false;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner input = new Scanner (System.in);
			int number;
			int num2;
		
			sayHello();
			sayHello();
			
			print("Java says;");
			sayHello();
			
			print ("Give a number: ");
	        number = input.nextInt();
	 
	        print("The squared value of " + number + " is " + square(number));
	        
	        print("Give number.");
	        num2 = input.nextInt();
	        print(num2 + " is " + isNegative(num2));
	 
	        //Closer Scanner
	        input.close();
		
	}

}
