package dev.jcassio.EventAPI.infra.mapper;

import dev.jcassio.EventAPI.core.entities.Event;
import dev.jcassio.EventAPI.infra.persistence.EventEntity;

public class EventEntityMapper {

    public EventEntity toEntity(Event event){
        return new EventEntity(
                event.id(),
                event.name(),
                event.description(),
                event.identifier(),
                event.startDate(),
                event.endDate(),
                event.location(),
                event.organizer(),
                event.capacity(),
                event.type()
        );
    }

    public Event toDomain(EventEntity eventEntity){
        return new Event(
                eventEntity.getId(),
                eventEntity.getName(),
                eventEntity.getDescription(),
                eventEntity.getIdentifier(),
                eventEntity.getStartDate(),
                eventEntity.getEndDate(),
                eventEntity.getLocation(),
                eventEntity.getOrganizer(),
                eventEntity.getCapacity(),
                eventEntity.getType()
        );
    }
}
