package com.adapter.pattern;

import com.queue.Queue;

/**
 * Created by rameez on 12/5/16.
 */
public class queueAdapter implements ArrayInterface {
    Queue queue;
    public queueAdapter(Queue queue){
        this.queue = queue;
    }
    @Override
    public Integer get() {
        return queue.dequeue();
    }

    @Override
    public void add(Integer value) {
        queue.enqueue(value);
    }

    @Override
    public int size() {
        return queue.getAllElementInOrder().size();
    }
}
