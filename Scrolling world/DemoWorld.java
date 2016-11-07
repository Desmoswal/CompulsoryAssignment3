import greenfoot.*;

/**
 * A little demo world to show you how this works.
 * 
 * @author Sven van Nigtevecht
 */
public class DemoWorld extends ScrollWorld
{
    /**
     * Constructor for objects of class DemoWorld.
     */
    public DemoWorld()
    {
        super(600, 400, 1, 1000, 700);
        addObject(new Mushroom(), 100,100);
        addObject(new Apple(), 700, 300);
        addObject(new Rock(), 400, 254);
        
        addCameraFollower(new Bug(), 0, 0);
        
        addObject(new FPS(), 85, 15); // FPS isn't a subclass of
        // ScrollActor, so it will looklike it's a camera follower
    }
}