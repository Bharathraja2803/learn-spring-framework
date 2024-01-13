package com.in28minutes.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class Pacman implements GamingConsole{

    @Override
    public void up() {
        System.out.println("Turn up");
    }

    @Override
    public void down() {
        System.out.println("Turn down");
    }

    @Override
    public void left() {
        System.out.println("Turn left");
    }

    @Override
    public void right() {
        System.out.println("Turn right");
    }
}
