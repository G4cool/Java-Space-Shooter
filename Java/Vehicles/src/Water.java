
public class Water extends Vehicle{
	
	int motors;
	String motorType;

	public Water (String com, String n, String col, int m, int g, int gM, int tS, int mo, String moT){
		super(com, n, col, m, g, gM, tS);
		motors = mo;
		motorType = moT;
	}
	
}
