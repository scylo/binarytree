import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

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
    int x, y;
    Node father_node;
    Node right_child;
    Node left_child;
    
    public Node(int value) {
        this.value = value;
        this.right_child = null;
        this.left_child = null;
        this.father_node = null;
        
        this.x = 320;
        this.y = 20;
        
        String value_string = Integer.toString(value);
        GreenfootImage img = new GreenfootImage(value_string.length()*20, 20);
        img.drawString(value_string, 2, 20);
        setImage(img);
    }
    
    public int getX() {
        return this.x;
    }
    
    public int getY() {
        return this.y;
    }
    
    public void setX(int value) {
        this.x = value;
    }
    
    public void setY(int value) {
        this.y = value;
    }
    
    public int getValue() {
        return value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public void setLeftChildValue(Node value) {
        this.left_child = value;
        value.setX(this.getX() - 20);
        value.setY(this.getY() + 30);
    }
    
    public void setRightChildValue(Node value) {
        this.right_child = value;
        value.setX(this.getX() + 20);
        value.setY(this.getY() + 30);
    }
    
    public Node getFather() {
        return this.father_node;
    }
    
    public void setFather(Node father) {
        this.father_node = father;
    }
    
    public Node getLeftChild() {
        return this.left_child;
    }
    
    public Node getRightChild() {
        return this.right_child;
    }
    
    public boolean hasChildren() {
        if (this.getLeftChild() != null || this.getRightChild() != null) {
            return true;
        }
        return false;
    }
    
    public ArrayList<Node> getChildrens() {
        ArrayList<Node> childrens = new ArrayList<>();
        childrens.add(this.getRightChild());
        childrens.add(this.getLeftChild());
        return childrens;
    }
    
    public void act() {
        setLocation(this.getX(), this.getY());
    }
}
