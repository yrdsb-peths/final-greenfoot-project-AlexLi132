import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lazer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Lazer extends Actor
{
    /**
     * Act - do whatever the Lazer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    static int health2 = 2; 
    public void act()
    {
        
        
        setLocation(getX(), getY() -5); 
        
        hitEnemy1();
        
        remove(); 
    }
    public void remove()
    {
        if(getY()==0)
        {
            getWorld().removeObject(this); 
        }
    }
    public void hitEnemy1()
    {
        if(isTouching(EnemyShip1.class))
        {
            removeTouching(EnemyShip.class);
            MyWorld world = (MyWorld) getWorld();
            world.increaseScore();
            
        }
    }
    
}
