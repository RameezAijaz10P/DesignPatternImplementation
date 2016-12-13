package com.adapter.pattern;

import com.binary.tree.BinaryTree;

import java.sql.Array;
import java.util.ArrayList;

/**
 * Created by rameez on 12/5/16.
 */
public class binaryTreeAdapter implements ArrayInterface {
    BinaryTree binaryTree;
    ArrayList<Integer> all_nodes = null;

    public binaryTreeAdapter(BinaryTree binaryTree)
    {
        this.binaryTree = binaryTree;
    }
    @Override
    public Integer get() {
        Integer value = all_nodes.get(0);
        all_nodes.remove(0);
        return value;
    }

    @Override
    public void add(Integer value) {
        binaryTree.addNode(value);
    }

    @Override
    public int size() {
        this.all_nodes=binaryTree.getAllNodes();
        return this.all_nodes.size();
    }
}
