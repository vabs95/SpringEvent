package com.bootcamp.events.customEvents;

import org.springframework.context.ApplicationEvent;

public class WithdrawEvent extends ApplicationEvent {
    /**
     * Create a new ApplicationEvent.
     *
     * @param source the component that published the event (never {@code null})
     */
    public WithdrawEvent(Object source) {
        super(source);
    }
}
