package com.in28minutes.learnspringframework.hello;

import com.in28minutes.learnspringframework.hello.HelloWorldConfiguration;

import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AppHelloWorldSpring {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("person2"));
        System.out.println(context.getBean("person3"));
        System.out.println(context.getBean("address"));

        System.out.println(context.getBean(Address.class));
    }
}
