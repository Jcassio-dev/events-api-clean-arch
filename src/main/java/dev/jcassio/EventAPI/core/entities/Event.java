package dev.jcassio.EventAPI.core.entities;

import dev.jcassio.EventAPI.core.enums.EventType;

import java.time.LocalDateTime;

public record Event(
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
) {}
