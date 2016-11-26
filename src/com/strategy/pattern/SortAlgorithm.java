package com.strategy.pattern;

import java.util.ArrayList;

/**
 * Created by rameez on 11/12/16.
 */
public abstract class SortAlgorithm {

    SortingBehavior sortingBehavior;

    abstract String displayAlgorithmName();

    public void  setSortingBehavior(SortingBehavior newSortingBehavior)
    {
        sortingBehavior = newSortingBehavior;
    }
    public ArrayList<Integer> performSort(ArrayList<Integer> numbers)
    {
        return sortingBehavior.sort(numbers);
    }

}
