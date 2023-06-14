import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyShip1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpeedPowerup extends EnemyShip
{
    /**
     * Act - do whatever the EnemyShip1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int healthSpeed = 3; 
    public SpeedPowerup()
    {
        
    }
    public void act()
    {
        moveAround(); 
        hitEnemySpeed(); 
        
        
    }
    public void hitEnemySpeed()
    {
        Actor projectile = getOneIntersectingObject(Lazer.class);
        if(projectile != null)
        {
            getWorld().removeObject(projectile); 
            healthSpeed--;
        }
        if(healthSpeed == 0)
        {
            MyWorld world = (MyWorld) getWorld();
            world.increaseSpeed();
            getWorld().removeObject(this); 
            
            
        }
    }
}
