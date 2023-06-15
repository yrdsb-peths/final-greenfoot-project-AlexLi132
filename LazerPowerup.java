import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Powerup that increases speed
 * 
 * @author Alex
 * @version June 12
 */
public class LazerPowerup extends EnemyShip
{
    /**
     * Act - do whatever the EnemyShip1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int healthLazer = 3; 
    
    public void act()
    {
        fall(); 
        hitEnemyLazer(); 
        
        
    }
     /**
     * Increases lazer power when hit 
     */
    public void hitEnemyLazer()
    {
        Actor projectile = getOneIntersectingObject(Lazer.class);
        if(projectile != null)
        {
            getWorld().removeObject(projectile); 
            healthLazer--;
        }
        if(healthLazer == 0)
        {
            MyWorld world = (MyWorld) getWorld();
            
            getWorld().removeObject(this); 
            world.powerup = true; 
            
        }
    }


}
