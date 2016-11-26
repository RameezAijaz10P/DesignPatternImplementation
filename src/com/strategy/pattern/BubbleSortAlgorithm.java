package com.strategy.pattern;

/**
 * Created by rameez on 11/13/16.
 */
public class BubbleSortAlgorithm extends SortAlgorithm {

    public BubbleSortAlgorithm(){
        sortingBehavior = new BubbleSortBehavior();
    }
    @Override
    String displayAlgorithmName() {
        return "Bubble Sort";
    }
}
