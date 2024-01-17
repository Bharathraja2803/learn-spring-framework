package com.in28minutes.learnspringframework.lazyInitialization;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA{

}
@Component
@Lazy
class ClassB{
    private ClassA classA;
    public ClassB(ClassA classA){
        System.out.println("Initialization of ClassB");
        this.classA = classA;
    }
    public void doSomething(){
        System.out.println("Something Done");
    }
}
@Configuration
@ComponentScan
public class LazyInitializationLauncherApp {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(LazyInitializationLauncherApp.class)){
            System.out.println("Initialization starts by now...");
            context.getBean(ClassB.class).doSomething();
        }
    }
}
