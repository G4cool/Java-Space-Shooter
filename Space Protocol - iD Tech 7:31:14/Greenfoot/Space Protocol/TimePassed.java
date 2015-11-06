import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class TimePassed here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TimePassed extends Actor
{
    /**
     * Act - do whatever the TimePassed wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int timeElapsed = 0;
    public void act() 
    {
        setImage(new GreenfootImage("Time elapsed: " + timeElapsed + " sec", 20, Color.white, Color.black));
        timer();
        // Add your action code here.
    }
    
    long beginSec = System.currentTimeMillis();
    
    public void timer()
    {
        long curTime = System.currentTimeMillis();
        if(curTime >= beginSec + 1000) //1000ms = 1 seconds
        {
            timeElapsed++;
            beginSec = curTime;
        }
    }
}
