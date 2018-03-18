package com.bootcamp.events.customEvents;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;


public class CustomPublisher implements ApplicationEventPublisherAware {


  private ApplicationEventPublisher publisher;

  @Override
  public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
    System.out.println("Welcome To Atm Machine...");
    publisher=applicationEventPublisher;
  }

  public void publish(EmployeeEvent event)
  {
    publisher.publishEvent(event);
  }

  public void publish1(WithdrawEvent event)
  {
    publisher.publishEvent(event);
  }

  public void publish2(MobileEvent event)
  {
    publisher.publishEvent(event);
  }

  public void publish3(AtmPinEvent event)
  {
    publisher.publishEvent(event);
  }
}
