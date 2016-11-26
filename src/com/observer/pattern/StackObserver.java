package com.observer.pattern;

import java.util.ArrayList;

/**
 * Created by rameez on 11/13/16.
 */
public class StackObserver implements Observer,DisplayElement {

    Stack stack = new Stack();

    public StackObserver(Subject s){s.registerObserver(this);}
    @Override
    public void update(Integer i) {
        stack.push(i);
    }

    @Override
    public ArrayList<Integer> display() {
        return stack.getAllElementInOrder();
    }
}
