
public class Boat extends Water{

	boolean aboveWater;
	
	public Boat (String com, String n, String col, int m, int g, int gM, int tS, int mo, String moT, boolean abW){
		super(com, n, col, m, g, gM, tS, mo, moT);
		aboveWater = abW;
	}
	
}
