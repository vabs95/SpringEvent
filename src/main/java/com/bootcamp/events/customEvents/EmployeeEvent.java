package com.bootcamp.events.customEvents;

import org.springframework.context.ApplicationEvent;

public class EmployeeEvent extends ApplicationEvent {
    /**
     * Create a new ApplicationEvent.
     *
     * @param source the component that published the event (never {@code null})
     */
    public EmployeeEvent(Object source) {
        super(source);
    }
}
