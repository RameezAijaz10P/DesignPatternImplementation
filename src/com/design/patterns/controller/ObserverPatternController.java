package com.design.patterns.controller;
import com.observer.pattern.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.design.patterns.model.ObserverPatternModel;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by rameez on 11/13/16.
 */
@Controller
public class ObserverPatternController {

    @RequestMapping(value = "/observer_pattern/publish", method = RequestMethod.GET, produces = "application/json")
    public  @ResponseBody
    ObserverPatternModel strategyPattern(String values) {
        if(values == null || values.trim().equals(""))
        {
            values = "1";
        }
        ArrayList<String> numbersList = new ArrayList<String>(Arrays.asList(values.split("\\s*,\\s*")));
        ArrayList<Integer> integers = new ArrayList<>();
        for(int i=0; i < numbersList.size(); i++) {
            integers.add(Integer.parseInt(numbersList.get(i)));
        }
        ObserverPatternModel observerPatternModel = new ObserverPatternModel();
        DataPublisher publisher = new DataPublisher();
        BinaryTreeObserver binaryTreeObserver = new BinaryTreeObserver(publisher);
        StackObserver stackObserver = new StackObserver(publisher);
        QueueObserver queueObserver = new QueueObserver(publisher);

        for(int j =0; j<numbersList.size(); j++)
        {
            publisher.notifyObservers(integers.get(j));
        }

        observerPatternModel.binaryTree=binaryTreeObserver.display();
        observerPatternModel.stack = stackObserver.display();
        observerPatternModel.queue = queueObserver.display();


        return observerPatternModel;
    }
    
    
}
