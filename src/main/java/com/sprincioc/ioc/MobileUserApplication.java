package com.sprincioc.ioc;


import com.sprincioc.ioc.uitl.SimService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobileUserApplication {
    public static void main(String[] args) {

        // Creating an object using beans.xml file
        // inside the beans.xml file, we need to specify the class which we want an object:
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("=>>config loaded!<<=");

        // =>> Generalized the use of SimService Interface reference:
        // Now we need to use an object which is created by spring IOC:
        // .getBean() method, return an object type Object:
        // here we are using compile time polymorphism:
        // SimService Interface reference variable store an object:
        SimService sim = context.getBean("sim", SimService.class);
        // calling functionality:
        sim.calling();
        sim.data();
    }
}
