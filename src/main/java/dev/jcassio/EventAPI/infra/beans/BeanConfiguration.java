package dev.jcassio.EventAPI.infra.beans;


import dev.jcassio.EventAPI.core.usecases.CreateEventCase;
import dev.jcassio.EventAPI.core.usecases.CreateEventCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    public CreateEventCase createEventCase() {
        return new CreateEventCaseImpl();
    }
}
