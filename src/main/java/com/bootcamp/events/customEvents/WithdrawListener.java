package com.bootcamp.events.customEvents;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;

@Component
public class WithdrawListener implements ApplicationListener<WithdrawEvent> {

    @Autowired
    JdbcTemplate jdbcTemplate;


    @Autowired
    PlatformTransactionManager transactionManager;
    @Override
    public void onApplicationEvent(WithdrawEvent event) {
        Employee employee= (Employee) event.getSource();
        String sql="update Employee set salary=salary-500 where id=? ";
        System.out.println("Processing...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        jdbcTemplate.update(sql,employee.getId());

    }
}
