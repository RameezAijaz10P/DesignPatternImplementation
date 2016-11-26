package com.observer.pattern;

import javax.management.Query;
import java.util.ArrayList;

/**
 * Created by rameez on 11/13/16.
 */
public class QueueObserver implements Observer,DisplayElement {

    Queue queue = new Queue();

    public QueueObserver(Subject s){
        s.registerObserver(this);
    }
    @Override
    public void update(Integer i) {
        queue.enqueue(i);
    }

    @Override
    public ArrayList<Integer> display() {
        return queue.getAllElementInOrder();
    }
}
