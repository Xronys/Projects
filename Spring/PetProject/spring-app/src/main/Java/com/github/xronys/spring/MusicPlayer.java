package com.github.xronys.spring;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();
    /*private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume( int volume ) {
        this.volume = volume;
    }

    //IoC
    public MusicPlayer( Music music ) {
        musicList.add(music);
    }*/

    public MusicPlayer() {
    }
    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }



    public void playMusic() {
        for (Music music: musicList
             ) {
            System.out.println("Playing: " + music.getSong());
        }

    }
}

