package dev.jcassio.EventAPI.core.usecases;

import dev.jcassio.EventAPI.core.entities.Event;

public interface findEventCase {
    public Event execute(Long id);
}
