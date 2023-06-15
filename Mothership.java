import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Protected by the spaceship
 * 
 * @author Alex
 * @version June 14
 */
public class Mothership extends Actor
{
    /**
     * Act - do whatever the Mothership wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act()
    {
        hitEnemy1();
        hitEnemy2(); 
        hitPowerup();
    }
    public void hitEnemy2()
    {
        if(isTouching(EnemyShip2.class))
        {
            removeTouching(EnemyShip2.class);
            MyWorld world = (MyWorld) getWorld();
            world.decreaseHealth2(); 
            
        }
    }
    public void hitEnemy1()
    {
        if(isTouching(EnemyShip1.class))
        {
            removeTouching(EnemyShip1.class);
            MyWorld world = (MyWorld) getWorld();
            world.decreaseHealth(); 
            
        }
    }
    public void hitPowerup()
    {
        if(isTouching(SpeedPowerup.class))
        {
            removeTouching(SpeedPowerup.class);
            MyWorld world = (MyWorld) getWorld();
            world.decreaseHealth(); 
            
        }
    }
    public void endGame()
    {
        MyWorld world = (MyWorld) getWorld();
        if(world.mothershipHealth == 0)
        {
            world.gameOver();
        }
    }
}
