package dev.jcassio.EventAPI.core.gateway;

import dev.jcassio.EventAPI.core.entities.Event;

public interface EventGateway {
    Event createEvent(Event event);
}
