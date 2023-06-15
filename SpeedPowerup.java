import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Powerup that increases speed
 * 
 * @author Alex
 * @version June 12
 */
public class SpeedPowerup extends EnemyShip
{
    /**
     * Act - do whatever the EnemyShip1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int healthSpeed = 3; 
    
    public void act()
    {
        fall(); 
        animate();
        hitEnemySpeed(); 
        
        
    }
     /**
     * Increases speed when hit 
     */
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
            world.powerupSound.play();
            
        }
    }
    GreenfootImage[] Animation = new GreenfootImage[2];
    SimpleTimer animationTimer = new SimpleTimer();
    
    public SpeedPowerup()
    {
        for(int i =0; i < Animation.length; i++)
        {
            Animation[i] = new GreenfootImage("images/star/star" + i + ".png");
            Animation[i].scale(50, 50);
        }
        animationTimer.mark();
        setImage(Animation[0]);
    }
    int imageIndex = 0;
     /**
     * Animates the speed powerup
     */
    public void animate()
    {
        if(animationTimer.millisElapsed() < 300)
        {
            return;
        }
        animationTimer.mark();
        setImage(Animation[imageIndex]);
        imageIndex = (imageIndex + 1)  % Animation.length;
        
        
    }
}
