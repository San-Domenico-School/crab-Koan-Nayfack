import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * lobster should moves around the scene automatically, turning at the edges.
 * 
 * @Koan Nayfack (your name) 
 * @v1.0 
 */
public class Lobster extends Actor
{
    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        turnAtEdge();
        autoMove();
    }
    
    private void turnAtEdge()
    {
         if(isAtEdge())
        {
            turn(180);
        }
    }
    
    private void autoMove()
    {
        move(5);
    }
}
