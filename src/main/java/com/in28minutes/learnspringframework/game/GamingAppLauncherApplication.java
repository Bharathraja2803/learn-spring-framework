package com.in28minutes.learnspringframework.game;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.in28minutes.learnspringframework.game")
public class GamingAppLauncherApplication {
//    @Bean
//    @Qualifier("PacmanConsole")
//    public Pacman pacman(){
//        return new Pacman();
//    }
//    @Bean
//    @Primary
//    @Qualifier("MarioConsole")
//    public SuperMario superMario(){
//        return new SuperMario();
//    }
//    @Bean
//    @Qualifier("ContraConsole")
//    public Contra contra(){
//        return new Contra();
//    }
//    @Bean(name="MarioRunner")
//    public GameRunner MarioRunner(@Qualifier("MarioConsole") GamingConsole game){
//        return new GameRunner(game);
//    }
//    @Bean(name="ContraRunner")
//    public GameRunner ContraRunner(@Qualifier("ContraConsole") GamingConsole game){
//        return new GameRunner(game);
//    }
//    @Bean(name="PacmanRunner")
//    public GameRunner PacmanRunner(@Qualifier("PacmanConsole") GamingConsole game){
//        return new GameRunner(game);
//    }
//    @Bean
//    @Primary
//    public GameRunner gameRunner(GamingConsole game){
//        return new GameRunner(game);
//    }
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)) {
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }

    }
}
