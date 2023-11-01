import greenfoot.*;  
import java.util.Random;
public class Food extends Actor
{
    Random r = new Random();
    public void act()
    {
        while(getOneIntersectingObject(Snake1.class)!=null)setLocation(r.nextInt(MyWorld.getMyWidth()), r.nextInt(MyWorld.getMyHeight()));
    }
}
