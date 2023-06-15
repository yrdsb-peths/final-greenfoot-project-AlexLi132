import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The world of the game
 * 
 * @author Alex
 * @version June 5
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
    GreenfootSound backgroundMusic = new GreenfootSound("music.mp3"); 
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    public MyWorld()
    {    
        // Create a new world with 600x600 cells with a cell size of 1x1 pixels.
        super(550, 590, 1);
        backgroundMusic.play(); 
        Battleship battleship = new Battleship();
        addObject (battleship, 275, 425);   
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
            if(level >= 1)
            {
                addEnemyShip2();
            } 
            enemyCount++; 
        }
        if(Greenfoot.getRandomNumber(400)<1)
        {
            if(level >= 3) 
            {
               addEnemyShip3();  
            }
            enemyCount++; 
        }
        if(Greenfoot.getRandomNumber(3000)<1)
        {
            addEnemyShipSpeed(); 
            enemyCount++; 
        }
    }
     /**
     * Spawn method for enemyship 1
     */
    public void addEnemyShip1()
    {
        addObject(new EnemyShip1(), Greenfoot.getRandomNumber(400), 0); 
    }
     /**
     * Spawn method for enemy ship 2
     */
    public void addEnemyShip2()
    {
        addObject(new EnemyShip2(), Greenfoot.getRandomNumber(400), 0); 
    }
     /**
     * Spawn method for enemy ship 3
     */
    public void addEnemyShip3()
    {
        addObject(new EnemyShip3(), Greenfoot.getRandomNumber(400), 0); 
    }
    /**
     * Spawn method for speed powerup
     */
    public void addEnemyShipSpeed()
    {
        addObject(new SpeedPowerup(), Greenfoot.getRandomNumber(400), 0); 
    }
     /**
     * End the game
     */
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
        EndScreen EndScreen = new EndScreen();
        Greenfoot.setWorld(EndScreen);
        
    }
     /**
     * Increases score by 1
     */
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
        
        if(score % 30 == 0)
        {
            level++;
        }
    }
    /**
     * Increases score by 2
     */
    public void increaseScore2()
    {
        score+=2;
        scoreLabel.setValue(score);
        
        
    }
    /**
     * Increases score by 5
     */
    public void increaseScore5()
    {
        score+=5;
        scoreLabel.setValue(score);
        
        
    }
    /**
     * Increases speed
     */
    public void increaseSpeed()
    {
        speed++; 
    }
    /**
     * Decreases health by 1
     */
    public void decreaseHealth()
    {
        mothershipHealth--;
        healthLabel.setValue("HP: " + mothershipHealth);
    }
    /**
     * Decreases health by 2
     */
    public void decreaseHealth2()
    {
        mothershipHealth-=2; 
        healthLabel.setValue("HP: " + mothershipHealth);
    }
    /**
     * Decreases health by 5
     */
    public void decreaseHealth5()
    {
        mothershipHealth-=5; 
        healthLabel.setValue("HP: " + mothershipHealth);
    }
}
