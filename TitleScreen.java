import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen
 * 
 * @author Alex
 * @version June 12
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label ("Galactic Shooter", 60);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(titleLabel, 350, 80);
        prepare();
    }

    /**
     * The main world act loop
     */
    public void act()
    {
        // Start the game if user presses the space bar
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld World = new MyWorld();
            Greenfoot.setWorld(World);
        }
        else
        {
            MyWorld World = new MyWorld();
            Greenfoot.setWorld(World);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Label label = new Label("Press <RUN> to Begin!", 40);
        addObject(label,275,184);
        Label label2 = new Label("Use \u2190 and \u2192 to Move Spaceship!", 40);
        addObject(label2,275,309);
        Label label3 = new Label("Press E to Shoot!", 40);
        addObject(label3,275,255);
        Label label4 = new Label("Defend the Mothership!", 40);
        addObject(label4,275,255);
        Battleship battleship = new Battleship();
        addObject(battleship,95,69);
        label.setLocation(300,146);
        label2.setLocation(313,194);
        label3.setLocation(335,256);
        label2.setLocation(355,194);
        Mothership mothership = new Mothership();
        addObject(mothership,299,355);
        battleship.setLocation(107,62);

        label3.setLocation(289,259);
        label3.setLocation(301,292);
        label3.setLocation(288,223);
        label4.setLocation(311,262);
        label2.setLocation(300,183);
        label3.setLocation(300,223);
        label4.setLocation(279,251);
        label4.setLocation(405,262);
        label4.setLocation(415,258);
        label4.setLocation(250,256);
        label4.setLocation(300,267);
    }
}