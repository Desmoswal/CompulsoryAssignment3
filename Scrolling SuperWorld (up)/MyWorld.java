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
        super(700, 500, 1, 14000); // scroll world constructor call; last parameter is scroll width
        setPaintOrder(Score.class,Ground.class,Traps.class,Box.class,Player.class);
        construct();
        buildLevel();
        addCoins();
        addTraps();
    }

    /**
     * Builds the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void buildLevel()
    {
        addObject(new Box(1,getHeight()),25,getHeight()/2);
        addObject(new Ground(1000),500,height(25));
        addObject(new Ground(350),1300,height(25));
        addObject(new Ground(200),2400,height(25));
        addObject(new Ground(250),2025,height(25));
        addObject(new Ground(200),2800,height(25));
        addObject(new Ground(1050),3675,height(25));
        addObject(new Ground(700),5675,height(25));
        
        addObject(new Box(),300,height(150));
        addObject(new Box(),500,height(75));
        addObject(new Box(0, 200) ,750,350); // should be a row of 4
        addObject(new Box(0, 200),1075,height(225));
        addObject(new Box(1, 300),1450,height(200));// Column of 6
        addObject(new Box(0, 150),1750,275);// Row of 3
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
        
        
        addObject(new Box(),4600,height(225));
        addObject(new Box(),4650,height(325));
        addObject(new Box(),4700,height(425));

        addObject(new Box(),4800,height(125));
        addObject(new Box(),4850,height(225));
        
        addObject(new Box(),5050,height(125));
        addObject(new Box(),5100,height(225));
        addObject(new Box(),5200,height(425));
        
        addObject(new Box(),5350,height(225));
        
        addObject(new Box(1, getHeight()), 6675, getHeight()/2);
    }
    private void addCoins(){
        //Coins
        addObject(new Coin(),300,height(200));
        addObject(new Coin(),850,height(230));
        addObject(new Coin(),900,height(270));
        addObject(new Coin(),950,height(310));
        addObject(new Coin(),1450,height(375));
        addObject(new Coin(),2100,height(150));
        addObject(new Coin(),2200,height(150));
        addObject(new Coin(),2300,height(150));
        addObject(new Coin(),2900,height(75));
        addObject(new Coin(),2950,height(75));
        addObject(new Coin(),3000,height(75));
        addObject(new Coin(),3050,height(75));
        addObject(new Coin(),3100,height(75));
        addObject(new Coin(),3150,height(75));
        addObject(new Coin(),3450,height(125));
        addObject(new Coin(),3575,height(200));
        addObject(new Coin(),3450,height(320));
        addObject(new Coin(),3675,height(475));
        for(int i=0;i<7;i++)addObject(new Coin(),4225+50*i,height(75));
        for(int i=0;i<4;i++)addObject(new Coin(),4550+50*i,height(175+100*i));
        for(int i=0;i<4;i++)addObject(new Coin(),4800+50*i,height(175+100*i));
        for(int i=0;i<4;i++)addObject(new Coin(),5050+50*i,height(175+100*i));
        for(int i=0;i<3;i++)addObject(new Coin(),5300+50*i,height(175+100*i));
        for(int i=0;i<10;i++)for(int j=0;j<4;j++)addObject(new Coin(),6050+50*i,height(75+50*j));
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
    private void addTraps(){
        addObject(new InvisibleBox(0),975,height(75));
        addObject(new InvisibleBox(0),975,height(125));
        addObject(new InvisibleBox(0),975,height(175));
        addObject(new InvisibleBox(1),1400,height(175));
        addObject(new TrapGround(250),1600,height(25));
        addObject(new TrapBox(),1900,height(150));
        addObject(new TrapGround(150),2225,height(25));
        addObject(new InvisibleBox(1),2150,height(175));
        addObject(new InvisibleBox(1),2275,height(150));
        addObject(new InvisibleBox(1),2500,height(175));
        addObject(new InvisibleBox(1),2550,height(175));
        addObject(new TrapBox(),2650, height(100));
        addObject(new TrapGround(250),3025,height(25));
        addObject(new TrapBox(),3625,height(75));
        addObject(new InvisibleBox(3),3625,height(325));
        addObject(new TrapGround(50),4225,height(25));
        addObject(new TrapBox(),4550,height(125));
        addObject(new TrapGround(50),4275,height(25));
        addObject(new TrapGround(50),4325,height(25));
        addObject(new TrapGround(50),4375,height(25));
        addObject(new TrapGround(50),4425,height(25));
        addObject(new TrapGround(50),4475,height(25));
        addObject(new TrapGround(50),4525,height(25));
        addObject(new InvisibleBox(2),4600,height(175));
        addObject(new InvisibleBox(2),4650,height(275));
        addObject(new InvisibleBox(2),4700,height(375));
        addObject(new TrapBox(),4900,height(325));
        addObject(new TrapBox(),4950,height(425));
        addObject(new InvisibleBox(2),4900,height(275));
        addObject(new InvisibleBox(2),4950,height(375));
        addObject(new InvisibleBox(3),4875,height(25));
        addObject(new InvisibleBox(3),4025,height(325));
        addObject(new InvisibleBox(3),4075,height(325));
        addObject(new InvisibleBox(3),4125,height(325));
        addObject(new InvisibleBox(3),4275,height(250));
        addObject(new InvisibleBox(3),4325,height(250));
        addObject(new InvisibleBox(3),4375,height(250));
        addObject(new InvisibleBox(3),5000,height(325));
        addObject(new InvisibleBox(2),5100,height(175));
        addObject(new InvisibleBox(2),5150,height(275));
        addObject(new TrapBox(),5150,height(325));
        addObject(new InvisibleBox(3),5150,height(375));
        addObject(new TrapBox(),5300,height(125));
        addObject(new TrapBox(),5400,height(325));
        addObject(new InvisibleBox(3),5275,height(325));
        addObject(new InvisibleBox(2),5450,height(350));
        addObject(new InvisibleBox(2),5500,height(375));
        addObject(new InvisibleBox(2),5550,height(400));
        addObject(new InvisibleBox(2),5600,height(425));
        addObject(new InvisibleBox(2),5650,height(450));
        addObject(new TrapBox(),5700,height(475));
        addObject(new TrapGround(300),5175,height(25));
        addObject(new TrapGround(50),6050,height(25));
        addObject(new TrapGround(50),6100,height(25));
        addObject(new TrapGround(50),6150,height(25));
        addObject(new TrapGround(50),6200,height(25));
        addObject(new TrapGround(50),6250,height(25));
        addObject(new TrapGround(50),6300,height(25));
        addObject(new TrapGround(50),6350,height(25));
        addObject(new TrapGround(50),6400,height(25));
        addObject(new TrapGround(50),6450,height(25));
        addObject(new TrapGround(50),6500,height(25));
        addObject(new TrapGround(50),6550,height(25));
        addObject(new TrapGround(50),6600,height(25));
        addObject(new TrapGround(50),6650,height(25));
    }
}
