 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class YouWon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class YouWon extends Actor
{
    /**
     * Act - do whatever the YouWon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    long pauseTime = 0;
    
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
    
    int length;
    int width;
    
    public void act()
    {
       //int length;
       //int width;
   
       if (Background.enNum == 0)
       {
           length = Background.length;
           width = Background.width;
           getWorld().addObject (new YouWon(), length / 2, width / 2);
       
                //long lastAdded2 = System.currentTimeMillis();
                //long curTime3 = System.currentTimeMillis();
                //long curTime3 = System.currentTimeMillis();
                //long seconds = curTime3 / 1000;
                //sleep = 3;
                //try {
                    //TimeUnit.SECONDS.sleep(sleep);
                //} catch(InterruptedException ex) {
                    //Thread.currentThread().interrupt();
                //}
                //Greenfoot.delay(3);
                //long curTime3 = System.currentTimeMillis();
                //long secs2 = curTime3 / 1000;
                //long curTime4;
                //long secs3;
                //do
                //{
                    //getWorld().addObject (new YouWon(), length / 2, width / 2);
                    //curTime4 = System.currentTimeMillis();
                    //secs3 = curTime3 / 1000;
                //} while (curTime4 / 1000 < curTime3 / 1000 + 3);
                //if (System.currentTimeMillis()/1000 - 3 >= secs2)
                //{
                //do
                //{
                pause(3000);
                Actor YouWon;
                YouWon = getOneObjectAtOffset(0, 0, YouWon.class);
                World world;
                world = getWorld();
                world.removeObject(this);
                Background.xp += 50;
                Background.myGold += 100;
                if (Background.xp >= 50 && Background.xp < 100){
                    Background.myLevel = 2;
                    getWorld().addObject (new Level(), getWorld().getWidth() / 2, getWorld().getHeight() / 2);
                } else if (Background.xp >= 100 && Background.xp < 200){
                    Background.myLevel = 3;
                    getWorld().addObject (new Level(), getWorld().getWidth() / 2, getWorld().getHeight() / 2);
                } else if (Background.xp >= 200 && Background.xp < 400){
                    Background.myLevel = 4;
                    getWorld().addObject (new Level(), getWorld().getWidth() / 2, getWorld().getHeight() / 2);
                } else if (Background.xp >= 400 && Background.xp < 800){
                    Background.myLevel = 5;
                    getWorld().addObject (new Level(), getWorld().getWidth() / 2, getWorld().getHeight() / 2);
                } else if (Background.xp >= 800 && Background.xp < 1600){
                    Background.myLevel = 6;
                    getWorld().addObject (new Level(), getWorld().getWidth() / 2, getWorld().getHeight() / 2);
                } else if (Background.xp >= 1600 && Background.xp < 3200){
                    Background.myLevel = 7;
                    getWorld().addObject (new Level(), getWorld().getWidth() / 2, getWorld().getHeight() / 2);
                } else if (Background.xp >= 3200 && Background.xp < 6400){
                    Background.myLevel = 8;
                    getWorld().addObject (new Level(), getWorld().getWidth() / 2, getWorld().getHeight() / 2);
                } else if (Background.xp >= 6400 && Background.xp < 12800){
                    Background.myLevel = 9;
                    getWorld().addObject (new Level(), getWorld().getWidth() / 2, getWorld().getHeight() / 2);
                } else if (Background.xp >= 12800){
                    Background.myLevel = 10;
                    getWorld().addObject (new Level(), getWorld().getWidth() / 2, getWorld().getHeight() / 2);
                }
                //curTime3 = System.currentTimeMillis();
                //secs2 = curTime3 / 1000;
                    //index2++;
                    //Greenfoot.setWorld(new YouWon());
                    //lastAdded2 = curTime3;
                //}
                //} while (index2 <= 0);
       }
    }   
    
}
