import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;

/**
 * Write a description of class AddButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AddButton extends Actor
{
    /**
     * Act - do whatever the AddButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseClicked(this)) {
             
             BTree btree = new BTree();
             String inputValue = JOptionPane.showInputDialog("Please input a value");
        }
    }
}
