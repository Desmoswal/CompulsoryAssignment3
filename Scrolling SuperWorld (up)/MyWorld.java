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
        super(6700, 500, 1, 6700); // scroll world constructor call; last parameter is scroll width
        setPaintOrder(Score.class,Ground.class,Box.class,Player.class,Traps.class);
        construct();
        buildLevel1();
    }

    /**
     * Builds the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void buildLevel1()
    {
        addObject(new Box(1,getHeight()),25,getHeight()/2);
        addObject(new Ground(1000),500,height(25));
        addObject(new Ground(550),1400,height(25));
        addObject(new Ground(600),2200,height(25));
        addObject(new Ground(4000),4700,height(25));
        
        addObject(new Box(),300,height(150));
        Box box2 = new Box();
        addObject(box2,500,height(75));
        addObject(new Box(0, 200) ,750,350); // should be a row of 4
        addObject(new Box(0, 200),1075,height(225));
        addObject(new Box(1, 300),1450,height(200));// Column of 6
        addObject(new Box(0, 150),1750,275);// Row of 3
        addObject(new Box(),2600, height(100));
        addObject(new Box(),3450,height(75));
        addObject(new Box(),3575,height(150));
        addObject(new Box(),3450,height(270));

        addObject(new Box(1, 400),3675,height(250));

        addObject(new Box(1, 350),3725,height(225));

        addObject(new Box(1, 300),3775,height(200));

        addObject(new Box(1, 250),3825,height(175));

        addObject(new Box(1, 200),3875,height(150));

        addObject(new Box(1, 150),3925,height(125));

        addObject(new Box(1, 100),3975,height(100));
        addObject(new Box(),4025,height(75));
        
        addObject(new Box(),4550,height(125));
        addObject(new Box(),4600,height(225));
        addObject(new Box(),4650,height(325));
        addObject(new Box(),4700,height(425));

        addObject(new Box(),4800,height(125));
        addObject(new Box(),4850,height(225));
        addObject(new Box(),4900,height(325));
        addObject(new Box(),4950,height(425));
        
        addObject(new Box(),5050,height(125));
        addObject(new Box(),5100,height(225));
        addObject(new Box(),5150,height(325));
        addObject(new Box(),5200,height(425));
        
        addObject(new Box(),5300,height(125));
        addObject(new Box(),5350,height(225));
        addObject(new Box(),5400,height(325));
        addObject(new Box(),5450,height(425));
        
        addObject(new Box(1, getHeight()), 6675, getHeight()/2);
    }
    
    public int height(int h)
    {
        return getHeight()-h;
    }
    
    private void construct()
    {
         // in the following statement, the main actor is placed in the center of the window
        setMainActor(new Player(),100, height(75)); // the int parameters are centered window x and y ranges
        // to start the main actor elsewhere
        mainActor.setLocation(100, height(75));
        GreenfootImage bg = new GreenfootImage("Mario LevelBG.png");
        setScrollingBackground(bg); // set the scolling background image
        addObject(new Score(), 40,height(450), false);
    }
}
