import greenfoot.*;
import java.awt.Color;

/**
 * A simple score class.
 */
public class Score extends Actor
{
    int score = 0; // the score field
    private static Score myScore;
    /**
     * Creates the object and its initial image.
     */
    public Score()
    {
        updateImage();
        myScore=this;
    }
    
    /**
     * Creates (or re-creates) the image of the object.
     */
    private void updateImage()
    {
        setImage(new GreenfootImage("Score: "+score, 18, Color.black, new Color(0, 0, 0, 0)));
    }
    
    /**
     * Adusts the score by <i>addAmt</i>.
     *
     * @param addAmt: the change in the score (negatives decrease the score)
     */
    public void add(int addAmt)
    {
        score+=addAmt;
        updateImage();
    }
    public static Score getScore(){
        return myScore;
    }
}
