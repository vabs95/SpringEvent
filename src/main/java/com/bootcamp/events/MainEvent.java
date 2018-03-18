package com.bootcamp.events;

import com.bootcamp.events.customEvents.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainEvent {

  public static void main(String[] args) {
    ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
    context.start();

    CustomPublisher publisher= (CustomPublisher) context.getBean("customPublisher");


    Employee employee=new Employee();
    employee.setId("1");
    employee.setName("abc");
    employee.setMailId("abc@gmail.com");
    employee.setSalary(2000);

//    Employee employee1=new Employee();
//    employee1.setId("1");
//    employee1.setName("abc");
//    employee1.setMailId("abc@gmail.com");
//    employee1.setSalary(2000);
//
//    Employee employee2=new Employee();
//    employee2.setId("1");
//    employee2.setName("abc");
//    employee2.setMailId("abc@gmail.com");
//    employee2.setSalary(31000);
    EmployeeEvent employeeEvent=new EmployeeEvent(employee);
    publisher.publish(employeeEvent);
////    WithdrawEvent withdrawEvent=new WithdrawEvent(employee);
//    publisher.publish1(withdrawEvent);

//    MobileEvent mobileEvent=new MobileEvent(employee);
//    publisher.publish2(mobileEvent);

//    AtmPinEvent atmPinEvent=new AtmPinEvent(employee);
//    publisher.publish3(atmPinEvent);


    context.stop();
  }
}
