package com.iterator.pattern;

import com.stack.Stack;

/**
 * Created by rameez on 12/5/16.
 */
public class StackIterator implements Iterator {
    Stack stack;
    public StackIterator(Stack stack){
        this.stack = stack;
    }
    @Override
    public boolean hasNext() {
        return stack.peak() != null;
    }

    @Override
    public Integer next() {
        return stack.pop();
    }
}
