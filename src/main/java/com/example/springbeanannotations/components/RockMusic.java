package com.example.springbeanannotations.components;

import com.example.springbeanannotations.components.Music;
import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "I'm on highway to hell";
    }
}
