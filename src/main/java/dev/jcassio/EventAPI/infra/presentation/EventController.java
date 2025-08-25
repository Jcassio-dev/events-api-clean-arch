package dev.jcassio.EventAPI.infra.presentation;


import dev.jcassio.EventAPI.core.entities.Event;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/api/v1/")
public class EventController {

    @PostMapping("event")
    public String createEvent(@RequestBody Event event) {
        return "Event created";
    }
}
