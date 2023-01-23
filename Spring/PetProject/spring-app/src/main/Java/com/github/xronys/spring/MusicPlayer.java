package com.github.xronys.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    @Autowired

    MusicPlayer (ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;

    }

    public String playMusic(Genre genre) {
        if(genre == Genre.CLASSICAL) {
            return "Playing: " + classicalMusic.getSong();
        }
        else if (genre == Genre.ROCK) {
            return "Playing: " + rockMusic.getSong();
        }
        else
            return "no such song";
    }
}

