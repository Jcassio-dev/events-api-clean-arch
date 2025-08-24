package dev.jcassio.EventAPI.core.usecases;

import dev.jcassio.EventAPI.core.entities.Event;

public class createEventCaseImpl implements createEventCase {
    @Override
    public Event execute(Event event) {
        System.out.println(event);
        return event;
    }
}
