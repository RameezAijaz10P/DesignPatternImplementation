package com.observer.pattern;

import java.util.ArrayList;

/**
 * Created by rameez on 11/13/16.
 */
public class BinaryTree {
    Node root_node=null;

    ArrayList<Integer> temp = new ArrayList<>();
    public ArrayList<Integer> getAllNodes(){
        InOrderTraversal(this.root_node);
        return temp;
    }
    void InOrderTraversal(Node n){
        if(n !=null)
        {
            if(n.getLeft_node() != null)
            {
                InOrderTraversal(n.getLeft_node());
            }
            temp.add(n.getValue());
            if(n.getRight_node()!=null)
            {
                InOrderTraversal(n.getRight_node());
            }
        }
    }
    public void addNode(Integer value){
        Node new_node = new Node(value);
        if(root_node == null)
        {
            root_node = new_node;
            return;
        }
        Node current_node = root_node;
        while (true)
        {
            if(value < current_node.getValue())
            {
                if(current_node.getLeft_node()==null)
                {
                    current_node.setLeftNode(new_node);
                    break;
                }
                current_node = current_node.getLeft_node();
            }
            else{
                if(current_node.getRight_node()==null)
                {
                    current_node.setRightNode(new_node);
                    break;
                }
                current_node = current_node.getRight_node();


            }

        }


    }
}

class Node{
    Integer value=null;
    Node left_node = null;
    Node right_node = null;
    Node(Integer value){
        this.value = value;
    }
    void setLeftNode(Node node){
        left_node = node;
    }
    void setRightNode(Node node){
        right_node = node;
    }
    Integer getValue(){return this.value;}
    Node getLeft_node(){return this.left_node;}
    Node getRight_node(){return this.right_node;}
}