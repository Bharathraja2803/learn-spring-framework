package com.in28minutes.learnspringframework.businessService;

import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Configuration
@ComponentScan
public class BusinessCalculationService {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(BusinessCalculationService.class);
        System.out.println(context.getBean(BusinessCalculationService.class).findMax());
    }
    private DataService dataService;
    @Autowired
    public BusinessCalculationService(DataService dataService){
        this.dataService = dataService;
    }
    public int findMax(){
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }
}
