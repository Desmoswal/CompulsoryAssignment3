import greenfoot.*;

/**
 * A surface for the main actor to gravitate toward.
 */
public class Ground extends StaticObjects
{
    /**
     * Creates a long platform for the main actor.
     */
    public Ground(int size)
    {
        GreenfootImage road = new GreenfootImage("Ground.png");
        GreenfootImage image = new GreenfootImage(size, road.getHeight());
        int w=road.getWidth();
        for(int offset=0; offset<size; offset+=w) image.drawImage(road, offset, 0);
        setImage(image);
    }
}
