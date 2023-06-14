import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyShip1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
        moveAround(); 
        hitEnemy2(); 
        
        
    }
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
            getWorld().removeObject(this); 
            
        }
    }
}
