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
        MyWorld world = (MyWorld) getWorld();
        BTree arvore = world.getBTree();
        // getWorld().addObject(arvore, 0, 0); // obeto precisa ser adiconado pro act funcionar
        
        // if (arvore.root != null) {
            // System.out.println(arvore.root.getValue());
        // }
 
        if (Greenfoot.mouseClicked(this)) {
             String value = JOptionPane.showInputDialog("digite o numero que deseja inserir");
             arvore.add(Integer.parseInt(value));
             // getWorld().addObject(x, 320, 20);
             // getWorld().addObject(arvore.add(Integer.parseInt(value)), 320, 20);
             // getWorld().addObject(newNode, newNode.x, newNode.y);
        }
    }
}
