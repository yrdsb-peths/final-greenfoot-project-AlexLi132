import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Second Enemy Ship (Planet)
 * 
 * @author Alex 
 * @version June 10
 */
public class EnemyShip2 extends EnemyShip
{
    /**
     * Act - do whatever the EnemyShip1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int health2 = 2; 
   
    public EnemyShip2()
    {
        
    }
    public void act()
    {
        fall(); 
        hitEnemy2(); 
        
        
    }
     /**
     * Removes ship when hit by projectile twice
     */
    public void hitEnemy2()
    {
        Actor projectile = getOneIntersectingObject(Lazer.class);
        if(projectile != null)
        {
            getWorld().removeObject(projectile); 
            health2--;
        }
        if(health2 == 0)
        {
            MyWorld world = (MyWorld) getWorld();
            world.increaseScore2();
            getWorld().removeObject(this); 
            
            
        }
    }
    
}
