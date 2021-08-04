package com.example.springbeanannotations;

import com.example.springbeanannotations.components.ClassicMusic;
import com.example.springbeanannotations.components.Computer;
import com.example.springbeanannotations.components.Music;
import com.example.springbeanannotations.components.MusicPlayer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringBeanAnnotationsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBeanAnnotationsApplication.class, args);

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        // создание плеера через нью
//        Music rockMusicBean = context.getBean("rockMusic", Music.class);
//        MusicPlayer rockMusicPlayer = new MusicPlayer(rockMusicBean);
//        rockMusicPlayer.playMusic();
//
//        // создание второго плеера через нью
//        Music classicMusicBean = context.getBean("classicMusic", Music.class);
//        MusicPlayer classicMusicPlayer = new MusicPlayer(classicMusicBean);
//        classicMusicPlayer.playMusic();

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer.toString());

        ClassicMusic classicMusic = context.getBean("classicMusic", ClassicMusic.class);

        context.close();
    }

}
