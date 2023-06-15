import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Second Enemy Ship (Planet)
 * 
 * @author Alex 
 * @version June 10
 */
public class EnemyShip3 extends EnemyShip
{
    /**
     * Act - do whatever the EnemyShip1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int health3 = 5; 
   
    public EnemyShip3()
    {
        
    }
    public void act()
    {
        fall(); 
        hitEnemy3(); 
        
        
    }
     /**
     * Removes ship when hit by projectile 5 times 
     */
    public void hitEnemy3()
    {
        Actor projectile = getOneIntersectingObject(Lazer.class);
        if(projectile != null)
        {
            getWorld().removeObject(projectile); 
            health3--;
        }
        if(health3 == 0)
        {
            MyWorld world = (MyWorld) getWorld();
            world.increaseScore5();
            getWorld().removeObject(this); 
            world.ding.play();
            
        }
    }
    
}
