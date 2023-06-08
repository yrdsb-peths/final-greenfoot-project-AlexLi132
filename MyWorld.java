import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class MyWorld extends World
{
    Label scoreLabel;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    public MyWorld()
    {    
        // Create a new world with 600x600 cells with a cell size of 1x1 pixels.
        super(600, 590, 1);
        Battleship battleship = new Battleship();
        addObject (battleship, 300, 500);   
        
    }
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
        
        
    }
}
