
public class Factorial {
	
	public static int counting (int num1, int num2){
		if (num1 <= 0){
			return num2;
		}
		else {
			System.out.println(num2);
			return counting(num1-1, num2 * num1);
		}
	}

}
