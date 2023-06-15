import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Second Enemy Ship (Planet)
 * 
 * @author Alex 
 * @version June 10
 */
public class EnemyShip4 extends EnemyShip
{
    /**
     * Act - do whatever the EnemyShip1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int health4 = 10; 
   
    public EnemyShip4()
    {
        
    }
    public void act()
    {
        fall(); 
        hitEnemy4(); 
        
        
    }
     /**
     * Removes ship when hit by lazer 10 times 
     */
    public void hitEnemy4()
    {
        Actor projectile = getOneIntersectingObject(Lazer.class);
        if(projectile != null)
        {
            getWorld().removeObject(projectile); 
            health4--;
        }
        if(health4 == 0)
        {
            MyWorld world = (MyWorld) getWorld();
            world.increaseScore10();
            getWorld().removeObject(this); 
            world.ding.play();
            
        }
    }
    
}
