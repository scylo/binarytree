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
             String value = JOptionPane.showInputDialog("digite o numero que deseja inserir");             
             getWorld().addObject(new Node(Integer.parseInt(value)), 320, 20);
             System.out.println(Integer.parseInt(value));
        }
    }
}
