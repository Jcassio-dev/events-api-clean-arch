package dev.jcassio.EventAPI.infra.mapper;

import dev.jcassio.EventAPI.core.entities.Event;
import dev.jcassio.EventAPI.infra.dto.EventDTO;
import org.springframework.stereotype.Component;

@Component
public class EventDTOMapper {
    public EventDTO toDTO(Event event){
        return new EventDTO(
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


    public Event toEntity(EventDTO eventDTO){
        return new Event(
                eventDTO.id(),
                eventDTO.name(),
                eventDTO.description(),
                eventDTO.identifier(),
                eventDTO.startDate(),
                eventDTO.endDate(),
                eventDTO.location(),
                eventDTO.organizer(),
                eventDTO.capacity(),
                eventDTO.type()
        );
    }
}
