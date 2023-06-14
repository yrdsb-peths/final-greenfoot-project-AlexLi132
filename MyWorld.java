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
    public int score = 0;
    public int level = 0;
    static int enemyCount = 0;
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
    public void act()
    {
        if(Greenfoot.getRandomNumber(60)<1)
        {
            addEnemyShip1(); 
            enemyCount++; 
        }
        if(Greenfoot.getRandomNumber(120)<1)
        {
            addEnemyShip2(); 
            enemyCount++; 
        }
    }
    public void addEnemyShip1()
    {
        addObject(new EnemyShip1(), Greenfoot.getRandomNumber(600), 0); 
    }
    public void addEnemyShip2()
    {
        addObject(new EnemyShip2(), Greenfoot.getRandomNumber(600), 0); 
    }
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
        
        
    }
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
        
        if(score % 10 == 0)
        {
            level++;
        }
    }
}
