import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
import java.awt.Color;

/**
 * Write a description of class Background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Background extends World
{

            public static int length = 1200;
            public static int width = 800;
            public static int enNum;
            public static int myScore = 0;

    /**
     * Constructor for objects of class Background.
     * 
     */
    
    Random rand = new Random();
    
    public Background()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(length, width, 1);
        enNum = 0;
        myScore = 0;
        int x3 = 600;
        int y3 = 50;
        //GreenfootImage image1 = new GreenfootImage("" + myScore, 20, Color.white, Color.black);
        addObject (new Score(), x3, y3);
        int x = rand.nextInt(getWidth() - 40) + 20;
        int y = rand.nextInt(getHeight() - 40) + 20;
        int x2 = rand.nextInt(getWidth() - 40) + 20;
        int y2 = rand.nextInt(getHeight() - 40) + 20;
        addObject (new EnemySpaceship1(), x, y);
        enNum ++;
        addObject (new EnemySpaceship1(), x2, y2);
        enNum ++;
    }
}
