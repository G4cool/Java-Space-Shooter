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
   int myHealth;
   public EnemySpaceship1Laser(int dir) {
       setRotation(dir);
       //setDirection(direction);
   } 
    public void act() 
    {
        move(5);
        killEnemies();
        isWorldEdge();
    }    
    
    int length;
    int width;
    
    public void killEnemies()
    {
        Actor SpaceshipCorrect1;
        SpaceshipCorrect1 = getOneObjectAtOffset(0, 0, SpaceshipCorrect1.class);
        if (SpaceshipCorrect1 != null)
        {
            myHealth = 100;
            //enemyHealth -= 20;
            //setImage(new GreenfootImage(java.lang.String string, int size, java.awt.Color foreground, java.awt.Color background));
            //if (enemyHealth <= 0){
            World world;
            world = getWorld();
            world.removeObject(SpaceshipCorrect1);
                length = Background.length;
                width = Background.width;
                getWorld().addObject (new YouLost(), length / 2, width / 2);
                //Greenfoot.setWorld(new YouWon());


           //}
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
