package com.template.pattern;


import java.util.ArrayList;

/**
 * Created by rameez on 12/11/16.
 */
public class BreadthFirstTraversor extends GraphTraverser {
    public static ArrayList<Integer> vertexQueue = new ArrayList<>();

    public static ArrayList<Integer> breadthFirstTraversal = new ArrayList<>();
    @Override
    public boolean storageIsEmpty() {
        return BreadthFirstTraversor.vertexQueue.isEmpty();
    }

    @Override
    public void addVertexInStorage(int vertex) {
        BreadthFirstTraversor.vertexQueue.add(vertex);
    }

    @Override
    public int getVertexFromStorage() {
        Integer temp = BreadthFirstTraversor.vertexQueue.get(0);
        BreadthFirstTraversor.vertexQueue.remove(0);
        return temp;
    }

    @Override
    public void printVertex(int vertex) {
        BreadthFirstTraversor.breadthFirstTraversal.add(vertex);
    }
}
