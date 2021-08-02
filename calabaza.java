import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class calabaza here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class calabaza extends Actor
{
    /**
     * Act - do whatever the calabaza wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //los movimientos de la clase calabaza para reaparecer 
        move(-5);
        perder();
        if(isAtEdge()== true){
            setLocation(getX()+580, Greenfoot.getRandomNumber(340)); 
        }
        if(isTouching(calabaza.class) == true){
            setLocation(getX()+580, Greenfoot.getRandomNumber(340));
        }
    }
    public void perder(){
    //Si la calabaza toca con el jugador, automaticamente para el juego
    if(isTouching(Ghost.class)){
            removeTouching(Ghost.class);
            if(true){
            Greenfoot.stop();
            }
    }
            
    
    }
}
