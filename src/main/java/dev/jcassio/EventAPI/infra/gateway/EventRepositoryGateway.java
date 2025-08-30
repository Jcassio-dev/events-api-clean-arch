package dev.jcassio.EventAPI.infra.gateway;

import dev.jcassio.EventAPI.core.entities.Event;
import dev.jcassio.EventAPI.core.gateway.EventGateway;
import dev.jcassio.EventAPI.infra.mapper.EventEntityMapper;
import dev.jcassio.EventAPI.infra.persistence.EventEntity;
import dev.jcassio.EventAPI.infra.persistence.EventRepository;

public class EventRepositoryGateway implements EventGateway {

    private final EventRepository eventRepository;
    private final EventEntityMapper eventEntityMapper = new EventEntityMapper();
    public EventRepositoryGateway(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @Override
    public Event createEvent(Event event){
        EventEntity mappedEvent = eventEntityMapper.toEntity(event);

        EventEntity createdEvent = eventRepository.save(mappedEvent);


        return eventEntityMapper.toDomain(createdEvent);
    }
}
