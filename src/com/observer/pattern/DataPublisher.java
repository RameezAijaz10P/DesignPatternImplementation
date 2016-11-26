package com.observer.pattern;

import java.util.ArrayList;

/**
 * Created by rameez on 11/13/16.
 */
public class DataPublisher implements Subject{
    ArrayList<Observer> observers = new ArrayList<>();
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if(i>0)
        observers.remove(i);
    }

    @Override
    public void notifyObservers(Integer integer) {
        for(int i =0; i<observers.size(); i++)
        {
            observers.get(i).update(integer);
        }

    }
}
