package com.bootcamp.events.customEvents;

import org.springframework.context.ApplicationEvent;

public class AtmPinEvent extends ApplicationEvent {
    /**
     * Create a new ApplicationEvent.
     *
     * @param source the component that published the event (never {@code null})
     */
    public AtmPinEvent(Object source) {
        super(source);
    }
}
