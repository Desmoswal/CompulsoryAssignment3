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
        super(700, 500, 1, 6000); // scroll world constructor call; last parameter is scroll width
        // in the following statement, the main actor is placed in the center of the window
        setMainActor(new Wombat(),100, getHeight()-75); // the int parameters are centered window x and y ranges
        // to start the main actor elsewhere
        mainActor.setLocation(100, getHeight()-75);
        GreenfootImage bg = new GreenfootImage("Mario LevelBG.png");
        setScrollingBackground(bg); // set the scolling background image
        // add other scrollable objects normally
        addObject(new Ground(5000), 200,getHeight()-25);
        addObject(new Box(), 20,getHeight()-75);
        // use of the following also adds scrollable objects
        addObject(new Box(), 380, getHeight()-150, true); // the boolean determines scrollable state
        // use the following for non-scrollable objects
        addObject(new Score(), 40,getHeight()-50, false);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Box box = new Box();
        addObject(box,1108,34);
        Box box2 = new Box();
        addObject(box2,1115,133);
        Box box3 = new Box();
        addObject(box3,1119,237);
        Box box4 = new Box();
        addObject(box4,1127,353);
        Box box5 = new Box();
        addObject(box5,1126,417);
    }
}
