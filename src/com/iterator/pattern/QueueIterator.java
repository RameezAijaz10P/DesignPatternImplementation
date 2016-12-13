package com.iterator.pattern;

import com.queue.Queue;

/**
 * Created by rameez on 12/5/16.
 */
public class QueueIterator implements Iterator {
    Queue queue;
    public QueueIterator(Queue queue){
        this.queue = queue;
    }
    @Override
    public boolean hasNext() {
        return queue.peak() != null;
    }

    @Override
    public Integer next() {
        return queue.dequeue();
    }
}
