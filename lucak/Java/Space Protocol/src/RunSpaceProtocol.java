import java.util.Scanner;
import java.util.Random;

public class RunSpaceProtocol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner scan = new Scanner (System.in);
			Random rand = new Random();
			String response;
			space space = new space();
			
			do {
				
				/*
				String characterName;
				String shipName;
				String shipType;
				int attack;
				int defense;
				int speed;
				double damage;
				double health;
				double topSpeed;
				int xp = 0;
				int intLevel = 1;
				int level1 = 0;
				int level2 = 50;
				int level3 = 100;
				int level4 = 200;
				int level5 = 400;
				int level6 = 800;
				int level7 = 1600;
				int level8 = 3200;
				int level9 = 6400;
				int level10 = 128000;
				String stringLevel = "Level 1";
				
				space.print("What would you like to name your character?");
				characterName = scan.nextLine();
				
				space.print("Ok, " + characterName + ".  What would you like to name your spaceship?");
				shipName = scan.nextLine();
				
				space.print("What class would you like your ship to be?  Attacking, defensive, or fast?  Enter a for attacking, d for defensive, and f for fast.");
				space.print("Attacking: Attack: 75  Defense: 25  Speed: 50");
				space.print("Defensive: Attack: 25  Defense: 75  Speed: 50");
				space.print("Fast: Attack: 25  Defense: 50  Speed: 75");
				shipType = scan.nextLine();
				
				if (shipType.equals("a")){
					attack = 75;
					defense = 25;
					speed = 50;
					damage = attack * 1.5;
					health = defense * 1.5;
					topSpeed = speed * 1.5;
					space.print("These are " + shipName + "'s stats: Attack: 75  Defense: 25  Speed: 50");
					space.print("Your ship " + shipName + " can deal " + damage + " damage, its health is " + health + ", and its top speed is " + topSpeed + ".");
				} else if (shipType.equals("d")){
					attack = 25;
					defense = 75;
					speed = 50;
					damage = attack * 1.5;
					health = defense * 1.5;
					topSpeed = speed * 1.5;
					space.print("These are " + shipName + "'s stats: Attack: 25  Defense: 75  Speed: 50");
					space.print("Your ship " + shipName + " can deal " + damage + " damage, its health is " + health + ", and its top speed is " + topSpeed + ".");
				} else if (shipType.equals("f")){
					attack = 25;
					defense = 50;
					speed = 75;
					damage = attack * 1.5;
					health = defense * 1.5;
					topSpeed = speed * 1.5;
					space.print("These are " + shipName + "'s stats: Attack: 25  Defense: 50  Speed: 75");
					space.print("Your ship " + shipName + " can deal " + damage + " damage, its health is " + health + ", and its top speed is " + topSpeed + ".");
				}
				else {
					space.print("Because you entered an invalid option, you have been given a ship with random stats.");
					attack = rand.nextInt(101);
					defense = rand.nextInt(101);
					speed = rand.nextInt(101);
					damage = attack * 1.5;
					health = defense * 1.5;
					topSpeed = speed * 1.5;
				}
				
				space.print("It is now time to go out into the universe and do stuff.");
				*/
				
				space.intro();
				
				/*
				space.print("You have encountered an enemy ship.  Would you like to battle it?  Enter y for yes and n for no.  If you try to avoid it, and the enemy ship has a greater top speed, your ship will be destroyed.");
				// Add part about looping back to fighting because just dying is kind of unfair or weird or whatever, and so fix the text that is printed out above.
				String ans1 = scan.nextLine();
				
				int attEn = rand.nextInt(76);//reduce down to 76
				int defEn = rand.nextInt(76);
				int speEn = rand.nextInt(76);
				double damEn = attEn * 1.5;
				double heaEn = defEn * 1.5;
				double topEn = speEn * 1.5;
				int levEn = intLevel;
				
				space.print("The enemy ship's stats are: Attack: " + attEn + "  Defense: " + defEn + "  Speed: " + speEn);
				space.print("The enemy ship can deal " + damEn + " damage, its health is " + heaEn + ", and its top speed is " + topEn + ".");
				
				if (ans1.equals("y")){
						heaEn = heaEn - damage;
						if (heaEn <= 0){
							xp = xp + 50;
							space.print("You have defeated your first enemy and gained 50 xp!");
							if (xp >= 50){
								stringLevel = "Level 2";
								intLevel = 2;
								System.out.println("You are now " + stringLevel + "!");
							}
						} else if (heaEn > 0){
							double damageDone = heaEn;
							space.print("You have done " + damage + " damage to the enemy ship!");
							health = health - damEn;
							if (health <= 0){
								space.print("The enemy ship has defeated you.");
							} else if (health > 0){
								double damDone = health;
								space.print("The enemy ship has done " + damEn + " damage to your ship.");
								do {
									heaEn = heaEn - damage;
									if (heaEn <= 0){
										xp = xp + 50;
										space.print("You have defeated your first enemy and gained 50 xp!");
										if (xp >= 50){
											stringLevel = "Level 2";
											intLevel = 2;
											space.print("You are now " + stringLevel + "!");
										}
									} else if (heaEn > 0){
										damageDone = heaEn;
										space.print("You have done " + damage + " damage to the enemy ship!");
										health = health - damEn;
										if (health <= 0){
											space.print("The enemy ship has defeated you.");
										} else if (health > 0){
											damDone = health;
											space.print("The enemy ship has done " + damEn + " damage to your ship.");
										}
									}
								} while (heaEn > 0 || health > 0);							}
						}
				} else if (ans1.equals("n")){
					if (topSpeed > topEn){
						space.print("You have avoided the enemy ship.");
					} else if (topSpeed <= topEn){
						space.print("You were not able to avoid the enemy ship, and in the proccess you have been destroyed.");
						// Add part about looping back to fighting because just dying is kinda unfair or weird or whatever.
					}
				}
				*/
				
				space.fight1();
				
				space.print("Would you like to play again?  Enter y for yes and n for no.");
				response = scan.nextLine();
				
			} while (response.equals("y"));
		
	}

}
