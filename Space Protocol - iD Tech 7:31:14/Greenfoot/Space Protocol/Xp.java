import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class Xp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Xp extends Actor
{
    /**
     * Act - do whatever the Xp wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(new GreenfootImage("Your xp: " + Background.xp, 20, Color.white, Color.black));
    }
}
