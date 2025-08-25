package dev.jcassio.EventAPI.core.usecases;

import dev.jcassio.EventAPI.core.entities.Event;

public interface FindEventCase {
    public Event execute(Long id);
}
