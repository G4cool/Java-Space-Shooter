
public class Plane extends Air{

	int wings;
	
	public Plane (String com, String n, String col, int m, int g, int gM, int tS, int wi, int en, String enT){
		super(com, n, col, m, g, gM, tS, en, enT);
		wings = wi;
	}
	
}
