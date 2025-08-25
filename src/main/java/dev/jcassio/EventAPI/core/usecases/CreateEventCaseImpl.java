package dev.jcassio.EventAPI.core.usecases;

import dev.jcassio.EventAPI.core.entities.Event;
import org.springframework.stereotype.Service;

@Service
public class CreateEventCaseImpl implements CreateEventCase {
    @Override
    public Event execute(Event event) {
        System.out.println(event);
        return event;
    }
}
