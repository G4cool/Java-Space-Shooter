
public class Animal {

	String type;
	String name;
	String color;
	int age;
	int topSpeed;
	int calories;
	int caloriesBurnedPerHour;
	int distanceTraveling;
	int timeToTravel;
	int caloriesBurned;
	int caloriesFromFood;
	
	public Animal (String t, String n, String co, int a, int tS, int ca, int caBPH){
		type = t;
		name = n;
		color = co;
		age = a;
		topSpeed = tS;
		calories = ca;
		caloriesBurnedPerHour = caBPH;
	}
	
	public void travel (int dT){
		distanceTraveling = dT;
		timeToTravel = distanceTraveling / topSpeed;
		caloriesBurned = timeToTravel * caloriesBurnedPerHour;
	}
	
	public void eat (int caFF){
		caloriesFromFood = caFF;
	}
	
}
