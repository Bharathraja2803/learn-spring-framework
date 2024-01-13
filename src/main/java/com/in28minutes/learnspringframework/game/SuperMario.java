package com.in28minutes.learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SuperMario implements GamingConsole{
    @Override
    public void up() {
        System.out.println("claim ladder");
    }

    @Override
    public void down() {
        System.out.println("go into the tunnel");
    }

    @Override
    public void left() {
        System.out.println("go back");
    }

    @Override
    public void right() {
        System.out.println("move forward");
    }
}
