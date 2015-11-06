import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spaceship1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spaceship1 extends Actor
{
    /**
     * Act - do whatever the Spaceship1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.isKeyDown("left"))
        {
            turn(-3);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            turn(3);
        }   
        if (Greenfoot.isKeyDown("up"))
        {
            move(3);
        }   
        if (Greenfoot.isKeyDown("down"))
        {
            move(-3);
        }
    }
}
