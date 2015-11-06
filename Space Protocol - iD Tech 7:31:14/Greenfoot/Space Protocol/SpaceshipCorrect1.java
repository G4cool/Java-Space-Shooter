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
        long pauseTime = 0;//saves the time when we can start moving again
    
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
    long lastAdded2 = System.currentTimeMillis();
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
    
    public void shootMissile()
    {
         if (Greenfoot.isKeyDown("x"))
        {
            long curTime2 = System.currentTimeMillis();
            if(curTime2 >= lastAdded2 + 500) //1000ms = 3 seconds
            {    
                getWorld().addObject(new Missile(getRotation()), getX(), getY());
                //getWorld().addObject(new Missile(getRotation() + 15), getX(), getY());
                //getWorld().addObject(new Laser(getRotation() + 30), getX(), getY());
                //getWorld().addObject(new Laser(getRotation() + 45), getX(), getY());
                //getWorld().addObject(new Laser(getRotation() + 60), getX(), getY());
                //getWorld().addObject(new Laser(getRotation() + 75), getX(), getY());
                //getWorld().addObject(new Laser(getRotation() + 90), getX(), getY());
                //getWorld().addObject(new Missile(getRotation() - 15), getX(), getY());
                //getWorld().addObject(new Laser(getRotation() - 30), getX(), getY());
                //getWorld().addObject(new Laser(getRotation() - 45), getX(), getY());
                //getWorld().addObject(new Laser(getRotation() - 60), getX(), getY());
                //getWorld().addObject(new Laser(getRotation() - 75), getX(), getY());
                //getWorld().addObject(new Laser(getRotation() - 90), getX(), getY());
                //Greenfoot.playSound("Phaser.wav"); 
                lastAdded2 = curTime2;
            }
             
        }
    }
    
    public void nuke()
    {
        if (Greenfoot.isKeyDown("n") && Greenfoot.isKeyDown("u") && Greenfoot.isKeyDown("k") && Greenfoot.isKeyDown("e"))
        {
            
           World world;
           world = getWorld();
           //length = Background.length;
           //width = Background.width;
           Actor EnemySpaceship1;
           EnemySpaceship1 = getOneObjectAtOffset(0, 0, EnemySpaceship1.class);
           world = getWorld();
           world.removeObject(EnemySpaceship1);
           Background.myScore += 1 * Background.enNum;
           Background.xp += 10 * Background.enNum;
           Background.myGold += 20 * Background.enNum;
           Background.enNum = 0;
           //getWorld().addObject (new YouWon(), Background.length / 2, Background.width / 2);
        }
    }
    
    boolean hardRun = false;
    
    public void hard()
    {
        if (Greenfoot.isKeyDown("h") && Greenfoot.isKeyDown("a") && Greenfoot.isKeyDown("r") && Greenfoot.isKeyDown("d"))
        {
            
           World world;
           world = getWorld();
           //length = Background.length;
           //width = Background.width;
           int x = rand.nextInt(Background.width - 40) + 20;
           int y = rand.nextInt(Background.length - 40) + 20;
           int x2 = rand.nextInt(Background.width - 40) + 20;
           int y2 = rand.nextInt(Background.length - 40) + 20;
           int x3 = rand.nextInt(Background.width - 40) + 20;
           int y3 = rand.nextInt(Background.length - 40) + 20;
           int x4 = rand.nextInt(Background.width - 40) + 20;
           int y4 = rand.nextInt(Background.length - 40) + 20;
           int x5 = rand.nextInt(Background.width - 40) + 20;
           int y5 = rand.nextInt(Background.length - 40) + 20;
           getWorld().addObject (new EnemySpaceship1(), x, y);
           Background.enNum ++;
           getWorld().addObject (new EnemySpaceship1(), x2, y2);
           Background.enNum ++;
           getWorld().addObject (new EnemySpaceship1(), x3, y3);
           Background.enNum ++;
           getWorld().addObject (new EnemySpaceship1(), x4, y4);
           Background.enNum ++;
           getWorld().addObject (new EnemySpaceship1(), x5, y5);
           Background.enNum ++;
           hardRun = true;
           //getWorld().addObject (new YouWon(), Background.length / 2, Background.width / 2);
        }
    }
    
    public void help()
    {
        if (Greenfoot.isKeyDown("h") && Greenfoot.isKeyDown("e") && Greenfoot.isKeyDown("l") && Greenfoot.isKeyDown("p"))
        {
            
           World world;
           world = getWorld();
           //length = Background.length;
           //width = Background.width;
           int x = rand.nextInt(Background.width - 40) + 20;
           int y = rand.nextInt(Background.length - 40) + 20;
           int x2 = rand.nextInt(Background.width - 40) + 20;
           int y2 = rand.nextInt(Background.length - 40) + 20;
           int x3 = rand.nextInt(Background.width - 40) + 20;
           int y3 = rand.nextInt(Background.length - 40) + 20;
           int x4 = rand.nextInt(Background.width - 40) + 20;
           int y4 = rand.nextInt(Background.length - 40) + 20;
           int x5 = rand.nextInt(Background.width - 40) + 20;
           int y5 = rand.nextInt(Background.length - 40) + 20;
           getWorld().addObject (new EnemySpaceship1(), x, y);
           Background.enNum ++;
           getWorld().addObject (new EnemySpaceship1(), x2, y2);
           Background.enNum ++;
           getWorld().addObject (new EnemySpaceship1(), x3, y3);
           Background.enNum ++;
           getWorld().addObject (new EnemySpaceship1(), x4, y4);
           Background.enNum ++;
           getWorld().addObject (new EnemySpaceship1(), x5, y5);
           Background.enNum ++;
           //getWorld().addObject (new YouWon(), Background.length / 2, Background.width / 2);
        }
    }
    
        long lastAdded3 = System.currentTimeMillis();
        int bossNum = 0;
    
    public void boss() {
        if ((Greenfoot.isKeyDown("b") && Greenfoot.isKeyDown("o") && Greenfoot.isKeyDown("s") && Greenfoot.isKeyDown("s")) && bossNum == 0) {
            World world;
            world = getWorld();
            int x = rand.nextInt(Background.width - 40) + 20;
            int y = rand.nextInt(Background.length - 40) + 20;
            getWorld().addObject (new Boss(), x, y);
            Background.enNum ++;
            long curTime3 = System.currentTimeMillis();
            /*
            if(curTime3 >= lastAdded3 + 500) //1000ms = 3 seconds
            {    
                getWorld().addObject(new MissileBad(getRotation()), getX(), getY()); 
                lastAdded3 = curTime3;
            }
            */
            bossNum = bossNum + 1;
        }
    }
    
   public boolean running() //are we running or are we paused  
    {  
        long time = System.currentTimeMillis();  
        return time > pauseTime;  
    }  
   public void pause(long delay) //delay represents how long we are delaying for  
   {  
       long time = System.currentTimeMillis();  
       pauseTime = time+delay;//redefine pauseTime so it is in the future-exactly delay milliseconds in the future  
   }
   
    public void act() 
    {
        movement();
        shoot();
        shootMissile();
        //shootBeam();
        Actor SpaceshipCorrect1;
        SpaceshipCorrect1 = getOneObjectAtOffset(0, 0, SpaceshipCorrect1.class);
        nuke();
        if (hardRun == false)
        {
            hard();
        }
        help();
        boss();
        if (Background.enNum > 0 || SpaceshipCorrect1 != null)
        {
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
        }
        if (Background.enNum == 0)
        {
           World world;
           world = getWorld();
           //length = Background.length;
           //width = Background.width;
           getWorld().addObject (new YouWon(), Background.length / 2, Background.width / 2);
        }
        //do
        //for (int index = 0; index > 0; index++)
        //{
           // Background.index++;
            //youWonMethod();
           // pause(3000);
            //delayMethod();
        //} while (Background.index == 1);
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
