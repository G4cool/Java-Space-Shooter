
public class RunFoo {
	static int x = 2;
	
	public static void foo_1(){
	    int x = 5;
	    foo_2();
	    System.out.println("x in foo_1 = " + x);
	}
	 
	public static void foo_2(){
	    int x = 10;
	    System.out.println("X in foo_2 = " +x);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			System.out.println("value of x before calling foo_1 is " + x);
		 
	        foo_1();
	 
	        System.out.println("value of x after calling foo_1 is " + x);
			
	}

}
