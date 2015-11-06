import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class Laser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

/*
public class Laser extends Actor
{
    /**
     * Act - do whatever the Laser wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    /*
    private int direction, speed;
    public void Bullet(int dir)
    {
        direction = dir;
        speed = 15;
    }
    
    public void act() 
    {
        setRotation(direction);
        move(speed);
    }    
}
*/

/*
public class Laser extends Actor  
  
{  
private int direction, speed;  
    public Laser(int dir)  
    {  
        direction = dir;  
        speed = 15;  
    }  
    /** 
     * Act - do whatever the bullet wants to do. This method is called whenever 
     * the 'Act' or 'Run' button gets pressed in the environment. 
     */  
    /*
    public void act()   
    {  
        setLocation(getX() + speed, getY());  
        isWorldEdge();  
        setRotation(direction);  
        move(speed);  
    }  
        public void isWorldEdge()  
    {   
            if(atWorldEdge() == true )  
            {  
        Actor Laser;  
        Laser = getOneObjectAtOffset(0, 0, Laser.class);  
        if (Laser != null)  
        {  
        World world;  
        world = getWorld();  
        world.removeObject(this);  
        }  
    }  
}  
    public boolean atWorldEdge()  
    {  
    if(getX() < 20 || getX() > getWorld().getWidth() - 20)  
    return true;  
    if(getY() < 20 || getY() > getWorld().getHeight() - 20)  
    return true;  
    else  
    return false;  
}  
}  
*/

public class Laser extends Actor  
{  
   int myScore = 0;
   int enemyHealth;
   int myHealth;
   public Laser(int dir) {
       setRotation(dir);
       //setDirection(direction);
   } 
   public void act()  
   {  
       move(5);
       killEnemies();
       isWorldEdge();
       //checkBoundaries();  
       //destroyEnemies();  
   }  
   //we add a method "checkBoundaries()" that destroys bullets that are off screen.  
   //public void checkBoundaries()  
   //{  
       //if(getX() > getWorld().getWidth() - 1)   
            //getWorld().removeObject(this);  
       //else if(getX() < 1)   
            //getWorld().removeObject(this);  
       //if(getY() > getWorld().getHeight() - 1)   
            //getWorld().removeObject(this);  
       //else if(getY() < 1)   
            //getWorld().removeObject(this);  
   //}  
   //"destroyEnemies()" destroys enemies.
   //boolean inGame;
   //Actor EnemySpaceship1 = getOneIntersectingObject(EnemySpaceship1.class);
   //public void destroyEnemies()  
   //{  
       //"Enemy" can be any class that you want the bullet to destroy.
       //do {
           //inGame = true;
           //Actor EnemySpaceship1 = getOneIntersectingObject(EnemySpaceship1.class);  
           //if(EnemySpaceship1 != null) {  
                //getWorld().removeObject(EnemySpaceship1);  
                //getWorld().removeObject(this);
                //inGame = false;
           //}  
       //} while (inGame = true);
   //}
   
   public void killEnemies()
    {
        Actor EnemySpaceship1;
        EnemySpaceship1 = getOneObjectAtOffset(0, 0, EnemySpaceship1.class);
        if (EnemySpaceship1 != null)
        {
            enemyHealth = 50;
            enemyHealth -= 10;
            //setImage(new GreenfootImage(java.lang.String string, int size, java.awt.Color foreground, java.awt.Color background));
            if (enemyHealth <= 0){
                World world;
                world = getWorld();
                world.removeObject(EnemySpaceship1);
                myScore += 1;

           }
        }
    }
    
   public void isWorldEdge()  
    {   
        if(atWorldEdge() == true )  
        {  
        Actor Laser;  
        Laser = getOneObjectAtOffset(0, 0, Laser.class);  
        if (Laser != null)  
        {  
        World world;  
        world = getWorld();  
        world.removeObject(Laser);  
        }  
    }  
   }

   public boolean atWorldEdge()  
    {  
    if(getX() < 20 || getX() > getWorld().getWidth() - 20)  
    return true;  
    if(getY() < 20 || getY() > getWorld().getHeight() - 20)  
    return true;  
    else  
    return false;  
   }  
  
   private int speed = 10;  
}  
