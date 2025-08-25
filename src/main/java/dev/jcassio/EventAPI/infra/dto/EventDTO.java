package dev.jcassio.EventAPI.infra.dto;

import dev.jcassio.EventAPI.core.enums.EventType;

import java.time.LocalDateTime;

public record EventDTO(
        Long id,
        String name,
        String description,
        String identifier,
        LocalDateTime startDate,
        LocalDateTime endDate,
        String location,
        String organizer,
        Integer capacity,
        EventType type
) {
}
