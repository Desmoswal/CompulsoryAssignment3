import greenfoot.*;

/**
 * A user-controlled actor that walks and jumps, and is pulled down by gravity.
 * <l><li>Left arrow moves actor left (toward left scroll limit)</li>
 * <li>Right arrow moves actor right (toward right scroll limit)</li>
 * <li>Up arrow makes the actor jump</li><l>
 */
public class Player extends Actor
{
    final int jSpeed = 25; // the initial 'jump' speed
    int ySpeed = 0, xSpeed = 0; // the initial vertical and horizontal speeds
    boolean aboutFace; // the direction (left or right) the actor is facing
    boolean onGround; // the state of the actor being set on an object or not

    /** 
     * Checks for changes in direction and moves the main actor.
     */
    public void act()
    {
        getDirection();
        move();
        if(getY()>=getWorld().getHeight())die();
        incrementScore();
    }

    /**
     * Moves the actor with appropriate image.  Checks for obstacles and adjusts
     * the position of the actor accordingly.
     */
    private void move()
    {
        ySpeed++; // adds gravity
        if (xSpeed != 0 && onGround) xSpeed+=aboutFace?2:-2; // add friction
        setLocation(getX()+xSpeed/10, getY()+ySpeed/2);
        // check for change in horizontal direction
        if((xSpeed>0 && aboutFace) || (xSpeed<0 && !aboutFace)) 
        {
            getImage().mirrorHorizontally();
            aboutFace = !aboutFace;
        }

        // check for obstacles
        onGround=false; // initialize value
        // check below the actor
   
        if ("space".equals(Greenfoot.getKey()))
        {
            Actor bullet = new Bullet();
            if (aboutFace) bullet.turn(180);
            getWorld().addObject(bullet, getX(), getY());
            bullet.move(32);
        }
    }

    /**
     * Determines any changes in horizontal and vertical speeds for the actor.
     */
    private void getDirection()
    {
        //         if (!onGround) return; // if not mid-air changes allowed
        // sets requested direction of move, or continues in current direction
        if (Greenfoot.isKeyDown("left") && xSpeed>-50) xSpeed-=2; // check left
        if (Greenfoot.isKeyDown("right") && xSpeed<50) xSpeed+=2; // check right
        if (Greenfoot.isKeyDown("up") && onGround) // check jump
        {
            ySpeed -= jSpeed; // add jump speed
        }
    }
    
    public void incrementScore()
    {
        if(Greenfoot.isKeyDown("space")/*getcoin*/)
        {
            ((Score) getWorld().getObjects(Score.class).get(0)).add(1);
        }
    }
    public void die(){
            Greenfoot.setWorld(new MyWorld());  
    }
    public void check(Class c,Actor a){
        // check below the actor
        while(getOneObjectAtOffset(0, getImage().getHeight()/2+1, c)==a)
        {
            setLocation(getX(), getY()-1); 
            onGround=true; 
            ySpeed=0;
        }
        // check above the actor
        while(getOneObjectAtOffset(0, -getImage().getHeight()/2-1, c)==a) 
        {
            setLocation(getX(), getY()+1);
            ySpeed = 0;
        }
        // check to right of actor
        while(getOneObjectAtOffset(getImage().getWidth()/2+1, 0, c)==a)
        {
            setLocation(getX()-1, getY());
            xSpeed = 0;
        }
        // check to left of actor
        while(getOneObjectAtOffset(-getImage().getWidth()/2-1, 0, c)==a)
        {
            setLocation(getX()+1, getY());
            xSpeed = 0;
        }
    }
}
