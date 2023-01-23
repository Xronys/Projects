package com.github.xronys.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        ClassicalMusic one = new ClassicalMusic();

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        /*System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());*/

        System.out.println(musicPlayer.playMusic(Genre.ROCK));

        context.close();
    }
}
