import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int score = 0;
    public Score()
    {
        setImage(new GreenfootImage("Score: " + score, 50, Color.GREEN, Color.BLACK));
    }
    public void act()
    {
        setImage(new GreenfootImage("Score: " + score, 50, Color.GREEN, Color.BLACK));
    }
}
