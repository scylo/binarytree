import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;

/**
 * Write a description of class BTree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BTree<Node> extends Actor
{
    /**
     * Act - do whatever the BTree wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    /** onde a arvore começa*/
    public Node root;
    
    public BTree() {
        this.root = null;
    }
    
    public Node getRoot() {
        return root;
    }
    
    public void add(int valor) {
        
    }
}
