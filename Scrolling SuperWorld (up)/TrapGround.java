import greenfoot.*;

/**
 * A surface for the main actor to gravitate toward.
 */
public class TrapGround extends Traps
{
    /**
     * Creates a long platform for the main actor.
     */
    Player p;
    private boolean activated=false;
    public TrapGround(int size)
    {
        GreenfootImage road = new GreenfootImage("Ground.png");
        GreenfootImage image = new GreenfootImage(size, road.getHeight());
        int w=road.getWidth();
        for(int offset=0; offset<size; offset+=w) image.drawImage(road, offset, 0);
        setImage(image);
    }
    public void act(){
        if(activated)setLocation(getX(),getY()+3);
        else checkActivated();
        if(p!=null)p.check(getClass(),this);
    }
    private void checkActivated(){
        if(isTouching(Player.class)){
            p=(Player)getOneIntersectingObject(Player.class);
            activated=true;
        }
    }
}
