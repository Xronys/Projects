package com.github.xronys.spring;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component("musicBean")
public class RockMusic implements Music {
    private String songName;
    private List<String> classicalSongs = Arrays.asList("Bohemian Rhapsody","Hotel California","Highway to Hell");

    public String getSongName() {
        return this.songName = classicalSongs.get((int)(Math.random() * (3)));
    }
    RockMusic(){}
    @Override
    public String getSong() {
        return getSongName();
    }
}
