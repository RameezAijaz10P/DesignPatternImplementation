package com.sigleton.pattern;

/**
 * Created by rameez on 12/11/16.
 */
public class Singleton {

    public Graph graph = new Graph();
    private static Singleton singleton = new Singleton();
    private Singleton(){}

    public static Singleton getInstance(){
        return singleton ;
    }
}
