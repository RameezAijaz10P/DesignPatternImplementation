package com.template.pattern;

import java.util.ArrayList;

/**
 * Created by rameez on 12/11/16.
 */
public abstract class GraphTraverser {

    private ArrayList<Integer> visited = new ArrayList<>();
    public final ArrayList<Integer> traverse(int[][] graph){
        int vertex = graph[0][0];
        addVertexInStorage(vertex);
        printVertex(vertex);
        do
        {
            if(!visited.contains(vertex)){
                visited.add(vertex);
            };
            vertex = getNextVertex(graph,vertex);
            if(vertex==-1)
            {
                vertex = getVertexFromStorage();
            }else {
                addVertexInStorage(vertex);
                printVertex(vertex);
            }

        }while (!storageIsEmpty());

        return visited;
    }
    public abstract boolean storageIsEmpty();
    public abstract void addVertexInStorage(int vertex);
    public abstract int getVertexFromStorage();
    public abstract void printVertex(int vertex);
    public int getNextVertex(int[][]graph, int i){
        int temp = -1;
        for(int j=0; j<graph[i].length; j++)
        {
            if(!visited.contains(graph[i][j])){
                temp = graph[i][j];
                break;
            }
        }
        return temp;
    }

}
