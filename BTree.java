import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;

/**
 * Write a description of class BTree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BTree extends Actor
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
    
    public Node add(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            System.out.println("arvore vazia");
            this.root = newNode;
            return this.root;
        } else {
            Node actual = this.root;
            System.out.println("buscando no correto");
            while(true) {            
                if (newNode.getValue() > actual.getValue()){
                    System.out.println("procurando na direita");
                    if (actual.getRightChild() == null) {
                        System.out.println("inserindo num no vazio");
                        actual.setRightChildValue(newNode);
                        return newNode;
                    } else {
                        System.out.println("no nao vazio, procurando no proximo");
                        actual = actual.getRightChild();
                    }
                }
    
                if (newNode.getValue() < actual.getValue()){
                    System.out.println("procurando na esquerda");
                    if (actual.getLeftChild() == null) {
                        System.out.println("inserindo num no vazio");
                        actual.setLeftChildValue(newNode);
                        return newNode;
                    } else {
                        System.out.println("no nao vazio, procurando no proximo");
                        actual = actual.getLeftChild();
                    }
                }
            }
        }
    }
}
