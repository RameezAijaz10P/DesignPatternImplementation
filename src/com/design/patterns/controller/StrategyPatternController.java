package com.design.patterns.controller;
import com.design.patterns.model.StrategyPatternModel;
import com.strategy.pattern.BubbleSortAlgorithm;
import com.strategy.pattern.MergeSortAlgorithm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Arrays;


@Controller
public class StrategyPatternController {
	@RequestMapping(value = "/strategy_pattern/sort/{algo_name}", method = RequestMethod.GET, produces = "application/json")
	public  @ResponseBody
	StrategyPatternModel strategyPattern(@PathVariable(value="algo_name") String algo_name,
										 String numbers) {

		if(numbers == null || numbers.trim().equals(""))
		{
			numbers = "1,2,3,4,5";
		}
		ArrayList<String> numbersList = new ArrayList<String>(Arrays.asList(numbers.split("\\s*,\\s*")));
		ArrayList<Integer> integers = new ArrayList<>();
		for(int i=0; i < numbersList.size(); i++) {
			integers.add(Integer.parseInt(numbersList.get(i)));
		}
		MergeSortAlgorithm mergeSort = new MergeSortAlgorithm();
		BubbleSortAlgorithm bubbleSort = new BubbleSortAlgorithm();
		String name;
		ArrayList<Integer> sortedArray;


		if(algo_name.contains("bubble_sort"))
		{
			name = "Bubble Sort";
			sortedArray = bubbleSort.performSort(integers);
		}
		else{
			name = "Merge Sort";
			sortedArray = mergeSort.performSort(integers);
		}

		StrategyPatternModel sortAlgoModel = new StrategyPatternModel();
		sortAlgoModel.setAlgoName(name);
		sortAlgoModel.setOutput(sortedArray);
		
		return sortAlgoModel;
	}
}
