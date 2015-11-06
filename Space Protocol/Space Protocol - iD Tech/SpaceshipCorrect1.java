import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpaceshipCorrect1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpaceshipCorrect1 extends Actor
{
    /**
     * Act - do whatever the SpaceshipCorrect1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int turning = 0;
    
    public void movement()
    {
        if (Greenfoot.isKeyDown("left"))
        {
           turn(-3);
           turning = turning - 3;
        }
        if (Greenfoot.isKeyDown("right"))
        {
            turn(3);
            turning = turning + 3;
        }
        if (Greenfoot.isKeyDown("up"))
        {
            move(3);
        }
        if (Greenfoot.isKeyDown("down"))
        {
            move(-3);
        }
        
        if (Greenfoot.isKeyDown("space"))
        {
            long curTime = System.currentTimeMillis();
            if(curTime >= lastAdded + 200) //1000ms = 3 seconds
            {    
            getWorld().addObject(new Laser(getRotation()), getX(), getY());
            //Greenfoot.playSound("Phaser.wav"); 
            lastAdded = curTime;
            }
             
        }
    }
    
    public void eat()
        {
            Actor EnemySpaceship1;
            EnemySpaceship1 = getOneObjectAtOffset(0, 0, EnemySpaceship1.class);
            if (EnemySpaceship1 != null)
            {
                World world;
                world = getWorld();
                world.removeObject(EnemySpaceship1);
                myScore += 1;
            }
        }
    
    long lastAdded = System.currentTimeMillis();
    int myScore = 0;
    
    public void act() 
    {
        movement();
        //eat();
    }
    
}
