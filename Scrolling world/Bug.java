import greenfoot.*;

/**
 * An demo class which is meant to be a camera follower.
 * It moves to face your mouse cursor, and it can move
 * back and forward.
 * 
 * @author Sven van Nigtevecht
 * @version 1.0
 */
public class Bug extends ScrollActor
{
    /** The number of cells we move forward and backword */
    private static final int MOVE_AMOUNT = 5;
    
    /**
     * Move to face the mouse,
     * and listen to the up and down keys.
     */
    public void act()
    {
        MouseInfo m = Greenfoot.getMouseInfo();
        if (m != null) {
            turnTowards(m.getX(), m.getY());
            // set the camera's direction to ours:
            getWorld().setCameraDirection(getRotation());
        }
        if (Greenfoot.isKeyDown("down")) {
            // move the camera backwards:
            getWorld().moveCamera(-MOVE_AMOUNT);
        }
        if (Greenfoot.isKeyDown("up")) {
            // move the camera forwards:
            getWorld().moveCamera(MOVE_AMOUNT);
        }
    }
}