package com.strategy.pattern;

import java.util.ArrayList;

/**
 * Created by rameez on 11/13/16.
 */
public class BubbleSortBehavior implements SortingBehavior {

    @Override
    public ArrayList<Integer> sort(ArrayList<Integer> numbers) {

        for (int i = 0; i < numbers.size(); i++) {
            boolean is_cell_swapped = false;
            for (int j = 0; j < numbers.size()-1; j++) {
                if (numbers.get(j) > numbers.get(j+1))
                {
                    numbers.set(j,numbers.get(j)+numbers.get(j+1));
                    numbers.set(j+1,numbers.get(j)-numbers.get(j+1));
                    numbers.set(j,numbers.get(j)-numbers.get(j+1));
                    is_cell_swapped = true;

                }
            }
            if(!is_cell_swapped)
            {
                break;
            }
        }

        return numbers;
    }
}
