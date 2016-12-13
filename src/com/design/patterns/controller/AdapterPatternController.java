package com.design.patterns.controller;

import com.adapter.pattern.ArrayInterface;
import com.adapter.pattern.binaryTreeAdapter;
import com.adapter.pattern.queueAdapter;
import com.adapter.pattern.stackAdapter;
import com.binary.tree.BinaryTree;
import com.design.patterns.model.AdapterPatternModel;
import com.design.patterns.model.IteratorPatternModel;
import com.queue.Queue;
import com.stack.Stack;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by rameez on 12/6/16.
 */
@Controller
public class AdapterPatternController {
    @RequestMapping(value = "/adapter_pattern/adapt", method = RequestMethod.GET, produces = "application/json")
    public  @ResponseBody
    AdapterPatternModel adapterPattern(){
        BinaryTree binaryTree = new BinaryTree();
        Stack stack = new Stack();
        Queue queue = new Queue();
        ArrayInterface binaryTreeArray = new binaryTreeAdapter(binaryTree);
        ArrayInterface stackArray = new stackAdapter(stack);
        ArrayInterface queueArray = new queueAdapter(queue);

        AdapterPatternModel adapterPatternModel = new AdapterPatternModel();

        binaryTreeArray.add(1);
        binaryTreeArray.add(2);
        binaryTreeArray.add(3);
        binaryTreeArray.add(4);

        stackArray.add(1);
        stackArray.add(2);
        stackArray.add(3);
        stackArray.add(4);

        queueArray.add(1);
        queueArray.add(2);
        queueArray.add(3);
        queueArray.add(4);

        int stack_size = stackArray.size();
        int queue_size = queueArray.size();
        int binaryTree_size = binaryTreeArray.size();

        for(int i =0; i<stack_size; i++)
        {
            adapterPatternModel.stack.add(stackArray.get());
        }
        for(int i =0; i<binaryTree_size; i++)
        {
            adapterPatternModel.binaryTree.add(binaryTreeArray.get());
        }
        for(int i =0; i<queue_size; i++)
        {
            adapterPatternModel.queue.add(queueArray.get());
        }
        return adapterPatternModel;

    }
}
