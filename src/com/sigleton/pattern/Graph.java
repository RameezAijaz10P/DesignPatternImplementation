package com.sigleton.pattern;

/**
 * Created by rameez on 12/11/16.
 */
public class Graph {

    private int[][] adjacencyList = {{1, 6, 8}, {0, 4, 6, 9}, {4, 6}, {4, 5, 8}, {1, 2, 3, 5, 9}, {3, 4}, {0, 1, 2}, {8, 9}, {0, 3, 7}, {1, 4, 7}};
    public int[][] getGraphAdjacencyList(){
        return adjacencyList;
    }

}
