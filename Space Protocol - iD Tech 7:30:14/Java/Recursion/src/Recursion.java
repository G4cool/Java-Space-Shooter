
public class Recursion {
	
	public static int counting (int num){
		if (num >= 10000001){
			return num;
		}
		else {
			System.out.println(num);
			return counting(1/(num+3));
		}
	}

}
