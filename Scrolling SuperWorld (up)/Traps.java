import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Traps here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Traps extends Actor
{
    public void act(){
        if(isTouching(Player.class)){
            Player p=(Player)getOneIntersectingObject(Player.class);
            p.die();
        }
    }
}
