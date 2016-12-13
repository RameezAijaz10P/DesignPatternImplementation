package com.design.patterns.controller;

import com.design.patterns.model.SingletonPatternModel;
import com.sigleton.pattern.Singleton;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by rameez on 12/11/16.
 */
@Controller
public class SingletonPatternController {
    @RequestMapping(value = "/singleton/graph", method = RequestMethod.GET, produces = "application/json")
    public  @ResponseBody
    SingletonPatternModel SingletonPattern(){
        SingletonPatternModel singletonPatternModel = new SingletonPatternModel();
        Singleton singleton = Singleton.getInstance();
        singletonPatternModel.graph = singleton.graph.getGraphAdjacencyList();
        return singletonPatternModel;
    }
}
