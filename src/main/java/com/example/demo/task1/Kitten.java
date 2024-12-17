package com.example.demo.task1;

public class Kitten {
    private final String voice;

    public Kitten(String voice) {
        this.voice = voice;

    }

    public void meow() {
        System.out.println(voice);
    }
}
