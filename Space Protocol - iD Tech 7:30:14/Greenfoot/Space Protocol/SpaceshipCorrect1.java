import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 * Write a description of class SpaceshipCorrect1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpaceshipCorrect1 extends Actor
{
    
    
        long curTime2 = System.currentTimeMillis();
        long secs = curTime2 / 1000;
    
    /**
     * Act - do whatever the SpaceshipCorrect1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int turning = 0;
    Random rand = new Random();
    
    int mSpeed = 0;
    //int rSpeed = 0;
    
    public void movement()
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
            mSpeed ++;
        }
        if (Greenfoot.isKeyDown("down"))
        {
            mSpeed --;
        }
        //turn(rSpeed);
        move(mSpeed);
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
    
    public void shoot()
    {
         if (Greenfoot.isKeyDown("space"))
        {
            long curTime = System.currentTimeMillis();
            if(curTime >= lastAdded + 200) //1000ms = 3 seconds
            {    
            getWorld().addObject(new Laser(getRotation()), getX(), getY());
            getWorld().addObject(new Laser(getRotation() + 15), getX(), getY());
            //getWorld().addObject(new Laser(getRotation() + 30), getX(), getY());
            //getWorld().addObject(new Laser(getRotation() + 45), getX(), getY());
            //getWorld().addObject(new Laser(getRotation() + 60), getX(), getY());
            //getWorld().addObject(new Laser(getRotation() + 75), getX(), getY());
            //getWorld().addObject(new Laser(getRotation() + 90), getX(), getY());
            getWorld().addObject(new Laser(getRotation() - 15), getX(), getY());
            //getWorld().addObject(new Laser(getRotation() - 30), getX(), getY());
            //getWorld().addObject(new Laser(getRotation() - 45), getX(), getY());
            //getWorld().addObject(new Laser(getRotation() - 60), getX(), getY());
            //getWorld().addObject(new Laser(getRotation() - 75), getX(), getY());
            //getWorld().addObject(new Laser(getRotation() - 90), getX(), getY());
            //Greenfoot.playSound("Phaser.wav"); 
            lastAdded = curTime;
            }
             
        }
    }
    
    public void act() 
    {
        movement();
        shoot();
        if (System.currentTimeMillis()/1000 -10 >= secs)
        {
            int x = rand.nextInt(getWorld().getWidth() - 40) + 20;
            int y = rand.nextInt(getWorld().getHeight() - 40) + 20;
            getWorld().addObject (new EnemySpaceship1(), x, y);
            Background.enNum ++;
            curTime2 = System.currentTimeMillis();
            secs = curTime2 / 1000;
            //JOptionPane.showMessageDialog(null, Background.enNum);
        }
        //setImage(new GreenfootImage("" + Laser.myScore, 20, Color.white, Color.black));
        /*
        GreenfootImage textImage = new GreenfootImage("Text to display", 24, new Color(0, 255, 128), new Color(0, 0, 0, 0));  
        GreenfootImage image = new GreenfootImage(textImage.getWidth()+12, 36);  
        image.setColor(new Color(196, 196, 0));  
        image.fill();  
        image.setColor(new Color(0, 0, 196));  
        image.fillRect(3, 3, image.getWidth()-6, 30);  
        image.drawImage(textImage, 6, 6);
        */
    }
    
}
