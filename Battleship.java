import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Battleship
 * 
 * @author Alex
 * @version June 5
 */

public class Battleship extends Actor
{
    static boolean canFire = true;
    /**
     * Act - do whatever the Battleship wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            MyWorld world = (MyWorld) getWorld();
            move(-world.speed);
            
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            MyWorld world = (MyWorld) getWorld();
            move(world.speed);
            
        }
        fireLazer(); 
        
        
    }
    public void fireLazer()
    {
        if(Greenfoot.isKeyDown("e") && canFire == true)
        {
            getWorld().addObject(new Lazer(), getX(), getY()-30);
            canFire = false; 
        }
        else if (!Greenfoot.isKeyDown("e"))
        {
            canFire = true; 
            
        }
    }
}
