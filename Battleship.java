import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Battleship
 * 
 * @author Alex
 * @version June 5
 */

public class Battleship extends Actor
{
    /**
     * Act - do whatever the Battleship wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            move(-2);
            
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(2);
            
        }
        
        
        
    }
    
}
