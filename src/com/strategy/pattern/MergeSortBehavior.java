package com.strategy.pattern;

import java.util.*;

/**
 * Created by rameez on 11/13/16.
 */
public class MergeSortBehavior implements SortingBehavior {

    ArrayList<Integer> mergeSort(ArrayList<Integer> array_1, ArrayList<Integer> array_2){
        ArrayList<Integer> result= new ArrayList<>();
        int i=0;

        while(!array_1.isEmpty() && !array_2.isEmpty())
        {
            if(array_1.get(i)<array_2.get(i))
            {
                result.add(array_1.get(i));
                array_1.remove(i);
            }
            else {
                result.add(array_2.get(i));
                array_2.remove(i);
            }
        }
        for(i =0; i< array_1.size();i++)
        {
            result.add(array_1.get(i));
        }
        for(i =0; i< array_2.size();i++)
        {
            result.add(array_2.get(i));
        }
        return result;
    }

    @Override
    public ArrayList<Integer> sort(ArrayList<Integer> numbers) {
        if(numbers.size()<2)
        {
            return numbers;
        }
        ArrayList<Integer> part_1=  sort(new ArrayList<>(numbers.subList(0,numbers.size()/2)));
        ArrayList<Integer> part_2=  sort(new ArrayList<>(numbers.subList(numbers.size()/2,numbers.size())));

        return mergeSort(part_1,part_2);
    }
}
