
public abstract class RunFizzBuzzActual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int x = 1;
		
			do{
				
				int y = x%3;
				int z = x%5;
				
				if (y == 0 && z == 0){
					System.out.println("fizz buzz");
				} else if (y == 0){
					System.out.println("fizz");
				} else if (z == 0){
					System.out.println("buzz");
				}
				else{
					System.out.println(x);
				}
				
				x = x + 1;
				
			} while (x < 101);
		
	}

}
