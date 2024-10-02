import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class CrabWorld extends World
{
   private GreenfootImage win;
   private GreenfootImage loose;
   /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */

   public void act()
   {
       lastWorm();
   }
    
    public CrabWorld() 
   {
       super(560, 560, 1);
       prepareScene();
       win = new GreenfootImage("youWon.png");
       loose = new GreenfootImage("youLoose.png");
        
    }
    
   private void prepareScene()
   {
       Crab crab = new Crab( );
       addObject(crab, 470, 100);
        
       Lobster lobster = new Lobster();
       int x = (int)(getWidth() * Math.random());
       int y = (int)(getWidth() * Math.random());
       addObject(lobster, x, y);
       
       Worm worm = new Worm();
       addObject(worm,(int)(Math.random() * 560), (int)(Math.random() * 560));
        
       Worm worm2 = new Worm();
       addObject(worm2,(int)(Math.random() * 560), (int)(Math.random() * 560));
        
       Worm worm3 = new Worm();
       addObject(worm3,(int)(Math.random() * 560), (int)(Math.random() * 560));
        
       Worm worm4 = new Worm();
       addObject(worm4,(int)(Math.random() * 560), (int)(Math.random() * 560));
        
       Worm worm5 = new Worm();
       addObject(worm5,(int)(Math.random() * 560), (int)(Math.random() * 560));
        
       Worm worm6 = new Worm();
       addObject(worm6,(int)(Math.random() * 560), (int)(Math.random() * 560));
        
       Worm worm7 = new Worm();
       addObject(worm7,(int)(Math.random() * 560), (int)(Math.random() * 560));
        
       Worm worm8 = new Worm();
       addObject(worm8,(int)(Math.random() * 560), (int)(Math.random() * 560));
        
       }
   private void lastWorm()
   {
      if(getObjects(Worm.class).size() == 0)
      {
          Greenfoot.playSound("chime.wav");
          setBackground(win);
          Greenfoot.stop();
      }
   }
   private void youLost()
   {
       if(getObjects(Crab.class).size() == 0)
      {
          setBackground(loose);
      }
   }
}