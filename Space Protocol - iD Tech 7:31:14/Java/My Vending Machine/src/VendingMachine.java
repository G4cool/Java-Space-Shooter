import java.util.Scanner;
 
public class VendingMachine
{
   public static void main( String[] args )
   {
   //create Scanner to get input from user
      Scanner input = new Scanner( System.in );
 
      double money;
      double change;
      double cost;
      int choice;
 
      System.out.println( "Hello I am a vending machine \nWhat would you like to buy?" );
       
      System.out.println("\nPress 1 for Candy, 2 for Soda, 3 for Ketchup");
       
      choice = input.nextInt();
       
      switch (choice){
       
      case 1:
           
          cost = 2.50;
          System.out.println("Candy costs $2.50, please enter your money");
          money = input.nextDouble();
          
          if (money == cost)
          {
   
              System.out.println("Enjoy your Candy");  
              System.out.println("\nYou have no change"); 
               
          } else if (money < cost) {
               
              System.out.println("Sorry you need to enter more money");
              System.out.println("\nHere is your change back\n");
              System.out.println(money);
               
          } else if (money > cost) {
           
              change = money - cost;
               
              System.out.println("Enjoy your Candy");
              System.out.println("\nYour change is: ");
              System.out.println(change);
               
          }
         break;
      case 2:
           
          cost = 1.00;
          System.out.println("Soda costs $1.00, please enter your money");
          money = input.nextDouble();
          
          if (money == cost)
          {
   
              System.out.println("Enjoy your Soda");  
              System.out.println("\nYou have no change"); 
               
          } else if (money < cost) {
               
              System.out.println("Sorry you need to enter more money");
              System.out.println("\nHere is your change back\n");
              System.out.println(money);
               
          } else if (money > cost) {
           
              change = money - cost;
               
              System.out.println("Enjoy your Soda");
              System.out.println("\nYour change is: ");
              System.out.println(change);
          }
          break;
      case 3:
           
          cost = 100;
          System.out.println("Ketchup costs $100, please enter your money");
          money = input.nextDouble();
          
          if (money == cost)
          {
   
              System.out.println("Enjoy your Ketchup...");  
              System.out.println("\nYou have no change"); 
               
          } else if (money < cost) {
               
              System.out.println("Sorry you need to enter more money");
              System.out.println("\nHere is your change back\n");
              System.out.println(money);
               
          } else if (money > cost) {
           
              change = money - cost;
               
              System.out.println("Enjoy your Ketchup");
              System.out.println("\nYour change is: ");
              System.out.println(change);
          }
          break;
          }
      }        
       
   }