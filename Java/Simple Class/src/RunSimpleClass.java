
public class RunSimpleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleClass one = new SimpleClass();
        SimpleClass two = new SimpleClass();
 
        one.setNumber(10);
 
        System.out.println("Value of number in class one: " + one.getNumber());
 
        two.setNumber(20);
 
        System.out.println("Value of number in class two: " + two.getNumber());
 
        System.out.println("Value of number in class one: " + one.getNumber());
 
        SimpleClass.addNumbers(40, 3);
 
        System.out.println ("Value of number in class one: " + one.getNumber());
        System.out.println ("Value of number in class two: " + two.getNumber());
		
	}

}
