package com.bootcamp.events.customEvents;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


    @Component
    public class AtmPinListener implements ApplicationListener<AtmPinEvent> {



    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public void onApplicationEvent(AtmPinEvent event) {
        System.out.println("Send Sms...");
        System.out.println("Validating pin...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Pin Successfully Changed...");




    }
}
