package com.template.pattern;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by rameez on 12/11/16.
 */
public class DepthFirstTraverser extends GraphTraverser {
    public static Stack<Integer> vertexStack = new Stack<>();
    public static ArrayList<Integer> depthFirstTraversal = new ArrayList<>();
    @Override
    public boolean storageIsEmpty() {
        return DepthFirstTraverser.vertexStack.isEmpty();
    }

    @Override
    public void addVertexInStorage(int vertex) {
        DepthFirstTraverser.vertexStack.push((Integer) vertex);
    }

    @Override
    public int getVertexFromStorage() {
        return DepthFirstTraverser.vertexStack.pop();
    }

    @Override
    public void printVertex(int vertex) {
        DepthFirstTraverser.depthFirstTraversal.add(vertex);
    }
}
