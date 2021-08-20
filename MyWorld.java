import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    private BTree arvore;
    boolean drawning = false;
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
        arvore = new BTree();
    }
    
    public BTree getBTree() {
        return arvore;
    }
    
    public boolean getDrawning() {
        return this.drawning;
    }
    
    public void setDrawning() {
        this.drawning = true;
    }
    
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    { 
        AddButton addButton = new AddButton();
        addObject(addButton,308,309);
    }
    
    public void act() {
        // System.out.println("arvore vazia");
        // Node actual = arvore.getRoot();
        // if (actual != null) {
            // if (getDrawning() == false) {
                // showTree(actual);
            // }
        // }
    }
    
    
}
