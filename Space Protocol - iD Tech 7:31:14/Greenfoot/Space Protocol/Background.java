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

            public static int length = 900;
            public static int width = 450;
            public static int enNum;
            public static int myScore = 0;
            public static int healthChange = 0;
            public static int myHealth = 100;
            public static int xp = 0;
            public static int myLevel = 1;
            public static int Level2 = 50;
            public static int Level3 = 100;
            public static int Level4 = 200;
            public static int Level5 = 400;
            public static int Level6 = 800;
            public static int Level7 = 1600;
            public static int Level8 = 3200;
            public static int Level9 = 6400;
            public static int Level10 = 12800;
            public static int myGold = 0;
            public static int index = 0;
            public static int index2 = 0;

    /**
     * Constructor for objects of class 
     * 
     */
    
    Random rand = new Random();
    long pauseTime = 0;
    
    public Background()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(length, width, 1);
        enNum = 0;
        myScore = 0;
        myHealth = 100;
        int x3 = getWidth() / 2;
        int y3 = 50;
        int x4 = 600;
        int y4  = 75;
        int x5 = 600;
        int y5 = 100;
        int y6 = 125;
        //GreenfootImage image1 = new GreenfootImage("" + myScore, 20, Color.white, Color.black);
        addObject (new Score(), x3, y3);
        addObject (new Xp(), x3, y4); 
        addObject (new MyHealth100Percent(), 150, 80);
        addObject (new Gold(), x3, y5);
        addObject (new TimePassed(), x3, y6);
        //addObject (new GoldImage(), x3 - 80, y5);
        int x = rand.nextInt(getWidth() - 40) + 20;
        int y = rand.nextInt(getHeight() - 40) + 20;
        int x2 = rand.nextInt(getWidth() - 40) + 20;
        int y2 = rand.nextInt(getHeight() - 40) + 20;
        addObject (new EnemySpaceship1(), x, y);
        enNum ++;
        addObject (new EnemySpaceship1(), x2, y2);
        enNum ++;
        addObject (new SpaceshipCorrect1(), getWidth() / 2, getHeight() / 2);
   }
    
}

