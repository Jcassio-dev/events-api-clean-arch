package dev.jcassio.EventAPI.core.usecases;

import dev.jcassio.EventAPI.core.entities.Event;

public interface createEventCase {
    public Event execute(Event event);
}
