package com.rashmit.week_7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class Week7Application {
    static String[] cities = {"Delhi", "Kolkata", "Bangalore", "Chennai", "Ahmedabad"};
    static String[] names = {"Peter", "Pierre", "George", "John", "Mina"};

    public static void main(String[] args) {
        SpringApplication.run(Week7Application.class, args);
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("employee-spring.xml");
        Employee[] employees = new Employee[5];
        for (int i=0;i<5;i++){
            employees[i] = (Employee) applicationContext.getBean("employee");
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
