package com.in28minutes.learnspringframework.predestroyandpostconstruct;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class SomeClass{
    private SomeDependency someDependency;
    public SomeClass(SomeDependency someDependency){
        this.someDependency = someDependency;
        System.out.println("All dependencies are ready");
    }
    @PostConstruct
    public void initialization(){
        someDependency.getReady();
    }
    @PreDestroy
    public void cleanup(){
        System.out.println("Cleaned up");
    }
}
@Component
class SomeDependency{
    public void getReady(){
        System.out.println("Some Logic using some dependency");
    }
}
@Configuration
@ComponentScan
public class PrePostAnnotationLauncherApp {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(PrePostAnnotationLauncherApp.class)){
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}
