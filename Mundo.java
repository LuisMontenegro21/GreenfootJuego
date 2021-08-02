import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mundo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mundo extends World
{

    /**
     * Constructor for objects of class Mundo.
     * 
     */
    public Mundo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(new Ghost(), 50, 200); // añadimos el personaje al mapa
        addObject(new calabaza(), 680, 200); // se une los obstaculos
        Greenfoot.delay(20);
        
    }
}
