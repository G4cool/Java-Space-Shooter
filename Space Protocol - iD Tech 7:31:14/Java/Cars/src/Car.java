
public class Car {

	public String name;
    public String type;
    //public String spefType;
    public String color;
    public double gas;
    public double miles;
    public int gasMileage;
    public int topSpeed;
	
	public static void print (String text) {
        System.out.println(text);
    }
	
	Car(){
        name = "BMW i8 Roadster";
        type = "coupe";
        //spefType = "coupe";
        color = "black";
        gas = 5000;
        miles = 0;
        gasMileage = 20;
        topSpeed = 180;
    }
    
    public void drive(double distance){
        miles = miles + distance;
        double quotient = distance/gasMileage;
        gas = gas - (quotient);
        //gas = gas - distance * 0.5;
        //100 gas
        //drive 100 miles
        //gas - 50
        //gas = 50
        //gas mileage/miles per gallon = 20
        //1 gallon = 20 miles
        //5 gallons = 100 miles
    }
     
    public void refuel(double refAmount){
        gas = gas + refAmount;
    }
    
    public void myCar2Method(){
    	
    	name = "Lamborghini Aventador";
        type = "coupe";
        //spefType = "coupe";
        color = "yellow";
        gas = 10000;
        miles = 0;
        gasMileage = 15;
        topSpeed = 220;
    	
    }
	
}
