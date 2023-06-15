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
    Label healthLabel;
    public int score = 0;
    public int level = 0;
    public int speed = 3;
    public int mothershipHealth = 100; 
    static int enemyCount = 0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    public MyWorld()
    {    
        // Create a new world with 600x600 cells with a cell size of 1x1 pixels.
        super(550, 590, 1);
        Battleship battleship = new Battleship();
        addObject (battleship, 275, 450);   
        Mothership mothership = new Mothership();
        addObject (mothership, 275, 550);
        scoreLabel = new Label(0, 45);
        addObject(scoreLabel, 520, 35);
        healthLabel = new Label("HP: " + 100, 45); 
        addObject(healthLabel, 75, 35);
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
        if(Greenfoot.getRandomNumber(3000)<1)
        {
            addEnemyShipSpeed(); 
            enemyCount++; 
        }
    }
    public void addEnemyShip1()
    {
        addObject(new EnemyShip1(), Greenfoot.getRandomNumber(500), 0); 
    }
    public void addEnemyShip2()
    {
        addObject(new EnemyShip2(), Greenfoot.getRandomNumber(500), 0); 
    }
    public void addEnemyShipSpeed()
    {
        addObject(new SpeedPowerup(), Greenfoot.getRandomNumber(500), 0); 
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
    public void increaseScore2()
    {
        score+=2;
        scoreLabel.setValue(score);
        
        if(score % 10 == 0)
        {
            level++;
        }
    }
    public void increaseSpeed()
    {
        speed++; 
    }
    public void decreaseHealth()
    {
        mothershipHealth--;
        healthLabel.setValue("HP: " + mothershipHealth);
    }
    public void decreaseHealth2()
    {
        mothershipHealth-=2; 
        healthLabel.setValue("HP: " + mothershipHealth);
    }
}
