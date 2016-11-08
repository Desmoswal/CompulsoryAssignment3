import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class player here.
 * 
 * @author Mark 
 * @version 0.1
 */
public class player extends ScrollActor
{
    float x = 160;
    float y = 100;
    float xs;
    float ys;

    float maxspeed = 3;

    boolean canjump = false;

    static GreenfootImage[] frames = new GreenfootImage[32];
    //static GreenfootImage[] mframes = new GreenfootImage[9]; //mirrored frames
    float cur_frame=0;
    float anim_speed= 0.1f; //f needed or java thinks its a double
    float start_frame=0;
    float end_frame=0;
    int animno = 0;
    int dir = 0;
    int animdelay = 0;
    int hurtdelay = 0;

    boolean dead = false;
    int health = 3;

    private DemoWorld mworld;

    public player(){

        GreenfootImage image = getImage();
        image.scale(50, 65);
        setImage(image);

        if (frames[0] == null){   //just in case
            //loading up frames
            frames[0] = new GreenfootImage("Idle__000.png.");
            frames[1] = new GreenfootImage("Run__001.png.");
            frames[2] = new GreenfootImage("Run__002.png.");
            frames[3] = new GreenfootImage("Run__003.png.");
            frames[4] = new GreenfootImage("Run__004.png.");
            frames[5] = new GreenfootImage("Run__005.png.");
            frames[6] = new GreenfootImage("Run__006.png.");
            frames[7] = new GreenfootImage("Run__007.png.");
            frames[8] = new GreenfootImage("Run__008.png.");
            frames[9] = new GreenfootImage("Run__009.png.");

        
            //mirrored frames
            frames[0+16] = new GreenfootImage("Idle__000.png.");
            frames[1+16] = new GreenfootImage("Run__001.png.");
            frames[2+16] = new GreenfootImage("Run__002.png.");
            frames[3+16] = new GreenfootImage("Run__003.png.");
            frames[4+16] = new GreenfootImage("Run__004.png.");
            frames[5+16] = new GreenfootImage("Run__005.png.");
            frames[6+16] = new GreenfootImage("Run__006.png.");
            frames[7+16] = new GreenfootImage("Run__007.png.");
            frames[8+16] = new GreenfootImage("Run__008.png.");
            frames[9+16] = new GreenfootImage("Run__009.png.");

            for (int i = 16; i<9+17;i++)
            {
                frames[i].mirrorHorizontally();
            } 

            setanim_stand();
        }
    }//constructor

    private void animate(){
        if (animdelay > 0) {animdelay--;}
        if (hurtdelay > 0) {hurtdelay--;} //yea, this codes getting messy

        cur_frame += anim_speed;
        if (cur_frame > end_frame) { cur_frame = start_frame;}

        this.setImage(frames[(int)cur_frame + dir]);
    }//animate

    
    //animations
    private void setanim_stand()
    {
        if (animno == 0 || canjump == false || animdelay > 0) {return;}
        animno = 0;
        anim_speed = 0; cur_frame = 0;  start_frame = 0;  end_frame = 0;
    }//stand

    private void setanim_run()
    {
        if (animno == 1 || canjump == false || animdelay > 0) {return;}
        animno = 1;
        anim_speed = 0.2f; cur_frame = 1;  start_frame = 1;  end_frame = 5;
    }//run

    private void setanim_brake()
    {
        if (animno == 3 || canjump == false || animdelay > 0) {return;}
        animno = 3;
        anim_speed = 0; cur_frame = 5;  start_frame = 5;  end_frame = 5;
    }

    private void setanim_jump()
    {
        if (animno == 2 || animdelay > 0) {return;}
        animno = 2;
        anim_speed = 0; cur_frame = 2;  start_frame = 2;  end_frame = 2;
    }//jump

    
    private void setanim_fall()
    {
        if (animno == 5 || canjump == true || animdelay > 0) {return;}
        animno = 5;
        anim_speed = 0; cur_frame = 5;  start_frame = 5;  end_frame = 5;
    }//fall

    //Not yet used
    private void setanim_kick()
    {
        if (animno == 4) {return;}
        animno = 4;
        anim_speed = 0.5f; cur_frame = 8;  start_frame = 9;  end_frame = 9;
    }//jump

    //Not yet used
    private void setanim_hurt()
    {
        if (animno == 6) {return;}
        animno = 6;
        anim_speed = 0.4f; cur_frame = 6;  start_frame = 6;  end_frame = 8;
    }//fall

    /**
     * Act - do whatever the player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        getWorld().setCameraLocation(this.getX(), this.getY());

        if (health <= 0)
        {
            dead = true;
            Greenfoot.playSound("nebhurt.wav");
            //getWorld().addObject(new defeat(), getX(),getY());
            getWorld().removeObject(this);
        }//health ran out

        if (dead) {return;}

        //set animation
        animate();

        if (Math.abs(xs) < 0.3) {setanim_stand();}

        if ( !Greenfoot.isKeyDown("left") && 
        !Greenfoot.isKeyDown("right") &&  
        Math.abs(xs) > 0.3  )
        {setanim_brake();}
        //controls
        //run
        if (Greenfoot.isKeyDown("left") && xs > -maxspeed )
        {            xs -= 0.75; setanim_run(); 
            if (animdelay <= 0 ) {dir = 16;} 
        }//endif

        if (Greenfoot.isKeyDown("right") && xs < maxspeed )
        {            xs += 0.75; setanim_run(); 
            if (animdelay <= 0 ) {dir = 0;}
        }//endif
        //jump
        if (Greenfoot.isKeyDown("up") && canjump)//&& ys > -4 )
        {            ys = -6; canjump = false;  setanim_jump();      }

        //Movement Physics
        x += xs;
        y += ys;

        // if (x < 16) {x = 16;}
        // if (x > myWorld.swidth) {x =  myWorld.swidth;}

        xs *=  0.91;

        if (ys > 2 ) {setanim_fall(); canjump = false;}
        if (ys < 5 ) {ys += 0.3;}

        if (y > 460)
        {
            //x = mworld.startx;
            //y = mworld.starty;
               y = 460; ys = 0; canjump = true;
        }//endif

        if (y < 16) {y = 16;}

        if (x > (DemoWorld.swidth-16)) { x = (DemoWorld.swidth-16); }
        if (x < 0) {x = 0;}

        
        //findElevator();
        //experiment();
        //attack();
      
        setLocation((int)x,(int)y-8);
        //mworld.setPlayerCoords(getX(),getY() );

        //gethurt();

        //myWorld.xo = (int) x-320;
        //  if (getX() > 400) {myWorld.scrollWorld(2,0);}

    }//act
    //-----------------------------------------------------------------  

    
    //need to do this or i got all kind of funny errors
    public void addedToWorld(World world) {
        mworld = (DemoWorld) world;  

        x = getX();
        y = getY();
    }//addedtoworld 

    //--------------------------------------------------------------------

    public void hurtPlayer()
    {
        if (hurtdelay > 0 && animdelay > 0 ) {return;}

        ys = 0;
        setanim_hurt();
        health--;
        
        //Greenfoot.playSound("shock.wav");
    }

}     
//class
