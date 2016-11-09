import greenfoot.*;

public class Bullet extends Actor
{
    public Bullet()
    {
        getImage().scale(5, 2);
        getImage().fill();
    }

    public void act()
    {
        move(5);
        if (getX() < -5 || getX() > getWorld().getWidth()+5) getWorld().removeObject(this);
    }
}