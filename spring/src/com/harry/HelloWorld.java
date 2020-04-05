package com.harry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 1, create a Spring ApplicationContext.
 * 2, create a HelloWorld class.
 * 3, instantiate a bean of HelloWorld, call its' getMessage() method to "say hello";
 */
public class HelloWorld {
    private String message;

    public String getMessage() {
        //return message;
        System.out.println(message);
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    //test getMessage() method of HelloWorld bean in Spring application context
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld objA = (HelloWorld) ctx.getBean("helloWorld");
        objA.setMessage("say hello from obj A");
        objA.getMessage();

        HelloWorld objB = (HelloWorld) ctx.getBean("helloWorld");
        objB.getMessage();

        System.out.println(objA == objB);
    }
}
