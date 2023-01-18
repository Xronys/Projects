package com.github.xronys.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

public class TestSpring {
    public static void main( String[] args ) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        // Music music = context.getBean("musicBean", Music.class);
        // MusicPlayer musicPlayer = new MusicPlayer(music);

        MusicPlayer musicPlayer = new MusicPlayer(context.getBean("musicList", ArrayList.class));
        musicPlayer.playMusic();

        /*System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());*/
        context.close();
    }
}
