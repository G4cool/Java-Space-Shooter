
public class Air extends Vehicle{

	int engines;
	String engineType;
	
	public Air (String com, String n, String col, int m, int g, int gM, int tS, int en, String enT){
		super(com, n, col, m, g, gM, tS);
		engines = en;
		engineType = enT;
	}
	
}
