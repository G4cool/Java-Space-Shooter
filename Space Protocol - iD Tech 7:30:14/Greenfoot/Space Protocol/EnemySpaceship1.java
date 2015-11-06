import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemySpaceship1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemySpaceship1 extends Actor
{
    /**
     * Act - do whatever the EnemySpaceship1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void randomMovement()
    {
        move(3);
        if (Greenfoot.getRandomNumber(100) < 10)
        {
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
        if (getX() <= 5 || getX() >= getWorld().getWidth() - 5)
        {
            turn(180);
        }
        if (getY() <= 5 || getY() >= getWorld().getHeight() - 5)
        {
            turn(180);
        }
         
    }
    
    long lastAdded = System.currentTimeMillis();
    int myScore = 0;
    
    public void shoot()
    {
        {
            long curTime = System.currentTimeMillis();
            if(curTime >= lastAdded + 400) //1000ms = 3 seconds
            {    
            getWorld().addObject(new EnemySpaceship1Laser(getRotation()), getX(), getY());
            //Greenfoot.playSound("Phaser.wav"); 
            lastAdded = curTime;
            }
             
        }
    }
    
    public void act() 
    {
        randomMovement();
        shoot();
    }  
}
