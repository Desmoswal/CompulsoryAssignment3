import greenfoot.*;

/**
 * Class MyWorld: sample world to show how to make use of my world super-class SWorld
 */
public class MyWorld extends SWorld
{

    /**
     * Creates a scrolling world using a main actor, a background, some obstacles, and a non-scrolling score.
     */
    public MyWorld()
    {    
        super(800, 600, 1, 6000); // scroll world constructor call; last parameter is scroll width
        // in the following statement, the main actor is placed in the center of the window
        setMainActor(new Wombat(), 250, 300); // the int parameters are centered window x and y ranges
        // to start the main actor elsewhere
        mainActor.setLocation(100, 342);
        GreenfootImage bg = new GreenfootImage("Level1.png");
        setScrollingBackground(bg); // set the scolling background image
        // add other scrollable objects normally
        addObject(new Ground(), 600, 600);

        addObject(new Ground(), 2000, 600);
        addObject(new Box(), 20, 345);
        // use of the following also adds scrollable objects
        addObject(new Box(), 380, 345, true); // the boolean determines scrollable state
        // use the following for non-scrollable objects
        addObject(new Score(), 40, 390, false);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Box box = new Box();
        addObject(box,390,452);
    }
}
