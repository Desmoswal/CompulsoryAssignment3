import greenfoot.*;

/**
 * An object to act as an obstacle.
 */
public class Box extends Actor
{
    /**
     * Creates the object and sizes its image.
     */
    public Box()
    {
        
    }
    public Box(int a,int size){
        GreenfootImage box = new GreenfootImage("Box(50x50).png");
        if(a==0){
            GreenfootImage image = new GreenfootImage(size, box.getHeight());
            int w=box.getWidth();
            for(int offset=0; offset<size; offset+=w) image.drawImage(box, offset, 0);
            setImage(image);
        }
        else if(a==1){
            GreenfootImage image = new GreenfootImage(box.getWidth(),size);
            int w=box.getHeight();
            for(int offset=0; offset<size; offset+=w) image.drawImage(box, 0, offset);
            setImage(image);
        }
        else{
            System.out.println("Error");
        }
    }
}
