package com.in28minutes.learnspringframework.XmlConfig;

import com.in28minutes.learnspringframework.game.GameRunner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class XmlConfigContextLauncherApp {
    public static void main(String[] args) {
        try(var context = new ClassPathXmlApplicationContext("XmlContextConfig.xml")){
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
            context.getBean(GameRunner.class).run();

        }
    }
}
