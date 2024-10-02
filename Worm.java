import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Worm here.
 * 
 * @author (Koan Nayfack) 
 * @version (1.0)
 */
public class Worm extends Actor
{
    /**
     * Act - do whatever the Worm wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        collision();
    
    }
    private void collision()
    {
       if(isTouching(Crab.class))
       {
         getWorld().removeObject(this);  
       }
    }
   
    }

