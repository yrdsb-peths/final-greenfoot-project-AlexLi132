import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * EnemyShip Superclass
 * 
 * @author Alex
 * @version June 10
 */
public class EnemyShip extends Actor
{
    /**
     * Act - do whatever the EnemyShip wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act()
    {
        // Add your action code here.
    }
     /**
     * Makes the planets fall
     */
    public void fall()
    {
        setLocation(getX(),getY()+3); 
    }
    
}
