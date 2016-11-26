package com.strategy.pattern;

/**
 * Created by rameez on 11/13/16.
 */
public class MergeSortAlgorithm extends SortAlgorithm {

    public MergeSortAlgorithm(){
        sortingBehavior = new MergeSortBehavior();
    }
    @Override
    String displayAlgorithmName() {
        return "Merge Sort";
    }
}
