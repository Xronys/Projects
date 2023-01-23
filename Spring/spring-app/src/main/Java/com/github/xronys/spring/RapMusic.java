package com.github.xronys.spring;

import java.util.Arrays;
import java.util.List;

public class RapMusic implements Music{

    private String songName;
    private List<String> rapSongs = Arrays.asList("In da Club","Run it","Rabbit Run");

    public String getSongName() {
        return this.songName = rapSongs.get((int)(Math.random() * (3)));
    }
    RapMusic(){}
    @Override
    public String getSong() {
        return getSongName();
    }
}
