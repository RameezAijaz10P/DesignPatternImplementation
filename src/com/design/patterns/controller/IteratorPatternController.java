package com.design.patterns.controller;

import com.binary.tree.BinaryTree;
import com.design.patterns.model.IteratorPatternModel;
import com.iterator.pattern.BinaryTreeIterator;
import com.iterator.pattern.Iterator;
import com.iterator.pattern.QueueIterator;
import com.iterator.pattern.StackIterator;
import com.queue.Queue;
import com.stack.Stack;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by rameez on 12/5/16.
 */
@Controller
public class IteratorPatternController {
    @RequestMapping(value = "/iterator_pattern/iterate", method = RequestMethod.GET, produces = "application/json")
    public  @ResponseBody
    IteratorPatternModel iteratorPattern() {
        IteratorPatternModel iteratorPatternModel= new IteratorPatternModel();
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.addNode(5);
        binaryTree.addNode(2);
        binaryTree.addNode(6);
        binaryTree.addNode(1);
        binaryTree.addNode(4);
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        Iterator stackIterator = new StackIterator(stack);
        Iterator queueIterator = new QueueIterator(queue);
        Iterator binaryTreeIterator = new BinaryTreeIterator(binaryTree);

        while (stackIterator.hasNext()){
            iteratorPatternModel.stack.add(stackIterator.next());
        }
        while (queueIterator.hasNext()){
            iteratorPatternModel.queue.add(queueIterator.next());
        }
        while (binaryTreeIterator.hasNext()){
            iteratorPatternModel.binaryTree.add(binaryTreeIterator.next());
        }

        return iteratorPatternModel;
    }
}
