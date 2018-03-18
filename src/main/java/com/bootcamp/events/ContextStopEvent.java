package com.bootcamp.events;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

/**
 * Created by nidhi on 31/3/17.
 */
public class ContextStopEvent implements ApplicationListener<ContextStoppedEvent> {
  @Override
  public void onApplicationEvent(ContextStoppedEvent event) {

      System.out.println("Employee Added Successfully...");
//    System.out.println("Done...Withdraw 500 Rupees From Employee Id 1");
//    System.out.println("Mobile Number Updated Successfully");
  }
}
