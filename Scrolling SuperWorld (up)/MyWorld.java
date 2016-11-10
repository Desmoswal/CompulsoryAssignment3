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
        super(700, 500, 1, 6000); // scroll world constructor call; last parameter is scroll width
        // in the following statement, the main actor is placed in the center of the window
        setMainActor(new Player(),100, getHeight()-75); // the int parameters are centered window x and y ranges
        // to start the main actor elsewhere
        mainActor.setLocation(100, getHeight()-75);
        GreenfootImage bg = new GreenfootImage("Level1.png");
        setScrollingBackground(bg); // set the scolling background image
        // add other scrollable objects normally
        ////addObject(new Ground(50000), 200,getHeight()-25);
        //addObject(new Box(1,200), 20,getHeight()-75);
        // use of the following also adds scrollable objects
        //addObject(new Box(), 380, getHeight()-150, true); // the boolean determines scrollable state
        // use the following for non-scrollable objects
        addObject(new Score(), 40,getHeight()-50, false);
        addObject(new TrapBox(),950,height(75));
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Box box5 = new Box();
        addObject(box5,-200,430);
        Box box6 = new Box();
        addObject(box6,-2300,364);
        Box box7 = new Box();
        addObject(box7,-2000,433);
        Box box9 = new Box(0,200);
        addObject(box9,-1800,350);
        Box box10 = new Box(0,200);
        addObject(box10,-1000,300);
        Box box11 = new Box(0,200);
        addObject(box11,-1500,300);
        Box box12 = new Box(1,150);
        addObject(box12,-1250,380);
        Box box13 = new Box();
        addObject(box13,800,430);
        Box box14 = new Box();
        addObject(box14,900,330);
        Box box15 = new Box();
        addObject(box15,800,230);
        Box box16 = new Box();
        addObject(box16,900,130);
        Box box17 = new Box(1,350);
        addObject(box17,1000,280);
        Box box18 = new Box();
        addObject(box18,950,130);
        Box box19 = new Box(1,300);
        addObject(box19,1050,305);
        Box box20 = new Box(1,250);
        addObject(box20,1100,330);
        Box box21 = new Box(1,200);
        addObject(box21,1150,355);
        Box box22 = new Box(1,150);
        addObject(box22,1200,380);
        Box box23 = new Box(1,100);
        addObject(box23,1250,405);
        Box box24 = new Box(1,50);
        addObject(box24,1300,430);
        Box box25 = new Box();
        addObject(box25,1550,180);
        Box box26 = new Box();
        addObject(box26,1550,380);
        Box box27 = new Box();
        addObject(box27,1550,280);
        Box box28 = new Box();
        addObject(box28,1900,380);
        Box box29 = new Box();
        addObject(box29,1950,280);
        Box box30 = new Box();
        addObject(box30,2000,180);
        Box box31 = new Box();
        addObject(box31,2050,80);

        Box box32 = new Box();
        addObject(box32,2150,380);
        Box box33 = new Box();
        addObject(box33,2200,280);
        Box box34 = new Box();
        addObject(box34,2250,180);
        Box box35 = new Box();
        addObject(box35,2300,80);

        Box box36 = new Box();
        addObject(box36,2400,380);
        Box box37 = new Box();
        addObject(box37,2450,280);
        Box box38 = new Box();
        addObject(box38,2500,180);
        Box box39 = new Box();
        addObject(box39,2550,80);

        Box box40 = new Box();
        addObject(box40,2650,380);
        Box box41 = new Box();
        addObject(box41,2700,280);
        Box box42 = new Box();
        addObject(box42,2750,180);
        Box box43 = new Box();
        addObject(box43,2800,80);

        Ground ground = new Ground(4000);
        addObject(ground,1925,getHeight()-25);
        Ground ground2 = new Ground(600);
        addObject(ground2,-650,getHeight()-25);
        Ground ground3 = new Ground(550);
        addObject(ground3,-1500,getHeight()-25);
        Ground ground4 = new Ground(1000);
        addObject(ground4,-2400,getHeight()-25);
    }
    public int height(int h){
        return getHeight()-h;
    }
    private void construct(){
         // in the following statement, the main actor is placed in the center of the window
        setMainActor(new Player(),100, height(75)); // the int parameters are centered window x and y ranges
        // to start the main actor elsewhere
        mainActor.setLocation(100, height(75));
        GreenfootImage bg = new GreenfootImage("Mario LevelBG.png");
        setScrollingBackground(bg); // set the scolling background image
        addObject(new Box(1,getHeight()),25,getHeight()/2);
        addObject(new Ground(1000),500,height(25));
        addObject(new Ground(550),1400,height(25));
        addObject(new Ground(600),2200,height(25));
        addObject(new Score(), 40,height(50), false);
    }
}
