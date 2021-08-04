package com.example.springbeanannotations.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@PropertySource("classpath:musicPlayer.properties")
@Component
public class MusicPlayer {

    @Value("${musicPlayer.name}")
    String name;

    @Value("${musicPlayer.volume}")
    String volume;

    // @Qualifier("classicMusic")
    // @Autowired
    // Можно удалить сеттер и конструктор и оставить только это поле
    private Music music;

    @Autowired
    public MusicPlayer(@Qualifier("classicMusic") Music music) {
        this.music = music;
    }

    // @Autowired
    // Можно через сеттер
    public void setMusic(Music music) {
        this.music = music;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String playMusic() {
        String song = "Playing: " + music.getSong();
        System.out.println(song);
        return song;
    }
}
