import greenfoot.*;

/**
 * This class defines a crab. 
 * Crabs can move turn as edges, check for keypress,collide with food and predetors.
 * @author KoanNayfack
 * @version 6/1/2022 5:48am
 */
public class Crab extends Actor
{
    // Always place fields first in the class.
    // After the fields place the behaviors
    
    
    public void act ()
    
    {
          storeUserInput();
          turnAtEdge();
          collision();
    }
    
    private void storeUserInput()
    {
         if(Greenfoot.isKeyDown("left"))
            {
                move(-3);
            }
            else if(Greenfoot.isKeyDown("right"))
            {
                move(3);
            }
            else if(Greenfoot.isKeyDown("up"))
            {
                turn(5);
            }
            
            else if(Greenfoot.isKeyDown("down"))
            {
                turn(-5);
            }
    } 
    
    private void turnAtEdge()
    {
        if(isAtEdge())
        {
            turn(180);
        }
    }
    
    private void collision()
    {
       if(isTouching(Lobster.class))
       {
            Greenfoot.playSound("au.wav");
            getWorld().removeObject(this);
            Greenfoot.stop();
       }
    }
}          
