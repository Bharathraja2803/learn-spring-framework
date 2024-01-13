package com.in28minutes.learnspringframework.hello;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address) {
};

record Address(String stName, String city) {
};

@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name() {
        return "Bharath";
    }

    @Bean
    public int age() {
        return 20;
    }

    @Bean
    public Person person() {
        return new Person("Bharath", 20,new Address("Marimuthu road","Attur"));
    }

    @Bean
    public Person person2() {
        return new Person(name(),age(),address());
    }

    @Bean(name = "person3")
    public Person person3WithParameter(String name, int age,@Qualifier("address 2 line st") Address address3) {
        return new Person(name,age,address3);
    }
    @Bean
    public Address address() {
        return new Address("Line st", "Attur");
    }
    @Bean(name = "address 2")
    @Primary
    public Address address2() {
        return new Address("Mari muthu Road", "Attur");
    }
    @Bean(name = "address 3")
    @Qualifier("address 2 line st")
    public Address address3() {
        return new Address("Line st", "Attur");
    }
}
