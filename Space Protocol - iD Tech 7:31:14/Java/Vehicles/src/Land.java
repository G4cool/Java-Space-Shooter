
public class Land extends Vehicle{
	
	int wheels;
	String powerHow; // Like engine or something else like that.
	String powerType; // Like electricity or something else like that.
	
	public Land (String com, String n, String col, int m, int g, int gM, int tS, int wh, String poH, String poT){
		super(com, n, col, m, g, gM, tS);
		wheels = wh;
		powerHow = poH;
		powerType = poT;
	}
	
}
