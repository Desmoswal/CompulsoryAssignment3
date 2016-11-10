import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InvisibleBox here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InvisibleBox extends Traps
{   
    /*
     * 0 touching right side 
     * 1 touching from below
     * 2 touching left side
     * 3 touching from above 
       */
    private int option;
    private boolean visible;
    private Player p;
    public InvisibleBox(int option){
        this.option=option;
        visible=false;
    }
    @Override
    public void act(){
        if(visible)p.check(getClass(),this);
        else isActivated();
    }
    private void popUp(){
        setImage("Box(50x50).png");
        visible=true;
    }
    private void isActivated(){
        if(isTouching(Player.class)){
            p=(Player)getOneIntersectingObject(Player.class);
            switch(option){
                case 0:
                    if(p.xSpeed<0)popUp();
                    break;
                case 1:
                    if(p.ySpeed<0)popUp();
                    break;
                case 2:
                    if(p.xSpeed>0)popUp();
                    break;
                case 3:
                    if(p.ySpeed>0)popUp();
                    break;
                default:
                    System.out.println("Error");
                    break;
                }
            }
    }
}
