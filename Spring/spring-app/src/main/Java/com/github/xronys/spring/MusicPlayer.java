package com.github.xronys.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/*@Component*/
public class MusicPlayer {
    List<Music> musicList = new ArrayList<>();

    MusicPlayer(RockMusic rockMusic, ClassicalMusic classicalMusic, RapMusic rapMusic) {
        musicList.add(rockMusic);
        musicList.add(classicalMusic);
        musicList.add(rapMusic);
    }

    public String playMusic() {
        return musicList.get((int)(Math.random() * (3))).getSong();
    }
}

