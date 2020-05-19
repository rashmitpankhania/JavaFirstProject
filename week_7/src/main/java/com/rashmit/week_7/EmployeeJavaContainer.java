package com.rashmit.week_7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

import static com.rashmit.week_7.EmployeeXMLContainer.cities;
import static com.rashmit.week_7.EmployeeXMLContainer.names;

@SpringBootApplication
public class EmployeeJavaContainer {
    public static void main(String[] args) {
        SpringApplication.run(EmployeeJavaContainer.class, args);
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(EmployeeConfig.class);
        Employee[] employees = new Employee[5];
        for (int i=0;i<5;i++){
            employees[i] = applicationContext.getBean(Employee.class);
            employees[i].setCity(cities[i]);
            employees[i].setId(i);
            employees[i].setName(names[i]);
        }
        System.out.println("Enter the employee id");
        Scanner in = new Scanner(System.in);
        int qid = in.nextInt();
        if(qid > 4){
            System.out.println("enter less 5 value");
            return;
        }
        System.out.println(employees[qid]);
    }
}
