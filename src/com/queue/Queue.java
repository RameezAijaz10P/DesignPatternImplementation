package com.queue;

import java.util.ArrayList;

/**
 * Created by rameez on 11/13/16.
 */
public class Queue {

    ArrayList<Integer> queue = new ArrayList<>();

    public void enqueue(Integer i){
        queue.add(i);

    }
    public Integer peak(){
        if(queue.size()==0)
        {
            return null;
        }
        Integer value = queue.get(0);
        return value;
    }
    public Integer dequeue(){
        Integer value = queue.get(0);
        queue.remove(0);
        return value;
    }
    public ArrayList<Integer> getAllElementInOrder(){
        return queue;
    }
}
