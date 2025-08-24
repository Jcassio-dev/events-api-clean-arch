package dev.jcassio.EventAPI.infra.persistence;

import dev.jcassio.EventAPI.core.enums.EventType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "events")
public class EventEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String identifier;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String location;
    private String organizer;
    private Integer capacity;
    @Enumerated(EnumType.STRING)
    private EventType type;
}
