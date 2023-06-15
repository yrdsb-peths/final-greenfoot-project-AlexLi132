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
        hitEnemy3();
        hitPowerup();
        endGame();
    }
    /**
     * Decreases health when hit by enemy 
     */
    public void hitEnemy2()
    {
        if(isTouching(EnemyShip2.class))
        {
            removeTouching(EnemyShip2.class);
            MyWorld world = (MyWorld) getWorld();
            world.decreaseHealth2(); 
            
        }
    }
    /**
     * Decreases health when hit by enemy 
     */
    public void hitEnemy3()
    {
        if(isTouching(EnemyShip3.class))
        {
            removeTouching(EnemyShip3.class);
            MyWorld world = (MyWorld) getWorld();
            world.decreaseHealth5(); 
            
        }
    }
    /**
     * Decreases health when hit by enemy 
     */
    public void hitEnemy1()
    {
        if(isTouching(EnemyShip1.class))
        {
            removeTouching(EnemyShip1.class);
            MyWorld world = (MyWorld) getWorld();
            world.decreaseHealth(); 
            
        }
    }
    /**
     * Decreases health when hit by powerup
     */
    public void hitPowerup()
    {
        if(isTouching(SpeedPowerup.class))
        {
            removeTouching(SpeedPowerup.class);
            MyWorld world = (MyWorld) getWorld();
            world.decreaseHealth(); 
            
        }
    }
    /**
     * Ends game when hit by powerup
     */
    public void endGame()
    {
        MyWorld world = (MyWorld) getWorld();
        if(world.mothershipHealth == 0)
        {
            world.gameOver();
        }
    }
}
