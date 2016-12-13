package com.adapter.pattern;

import com.stack.Stack;

/**
 * Created by rameez on 12/5/16.
 */
public class stackAdapter implements ArrayInterface {
    Stack stack;

    public stackAdapter(Stack stack){
        this.stack = stack;
    }
    @Override
    public Integer get() {
        return stack.pop();
    }

    @Override
    public void add(Integer value) {
        stack.push(value);
    }

    @Override
    public int size() {
        return stack.getAllElementInOrder().size();
    }
}
