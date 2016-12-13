package com.observer.pattern;

import com.binary.tree.BinaryTree;

import java.util.ArrayList;

/**
 * Created by rameez on 11/13/16.
 */
public class BinaryTreeObserver implements Observer,DisplayElement {

    BinaryTree binary_tree = new BinaryTree();
    public BinaryTreeObserver(Subject s)
    {
        s.registerObserver(this);
    }
    @Override
    public void update(Integer i) {

        binary_tree.addNode(i);

    }

    @Override
    public ArrayList<Integer> display() {
        return binary_tree.getAllNodes();

    }
}
