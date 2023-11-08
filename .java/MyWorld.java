import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    
    GreenfootSound backgroundMusic = new GreenfootSound("space.mp3");
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    

    public MyWorld()
    {   
        super(600, 400, 1); 
        
        backgroundMusic.playLoop();
        
        addObject(new spaceship(),300,200);
        addObject(new alien(),100,100);
        addObject(new alien(),500,200);
        addObject(new star(),100,100);
        addObject(new star(),100,200);
        addObject(new star(),100,300);
        addObject(new star(),300,100);
        addObject(new star(),300,200);
        addObject(new star(),300,300);
        addObject(new star(),500,100);
        addObject(new star(),500,200);
        addObject(new star(),500,300);
    }
}
