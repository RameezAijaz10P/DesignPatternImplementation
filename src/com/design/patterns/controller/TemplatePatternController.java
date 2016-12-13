package com.design.patterns.controller;

import com.design.patterns.model.TemplatePatternModel;
import com.sigleton.pattern.Singleton;
import com.template.pattern.BreadthFirstTraversor;
import com.template.pattern.DepthFirstTraverser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by rameez on 12/11/16.
 */
@Controller
public class TemplatePatternController {
    @RequestMapping(value = "/template_pattern/traverse", method = RequestMethod.GET, produces = "application/json")
    public  @ResponseBody
    TemplatePatternModel templatePattern() {
        TemplatePatternModel templatePatternModel = new TemplatePatternModel();
        DepthFirstTraverser depthFirstTraverser = new DepthFirstTraverser();
        BreadthFirstTraversor breadthFirstTraversor = new BreadthFirstTraversor();
        int[][] graph = Singleton.getInstance().graph.getGraphAdjacencyList();
        depthFirstTraverser.traverse(graph);
        breadthFirstTraversor.traverse(graph);
        templatePatternModel.depthFirstTraversal = DepthFirstTraverser.depthFirstTraversal;
        templatePatternModel.breadthFirstTraversal = BreadthFirstTraversor.breadthFirstTraversal;
        return templatePatternModel;

    }
}
