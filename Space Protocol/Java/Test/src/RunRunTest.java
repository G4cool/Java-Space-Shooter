import java.util.concurrent.*;

public class RunRunTest {

	public static void sleep (int s){
    	try {
    		TimeUnit.SECONDS.sleep(s);
		} catch(InterruptedException ex) {
    		Thread.currentThread().interrupt();
    	}
    }
	
	public static void print (String text) {
        System.out.println(text);
    }
	
}
