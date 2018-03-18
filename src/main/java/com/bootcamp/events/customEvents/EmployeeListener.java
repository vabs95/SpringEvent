package com.bootcamp.events.customEvents;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

@Component
public class EmployeeListener implements ApplicationListener<EmployeeEvent> {
    @Autowired
    JdbcTemplate jdbcTemplate;


    @Autowired
    PlatformTransactionManager transactionManager;






    @Override
    public void onApplicationEvent(EmployeeEvent event) {

        Employee employee= (Employee) event.getSource();
        if(employee.getSalary()>30000){
            System.out.println("Alert!!!Salary Is Greater Than 30000");
        }
        else {
            String name=employee.getName();
            String id=employee.getId();
            String maidid=employee.getMailId();
            int salary=employee.getSalary();
            String sql="INSERT INTO Employee (id, name, maidid,salary) VALUES (?,?,?,?)";
//            String sql = "INSERT INTO user_account (username,amount)VALUES(?,?)";
            jdbcTemplate.update(sql,id,name,maidid,salary);

        }

    }
}
