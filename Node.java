import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Node here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Node extends Actor
{
    /**
     * Act - do whatever the Node wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int value;
    Node father_node;
    Node right_child;
    Node left_child;
    
    public Node(int value) {
       this.value = value;
       this.right_child = null;
       this.left_child = null;

       String value_string = Integer.toString(value);
       GreenfootImage img = new GreenfootImage(value_string.length()*20, 20);
       img.drawString(value_string, 2, 20);
       setImage(img);
    }
    
    public int getValue() {
        return value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public void setLeftChildValue(Node value) {
        this.left_child = value;
    }
    
    public void setRightChildValue(Node value) {
        this.right_child = value;
    }
    
    public Node getLeftChild() {
        return this.left_child;
    }
    
    public Node getRightChild() {
        return this.right_child;
    }
}
