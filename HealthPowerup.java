import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Powerup that increases speed
 * 
 * @author Alex
 * @version June 12
 */
public class HealthPowerup extends EnemyShip
{
    /**
     * Act - do whatever the EnemyShip1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int healthHealth = 3; 
    
    public void act()
    {
        fall(); 
        hitEnemyHealth(); 
        
        
    }
     /**
     * Increases lazer power when hit 
     */
    public void hitEnemyHealth()
    {
        Actor projectile = getOneIntersectingObject(Lazer.class);
        if(projectile != null)
        {
            getWorld().removeObject(projectile); 
            healthHealth--;
        }
        if(healthHealth == 0)
        {
            MyWorld world = (MyWorld) getWorld();
            world.mothershipHealth += 5; 
            world.healthLabel.setValue("HP: " + world.mothershipHealth);
            getWorld().removeObject(this); 
            world.powerupSound.play();
            
        }
    }


}
