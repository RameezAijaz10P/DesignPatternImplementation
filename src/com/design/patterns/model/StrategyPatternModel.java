package com.design.patterns.model;

import java.util.ArrayList;

public class StrategyPatternModel {
	String algo_name;
	ArrayList<Integer> output = new ArrayList<>();
	
	public String getAlgoName(){
		return algo_name;
	}
	public void setAlgoName(String name)
	{
		algo_name = name;
	}
	public ArrayList<Integer> getOutput(){
		return output;
	}
	public void setOutput(ArrayList<Integer> arg)
	{
		output=arg;
	}
	

}
