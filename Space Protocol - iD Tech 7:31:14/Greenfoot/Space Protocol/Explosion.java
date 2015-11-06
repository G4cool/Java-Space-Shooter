import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Explosion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Explosion extends Actor
{
    /**
     * Act - do whatever the Explosion wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //appear();
        // Add your action code here.
    }
    
    long lastAdded = System.currentTimeMillis();
    
    public void appear()
    {
        if (Missile.destroy == true)
        {
            World world;
            world = getWorld();
            getWorld().addObject(new Explosion(), Missile.posX, Missile.posY);
            long curTime = System.currentTimeMillis();
            if(curTime >= lastAdded + 500) //1000ms = 1 seconds
            {
                world.removeObject(this);
                lastAdded = curTime;
            }
        }
    }
}
