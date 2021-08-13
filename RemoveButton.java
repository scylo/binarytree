import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;

/**
 * Write a description of class RemoveButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RemoveButton extends Actor
{
    /**
     * Act - do whatever the RemoveButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseClicked(this)) {
             String inputValue = JOptionPane.showInputDialog("Please input a value");
        }  
    }
}
