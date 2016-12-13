package com.stack;

import java.util.ArrayList;

/**
 * Created by rameez on 11/13/16.
 */
public class Stack {
    ArrayList<Integer> stack = new ArrayList<>();

    public void push(Integer i){
        stack.add(i);
    }

    public Integer pop(){
        Integer value = stack.get(stack.size()-1);
        stack.remove(stack.size()-1);
        return value;
    }
    public Integer peak(){
        if(stack.size()==0)
        {
            return null;
        }
        Integer value = stack.get(stack.size()-1);
        return value;
    }
    public ArrayList<Integer> getAllElementInOrder(){
        ArrayList<Integer> temp = new ArrayList<>();
        Integer i = stack.size();

        while (i>0)
        {
            temp.add(stack.get(--i));
        }
        return temp;
    }
}
