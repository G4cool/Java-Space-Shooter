
public class SimpleClass {

	private static int number;
    
    public void setNumber (int n){  
        number = n;
    }
     
    public int getNumber (){
        return number;
    }
     
    public static void addNumbers (int x, int y) {  
        number = x + y; 
    }
	
}
