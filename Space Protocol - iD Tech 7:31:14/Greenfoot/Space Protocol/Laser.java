import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.util.concurrent.*;

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
   
   //long curTime3 = System.currentTimeMillis();
   //long secs2 = curTime3 / 1000;
   
   int myScore = 0;
   int enemyHealth;
   int myHealth;
   boolean gone;
   public Laser(int dir) {
       setRotation(dir);
       //setDirection(direction);
   } 
   public void act()  
   {  
       move(10);
       killEnemies();
       if (gone == false)
       {
           isWorldEdge();
       }
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
   
   int length;
   int width;
   //int sleep;
   long lastAdded2 = System.currentTimeMillis();
   //int index = 0;
   
   public void killEnemies()
    {
        Actor EnemySpaceship1;
        EnemySpaceship1 = getOneObjectAtOffset(0, 0, EnemySpaceship1.class);
        if (EnemySpaceship1 != null)
        {
            //long curTime3 = System.currentTimeMillis();
            enemyHealth = 50;
            //enemyHealth -= 10;
            //setImage(new GreenfootImage(java.lang.String string, int size, java.awt.Color foreground, java.awt.Color background));
            //if (enemyHealth <= 0){
            World world;
            world = getWorld();
            world.removeObject(EnemySpaceship1);
            world.removeObject(this);
            gone = true;
            Background.myScore += 1;
            Background.enNum --;
            Background.xp += 10;
            Background.myGold += 20;
            //Background.enNum = 0;
            //if (Background.enNum == 0)
            //{
               //for (int index = 0; index >= 0; index++)
               //{
                //do
                //{
                    //length = Background.length;
                    //width = Background.width;
                    //getWorld().addObject (new YouWon(), length / 2, width / 2);
                    //delay(3);
                    //Background.index++;
                //} while (Background.index <= 0);
               //}

            //}
            //length = Background.length;
            //width = Background.width;
            //if (Background.enNum == 0)
            //{
                //getWorld().addObject (new YouWon(), length / 2, width / 2);
            //}
            /*
            if (Background.enNum == 0)
            {
                //long lastAdded2 = System.currentTimeMillis();
                //long curTime3 = System.currentTimeMillis();
                //long curTime3 = System.currentTimeMillis();
                //long seconds = curTime3 / 1000;
                //sleep = 3;
                //try {
                    //TimeUnit.SECONDS.sleep(sleep);
                //} catch(InterruptedException ex) {
                    //Thread.currentThread().interrupt();
                //}
                long curTime3 = System.currentTimeMillis();
                long secs2 = curTime3 / 1000;
                long curTime4;
                long secs3;
                do
                {
                    //getWorld().addObject (new YouWon(), length / 2, width / 2);
                    curTime4 = System.currentTimeMillis();
                    secs3 = curTime3 / 1000;
                } while (curTime4 / 1000 < curTime3 / 1000 + 3);
                //if (System.currentTimeMillis()/1000 - 3 >= secs2)
                //{
                    Actor YouWon;
                    YouWon = getOneObjectAtOffset(0, 0, YouWon.class);
                    world  = getWorld();
                    world.removeObject(YouWon);
                    Background.xp += 50;
                    Background.myGold += 100;
                    if (Background.xp >= 50 && Background.xp < 100){
                        Background.myLevel = 2;
                        getWorld().addObject (new Level(), getWorld().getWidth() / 2, getWorld().getHeight() / 2);
                    } else if (Background.xp >= 100 && Background.xp < 200){
                        Background.myLevel = 3;
                        getWorld().addObject (new Level(), getWorld().getWidth() / 2, getWorld().getHeight() / 2);
                    } else if (Background.xp >= 200 && Background.xp < 400){
                        Background.myLevel = 4;
                        getWorld().addObject (new Level(), getWorld().getWidth() / 2, getWorld().getHeight() / 2);
                    } else if (Background.xp >= 400 && Background.xp < 800){
                        Background.myLevel = 5;
                        getWorld().addObject (new Level(), getWorld().getWidth() / 2, getWorld().getHeight() / 2);
                    } else if (Background.xp >= 800 && Background.xp < 1600){
                        Background.myLevel = 6;
                        getWorld().addObject (new Level(), getWorld().getWidth() / 2, getWorld().getHeight() / 2);
                    } else if (Background.xp >= 1600 && Background.xp < 3200){
                        Background.myLevel = 7;
                        getWorld().addObject (new Level(), getWorld().getWidth() / 2, getWorld().getHeight() / 2);
                    } else if (Background.xp >= 3200 && Background.xp < 6400){
                        Background.myLevel = 8;
                        getWorld().addObject (new Level(), getWorld().getWidth() / 2, getWorld().getHeight() / 2);
                    } else if (Background.xp >= 6400 && Background.xp < 12800){
                        Background.myLevel = 9;
                        getWorld().addObject (new Level(), getWorld().getWidth() / 2, getWorld().getHeight() / 2);
                    } else if (Background.xp >= 12800){
                        Background.myLevel = 10;
                        getWorld().addObject (new Level(), getWorld().getWidth() / 2, getWorld().getHeight() / 2);
                    }
                    curTime3 = System.currentTimeMillis();
                    secs2 = curTime3 / 1000;
                    //Greenfoot.setWorld(new YouWon());
                    //lastAdded2 = curTime3;
                //}
            }
            */

           //}
        }
    }
    
   //int index2 = 0;
   
   public void isWorldEdge()  
    {   
        if(atWorldEdge()  )
        {  
        
        World world;  
        world = getWorld();  
        world.removeObject(this);  
        
    }  
   }

   public boolean atWorldEdge()  
    {  
    if(getX() < 20 || getX() > getWorld().getWidth() - 20)  
    return true;  
    else if(getY() < 20 || getY() > getWorld().getHeight() - 20)  
    return true;  
    else  
    return false;  
   }  
  
   private int speed = 10;  
}  
