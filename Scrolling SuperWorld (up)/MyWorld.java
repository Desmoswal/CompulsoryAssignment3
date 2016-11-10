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
        super(600, 500, 1, 12000); // scroll world constructor call; last parameter is scroll width

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
        
        Box box = new Box();
        addObject(box,301,360);
        Box box2 = new Box();
        addObject(box2,516,436);
        box.setLocation(514,358);
        box2.setLocation(767,427);
        box.setLocation(295,353);
        box2.setLocation(513,425);
        Box box3 = new Box();
        addObject(new Box(0, 200) ,744,358); // should be a row of 4
        box3.setLocation(739,355);
        Box box4 = new Box(); //Should be a row of 4
        addObject(new Box(0, 200),1076,275);
        Box box5 = new Box(); // Column of 6
        addObject(new Box(1, 300),1433,300);
        Box box6 = new Box(); // Row of 3
        addObject(new Box(0, 150),1750,274);
        Box box7 = new Box();
        addObject(box7,2600, 431);
        Box box8 = new Box();
        addObject(box8,3457,439);
        Box box9 = new Box();
        addObject(box9,3576,356);
        Box box10 = new Box();
        addObject(box10,3458,230);

        addObject(new Box(1, 400),3678,250);

        addObject(new Box(1, 350),3727,275);

        addObject(new Box(1, 300),3777,300);

        addObject(new Box(1, 250),3826,325);

        addObject(new Box(1, 200),3876,350);

        addObject(new Box(1, 150),3926,375);

        addObject(new Box(1, 100),3977,400);
        Box box18 = new Box();
        addObject(box18,4025,425);

        box8.setLocation(3457,426);
        
        Box box19 = new Box();
        addObject(box19,4562,400);
        Box box20 = new Box();
        addObject(box20,4612,315);
        Box box21 = new Box();
        addObject(box21,4662,231);
        Box box22 = new Box();
        addObject(box22,4711,150);
        Box box23 = new Box();
        addObject(box23,4764,398);
        Box box24 = new Box();
        addObject(box24,4814,315);
        Box box25 = new Box();
        addObject(box25,4863,230);
        Box box26 = new Box();
        addObject(box26,4909,147);
        Box box27 = new Box();
        addObject(box27,4963,402);
        Box box28 = new Box();
        addObject(box28,5013,315);
        Box box29 = new Box();
        addObject(box29,5064,233);
        Box box30 = new Box();
        addObject(box30,5112,149);
        Box box31 = new Box();
        addObject(box31,5312,151);
        Box box32 = new Box();
        addObject(box32,5265,232);
        Box box33 = new Box();
        addObject(box33,5212,315);
        Box box34 = new Box();
        addObject(box34,5163,399);
        Box box35 = new Box();
        addObject(box35,4209,402);
        box35.setLocation(4202,313);
        Box box36 = new Box();
        addObject(box36,4208,234);
        Box box37 = new Box();
        addObject(new Box(1, getHeight()), 5985, 200);
        
        addObject(new Score(), 40,height(450), false);
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
        
    }
}
