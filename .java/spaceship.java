import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class spaceship here.
 * 
 * @Caroline Kirkconnell (CarolineKirkconnell8@gmail.com)
 * @final
 */
public class spaceship extends Actor
{
    /**
     * Act - do whatever the spaceship wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(5);
        
        if(isTouching(star.class))
        {   
            removeTouching(star.class);
            Greenfoot.playSound("yay.wav");
        }
        
        if(Greenfoot.isKeyDown("left"))
        {   
            turn(-5);
        }    
        
        if(Greenfoot.isKeyDown("right"))
        {   
            turn(5);
        } 
    }   
}
