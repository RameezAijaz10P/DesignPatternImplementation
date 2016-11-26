package com.observer.pattern;

/**
 * Created by rameez on 11/13/16.
 */
public interface Subject {

    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers(Integer i);
}
