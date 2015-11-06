import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss extends Actor
{
    /**
     * Act - do whatever the Boss wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        movement();
        missile();
    }
    
    public void movement() {
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
    
    public void missile() {
        long curTime = System.currentTimeMillis();
        if(curTime >= lastAdded + 500) //1000ms = 3 seconds
        {    
            getWorld().addObject(new MissileBad(getRotation()), getX(), getY()); 
            lastAdded = curTime;
        }
    }
}
