import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fondo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fondo extends World
{
    SimpleTimer contador = new SimpleTimer();
    Counter tiempo = new Counter();
    /**
     * Constructor for objects of class Fondo.
     * 
     */
    public Fondo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(632, 355, 1); 
        addObject(new Ghost(), 50, 200); // añadimos el personaje al mapa
        addObject(tiempo, getWidth()/2, getHeight()-320);
        addObject(new calabaza(), 620, 155);
        contador.mark();

        prepare();
    }

    public void act(){
        tiempo.setValue(contador.millisElapsed()/100); 
        if(Greenfoot.isKeyDown("Space")){
            Greenfoot.start();
        }
        //contamos el tiempo con esto, que resulta ser el puntaje
        

    }
    
    private void prepare()
    {
        calabaza calabaza = new calabaza();
        addObject(calabaza,614,230);
        calabaza calabaza2 = new calabaza();
        addObject(calabaza2,614,26);
        calabaza.setLocation(620,223);
        calabaza calabaza3 = new calabaza();
        addObject(calabaza3,622,300);
        calabaza calabaza4 = new calabaza();
        addObject(calabaza4,539,25);
    }
}
