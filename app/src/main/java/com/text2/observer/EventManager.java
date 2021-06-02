package com.text2.observer;

import java.util.ArrayList;
import java.util.List;

public class EventManager {
    private List<EventListener> listenerList = new ArrayList<>();

    public void subscribe(EventListener eventListener){
        listenerList.add(eventListener);
    }

    public void unsubscribe(EventListener eventListener){
        listenerList.remove(eventListener);
    }

    public void update(String text){
        for (EventListener eventListener : listenerList) {
            eventListener.update(text);
        }
    }
}
