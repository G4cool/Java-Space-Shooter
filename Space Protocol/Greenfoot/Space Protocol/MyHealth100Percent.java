import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyHealth100Percent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyHealth100Percent extends Actor
{
    /**
     * Act - do whatever the MyHealth100Percent wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Background.myHealth == 100){
            setImage("MyHealth100.png");
        } else if (Background.myHealth == 80){
            setImage("MyHealth80.png");
        } else if (Background.myHealth == 60){
            setImage("MyHealth60.png");
        } else if (Background.myHealth == 40){
            setImage("MyHealth40.png");
        } else if (Background.myHealth == 20){
            setImage("MyHealth20.png");
        } else if (Background.myHealth == 0){
            setImage("MyHealth0.png");
        }
    }
}
