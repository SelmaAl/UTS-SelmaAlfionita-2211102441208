import greenfoot.*; 
public class Snake1 extends Actor
{
    private int leght;
    private Snake1 nextNode;
    public void act()
    {
        if(0==leght--&&Snake2.getAlive())getWorld().removeObject(this);
    }
    public Snake1(int pLength, int rotation, Snake1 next)
    {
        leght = pLength;
        setRotation(rotation);
        nextNode = next;
    }
    public void increase()
    {
        leght += Snake2.getScale();
        if(nextNode!=null)nextNode.increase();
    }
}
