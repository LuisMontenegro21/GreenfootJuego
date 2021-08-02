import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ghost here.
 * 
 * @author (Luis) 
 * @version (a version number or a date)
 */
public class Ghost extends Actor
{
    /**
     * Act - do whatever the Ghost wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        control();
        perder();
    }
    public void control()
    {
    // los controles del jugador
        if(Greenfoot.isKeyDown("Up")){
        setLocation(getX(),getY()-8);
    }
        if(Greenfoot.isKeyDown("Down")){
        setLocation(getX(), getY()+8);
    }
    }
    public void perder(){
    if(isTouching(calabaza.class)){
        Greenfoot.stop();
    }
    }
}

        
    
        
    


