import greenfoot.*;

/**
 * A surface for the main actor to gravitate toward.
 */
public class Ground extends Actor
{
    /**
     * Creates a long platform for the main actor.
     */
    public Ground()
    {
        GreenfootImage road = new GreenfootImage("Ground.png");
        GreenfootImage image = new GreenfootImage(1040, road.getHeight());
        image.fill();
        int w=road.getWidth();
        
        
        for(int offset=0; offset<1040; offset+=w) 
        {
            image.drawImage(road, offset, 0);
        }
        setImage(image);
    }
}
