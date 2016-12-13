package com.iterator.pattern;

import com.binary.tree.BinaryTree;

import java.util.ArrayList;

/**
 * Created by rameez on 12/5/16.
 */
public class BinaryTreeIterator implements Iterator {
    BinaryTree binaryTree;
    ArrayList<Integer> all_nodes;
    public BinaryTreeIterator(BinaryTree binaryTree){
        this.binaryTree = binaryTree;
        this.all_nodes = binaryTree.getAllNodes();

    }
    @Override
    public boolean hasNext() {
        return all_nodes.size()>0;
    }

    @Override
    public Integer next() {
        Integer value = all_nodes.get(0);
        all_nodes.remove(0);
        return value;
    }
}
