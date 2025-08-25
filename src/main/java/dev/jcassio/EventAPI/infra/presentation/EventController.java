package dev.jcassio.EventAPI.infra.presentation;


import dev.jcassio.EventAPI.core.entities.Event;
import dev.jcassio.EventAPI.core.usecases.CreateEventCase;
import dev.jcassio.EventAPI.infra.dto.EventDTO;
import dev.jcassio.EventAPI.infra.mapper.EventDTOMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/api/v1/")
public class EventController {
    private final CreateEventCase createEventCase;
    private final EventDTOMapper eventDTOMapper;

    public EventController(CreateEventCase createEventCase, EventDTOMapper eventDTOMapper) {
        this.createEventCase = createEventCase;
        this.eventDTOMapper = eventDTOMapper;
    }


    @PostMapping("event")
    public EventDTO createEvent(@RequestBody EventDTO dto) {
        Event ParsedDto = eventDTOMapper.toEntity(dto);

        Event newEvent = createEventCase.execute(ParsedDto);

        return eventDTOMapper.toDTO(newEvent);
    }
}
