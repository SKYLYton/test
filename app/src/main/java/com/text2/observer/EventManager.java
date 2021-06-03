package com.text2.observer;

import java.util.HashSet;
import java.util.Set;

public class EventManager {
    private final Set<EventListener> listenerList = new HashSet<>();

    public void subscribe(EventListener eventListener) {
        listenerList.add(eventListener);
    }

    public void unsubscribe(EventListener eventListener) {
        listenerList.remove(eventListener);
    }

    public void notify(String text) {
        for (EventListener eventListener : listenerList) {
            eventListener.update(text);
        }
    }
}
