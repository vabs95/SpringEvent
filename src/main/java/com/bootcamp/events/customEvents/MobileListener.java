package com.bootcamp.events.customEvents;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MobileListener implements ApplicationListener<MobileEvent> {
    @Override
    public void onApplicationEvent(MobileEvent event) {
        System.out.println("Please Wait...Updating Mobile Number");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
