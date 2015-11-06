import javax.swing.JOptionPane;

import java.util.Scanner;

public class VirtualCarEngine {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car myCar = new Car();
		Scanner scan = new Scanner (System.in);
		 
		System.out.println("Your car is a " + myCar.name + ".");
		System.out.println("Your car is a " + myCar.type + ".");
		System.out.println("Your car's color is " + myCar.color + ".");
		System.out.println("Your car's gas milage is " + myCar.gasMileage + " mpg.");
		System.out.println("Your car's top speed is " + myCar.topSpeed + " mph.");
        
		System.out.println("Gas before driving: " + myCar.gas + " gallons.");
		System.out.println("Miles before driving: " + myCar.miles + " miles.");
		
		System.out.println("How many miles would you like to drive your car for?");
		double distance = scan.nextDouble();
		
		System.out.println("How fast would you like to drive? Remember, your car's top speed is " + myCar.topSpeed + " mph.");
        double speed = scan.nextDouble();
		
        myCar.drive(distance);
        
        double time = distance/speed;
        
        System.out.println("It took you " + time + " hours to drive " + distance + " miles."); 
        System.out.println("Gas after driving: " + myCar.gas + " gallons.");
        System.out.println("Miles after driving " + myCar.miles + " miles.");
        
        System.out.println("It's now time to refuel your car.");
        
        double quotient = distance/myCar.gasMileage;
        myCar.refuel(quotient);
         
        System.out.println("Gas after refueling: " + myCar.gas + " gallons.");
        
        Car myCar2 = new Car();
        
        myCar2.myCar2Method();
        
        System.out.println("Your second car is a " + myCar2.name + ".");
		System.out.println("Your second car is a " + myCar2.type + ".");
		System.out.println("Your second car's color is " + myCar2.color + ".");
		System.out.println("Your second car's gas milage is " + myCar2.gasMileage + " mpg.");
		System.out.println("Your second car's top speed is " + myCar2.topSpeed + " mph.");
        
		System.out.println("Gas before driving: " + myCar2.gas + " gallons.");
		System.out.println("Miles before driving: " + myCar2.miles + " miles.");
		
		System.out.println("How many miles would you like to drive your second car for?");
		distance = scan.nextDouble();
		
		System.out.println("How fast would you like to drive? Remember, your car's top speed is " + myCar2.topSpeed + " mph.");
        speed = scan.nextDouble();
		
        myCar2.drive(distance);
        
        time = distance/speed;
        
        System.out.println("It took you " + time + " hours to drive " + distance + " miles."); 
        System.out.println("Gas after driving: " + myCar2.gas + " gallons.");
        System.out.println("Miles after driving " + myCar2.miles + " miles.");
        
        System.out.println("It's now time to refuel your second car.");
         
        quotient = distance/myCar2.gasMileage;
        myCar2.refuel(quotient);
         
        System.out.println("Gas after refueling: " + myCar2.gas + " gallons.");
		
	}

}
