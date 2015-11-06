import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemySpaceship1Laser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemySpaceship1Laser extends Actor
{
    /**
     * Act - do whatever the EnemySpaceship1Laser wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   //int myHealth;
   boolean gone;
   public EnemySpaceship1Laser(int dir) {
       setRotation(dir);
       //setDirection(direction);
   } 
    public void act() 
    {
        move(5);
        killEnemies();
        if (gone == false){
            isWorldEdge();
        }

    }    
    
    int length;
    int width;
    
    public void killEnemies()
    {
        Actor SpaceshipCorrect1;
        SpaceshipCorrect1 = getOneObjectAtOffset(0, 0, SpaceshipCorrect1.class);
        if (SpaceshipCorrect1 != null)
        {
            //myHealth = 100;
            Background.myHealth -= 20;
            World world;
            world = getWorld();
            //setImage(new GreenfootImage(java.lang.String string, int size, java.awt.Color foreground, java.awt.Color background));
            if (Background.myHealth <= 0){
                world = getWorld();
                world.removeObject(SpaceshipCorrect1);
                length = Background.length;
                width = Background.width;
                getWorld().addObject (new YouLost(), length / 2, width / 2);
                //setImage(new GreenfootImage("" + Background.xp, 20, Color.white, Color.black));
                //Greenfoot.setWorld(new YouWon());
           }
            world.removeObject(this);
            gone = true;
        }
    }
    
    public void isWorldEdge()  
    {   
        if(atWorldEdge()  )
        {  
        
        World world;  
        world = getWorld();  
        world.removeObject(this);  
        
    }  
   }

   public boolean atWorldEdge()  
    {  
    if(getX() < 20 || getX() > getWorld().getWidth() - 20)  
    return true;  
    else if(getY() < 20 || getY() > getWorld().getHeight() - 20)  
    return true;  
    else  
    return false;  
   }
    
}
