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
        Node actual = arvore.getRoot();
        if (actual != null) {
            showTree(actual);
        }
    }
    
    public void showTree(Node actual) {
        if (actual.getFather() == null) {
            addObject(actual, actual.x, actual.y);
            if (actual.hasChildren()) {
                for (Node node : actual.getChildrens()) {
                    if (node != null) {
                        showTree(node);
                    }
                }
            }
        }
        if (actual.getRightChild() != null) {
            if (actual.getFather().getRightChild() == actual) {
                addObject(actual, actual.x + 20, actual.y + 30);
                showTree(actual.getRightChild());
            }
        }
        if (actual.getRightChild() != null) {
            if (actual.getFather().getLeftChild() == actual) {
                addObject(actual, actual.x - 20, actual.y + 30);
                showTree(actual.getLeftChild());
            }
        }
    }
}
