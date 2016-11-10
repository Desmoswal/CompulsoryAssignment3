import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TrapBox here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TrapBox extends Traps
{    
    public void act(){
        if(isTouching(Player.class)){
            Player p=(Player)getOneIntersectingObject(Player.class);
            p.die();
        }
    }
}
