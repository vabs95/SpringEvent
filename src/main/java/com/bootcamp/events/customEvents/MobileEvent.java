package com.bootcamp.events.customEvents;

import org.springframework.context.ApplicationEvent;

public class MobileEvent extends ApplicationEvent {
    /**
     * Create a new ApplicationEvent.
     *
     * @param source the component that published the event (never {@code null})
     */
    public MobileEvent(Object source) {
        super(source);
    }
}
