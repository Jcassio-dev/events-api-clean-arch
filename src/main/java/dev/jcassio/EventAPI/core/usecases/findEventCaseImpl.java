package dev.jcassio.EventAPI.core.usecases;

import dev.jcassio.EventAPI.core.entities.Event;

public class findEventCaseImpl implements findEventCase {
    @Override
    public Event execute(Long id) {
        System.out.println(id);
         return null;
    }
}
