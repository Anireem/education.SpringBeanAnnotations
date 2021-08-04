package com.example.springbeanannotations.components;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype")
public class ClassicMusic implements Music {

    @PostConstruct
    public void doInit() {
        System.out.println("initialization classic music");
    }

    @PreDestroy
    public void doDestroy() {
        System.out.println("destroy classic music");
    }

    @Override
    public String getSong() {
        return "Реквием";
    }
}
