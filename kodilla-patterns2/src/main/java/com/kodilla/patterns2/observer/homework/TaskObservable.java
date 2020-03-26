package com.kodilla.patterns2.observer.homework;


public interface TaskObservable {
    void registerObserver(TaskObserver taskObserver);
    void notifyObserver();
    void removeObserver(TaskObserver taskObserver);
}
