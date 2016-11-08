import greenfoot.*;
import java.awt.Color;

/**
 * A little demo world to show you how this works.
 * 
 * @author Mark
 */
public class DemoWorld extends ScrollWorld
{
    static GreenfootImage background = new GreenfootImage("levelmask.png");
    static GreenfootImage bgmask = new GreenfootImage("levelmask.png");
    static GreenfootImage colorCodes = new GreenfootImage("codes.gif");
    
    static Color grndcolor;
    
    /**
     * Constructor for objects of class DemoWorld.
     */
    
    static int swidth = 2000;
    static int sheight = 700;
    
    static public int startx, starty;
   
    public DemoWorld()
    {
        super(600, 700, 1, 2000, 700);
        addObject(new Mushroom(), 100,100);
        addObject(new Apple(), 700, 300);
        addObject(new Rock(), 400, 254);
        
        addCameraFollower(new player(), 0, 0);
        
        addObject(new FPS(), 85, 15); // FPS isn't a subclass of
        // ScrollActor, so it will looklike it's a camera follower
        
        setBackground(background);
        bgmask = new GreenfootImage("levelmask.png");
    }
    
    
    private void setValues()
    {
        grndcolor = colorCodes.getColorAt(1, 1); //Black
    }
    
    public boolean isGround(Color mg)
    {
        if(grndcolor.equals(mg))
        {return true;}
        return false;
    }
    
    
    public boolean isGround(int x, int y)
    {
        if(x > swidth-1 || x < 0 || y > sheight - 1 || y < 0) {return false;}
        
        Color ez = bgmask.getColorAt(x,y);
        if(grndcolor.equals(ez))
        {return true;}
        return false;
    }
    
    /*public void setPlayerCoords(int px, int py)
    {
        playerx = px;
        playery = py;
    }*/
}