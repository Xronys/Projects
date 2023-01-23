package com.github.xronys.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class ClassicalMusic implements Music{
    private String songName;
    private List<String> classicalSongs = Arrays.asList("Hungarian Rhapsody","Symphony No. 5","The Valkyrie: Ride of the Valkyries");


    ClassicalMusic(){
    }
/*    private ClassicalMusic classicalMusic1 = new ClassicalMusic("");
    private ClassicalMusic classicalMusic2 = new ClassicalMusic(");
    private ClassicalMusic classicalMusic3 = new ClassicalMusic("");*/

    public String getSongName() {
        return this.songName = classicalSongs.get(0 + (int)(Math.random() * ((2 - 0) + 1)));
    }


    @Override
    public String getSong() {
        return getSongName();
    }
}
